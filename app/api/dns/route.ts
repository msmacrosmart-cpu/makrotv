import { NextRequest, NextResponse } from "next/server";
import { listServers, getServer, getClientByUsername, getDB, saveDB } from "@/lib/db";
import { verifyAdminToken } from "@/lib/auth";
import crypto from "crypto";

/**
 * DNS API — mimics original http://appstop.site/makrotv/api/dns
 * Original app does POST with Form to "dns" endpoint and expects:
 * { "status": "true", "su": "http://server1,http://server2", "sc": "<md5>", "ndd": "..." }
 * We implement flexible GET/POST. If username provided, return its linked server, otherwise default.
 */

function md5(str: string): string {
  return crypto.createHash("md5").update(str).digest("hex");
}

function sanitizeDns(value: string): string {
  return value.trim().replace(/\/+$/, "");
}

// Salt used in original app for sc calculation: "NB!@#12ZKWd" (from f.java h)
const SALT = "NB!@#12ZKWd";
const EMPTY_B = ""; // f.j.a.f.b.b

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
        return NextResponse.json({ error: "Não autorizado" }, { status: 401 });
      }
      const db = getDB();
      db.servers = body.servers;
      saveDB(db);
      return NextResponse.json({ servers: db.servers });
    }
  }
  return handle(req);
}

async function handle(req: NextRequest) {
  const url = new URL(req.url);
  // try to get params from query, body (form or json)
  let params: Record<string, string> = {};
  // query
  url.searchParams.forEach((v, k) => (params[k] = v));

  // body
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
      // try text as form
      const text = await req.clone().text().catch(() => "");
      if (text && text.includes("=")) {
        try {
          const sp = new URLSearchParams(text);
          sp.forEach((v, k) => (params[k] = v));
        } catch {}
      }
    }
  } catch {}

  // Determine which server(s) to return
  // If username supplied (field "u"), try to find client and its server
  const username = params["u"] || params["username"] || params["user"] || "";
  let targetServers: string[] = [];

  if (username) {
    const client = getClientByUsername(username);
    if (client && client.serverId) {
      const srv = getServer(client.serverId);
      if (srv && srv.status === "active") targetServers = [sanitizeDns(srv.url)];
    }
    // if not found, fallback to default
  }

  if (targetServers.length === 0) {
    const servers = listServers().filter((s) => s.status === "active");
    if (servers.length > 0) {
      // if multiple, return comma-separated as original did comma-split
      targetServers = servers.map((s) => sanitizeDns(s.url)).filter(Boolean);
      // For backward compat, if client has linked server but username not supplied, we could still return all.
    } else {
      // fallback to env
      targetServers = [];
    }
  }

  const su = targetServers.join(",");
  const sc = md5(`${su}*${SALT}*${EMPTY_B}`);
  const hasDns = targetServers.length > 0;

  // Keep the legacy Xtream payload while exposing the sanitized URL explicitly.
  const response = {
    status: hasDns ? "true" : "false",
    su,
    sc,
    ndd: "0",
    msg: hasDns ? "OK" : "Nenhum servidor DNS ativo configurado.",
    url: targetServers[0] || "",
    dns: su,
    servers: targetServers,
    timestamp: new Date().toISOString(),
  };

  // Log for debugging (optional)
  // console.log("DNS request", params, "->", response);

  return NextResponse.json(response, {
    headers: {
      "Content-Type": "application/json; charset=utf-8",
      "Cache-Control": "no-store",
    },
  });
}

// Handle OPTIONS for CORS
export async function OPTIONS() {
  return new NextResponse(null, {
    status: 200,
    headers: {
      "Access-Control-Allow-Origin": "*",
      "Access-Control-Allow-Methods": "GET, POST, OPTIONS",
      "Access-Control-Allow-Headers": "Content-Type, Authorization",
    },
  });
}
