import { NextRequest, NextResponse } from "next/server";
import { verifyAdminToken } from "@/lib/auth";

export async function GET(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  if (!token) return NextResponse.json({ error: "Não autenticado" }, { status: 401 });
  const payload = verifyAdminToken(token);
  if (!payload) return NextResponse.json({ error: "Token inválido" }, { status: 401 });
  return NextResponse.json({ username: payload.username, id: payload.id });
}
