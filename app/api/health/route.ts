import { NextResponse } from "next/server";
import { dbHealth } from "@/lib/db";
import fs from "fs";

export async function GET() {
  const health = dbHealth();
  // Check APK exists
  let apkInfo: any = null;
  try {
    const stat = fs.statSync("makrotv.apk");
    apkInfo = { exists: true, size: stat.size, sizeMB: (stat.size / 1024 / 1024).toFixed(2) + " MB" };
  } catch {
    apkInfo = { exists: false };
  }

  return NextResponse.json({
    ok: true,
    timestamp: new Date().toISOString(),
    service: "MakroTV Panel & API",
    version: "2.0.0",
    db: health,
    apk: apkInfo,
    endpoints: {
      panel: "/dashboard",
      login: "/login",
      api_dns: "/api/dns (GET, POST) also /makrotv/api/dns",
      player_api: "/player_api.php?username=&password= (Xtream compat)",
      health: "/api/health",
    },
    originalPanel: "http://appstop.site/makrotv/api/dns (suspenso - 302)",
    newPanelBase: process.env.NEXT_PUBLIC_PANEL_URL || "https://makrotv.vercel.app",
    panelUrl: process.env.NEXT_PUBLIC_PANEL_URL || "https://makrotv.vercel.app",
    apkPackage: "brstore.makro.app",
    baseUrlHardcoded: "http://appstop.site/makrotv/api/",
    patchedApk: "/api/apk/info",
    downloadUrl: "/makrotv-patched.apk",
  });
}
