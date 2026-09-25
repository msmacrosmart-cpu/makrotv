"use client";

import Link from "next/link";
import { usePathname, useRouter } from "next/navigation";
import { useEffect, useState } from "react";
import { LayoutDashboard, Users, Server, LogOut, Tv, Menu, X, Shield, ExternalLink } from "lucide-react";

export default function DashboardLayout({ children }: { children: React.ReactNode }) {
  const pathname = usePathname();
  const router = useRouter();
  const [mobile, setMobile] = useState(false);
  const [me, setMe] = useState<{ username: string } | null>(null);

  useEffect(() => {
    fetch("/api/auth/me")
      .then((r) => r.json())
      .then((d) => {
        if (d.username) setMe(d);
        else router.push("/login");
      })
      .catch(() => router.push("/login"));
  }, [router]);

  async function logout() {
    await fetch("/api/auth/logout", { method: "POST" });
    router.push("/login");
  }

  const nav = [
    { href: "/dashboard", label: "Visão Geral", icon: LayoutDashboard },
    { href: "/dashboard/clients", label: "Clientes", icon: Users },
    { href: "/dashboard/servers", label: "Servidores DNS", icon: Server },
  ];

  return (
    <div className="min-h-screen bg-[#0a0a0a] flex">
      {/* Sidebar desktop */}
      <aside className="hidden lg:flex w-72 bg-[#111111] border-r border-white/10 flex-col">
        <div className="p-6">
          <Link href="/dashboard" className="flex items-center gap-3">
            <div className="w-9 h-9 rounded-xl bg-red-600 flex items-center justify-center font-black">M</div>
            <div>
              <div className="font-black leading-none">MakroTV</div>
              <div className="text-xs text-white/50 -mt-1">Painel Administrativo</div>
            </div>
          </Link>
        </div>

        <nav className="px-3 space-y-1 flex-1">
          {nav.map((n) => {
            const active = pathname === n.href;
            return (
              <Link
                key={n.href}
                href={n.href}
                className={`flex items-center gap-3 px-3 py-3 rounded-xl text-sm font-medium transition ${active ? "bg-white text-black" : "text-white/70 hover:bg-white/5 hover:text-white"}`}
              >
                <n.icon className="w-5 h-5" /> {n.label}
              </Link>
            );
          })}
          <div className="pt-6 mt-6 border-t border-white/10 space-y-3">
            <div className="px-3 py-3 rounded-xl bg-[#1a1a1a] border border-white/10">
              <div className="text-xs text-white/50 flex items-center gap-2"><Shield className="w-3 h-3" /> API Status</div>
              <div className="text-sm mt-1 flex items-center gap-2"><span className="w-2 h-2 bg-green-500 rounded-full animate-pulse" /> Operacional</div>
              <Link href="/api/dns" target="_blank" className="text-xs text-white/50 hover:text-white flex items-center gap-1 mt-2">Testar /api/dns <ExternalLink className="w-3 h-3" /></Link>
            </div>
            <div className="px-3 py-3 rounded-xl bg-red-600/20 border border-red-600/20">
              <div className="text-xs font-bold flex items-center gap-2"><Tv className="w-3 h-3" /> APK</div>
              <div className="text-xs text-white/70 mt-1">brstore.makro.app • IPTV Smarters</div>
              <div className="text-xs text-white/50">Base original: appstop.site (suspenso)</div>
            </div>
          </div>
        </nav>

        <div className="p-4 border-t border-white/10">
          <div className="flex items-center gap-3">
            <div className="w-9 h-9 rounded-full bg-white/10 flex items-center justify-center font-bold">{me?.username?.[0]?.toUpperCase() || "A"}</div>
            <div className="flex-1 min-w-0">
              <div className="text-sm font-semibold truncate">{me?.username || "admin"}</div>
              <div className="text-xs text-white/50">Administrador</div>
            </div>
            <button onClick={logout} className="w-8 h-8 rounded-full bg-white/5 hover:bg-white/10 flex items-center justify-center">
              <LogOut className="w-4 h-4" />
            </button>
          </div>
        </div>
      </aside>

      {/* Main */}
      <div className="flex-1 flex flex-col min-w-0">
        {/* mobile topbar */}
        <header className="lg:hidden sticky top-0 z-30 bg-[#111111] border-b border-white/10 px-4 py-3 flex items-center justify-between">
          <Link href="/dashboard" className="flex items-center gap-2 font-black">
            <div className="w-8 h-8 rounded-lg bg-red-600 flex items-center justify-center">M</div> MakroTV
          </Link>
          <button onClick={() => setMobile(!mobile)} className="w-9 h-9 rounded-xl bg-white/5 flex items-center justify-center">
            {mobile ? <X className="w-5 h-5" /> : <Menu className="w-5 h-5" />}
          </button>
        </header>

        {mobile && (
          <div className="lg:hidden bg-[#111111] border-b border-white/10 p-4 space-y-2">
            {nav.map((n) => (
              <Link key={n.href} href={n.href} onClick={() => setMobile(false)} className={`flex items-center gap-3 px-3 py-3 rounded-xl ${pathname === n.href ? "bg-white text-black" : "bg-white/5 text-white"}`}>
                <n.icon className="w-5 h-5" /> {n.label}
              </Link>
            ))}
            <button onClick={logout} className="w-full flex items-center gap-3 px-3 py-3 rounded-xl bg-red-600 text-white">
              <LogOut className="w-5 h-5" /> Sair
            </button>
          </div>
        )}

        <main className="flex-1 p-4 md:p-8 overflow-auto">{children}</main>
      </div>
    </div>
  );
}
