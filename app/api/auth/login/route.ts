import { NextRequest, NextResponse } from "next/server";
import { verifyAdmin, getDB } from "@/lib/db";
import { signAdminToken } from "@/lib/auth";

export async function POST(req: NextRequest) {
  try {
    const { username, password } = await req.json();
    if (!username || !password) {
      return NextResponse.json({ error: "Usuário e senha obrigatórios" }, { status: 400 });
    }
    // also allow env admin without DB lookup? verifyAdmin already checks DB which is seeded from env
    const admin = verifyAdmin(username, password);
    if (!admin) {
      // fallback to env check directly (in case DB hash mismatch)
      const envUser = process.env.ADMIN_USERNAME || "admin";
      const envPass = process.env.ADMIN_PASSWORD || "admin123";
      if (username !== envUser || password !== envPass) {
        return NextResponse.json({ error: "Credenciais inválidas" }, { status: 401 });
      }
      // if env matches but DB doesn't, create token for env admin
      const token = signAdminToken({ id: "env_admin", username });
      const res = NextResponse.json({ ok: true, username });
      res.cookies.set("admin_token", token, {
        httpOnly: true,
        secure: process.env.NODE_ENV === "production",
        sameSite: "lax",
        path: "/",
        maxAge: 60 * 60 * 24 * 7,
      });
      return res;
    }

    const token = signAdminToken({ id: admin.id, username: admin.username });
    const res = NextResponse.json({ ok: true, username: admin.username });
    res.cookies.set("admin_token", token, {
      httpOnly: true,
      secure: process.env.NODE_ENV === "production",
      sameSite: "lax",
      path: "/",
      maxAge: 60 * 60 * 24 * 7,
    });
    return res;
  } catch (e: any) {
    return NextResponse.json({ error: e.message || "Erro" }, { status: 500 });
  }
}
