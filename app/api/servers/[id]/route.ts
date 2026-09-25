import { NextRequest, NextResponse } from "next/server";
import { getServer, updateServer, deleteServer } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";

function isAuthed(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  if (!token) return false;
  return !!verifyAdminToken(token);
}

export async function GET(req: NextRequest, { params }: { params: { id: string } }) {
  const s = getServer(params.id);
  if (!s) return NextResponse.json({ error: "Não encontrado" }, { status: 404 });
  return NextResponse.json({ server: s });
}

export async function PUT(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  try {
    const body = await req.json();
    if (body.url) {
      let u = body.url.trim();
      if (!u.startsWith("http://") && !u.startsWith("https://")) u = "http://" + u;
      body.url = u.replace(/\/$/, "");
    }
    const updated = updateServer(params.id, body);
    if (!updated) return NextResponse.json({ error: "Não encontrado" }, { status: 404 });
    return NextResponse.json({ server: updated });
  } catch (e: any) {
    return NextResponse.json({ error: e.message }, { status: 500 });
  }
}

export async function DELETE(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  const ok = deleteServer(params.id);
  if (!ok) return NextResponse.json({ error: "Não encontrado" }, { status: 404 });
  return NextResponse.json({ ok: true });
}
