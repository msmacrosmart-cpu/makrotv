import { NextRequest, NextResponse } from "next/server";
import { deleteBanner, getBanner, updateBanner } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";

function isAuthed(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  return !!token && !!verifyAdminToken(token);
}

export async function GET(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  const banner = getBanner(params.id);
  if (!banner) return NextResponse.json({ error: "Banner não encontrado" }, { status: 404 });
  return NextResponse.json({ banner });
}

export async function PUT(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  try {
    const body = await req.json();
    if (body.imageUrl !== undefined && !/^https?:\/\//i.test(String(body.imageUrl).trim())) {
      return NextResponse.json({ error: "A URL da imagem deve começar com http:// ou https://" }, { status: 400 });
    }
    const updated = updateBanner(params.id, {
      ...(body.title !== undefined ? { title: String(body.title) } : {}),
      ...(body.imageUrl !== undefined ? { imageUrl: String(body.imageUrl) } : {}),
      ...(body.linkUrl !== undefined ? { linkUrl: String(body.linkUrl) } : {}),
      ...(body.active !== undefined ? { active: Boolean(body.active) } : {}),
      ...(body.order !== undefined ? { order: Number(body.order) || 0 } : {}),
    });
    if (!updated) return NextResponse.json({ error: "Banner não encontrado" }, { status: 404 });
    return NextResponse.json({ banner: updated });
  } catch (error: any) {
    return NextResponse.json({ error: error?.message || "Não foi possível atualizar o banner" }, { status: 400 });
  }
}

export async function DELETE(req: NextRequest, { params }: { params: { id: string } }) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  if (!deleteBanner(params.id)) return NextResponse.json({ error: "Banner não encontrado" }, { status: 404 });
  return NextResponse.json({ ok: true });
}
