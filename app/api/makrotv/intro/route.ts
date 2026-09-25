import { NextResponse } from "next/server";
import { listActiveBanners } from "@/lib/db";

export const dynamic = "force-dynamic";

/** Public payload consumed by the original MakroTV app and useful for banner clients. */
export async function GET() {
  const banners = listActiveBanners();
  return NextResponse.json({
    status: "true",
    url: banners[0]?.imageUrl || "",
    banners: banners.map((banner) => ({
      id: banner.id,
      title: banner.title,
      image: banner.imageUrl,
      imageUrl: banner.imageUrl,
      url: banner.linkUrl || "",
      link: banner.linkUrl || "",
    })),
  });
}

export async function POST() {
  return GET();
}
