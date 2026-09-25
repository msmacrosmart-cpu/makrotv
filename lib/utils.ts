import { clsx, type ClassValue } from "clsx";
import { twMerge } from "tailwind-merge";

export function cn(...inputs: ClassValue[]) {
  return twMerge(clsx(inputs));
}

export function formatDate(date: string | Date | null) {
  if (!date) return "-";
  return new Date(date).toLocaleDateString("pt-BR");
}

export function isExpired(expiry: string | Date | null) {
  if (!expiry) return false;
  return new Date(expiry) < new Date();
}
