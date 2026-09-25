import { NextRequest, NextResponse } from "next/server";
import { listServers, getServer, getClientByUsername, getDB, saveDB } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";
import crypto from "crypto";

/**
 * DNS API — MakroTV Optimized
 * Fixed fallback added to permanently solve Error 921 and empty server returns.
 */

// DIGITE AQUI A URL DO SEU SERVIDOR PRINCIPAL (SEM BARRA NO FINAL)
const DEFAULT_DNS_SERVER = "http://ouro.cdntop.online";

function md5(str: string): string {
  return crypto.createHash("md5").update(str).digest("hex");
}

function sanitizeDns(value: string): string {
  return value.trim().replace(/\/+$/, "");
}

const jsonHeaders = {
  "Content-Type": "application/json; charset=utf-8",
  "Access-Control-Allow-Origin": "*",
  "Cache-Control": "no-store",
};

function jsonResponse(payload: unknown, status = 200) {
  return NextResponse.json(payload, { status, headers: jsonHeaders });
}

// Salt used in original app for sc calculation: "NB!@#12ZKWd"
const SALT = "NB!@#12ZKWd";
const EMPTY_B = "";

export async function GET(req: NextRequest) {
  return handle(req);
}

export async function POST(req: NextRequest) {
  const contentType = req.headers.get("content-type") || "";
  if (contentType.includes("application/json")) {
    const body = await req.clone().json().catch(() => null);
    if (body && Array.isArray(body.servers)) {
      const token = req.cookies.get("admin_token")?.value;
      if (!token || !verifyAdminToken(token)) {
        return jsonResponse({ error: "Não autorizado" }, 401);
      }
      const db = getDB();
      db.servers = body.servers;
      saveDB(db);
      return jsonResponse({ servers: db.servers });
    }
  }
  return handle(req);
}

async function handle(req: NextRequest) {
  const url = new URL(req.url);
  let params: Record<string, string> = {};
  
  url.searchParams.forEach((v, k) => (params[k] = v));

  try {
    const ct = req.headers.get("content-type") || "";
    if (ct.includes("application/json")) {
      const body = await req.json().catch(() => ({}));
      Object.assign(params, body);
    } else if (ct.includes("application/x-www-form-urlencoded") || ct.includes("multipart/form-data")) {
      const form = await req.formData().catch(() => null);
      if (form) form.forEach((v, k) => (params[k] = String(v)));
      else {
        const text = await req.text().catch(() => "");
        if (text) {
          const sp = new URLSearchParams(text);
          sp.forEach((v, k) => (params[k] = v));
        }
      }
    } else {
      const text = await req.clone().text().catch(() => "");
      if (text && text.includes("=")) {
        try {
          const sp = new URLSearchParams(text);
          sp.forEach((v, k) => (params[k] = v));
        } catch {}
      }
    }
  } catch {}

  const username = params["u"] || params["username"] || params["user"] || "";
  let targetServers: string[] = [];

  if (username) {
    try {
      const client = getClientByUsername(username);
      if (client && client.serverId) {
        const srv = getServer(client.serverId);
        if (srv && srv.status === "active" && srv.url) {
          targetServers = [sanitizeDns(srv.url)];
        }
      }
    } catch {}
  }

  if (targetServers.length === 0) {
    try {
      const servers = listServers().filter((s) => s.status === "active" && s.url);
      if (servers.length > 0) {
        targetServers = servers.map((s) => sanitizeDns(s.url)).filter(Boolean);
      }
    } catch {}
  }

  // Garantia absoluta de fallback se a busca no banco falhar ou estiver vazia
  if (targetServers.length === 0) {
    const fallbackDns = sanitizeDns(process.env.DEFAULT_DNS || DEFAULT_DNS_SERVER);
    targetServers = [fallbackDns];
  }

  const su = targetServers.join(",");
  const sc = md5(`${su}*${SALT}*${EMPTY_B}`);
  const activeDns = targetServers[0] || sanitizeDns(DEFAULT_DNS_SERVER);

  const response = {
    status: "active",
    status_code: 200,
    result: "success",
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
