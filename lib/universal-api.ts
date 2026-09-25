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

function getActiveDns(request: NextRequest) {
  const username = request.nextUrl.searchParams.get("username") || request.nextUrl.searchParams.get("u") || "";
  if (username) {
    const client = getClientByUsername(username);
    const server = client?.serverId ? getServer(client.serverId) : undefined;
    if (server?.status === "active") return sanitizeDns(server.url);
  }

  const configuredDns = listServers()
    .filter((server) => server.status === "active")
    .map((server) => sanitizeDns(server.url))
    .find(Boolean);

  return configuredDns || sanitizeDns(process.env.DEFAULT_DNS || "http://127.0.0.1:8080");
}

export function universalResponse(request: NextRequest) {
  const dns = getActiveDns(request);
  const configured = Boolean(dns);
  return NextResponse.json(
    {
      status: configured ? "active" : "error",
      status_code: configured ? 200 : 503,
      result: configured ? "success" : "error",
      response: configured ? "success" : "error",
      message: configured ? "success" : "Nenhum servidor DNS ativo configurado no painel.",
      url: dns,
      dns,
      server_url: dns,
      sucess: configured,
      sucesso: configured,
      user_info: { auth: configured ? 1 : 0, status: configured ? "Active" : "Inactive" },
      server_info: { url: dns, port: "80" },
      banners: [],
    },
    { status: configured ? 200 : 503, headers: universalJsonHeaders },
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
      const upstream = await fetch(target, { cache: "no-store", redirect: "manual" });
      const body = await upstream.text();
      return new NextResponse(body, {
        status: upstream.status,
        headers: { ...universalJsonHeaders, "Content-Type": "application/json; charset=utf-8" },
      });
    } catch {
      return NextResponse.json(
        { status: "error", status_code: 502, result: "error", message: "Não foi possível conectar ao servidor DNS.", url: dns, dns },
        { status: 502, headers: universalJsonHeaders },
      );
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
