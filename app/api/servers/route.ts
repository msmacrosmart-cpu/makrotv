import { NextRequest, NextResponse } from "next/server";
import { listServers, createServer, getServer } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";

function isAuthed(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  if (!token) return false;
  return !!verifyAdminToken(token);
}

export async function GET(req: NextRequest) {
  // Allow public read for health? But protect write. For now allow read without auth for API usage.
  const servers = listServers();
  return NextResponse.json({ servers });
}

export async function POST(req: NextRequest) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  try {
    const { name, url, status } = await req.json();
    if (!name || !url) return NextResponse.json({ error: "Nome e URL obrigatórios" }, { status: 400 });
    // normalize url
    let normalized = url.trim();
    if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) normalized = "http://" + normalized;
    normalized = normalized.replace(/\/$/, "");
    const srv = createServer({ name: name.trim(), url: normalized, status: status || "active" });
    return NextResponse.json({ server: srv });
  } catch (e: any) {
    return NextResponse.json({ error: e.message }, { status: 500 });
  }
}
