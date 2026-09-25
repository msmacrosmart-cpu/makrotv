// Simple JSON file DB that works on Vercel (uses /tmp when writable, fallback to memory)
// In production with DATABASE_URL you would replace this with Prisma/real DB.
// This implementation persists to data/db.json locally and /tmp/db.json on Vercel.
// On Vercel the filesystem is ephemeral, so data will reset on redeploy — for persistence, configure external DB.

import fs from "fs";
import path from "path";
import crypto from "crypto";
import bcrypt from "bcryptjs";

export interface Server {
  id: string;
  name: string;
  url: string;
  status: string;
  createdAt: string;
  updatedAt: string;
}

export interface Client {
  id: string;
  name: string;
  username: string;
  password: string; // hashed
  email?: string;
  serverId?: string | null;
  status: string; // active | blocked | expired
  expiry?: string | null;
  createdAt: string;
  updatedAt: string;
}

export interface Banner {
  id: string;
  title: string;
  imageUrl: string;
  linkUrl?: string;
  active: boolean;
  order: number;
  createdAt: string;
  updatedAt: string;
}

export interface Admin {
  id: string;
  username: string;
  password: string;
}

interface DB {
  servers: Server[];
  clients: Client[];
  banners: Banner[];
  admins: Admin[];
  meta: { version: number };
}

const DATA_DIR = path.join(process.cwd(), "data");
const LOCAL_DB = path.join(DATA_DIR, "db.json");
const TMP_DB = "/tmp/makrotv-db.json";

function dbPath(): string {
  // On Vercel, cwd is /var/task, which is read-only, so we use /tmp
  // Check if we can write to LOCAL_DB directory
  try {
    if (process.env.VERCEL) return TMP_DB;
    return LOCAL_DB;
  } catch {
    return TMP_DB;
  }
}

function ensureDefaultDB(): DB {
  const now = new Date().toISOString();
  const defaultAdminPass = bcrypt.hashSync(process.env.ADMIN_PASSWORD || "admin123", 10);
  return {
    servers: [
      {
        id: "srv_default",
        name: "Servidor Principal",
        url: process.env.DEFAULT_DNS || "http://seu-servidor-xtream.com:8080",
        status: "active",
        createdAt: now,
        updatedAt: now,
      },
    ],
    clients: [
      {
        id: "cli_demo",
        name: "Cliente Demonstração",
        username: "demo",
        password: bcrypt.hashSync("demo123", 10),
        email: "demo@makrotv.com",
        serverId: "srv_default",
        status: "active",
        expiry: new Date(Date.now() + 30 * 24 * 60 * 60 * 1000).toISOString(),
        createdAt: now,
        updatedAt: now,
      },
    ],
    // Banners are intentionally empty by default; add the images from the panel.
    banners: [],
    admins: [
      {
        id: "adm_default",
        username: process.env.ADMIN_USERNAME || "admin",
        password: defaultAdminPass,
      },
    ],
    meta: { version: 1 },
  };
}

function normalizeDB(value: Partial<DB>): DB {
  return {
    servers: Array.isArray(value.servers) ? value.servers : [],
    clients: Array.isArray(value.clients) ? value.clients : [],
    banners: Array.isArray(value.banners) ? value.banners : [],
    admins: Array.isArray(value.admins) ? value.admins : [],
    meta: value.meta || { version: 1 },
  };
}

function readDB(): DB {
  const p = dbPath();
  try {
    if (fs.existsSync(p)) {
      const raw = fs.readFileSync(p, "utf-8");
      return normalizeDB(JSON.parse(raw));
    }
  } catch {}
  // try local fallback
  try {
    if (fs.existsSync(LOCAL_DB)) {
      const raw = fs.readFileSync(LOCAL_DB, "utf-8");
      const db = normalizeDB(JSON.parse(raw));
      // copy to tmp for next reads
      try {
        fs.writeFileSync(p, JSON.stringify(db, null, 2));
      } catch {}
      return db;
    }
  } catch {}
  // create default
  const def = ensureDefaultDB();
  try {
    fs.mkdirSync(path.dirname(p), { recursive: true });
    fs.writeFileSync(p, JSON.stringify(def, null, 2));
  } catch {}
  // also write to local if possible
  try {
    fs.mkdirSync(DATA_DIR, { recursive: true });
    if (!fs.existsSync(LOCAL_DB)) fs.writeFileSync(LOCAL_DB, JSON.stringify(def, null, 2));
  } catch {}
  return def;
}

function writeDB(db: DB) {
  const p = dbPath();
  try {
    fs.mkdirSync(path.dirname(p), { recursive: true });
    fs.writeFileSync(p, JSON.stringify(db, null, 2));
  } catch {}
  // also try to write to local for persistence in dev
  try {
    fs.mkdirSync(DATA_DIR, { recursive: true });
    fs.writeFileSync(LOCAL_DB, JSON.stringify(db, null, 2));
  } catch {}
}

// Helpers
export function getDB(): DB {
  return readDB();
}

export function saveDB(db: DB) {
  writeDB(db);
}

export function generateId(prefix: string = "id"): string {
  return `${prefix}_${crypto.randomBytes(6).toString("hex")}_${Date.now().toString(36)}`;
}

// Servers
export function listServers(): Server[] {
  return getDB().servers;
}

export function getServer(id: string): Server | undefined {
  return getDB().servers.find((s) => s.id === id);
}

export function createServer(data: Omit<Server, "id" | "createdAt" | "updatedAt">): Server {
  const db = getDB();
  const now = new Date().toISOString();
  const srv: Server = {
    id: generateId("srv"),
    createdAt: now,
    updatedAt: now,
    ...data,
  };
  db.servers.push(srv);
  saveDB(db);
  return srv;
}

export function updateServer(id: string, data: Partial<Server>): Server | null {
  const db = getDB();
  const idx = db.servers.findIndex((s) => s.id === id);
  if (idx === -1) return null;
  db.servers[idx] = { ...db.servers[idx], ...data, updatedAt: new Date().toISOString() };
  saveDB(db);
  return db.servers[idx];
}

export function deleteServer(id: string): boolean {
  const db = getDB();
  const idx = db.servers.findIndex((s) => s.id === id);
  if (idx === -1) return false;
  db.servers.splice(idx, 1);
  // unlink clients
  db.clients.forEach((c) => {
    if (c.serverId === id) c.serverId = null;
  });
  saveDB(db);
  return true;
}

// Banners
export function listBanners(): Banner[] {
  return getDB().banners.slice().sort((a, b) => a.order - b.order || a.createdAt.localeCompare(b.createdAt));
}

export function listActiveBanners(): Banner[] {
  return listBanners().filter((banner) => banner.active);
}

export function getBanner(id: string): Banner | undefined {
  return getDB().banners.find((banner) => banner.id === id);
}

export function createBanner(data: { title: string; imageUrl: string; linkUrl?: string; active?: boolean; order?: number }): Banner {
  const db = getDB();
  const now = new Date().toISOString();
  const banner: Banner = {
    id: generateId("banner"),
    title: data.title.trim(),
    imageUrl: data.imageUrl.trim(),
    linkUrl: data.linkUrl?.trim() || "",
    active: data.active !== false,
    order: Number.isFinite(data.order) ? Number(data.order) : db.banners.length,
    createdAt: now,
    updatedAt: now,
  };
  db.banners.push(banner);
  saveDB(db);
  return banner;
}

export function updateBanner(id: string, data: Partial<Omit<Banner, "id" | "createdAt">>): Banner | null {
  const db = getDB();
  const idx = db.banners.findIndex((banner) => banner.id === id);
  if (idx === -1) return null;
  const current = db.banners[idx];
  db.banners[idx] = {
    ...current,
    ...data,
    title: data.title === undefined ? current.title : data.title.trim(),
    imageUrl: data.imageUrl === undefined ? current.imageUrl : data.imageUrl.trim(),
    linkUrl: data.linkUrl === undefined ? current.linkUrl || "" : data.linkUrl.trim(),
    order: data.order === undefined ? current.order : Number(data.order),
    updatedAt: new Date().toISOString(),
  };
  saveDB(db);
  return db.banners[idx];
}

export function deleteBanner(id: string): boolean {
  const db = getDB();
  const idx = db.banners.findIndex((banner) => banner.id === id);
  if (idx === -1) return false;
  db.banners.splice(idx, 1);
  saveDB(db);
  return true;
}

// Clients
export function listClients(): Client[] {
  return getDB().clients;
}

export function getClient(id: string): Client | undefined {
  return getDB().clients.find((c) => c.id === id);
}

export function getClientByUsername(username: string): Client | undefined {
  return getDB().clients.find((c) => c.username.toLowerCase() === username.toLowerCase());
}

export function createClient(data: { name: string; username: string; password: string; email?: string; serverId?: string | null; status?: string; expiry?: string | null }): Client {
  const db = getDB();
  if (db.clients.some((c) => c.username.toLowerCase() === data.username.toLowerCase())) {
    throw new Error("Username already exists");
  }
  const now = new Date().toISOString();
  const cli: Client = {
    id: generateId("cli"),
    name: data.name,
    username: data.username,
    password: bcrypt.hashSync(data.password, 10),
    email: data.email || "",
    serverId: data.serverId || null,
    status: data.status || "active",
    expiry: data.expiry || null,
    createdAt: now,
    updatedAt: now,
  };
  db.clients.push(cli);
  saveDB(db);
  return cli;
}

export function updateClient(id: string, data: Partial<Omit<Client, "id" | "createdAt">> & { password?: string }): Client | null {
  const db = getDB();
  const idx = db.clients.findIndex((c) => c.id === id);
  if (idx === -1) return null;
  const existing = db.clients[idx];
  // if username change, check unique
  if (data.username && data.username.toLowerCase() !== existing.username.toLowerCase()) {
    if (db.clients.some((c) => c.username.toLowerCase() === data.username!.toLowerCase())) {
      throw new Error("Username already exists");
    }
  }
  const updated: Client = {
    ...existing,
    ...data,
    password: data.password ? bcrypt.hashSync(data.password, 10) : existing.password,
    updatedAt: new Date().toISOString(),
  } as Client;
  // handle empty password not hashed
  if (data.password === "" || data.password === undefined) {
    updated.password = existing.password;
  }
  db.clients[idx] = updated;
  saveDB(db);
  return updated;
}

export function deleteClient(id: string): boolean {
  const db = getDB();
  const idx = db.clients.findIndex((c) => c.id === id);
  if (idx === -1) return false;
  db.clients.splice(idx, 1);
  saveDB(db);
  return true;
}

export function isClientExpired(client: Client): boolean {
  if (!client.expiry) return false;
  return new Date(client.expiry) < new Date();
}

export function getClientStatus(client: Client): string {
  if (client.status === "blocked") return "blocked";
  if (isClientExpired(client)) return "expired";
  return client.status;
}

// Admins
export function getAdminByUsername(username: string): Admin | undefined {
  return getDB().admins.find((a) => a.username === username);
}

export function verifyAdmin(username: string, password: string): Admin | null {
  const admin = getAdminByUsername(username);
  if (!admin) return null;
  if (bcrypt.compareSync(password, admin.password)) return admin;
  return null;
}

// For Vercel external DB note: if DATABASE_URL is set, you could switch to Prisma here.
export function dbHealth() {
  const db = getDB();
  return {
    servers: db.servers.length,
    clients: db.clients.length,
    banners: db.banners.length,
    activeBanners: db.banners.filter((banner) => banner.active).length,
    admins: db.admins.length,
    path: dbPath(),
    vercel: !!process.env.VERCEL,
    hasDatabaseUrl: !!process.env.DATABASE_URL,
  };
}
