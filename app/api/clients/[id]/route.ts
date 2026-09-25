import { NextRequest, NextResponse } from "next/server";
import { getClient, updateClient, deleteClient, getServer, isClientExpired } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";

function isAuthed(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  if (!token) return false;
  return !!verifyAdminToken(token);
}

export async function GET(req: NextRequest, { params }: { params: { id: string } }) {
  const c = getClient(params.id);
  if (!c) return NextResponse.json({ error: "Não encontrado" }, { status: 404 });
  const srv = c.serverId ? getServer(c.serverId) : null;
  return NextResponse.json({
    client: { ...c, password: undefined, serverName: srv?.name, serverUrl: srv?.url, isExpired: isClientExpired(c) },
  });
}

export async function PUT(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  try {
    const body = await req.json();
    // body may contain password empty meaning keep old
    const updated = updateClient(params.id, body);
    if (!updated) return NextResponse.json({ error: "Não encontrado" }, { status: 404 });
    const srv = updated.serverId ? getServer(updated.serverId) : null;
    return NextResponse.json({
      client: { ...updated, password: undefined, serverName: srv?.name, serverUrl: srv?.url, isExpired: isClientExpired(updated) },
    });
  } catch (e: any) {
    return NextResponse.json({ error: e.message }, { status: 400 });
  }
}

export async function DELETE(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  const ok = deleteClient(params.id);
  if (!ok) return NextResponse.json({ error: "Não encontrado" }, { status: 404 });
  return NextResponse.json({ ok: true });
}
