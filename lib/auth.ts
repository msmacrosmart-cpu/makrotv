import jwt from "jsonwebtoken";
import bcrypt from "bcryptjs";

const JWT_SECRET = process.env.JWT_SECRET || "makrotv-super-secret-change-in-production-2024";
const JWT_EXPIRES = "7d";

export interface AdminPayload {
  id: string;
  username: string;
}

export function hashPassword(password: string): string {
  return bcrypt.hashSync(password, 10);
}

export function verifyPassword(password: string, hash: string): boolean {
  return bcrypt.compareSync(password, hash);
}

export function signAdminToken(payload: AdminPayload): string {
  return jwt.sign(payload, JWT_SECRET, { expiresIn: JWT_EXPIRES });
}

export function verifyAdminToken(token: string): AdminPayload | null {
  try {
    return jwt.verify(token, JWT_SECRET) as AdminPayload;
  } catch {
    return null;
  }
}

export function getAdminFromRequest(req: Request): AdminPayload | null {
  const cookie = req.headers.get("cookie") || "";
  const match = cookie.match(/admin_token=([^;]+)/);
  if (!match) return null;
  return verifyAdminToken(match[1]);
}
