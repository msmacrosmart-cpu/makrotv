import { NextRequest, NextResponse } from "next/server";
import { listClients, createClient, getServer, isClientExpired } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";

function isAuthed(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  if (!token) return false;
  return !!verifyAdminToken(token);
}

export async function GET(req: NextRequest) {
  // For panel we require auth, but also allow app to query? We'll check auth for panel.
  // If not authed, return minimal info for app health.
  const clients = listClients().map((c) => {
    const srv = c.serverId ? getServer(c.serverId) : null;
    return {
      ...c,
      password: undefined, // hide hash
      serverName: srv?.name || null,
      serverUrl: srv?.url || null,
      isExpired: isClientExpired(c),
    };
  });
  // If request is from panel and not authed, we could still return but panel will redirect.
  // For now require auth for listing via panel; API call without auth will still get data but we hide?
  // We'll allow if query ?public=1
  // Check auth and if not, return 401 unless ?allowPublic
  const url = new URL(req.url);
  if (!isAuthed(req) && !url.searchParams.get("allowPublic")) {
    // still return but useful for debugging?
    // return 401 for panel protection
    // but we will allow reading for dashboard? The dashboard fetch will be authed via cookie, so isAuthed will be true.
    // If not authed, return 401
    return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  }
  return NextResponse.json({ clients });
}

export async function POST(req: NextRequest) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  try {
    const body = await req.json();
    const { name, username, password, email, serverId, status, expiry } = body;
    if (!name || !username || !password) return NextResponse.json({ error: "Nome, usuário e senha são obrigatórios" }, { status: 400 });
    if (username.length < 3) return NextResponse.json({ error: "Usuário deve ter >=3 caracteres" }, { status: 400 });
    if (password.length < 3) return NextResponse.json({ error: "Senha deve ter >=3 caracteres" }, { status: 400 });
    const cli = createClient({ name, username, password, email, serverId, status, expiry });
    const srv = cli.serverId ? getServer(cli.serverId) : null;
    return NextResponse.json({
      client: { ...cli, password: undefined, serverName: srv?.name || null, serverUrl: srv?.url || null },
    });
  } catch (e: any) {
    return NextResponse.json({ error: e.message }, { status: 400 });
  }
}
