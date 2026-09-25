#!/bin/bash
# MakroTV APK Patch - Substitui a URL hardcoded do painel antigo pelo novo painel Vercel
# Uso: ./scripts/patch-apk.sh https://seu-dominio.vercel.app
# Requisitos: apktool, jarsigner / apksigner, zipalign, java

set -e

NEW_BASE=${1:-""}
if [ -z "$NEW_BASE" ]; then
  echo "Uso: $0 <nova_base_url>"
  echo "Exemplo: $0 https://makrotv-seuusuario.vercel.app"
  echo ""
  echo "O script vai:"
  echo "  1. Decodificar makrotv.apk com apktool"
  echo "  2. Substituir http://appstop.site/makrotv/api/ pela nova URL"
  echo "  3. Recompilar e assinar o APK"
  exit 1
fi

# Normaliza: garante trailing slash e adiciona /makrotv/api/ se não houver path
if [[ "$NEW_BASE" != */ ]]; then
  NEW_BASE="$NEW_BASE/"
fi
if [[ "$NEW_BASE" != *"/makrotv/api/"* && "$NEW_BASE" != *"/api/"* ]]; then
  # Se passou apenas domínio raiz, adiciona makrotv/api/
  NEW_BASE="${NEW_BASE}makrotv/api/"
fi

OLD_URL="http://appstop.site/makrotv/api/"
OLD_HOST="http://appstop.site"

echo "=== MakroTV APK Patch ==="
echo "Origem (suspenso): $OLD_URL"
echo "Destino (novo):    $NEW_BASE"
echo ""

# Checa dependências
command -v apktool >/dev/null 2>&1 || { echo "Erro: apktool não encontrado. Instale: https://apktool.org"; exit 1; }
command -v java >/dev/null 2>&1 || { echo "Erro: java não encontrado"; exit 1; }

APK_IN="makrotv.apk"
WORK_DIR="/tmp/makrotv-patch-$$"
OUT_DIR="apk-patched"

if [ ! -f "$APK_IN" ]; then
  echo "Erro: $APK_IN não encontrado na raiz do repositório"
  exit 1
fi

rm -rf "$WORK_DIR" "$OUT_DIR"
mkdir -p "$WORK_DIR" "$OUT_DIR"

echo "[1/5] Decodificando APK..."
set +e
apktool d "$APK_IN" -o "$WORK_DIR/app" -f 2>&1 | tee /tmp/apktool-decode.log
DECODE_EXIT=${PIPESTATUS[0]}
cat /tmp/apktool-decode.log
if [ $DECODE_EXIT -ne 0 ]; then
  echo "Aviso: apktool decode com recursos falhou (exit $DECODE_EXIT), tentando com -r (skip resources) ..."
  rm -rf "$WORK_DIR/app"
  apktool d "$APK_IN" -o "$WORK_DIR/app" -r -f 2>&1 | tee /tmp/apktool-decode2.log
  cat /tmp/apktool-decode2.log
  if [ ${PIPESTATUS[0]} -ne 0 ]; then
    echo "Erro: apktool decode falhou mesmo com -r"
    exit 1
  fi
fi
set -e

echo "[2/5] Procurando URLs hardcoded..."
grep -r "appstop.site" "$WORK_DIR/app" --include="*.smali" --include="*.xml" -n || echo "Nenhum appstop encontrado antes (ok, já patchado?)"

echo "[3/5] Substituindo URL..."
# Substitui em smali e xml
find "$WORK_DIR/app" -type f \( -name "*.smali" -o -name "*.xml" \) -exec sed -i "s|${OLD_URL}|${NEW_BASE}|g" {} \;
find "$WORK_DIR/app" -type f -name "*.smali" -exec sed -i "s|${OLD_HOST}|$(echo $NEW_BASE | sed 's|/makrotv/api/||; s|/api/||')|g" {} \; || true

# Verifica
echo "Após substituição:"
grep -r "appstop.site" "$WORK_DIR/app" --include="*.smali" -n | head -n 20 || echo "OK: nenhuma ocorrência de appstop.site restante"
grep -r "$NEW_BASE" "$WORK_DIR/app" --include="*.smali" -n | head -n 20 || echo "Aviso: nova URL não encontrada em smali (verifique se o padrão foi diferente)"
# Mostra arquivo chave
cat "$WORK_DIR/app/smali/f/j/a/f/g.smali" 2>/dev/null | grep -A2 -B2 "const-string" | head -n 30 || true

echo "[4/5] Recompilando..."
set +e
apktool b "$WORK_DIR/app" -o "$OUT_DIR/makrotv-patched-unsigned.apk" 2>&1 | tee /tmp/apktool-build.log
BUILD_EXIT=${PIPESTATUS[0]}
cat /tmp/apktool-build.log
if [ $BUILD_EXIT -ne 0 ]; then
  echo "Aviso: apktool build falhou (exit $BUILD_EXIT), tentando com --use-aapt2 ..."
  apktool b "$WORK_DIR/app" -o "$OUT_DIR/makrotv-patched-unsigned.apk" --use-aapt2 2>&1 | tee /tmp/apktool-build2.log || true
  cat /tmp/apktool-build2.log
  if [ ! -f "$OUT_DIR/makrotv-patched-unsigned.apk" ]; then
    echo "Erro: build falhou mesmo com --use-aapt2"
    # mostra último log
    cat /tmp/apktool-build.log | tail -n 100
    cat /tmp/apktool-build2.log | tail -n 100
    exit 1
  fi
fi
set -e

echo "[5/5] Assinando (debug keystore)..."
# Gera keystore debug se não existir
KEYSTORE="$OUT_DIR/debug.keystore"
if [ ! -f "$KEYSTORE" ]; then
  keytool -genkey -v -keystore "$KEYSTORE" -storepass android -alias androiddebugkey -keypass android -keyalg RSA -keysize 2048 -validity 10000 -dname "CN=Android Debug,O=Android,C=US" 2>&1 | tail -n 5
fi

# Assina com jarsigner (ou apksigner se disponível)
if command -v apksigner >/dev/null 2>&1; then
  apksigner sign --ks "$KEYSTORE" --ks-pass pass:android --key-pass pass:android --out "$OUT_DIR/makrotv-patched.apk" "$OUT_DIR/makrotv-patched-unsigned.apk"
  apksigner verify "$OUT_DIR/makrotv-patched.apk" && echo "Assinatura OK (apksigner)"
else
  jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore "$KEYSTORE" -storepass android "$OUT_DIR/makrotv-patched-unsigned.apk" androiddebugkey 2>&1 | tail -n 10
  mv "$OUT_DIR/makrotv-patched-unsigned.apk" "$OUT_DIR/makrotv-patched.apk"
  jarsigner -verify "$OUT_DIR/makrotv-patched.apk" && echo "Assinatura OK (jarsigner)"
fi

# zipalign se disponível
if command -v zipalign >/dev/null 2>&1; then
  zipalign -v 4 "$OUT_DIR/makrotv-patched.apk" "$OUT_DIR/makrotv-patched-aligned.apk" 2>&1 | tail -n 5
  mv "$OUT_DIR/makrotv-patched-aligned.apk" "$OUT_DIR/makrotv-patched.apk"
fi

ls -lh "$OUT_DIR/makrotv-patched.apk"
echo ""
echo "=== PATCH CONCLUÍDO ==="
echo "APK patchado: $OUT_DIR/makrotv-patched.apk"
echo "Instale com: adb install -r $OUT_DIR/makrotv-patched.apk"
echo ""
echo "Teste a nova URL:"
echo "  curl $NEW_BASE/dns"
echo "  curl $NEW_BASE/../player_api.php?username=demo&password=demo123  (ou sua URL base/player_api.php)"

# Limpeza opcional
# rm -rf "$WORK_DIR"
