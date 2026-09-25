import { NextRequest, NextResponse } from "next/server";
import fs from "fs";
import path from "path";

export async function GET(req: NextRequest) {
  const candidates = [
    path.join(process.cwd(), "public", "makrotv-patched.apk"),
    path.join(process.cwd(), "apk-patched", "makrotv-patched.apk"),
    path.join(process.cwd(), "makrotv-patched.apk"),
    path.join(process.cwd(), "public", "makrotv.apk"),
  ];

  let filePath: string | null = null;
  for (const p of candidates) {
    try {
      const s = fs.statSync(p);
      if (s.isFile() && s.size > 1024) {
        filePath = p;
        break;
      }
    } catch {}
  }

  if (!filePath) {
    // No patched APK, provide helpful JSON / redirect to info
    const accept = req.headers.get("accept") || "";
    if (accept.includes("text/html")) {
      // browser navigating directly - show info page via redirect
      return NextResponse.redirect(new URL("/api/apk/info", req.url), 302);
    }
    return NextResponse.json(
      {
        error: "APK patchado não encontrado",
        message: "O APK patchado ainda não foi gerado neste deploy.",
        howToGenerate: "Execute: ./scripts/patch-apk.sh https://makrotv-ten.vercel.app  ou dispare o workflow GitHub Actions 'Patch APK'",
        info: "/api/apk/info",
        panelUrl: process.env.NEXT_PUBLIC_PANEL_URL || "https://makrotv-ten.vercel.app",
        workflow: "https://github.com/msmacrosmart-cpu/makrotv/actions/workflows/patch-apk.yml",
      },
      { status: 404 }
    );
  }

  // If file exists and is the public static file, redirect to CDN static path for efficiency
  if (filePath.includes("public/makrotv-patched.apk")) {
    // Redirect to static asset (Vercel edge cache) - better than streaming via serverless
    return NextResponse.redirect(new URL("/makrotv-patched.apk", req.url), 302);
  }

  // Otherwise stream file (fallback for apk-patched location)
  const stat = fs.statSync(filePath);
  const stream = fs.createReadStream(filePath);

  // @ts-ignore
  const webStream = stream as any;

  return new NextResponse(webStream as any, {
    headers: {
      "Content-Type": "application/vnd.android.package-archive",
      "Content-Disposition": `attachment; filename="makrotv-patched.apk"`,
      "Content-Length": stat.size.toString(),
      "Cache-Control": "public, max-age=3600",
    },
  });
}
