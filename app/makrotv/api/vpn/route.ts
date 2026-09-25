import { NextRequest, NextResponse } from "next/server";
export async function GET() { return NextResponse.json({ status: "false", msg: "" }); }
export async function POST() { return NextResponse.json({ status: "false" }); }
