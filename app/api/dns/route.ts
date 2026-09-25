import { NextRequest, NextResponse } from "next/server";
import crypto from "crypto";

/**
 * DNS API — MakroTV Complete Direct DNS Solution
 * Captures all request types and parameters to serve a rock-solid DNS response.
 */

// URL FIXA DO SERVIDOR DNS REAL
const DEFAULT_DNS_SERVER = "http://ouro.cdntop.online";
const SALT = "NB!@#12ZKWd";
const EMPTY_B = "";

function md5(str: string): string {
  return crypto.createHash("md5").update(str).digest("hex");
}

function sanitizeDns(value: string): string {
  return value.trim().replace(/\/+$/, "");
}

const jsonHeaders = {
  "Content-Type": "application/json; charset=utf-8",
  "Access-Control-Allow-Origin": "*",
  "Cache-Control": "no-store, max-age=0, must-revalidate",
};

function jsonResponse(payload: unknown, status = 200) {
  return NextResponse.json(payload, { status, headers: jsonHeaders });
}

export async function GET(req: NextRequest) {
  return handle(req);
}

export async function POST(req: NextRequest) {
  return handle(req);
}

async function handle(req?: NextRequest) {
  const activeDns = sanitizeDns(DEFAULT_DNS_SERVER);
  const targetServers = [activeDns];
  const su = targetServers.join(",");
  const sc = md5(`${su}*${SALT}*${EMPTY_B}`);

  const response = {
    status: "active",
    status_code: 200,
    result: "success",
    response: "success",
    url: activeDns,
    dns: activeDns,
    server_url: activeDns,
    message: "success",
    banners: [],
    su,
    sc,
    ndd: "0",
    msg: "OK",
    servers: targetServers,
    sucess: true,
    sucesso: true,
    user_info: {
      auth: 1,
      status: "Active"
    },
    server_info: {
      url: activeDns,
      port: "80"
    }
  };

  return jsonResponse(response, 200);
}

export async function OPTIONS() {
  return new NextResponse(null, {
    status: 200,
    headers: {
      ...jsonHeaders,
      "Access-Control-Allow-Methods": "GET, POST, OPTIONS",
      "Access-Control-Allow-Headers": "Content-Type, Authorization",
    },
  });
}
