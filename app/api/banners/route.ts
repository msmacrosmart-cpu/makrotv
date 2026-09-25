import { NextRequest, NextResponse } from "next/server";
import { createBanner, listBanners } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";

function isAuthed(req: NextRequest) {
  const token = req.cookies.get("admin_token")?.value;
  return !!token && !!verifyAdminToken(token);
}

export async function GET(req: NextRequest) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  return NextResponse.json({ banners: listBanners() });
}

export async function POST(req: NextRequest) {
  if (!isAuthed(req)) return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
  try {
    const body = await req.json();
    const title = String(body.title || "").trim();
    const imageUrl = String(body.imageUrl || "").trim();
    if (!title || !imageUrl) {
      return NextResponse.json({ error: "Título e URL da imagem são obrigatórios" }, { status: 400 });
    }
    if (!/^https?:\/\//i.test(imageUrl)) {
      return NextResponse.json({ error: "A URL da imagem deve começar com http:// ou https://" }, { status: 400 });
    }
    const banner = createBanner({
      title,
      imageUrl,
      linkUrl: body.linkUrl,
      active: body.active !== false,
      order: Number(body.order || 0),
    });
    return NextResponse.json({ banner }, { status: 201 });
  } catch (error: any) {
    return NextResponse.json({ error: error?.message || "Não foi possível criar o banner" }, { status: 400 });
  }
}
