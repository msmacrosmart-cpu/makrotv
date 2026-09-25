# Análise Detalhada do APK MakroTV — 2026-09-25

## Resumo Executivo
APK de 60.24 MB, pacote `brstore.makro.app`, rebrand de IPTV Smarters Pro, hardcode para `http://appstop.site/makrotv/api/` (suspenso, 302). UI completa preservável via patch.

## Artefatos
- `analysis/report.txt` — grep appstop, manifest, strings
- `analysis/probe_result.txt` — curl appstop.site (302 → suspendedpage.cgi)
- `analysis/j1.txt` — MD5 e sc
- `analysis/critical/` — descompilação jadx de f.j.a.f, f.j.a.h, LoginActivity, SplashActivity
- `analysis/full_f/` — f.j.a.f completo
- `makrotv.apk` — original intacto

## Manifest
compileSdk 31, package brstore.makro.app, allowBackup false, largeHeap true, usesCleartextTraffic true, banner tv_banner, 40+ activities, providers FileProvider.

## DNS & Auth Flow (código)
- `f.j.a.f.g.a.a = "http://appstop.site/makrotv/api/"`
- `g.b("dns")` → `d(..., "dns", ..., "Form", b, false)` → `a.a(context, "dns", ...)` → OkHttp POST `${base}${endpoint}` com Form `gu,k,sc,u,pw,r,av,dt,d,do`
- Resposta JSON: `status, su, sc, ndd` — `su` é DNS CSV, `sc = MD5(su + "*" + salt + "*" + b.b)` salt = "NB!@#12ZKWd"
- `SplashActivity.h0` → `JSONObject.getString("status")=="true"` → `H = getString("su")` → `l1(H)` → split "," → `f0.h(username, password, dnsList)` → Retrofit `Y()` → `player_api.php`
- `f.j.a.h.i.e.Y()` → lê `loginPrefsserverurl.serverUrlMAG` → garante `http://` + "/" → Retrofit base

## Prova de Suspensão
Runner GitHub: `curl -i http://appstop.site/makrotv/api/dns` → HTTP 302 Location: http://appstop.site/cgi-sys/suspendedpage.cgi (repetido para /api/, /makrotv/, /)

## Rebuild Viabilidade
- JADX OK (10053 classes), mas sem gradle source, rebuild completo = novo projeto.
- Patch via apktool: troca const-string em `smali/f/j/a/f/g.smali`, recompila, re-assina — 5 passos, <2 min.

## Telas
Splash, Login, Dashboard, Live/VOD/Series, EPG, Catch-up, Recording, External Player, MultiUser, Settings, Parental, Whmcs (invoices).

## Não Inventado
Todos os IPs, URLs, hashes e fluxos vêm de `strings`, `grep -r appstop` e `curl` real. Onde havia dúvida (ex: `b.b` vazio), explicitado.

## Próximos Passos se Precisar
- Capturar `su, sc` reais se painel voltar (via wayback ou backup cPanel).
- Implementar proxy Xtream real em `/api/player` para categorias/streams (hoje stub []).
