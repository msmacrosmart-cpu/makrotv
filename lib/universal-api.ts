import { NextRequest, NextResponse } from "next/server";
import { getClientByUsername, getServer, listServers } from "@/lib/db";

export const universalJsonHeaders = {
  "Content-Type": "application/json; charset=utf-8",
  "Access-Control-Allow-Origin": "*",
  "Access-Control-Allow-Methods": "GET, POST, OPTIONS",
  "Access-Control-Allow-Headers": "Content-Type, Authorization",
  "Cache-Control": "no-store",
};

export function sanitizeDns(value: string) {
  return value.trim().replace(/\/+$/, "");
}

// SERVIDORES DNS FIXOS
const DEFAULT_REAL_DNS = "http://ouro.cdntop.online";

function getActiveDns(request: NextRequest) {
  const username = request.nextUrl.searchParams.get("username") || request.nextUrl.searchParams.get("u") || "";
  if (username) {
    try {
      const client = getClientByUsername(username);
      const server = client?.serverId ? getServer(client.serverId) : undefined;
      if (server?.status === "active" && server.url) return sanitizeDns(server.url);
    } catch {}
  }

  try {
    const configuredDns = listServers()
      .filter((server) => server.status === "active" && server.url)
      .map((server) => sanitizeDns(server.url))
      .find(Boolean);

    if (configuredDns) return configuredDns;
  } catch {}

  return sanitizeDns(process.env.DEFAULT_DNS || DEFAULT_REAL_DNS);
}

export function universalResponse(request: NextRequest) {
  const dns = getActiveDns(request);
  const configured = Boolean(dns);
  return NextResponse.json(
    {
      status: "active",
      status_code: 200,
      result: "success",
      response: "success",
      message: "success",
      url: dns,
      dns,
      server_url: dns,
      sucess: true,
      sucesso: true,
      user_info: { auth: 1, status: "Active" },
      server_info: { url: dns, port: "80" },
      banners: [],
    },
    { status: 200, headers: universalJsonHeaders },
  );
}

export async function handleUniversalRequest(request: NextRequest) {
  const username = request.nextUrl.searchParams.get("username") || request.nextUrl.searchParams.get("u");
  const password = request.nextUrl.searchParams.get("password") || request.nextUrl.searchParams.get("p");
  const dns = getActiveDns(request);

  if (dns && username && password) {
    const target = new URL(`${dns}/player_api.php`);
    request.nextUrl.searchParams.forEach((value, key) => target.searchParams.set(key, value));
    try {
      const upstream = await fetch(target.toString(), { cache: "no-store", redirect: "manual" });
      const body = await upstream.text();
      return new NextResponse(body, {
        status: upstream.status,
        headers: { ...universalJsonHeaders, "Content-Type": "application/json; charset=utf-8" },
      });
    } catch {
      return universalResponse(request);
    }
  }

  return universalResponse(request);
}

export function optionsResponse() {
  return new NextResponse(null, { status: 204, headers: universalJsonHeaders });
}

export function methodNotAllowed() {
  return NextResponse.json({ status: "error", status_code: 405, message: "Método não permitido." }, { status: 405, headers: universalJsonHeaders });
}

export type UniversalHandlers = {
  GET: (request: NextRequest) => Promise<Response>;
  POST: (request: NextRequest) => Promise<Response>;
  OPTIONS: () => Response;
};

export function createUniversalHandlers(): UniversalHandlers {
  return { GET: handleUniversalRequest, POST: handleUniversalRequest, OPTIONS: optionsResponse };
}

export { getActiveDns };
