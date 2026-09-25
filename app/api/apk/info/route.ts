import { NextResponse } from "next/server";
import fs from "fs";
import path from "path";

export async function GET() {
  const candidates = [
    path.join(process.cwd(), "public", "makrotv-patched.apk"),
    path.join(process.cwd(), "apk-patched", "makrotv-patched.apk"),
    path.join(process.cwd(), "makrotv-patched.apk"),
  ];

  let file: string | null = null;
  let stat: fs.Stats | null = null;
  for (const p of candidates) {
    try {
      const s = fs.statSync(p);
      if (s.isFile() && s.size > 1024) {
        file = p;
        stat = s;
        break;
      }
    } catch {}
  }

  // also check original
  let originalStat: fs.Stats | null = null;
  try {
    originalStat = fs.statSync(path.join(process.cwd(), "makrotv.apk"));
  } catch {}

  const panelUrl = process.env.NEXT_PUBLIC_PANEL_URL || "https://makrotv.vercel.app";
  const basePatched = `${panelUrl}/makrotv/api/`;
  const baseOriginal = "http://appstop.site/makrotv/api/";

  if (file && stat) {
    return NextResponse.json({
      available: true,
      patched: true,
      url: "/api/apk/download",
      directUrl: "/makrotv-patched.apk",
      panelUrl,
      baseUrl: basePatched,
      originalBaseUrl: baseOriginal,
      size: stat.size,
      sizeHuman: `${(stat.size / 1024 / 1024).toFixed(2)} MB`,
      mtime: stat.mtime.toISOString(),
      package: "brstore.makro.app",
      version: "v7-patched",
      signing: ["v1", "v2", "v3"],
      instructions: "Baixe via /api/apk/download e instale. Ative 'Fontes desconhecidas' no Android.",
    });
  }

  return NextResponse.json({
    available: false,
    patched: false,
    panelUrl,
    baseUrl: basePatched,
    originalBaseUrl: baseOriginal,
    originalSize: originalStat?.size || null,
    originalSizeHuman: originalStat ? `${(originalStat.size / 1024 / 1024).toFixed(2)} MB` : null,
    message: "APK patchado ainda não gerado neste deploy. Execute o workflow 'Patch APK' no GitHub ou rode ./scripts/patch-apk.sh https://makrotv.vercel.app localmente.",
    generate: {
      githubWorkflow: "https://github.com/msmacrosmart-cpu/makrotv/actions/workflows/patch-apk.yml",
      script: "./scripts/patch-apk.sh https://makrotv.vercel.app",
      expectedOutput: "apk-patched/makrotv-patched.apk e public/makrotv-patched.apk",
    },
    downloadFallback: {
      originalApk: "APK original (não patchado) disponível em /makrotv.apk mas aponta para http://appstop.site (suspenso)",
    },
  });
}
