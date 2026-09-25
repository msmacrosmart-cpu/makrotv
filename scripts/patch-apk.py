#!/usr/bin/env python3
"""
Patch APK sem apktool — edição binária direta do dex string pool (método rápido).
Substitui http://appstop.site/makrotv/api/ por nova URL de tamanho igual ou menor (padding com \0).
Se a nova URL for maior, avisa que é necessário usar apktool (patch-apk.sh).

Uso: python3 scripts/patch-apk.py https://seu-dominio.vercel.app/makrotv/api/
"""

import sys, os, struct, hashlib

OLD = b"http://appstop.site/makrotv/api/"
# Também tentar sem trailing slash
OLD_VARIANTS = [b"http://appstop.site/makrotv/api/", b"http://appstop.site"]

def patch_apk(apk_path, new_base):
    if not new_base.endswith("/"):
        new_base += "/"
    # Se new_base não contiver path, adiciona makrotv/api/
    if "makrotv/api" not in new_base and "/api" not in new_base:
        new_base = new_base.rstrip("/") + "/makrotv/api/"

    new_bytes = new_base.encode()

    print(f"OLD: {OLD.decode()}")
    print(f"NEW: {new_base} (len {len(new_bytes)} vs {len(OLD)})")

    if len(new_bytes) > len(OLD):
        print(f"AVISO: Nova URL ({len(new_bytes)} bytes) é maior que antiga ({len(OLD)} bytes).")
        print("Patch binário direto não é seguro (string pool tem tamanho fixo).")
        print("Use o método apktool: ./scripts/patch-apk.sh " + new_base)
        # Ainda tenta, mas vai truncar/pad?
        # Para demo, permitimos se até +10% com padding hack? Melhor abortar.
        # Vamos fazer patch via string replacement que permite tamanho diferente se usarmos dex rewrite?
        # Simplificamos: aborta.
        return False

    with open(apk_path, "rb") as f:
        data = f.read()

    if OLD not in data:
        print("OLD string não encontrada no APK (já patchado ou variante diferente).")
        # Tenta variantes
        for v in OLD_VARIANTS:
            if v in data:
                print(f"Variante encontrada: {v.decode()}")
                OLD_LOCAL = v
                break
        else:
            print("Nenhuma variante encontrada.")
            return False
    else:
        OLD_LOCAL = OLD

    # Pad new_bytes to same length with null bytes (dex strings are null-terminated)
    padded = new_bytes + b"\x00" * (len(OLD_LOCAL) - len(new_bytes))
    # For dex, strings are stored as MUTF8 with uleb128 length prefix — we must also update length.
    # Simplificação: se len igual, simples replace funciona; se menor, precisamos ajustar length byte.
    # O dex armazena comprimento utf16 como uleb128 antes da string.
    # Vamos localizar ocorrência e ajustar o byte anterior se for length.

    # Encontra todas ocorrências
    count = data.count(OLD_LOCAL)
    print(f"Encontradas {count} ocorrência(s) de OLD no APK (zip).")

    # Para APK (zip), a string está dentro do classes.dex que está comprimido no zip.
    # Patch direto no zip funciona se o tamanho for igual (sem mudar compressão).
    # Se fizermos replace simples byte a byte no arquivo zip comprimido, não vai funcionar porque dex está comprimido.
    # Portanto este método só funciona se o dex estiver descomprimido (unlikely).
    # Melhor extrair, patch dex, e re-zipar.

    import zipfile, tempfile, shutil

    tmpdir = tempfile.mkdtemp(prefix="makrotv_patch_")
    print(f"Extraindo para {tmpdir}...")
    with zipfile.ZipFile(apk_path, 'r') as zin:
        zin.extractall(tmpdir)

    dex_path = os.path.join(tmpdir, "classes.dex")
    if not os.path.exists(dex_path):
        print("classes.dex não encontrado após extração")
        return False

    with open(dex_path, "rb") as f:
        dex = f.read()

    # Agora patch no dex descomprimido
    if OLD_LOCAL not in dex:
        print("OLD não encontrada no classes.dex descomprimido (talvez ofuscado diferente).")
        # Tenta buscar como utf8?
        print("Tentando buscar bytes brute...")
        return False

    # Para dex, precisamos lidar com length prefix.
    # O formato: [uleb128 len][bytes][0x00]
    # Se new_bytes len != old len, o uleb128 precisa ser ajustado.
    # Como estamos usando mesma len (padded), o len utf16 é igual? Mas new_base pode ter tamanho diferente em chars (ascii igual a utf16 len)
    # Se len(new) < len(old), o uleb128 deve ser atualizado para len(new), e o resto será padding null que será ignorado? Mas dex parser espera exatamente len.
    # Solução: manter len igual e preencher com null, mas dex string terminator é 0x00, então o excesso será parte da string com nulls? Não ideal.
    # Melhor: atualizar uleb128 se len diferente, e depois ajustar offsets do dex (complexo).
    # Para simplificar, exigimos len igual.

    if len(new_bytes) != len(OLD_LOCAL):
        print("Para patch dex, exigimos len idêntico. Use apktool para tamanhos diferentes.")
        print(f"OLD len {len(OLD_LOCAL)}, NEW len {len(new_bytes)}")
        # Se NEW menor, podemos fazer replace e preencher com espaço?
        # Mas vamos abortar e instruir usar apktool.
        return False

    new_dex = dex.replace(OLD_LOCAL, new_bytes)
    if new_dex == dex:
        print("Nenhuma substituição feita no dex")
        return False

    with open(dex_path, "wb") as f:
        f.write(new_dex)

    # Também patch classes2.dex se existir
    dex2_path = os.path.join(tmpdir, "classes2.dex")
    if os.path.exists(dex2_path):
        with open(dex2_path, "rb") as f:
            dex2 = f.read()
        if OLD_LOCAL in dex2:
            if len(new_bytes) == len(OLD_LOCAL):
                new_dex2 = dex2.replace(OLD_LOCAL, new_bytes)
                with open(dex2_path, "wb") as f:
                    f.write(new_dex2)
                print("Patch também aplicado em classes2.dex")

    # Re-empacotar
    out_path = apk_path.replace(".apk", "-patched-simple.apk")
    print(f"Reempacotando para {out_path}...")
    with zipfile.ZipFile(out_path, 'w', zipfile.ZIP_DEFLATED) as zout:
        for root, _, files in os.walk(tmpdir):
            for file in files:
                full = os.path.join(root, file)
                rel = os.path.relpath(full, tmpdir)
                zout.write(full, rel)

    # Copia assinatura? APK precisará ser re-assinado com jarsigner/apksigner manualmente.
    print(f"APK patchado (não assinado): {out_path}")
    print("Assine com: jarsigner -keystore debug.keystore -storepass android ...")
    print("Ou use o método completo: ./scripts/patch-apk.sh")

    # Cleanup
    shutil.rmtree(tmpdir)
    return True

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Uso: python3 scripts/patch-apk.py <nova_base_url> [apk_path]")
        print("Ex: python3 scripts/patch-apk.py https://meuapp.vercel.app")
        sys.exit(1)
    new_base = sys.argv[1]
    apk = sys.argv[2] if len(sys.argv) > 2 else "makrotv.apk"
    ok = patch_apk(apk, new_base)
    sys.exit(0 if ok else 1)
