import { NextRequest, NextResponse } from "next/server";
import { getClientByUsername, getServer, isClientExpired } from "@/lib/db";
import bcrypt from "bcryptjs";

/**
 * Xtream Codes compatible player_api.php
 * Original app calls: http://server:port/player_api.php?username=XXX&password=YYY
 * With Retrofit base = serverUrl from DNS.
 * We mimic that endpoint so the patched APK can authenticate against our panel instead of directly against Xtream.
 * If the client's server is an external Xtream, we could proxy, but for now we authenticate via our DB and return server_info of the linked server.
 *
 * Query params: username, password, action (optional)
 */

export async function GET(req: NextRequest) {
  const url = new URL(req.url);
  // Also support POST
  const username = url.searchParams.get("username") || url.searchParams.get("user") || "";
  const password = url.searchParams.get("password") || url.searchParams.get("pass") || "";
  const action = url.searchParams.get("action") || "";

  // Allow CORS preflight already via next.config
  if (!username || !password) {
    return NextResponse.json(
      { user_info: { auth: 0, status: "Failed", message: "Missing credentials" }, server_info: {} },
      { status: 200 }
    );
  }

  const client = getClientByUsername(username);
  if (!client) {
    return NextResponse.json(
      {
        user_info: {
          username,
          password,
          message: "Invalid username",
          auth: 0,
          status: "Failed",
          exp_date: "",
          is_trial: "0",
          active_cons: "0",
          created_at: "",
          max_connections: "0",
          allowed_output_formats: ["m3u8", "ts"],
        },
        server_info: {},
      },
      { status: 200 }
    );
  }

  // Verify password (bcrypt)
  const passOk = bcrypt.compareSync(password, client.password);
  if (!passOk) {
    return NextResponse.json(
      {
        user_info: {
          username,
          password,
          message: "Invalid password",
          auth: 0,
          status: "Failed",
          exp_date: "",
          is_trial: "0",
          active_cons: "0",
          created_at: "",
          max_connections: "0",
          allowed_output_formats: ["m3u8", "ts"],
        },
        server_info: {},
      },
      { status: 200 }
    );
  }

  // Check status
  if (client.status === "blocked") {
    return NextResponse.json(
      {
        user_info: {
          username,
          password,
          message: "Account blocked",
          auth: 0,
          status: "Blocked",
          exp_date: client.expiry ? String(Math.floor(new Date(client.expiry).getTime() / 1000)) : "",
          is_trial: "0",
          active_cons: "0",
          created_at: String(Math.floor(new Date(client.createdAt).getTime() / 1000)),
          max_connections: "1",
          allowed_output_formats: ["m3u8", "ts"],
        },
        server_info: {},
      },
      { status: 200 }
    );
  }

  if (isClientExpired(client)) {
    return NextResponse.json(
      {
        user_info: {
          username,
          password,
          message: "Expired",
          auth: 0,
          status: "Expired",
          exp_date: String(Math.floor(new Date(client.expiry!).getTime() / 1000)),
          is_trial: "0",
          active_cons: "0",
          created_at: String(Math.floor(new Date(client.createdAt).getTime() / 1000)),
          max_connections: "1",
          allowed_output_formats: ["m3u8", "ts"],
        },
        server_info: {},
      },
      { status: 200 }
    );
  }

  // Auth success
  const server = client.serverId ? getServer(client.serverId) : null;
  const serverUrl = server?.url || process.env.DEFAULT_DNS || "http://seu-servidor-xtream.com:8080";
  // Parse serverUrl to extract host, port, protocol
  let parsed: URL | null = null;
  try {
    let u = serverUrl;
    if (!u.startsWith("http://") && !u.startsWith("https://")) u = "http://" + u;
    parsed = new URL(u);
  } catch {}

  const expDate = client.expiry ? String(Math.floor(new Date(client.expiry).getTime() / 1000)) : "";
  const createdAt = String(Math.floor(new Date(client.createdAt).getTime() / 1000));

  // If action requested (e.g., get_live_categories etc.), we could proxy to real Xtream
  // For now, if action is set and we have a real server, we could attempt to proxy
  // But to keep simple, return empty categories for non-auth actions when using our panel as source.
  // The app expects actions like get_live_categories, get_vod_categories, get_series_categories, etc.
  // Without a real Xtream backend, those will be empty. For demo we return empty arrays but the login still succeeds.
  if (action) {
    // Return minimal category data to not break app
    // The app uses separate Retrofit calls via Y() for those actions to same serverUrl.
    // Since our panel doesn't have live streams, we return empty but valid structure.
    // We detect action and return appropriate empty list
    if (action === "get_live_categories" || action === "get_vod_categories" || action === "get_series_categories") {
      return NextResponse.json([], { status: 200 });
    }
    if (action === "get_live_streams" || action === "get_vod_streams" || action === "get_series") {
      return NextResponse.json([], { status: 200 });
    }
    // fallback generic
    return NextResponse.json([], { status: 200 });
  }

  const response = {
    user_info: {
      username: client.username,
      password: password, // echo
      message: "",
      auth: 1,
      status: "Active",
      exp_date: expDate,
      is_trial: "0",
      active_cons: "0",
      created_at: createdAt,
      max_connections: "1",
      allowed_output_formats: ["m3u8", "ts"],
    },
    server_info: {
      url: serverUrl,
      port: parsed?.port || "8080",
      https_port: "8443",
      server_protocol: parsed?.protocol.replace(":", "") || "http",
      rtmp_port: "8880",
      timezone: "America/Sao_Paulo",
      timestamp_now: Math.floor(Date.now() / 1000),
      time_now: new Date().toISOString().slice(0, 19).replace("T", " "),
    },
  };

  return NextResponse.json(response, { status: 200 });
}

export async function POST(req: NextRequest) {
  // Allow POST as well (some clients may POST)
  const form = await req.formData().catch(() => null);
  const url = new URL(req.url);
  // merge
  if (form) {
    form.forEach((v, k) => url.searchParams.set(k, String(v)));
  }
  // reuse GET logic by constructing new request with merged params
  const newReq = new NextRequest(url.toString(), { headers: req.headers });
  return GET(newReq);
}

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
