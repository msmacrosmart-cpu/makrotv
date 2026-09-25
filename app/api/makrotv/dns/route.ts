import { NextRequest } from "next/server";
import { GET as DnsGET, POST as DnsPOST, OPTIONS as DnsOPTIONS } from "@/app/api/dns/route";
export async function GET(req: NextRequest) { return DnsGET(req); }
export async function POST(req: NextRequest) { return DnsPOST(req); }
export async function OPTIONS() { return DnsOPTIONS(); }
