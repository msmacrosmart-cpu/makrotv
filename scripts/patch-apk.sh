#!/usr/bin/env bash
# Rebuilds the MakroTV APK with the panel URL embedded in smali.
# The order is important: apktool d -> patch -> apktool b -> zipalign -> apksigner.
# Usage: ./scripts/patch-apk.sh https://makrotv.vercel.app

set -Eeuo pipefail

PANEL_URL=${1:-"https://makrotv.vercel.app"}
APK_IN=${APK_IN:-"makrotv.apk"}
OUT_DIR=${OUT_DIR:-"apk-patched"}
WORK_DIR=${WORK_DIR:-"$(mktemp -d /tmp/makrotv-patch.XXXXXX)"}
DECODED="$WORK_DIR/app"
UNSIGNED="$OUT_DIR/makrotv-patched-unsigned.apk"
ALIGNED="$WORK_DIR/makrotv-patched-aligned.apk"
FINAL="$OUT_DIR/makrotv-patched.apk"
KEYSTORE="$WORK_DIR/debug.keystore"

cleanup() {
  if [[ "${KEEP_WORK_DIR:-0}" != "1" ]]; then
    rm -rf "$WORK_DIR"
  else
    echo "Keeping work directory: $WORK_DIR"
  fi
}
trap cleanup EXIT

command -v apktool >/dev/null || { echo "Erro: apktool não encontrado" >&2; exit 1; }
command -v zipalign >/dev/null || { echo "Erro: zipalign não encontrado" >&2; exit 1; }
command -v apksigner >/dev/null || { echo "Erro: apksigner não encontrado" >&2; exit 1; }
command -v keytool >/dev/null || { echo "Erro: keytool não encontrado" >&2; exit 1; }
[[ -f "$APK_IN" ]] || { echo "Erro: APK de entrada não encontrado: $APK_IN" >&2; exit 1; }

if [[ "$PANEL_URL" != */ ]]; then
  PANEL_URL="$PANEL_URL/"
fi
if [[ "$PANEL_URL" != */makrotv/api/ && "$PANEL_URL" != */api/ ]]; then
  PANEL_URL="${PANEL_URL}makrotv/api/"
fi

OLD_URL="http://appstop.site/makrotv/api/"
OLD_HOST="http://appstop.site"
PANEL_ORIGIN="$(python3 - "$PANEL_URL" <<'PY'
import sys
from urllib.parse import urlsplit
url = urlsplit(sys.argv[1])
print(f"{url.scheme}://{url.netloc}")
PY
)"

mkdir -p "$OUT_DIR"
rm -f "$UNSIGNED" "$FINAL"

echo "=== MakroTV APK rebuild ==="
echo "Origem:  $OLD_URL"
echo "Destino: $PANEL_URL"
echo "Entrada: $APK_IN"

echo "[1/5] apktool decode"
apktool d "$APK_IN" -o "$DECODED" -f

echo "[2/5] patch smali/XML and remove testOnly"
python3 - "$DECODED" "$OLD_URL" "$OLD_HOST" "$PANEL_URL" "$PANEL_ORIGIN" <<'PY'
from pathlib import Path
import re
import sys

root, old_url, old_host, new_url, new_origin = sys.argv[1:]
root = Path(root)
changed = 0
old_hits = 0
for path in root.rglob("*"):
    if not path.is_file() or path.suffix not in {".smali", ".xml"}:
        continue
    try:
        text = path.read_text(encoding="utf-8")
    except UnicodeDecodeError:
        continue
    original = text
    old_hits += text.count(old_url) + text.count(old_host)
    text = text.replace(old_url, new_url).replace(old_host, new_origin)
    if path.name == "AndroidManifest.xml":
        text = re.sub(r"\s+android:testOnly=\"(?:true|false)\"", "", text)
        text = re.sub(r"\s+testOnly=\"(?:true|false)\"", "", text)
    if text != original:
        path.write_text(text, encoding="utf-8")
        changed += 1

if old_hits == 0:
    raise SystemExit("URL original não encontrada no conteúdo decodificado")
print(f"Arquivos alterados: {changed}; ocorrências antigas: {old_hits}")
PY
if grep -R "appstop\.site" "$DECODED" --include='*.smali' --include='*.xml' -n; then
  echo "Erro: appstop.site ainda aparece no APK decodificado" >&2
  exit 1
fi

echo "[3/5] apktool build"
apktool b "$DECODED" -o "$UNSIGNED"

# Align before signing. Signing an APK and then aligning it invalidates v2/v3.
echo "[4/5] zipalign (before signing)"
zipalign -f -v 4 "$UNSIGNED" "$ALIGNED"
zipalign -c -v 4 "$ALIGNED"

echo "[5/5] apksigner v1 + v2 + v3"
keytool -genkeypair -keystore "$KEYSTORE" -storepass android -keypass android \
  -alias androiddebugkey -keyalg RSA -keysize 2048 -validity 10000 \
  -dname "CN=Android Debug,O=Android,C=US" >/dev/null 2>&1
apksigner sign --ks "$KEYSTORE" --ks-pass pass:android --key-pass pass:android \
  --v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true \
  --out "$FINAL" "$ALIGNED"
apksigner verify --verbose "$FINAL"

if ! unzip -p "$FINAL" classes.dex | strings | grep -Fq "${PANEL_ORIGIN}"; then
  echo "Erro: domínio novo não foi encontrado em classes.dex" >&2
  exit 1
fi
if unzip -p "$FINAL" classes.dex | strings | grep -Fq "appstop.site"; then
  echo "Erro: domínio antigo ainda está em classes.dex" >&2
  exit 1
fi

cp -f "$FINAL" "$OUT_DIR/makrotv-patched.apk"
ls -lh "$FINAL"
stat -c 'bytes=%s' "$FINAL"
echo "APK pronto: $FINAL"
