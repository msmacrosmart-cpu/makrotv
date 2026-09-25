import { NextResponse } from "next/server";
import { listActiveBanners } from "@/lib/db";

export const dynamic = "force-dynamic";

export async function GET() {
  return NextResponse.json({
    status: "true",
    banners: listActiveBanners(),
  }, {
    headers: { "Cache-Control": "public, max-age=60, s-maxage=60" },
  });
}
