import { NextResponse } from "next/server";
import { dbHealth } from "@/lib/db";
import fs from "fs";
import path from "path";

export const dynamic = "force-dynamic";

function fileInfo(filePath: string) {
  try {
    const stat = fs.statSync(filePath);
    return { exists: true, size: stat.size, sizeMB: (stat.size / 1024 / 1024).toFixed(2) + " MB" };
  } catch {
    return { exists: false };
  }
}

export async function GET() {
  const patchedPath = path.join(process.cwd(), "public", "makrotv-patched.apk");
  const originalPath = path.join(process.cwd(), "makrotv.apk");
  const panelUrl = process.env.NEXT_PUBLIC_PANEL_URL || "https://makrotv.vercel.app";

  return NextResponse.json({
    ok: true,
    timestamp: new Date().toISOString(),
    service: "MakroTV Panel & API",
    version: "3.0.0-banners-dns",
    db: dbHealth(),
    apk: {
      patched: fileInfo(patchedPath),
      original: fileInfo(originalPath),
      package: "brstore.makro.app",
      download: "/api/apk/download",
    },
    endpoints: {
      panel: "/dashboard",
      banners: "/makrotv/api/intro",
      api_dns: "/api/dns (GET, POST) also /makrotv/api/dns",
      player_api: "/player_api.php?username=&password= (Xtream compat)",
      health: "/api/health",
    },
    originalPanel: "http://appstop.site/makrotv/api/dns (suspenso - 302)",
    newPanelBase: panelUrl,
    panelUrl,
    baseUrlHardcoded: "https://makrotv.vercel.app/makrotv/api/",
    patchedApk: "/api/apk/info",
    downloadUrl: "/api/apk/download",
  });
}
