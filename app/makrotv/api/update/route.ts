import { NextRequest, NextResponse } from "next/server";
export async function GET() { return NextResponse.json({ status: "false", version: "1.0", url: "" }); }
export async function POST() { return NextResponse.json({ status: "false" }); }
