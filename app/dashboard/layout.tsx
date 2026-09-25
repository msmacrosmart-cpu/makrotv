"use client";

import Link from "next/link";
import { usePathname, useRouter } from "next/navigation";
import { useEffect, useState } from "react";
import { Download, ExternalLink, Globe, Image as ImageIcon, LayoutDashboard, LogOut, Menu, Shield, Tv, X } from "lucide-react";

export default function DashboardLayout({ children }: { children: React.ReactNode }) {
  const pathname = usePathname();
  const router = useRouter();
  const [mobile, setMobile] = useState(false);
  const [me, setMe] = useState<{ username: string } | null>(null);

  useEffect(() => {
    fetch("/api/auth/me")
      .then((response) => response.json())
      .then((data) => {
        if (data.username) setMe(data);
        else router.push("/login");
      })
      .catch(() => router.push("/login"));
  }, [router]);

  async function logout() {
    await fetch("/api/auth/logout", { method: "POST" });
    router.push("/login");
  }

  const nav = [
    { href: "/dashboard", label: "Visão geral", icon: LayoutDashboard },
    { href: "/dashboard/banners", label: "Banners", icon: ImageIcon },
    { href: "/dashboard/dns", label: "DNS / URL", icon: Globe },
  ];

  function isActive(href: string) {
    return pathname === href || (href !== "/dashboard" && pathname.startsWith(`${href}/`));
  }

  return (
    <div className="min-h-screen bg-[#0a0a0a] flex">
      <aside className="hidden lg:flex w-72 bg-[#111111] border-r border-white/10 flex-col">
        <div className="p-6">
          <Link href="/dashboard" className="flex items-center gap-3">
            <div className="w-9 h-9 rounded-xl bg-red-600 flex items-center justify-center font-black">M</div>
            <div>
              <div className="font-black leading-none">MakroTV</div>
              <div className="text-xs text-white/50 mt-1">Banners + DNS / URL</div>
              <div className="text-[10px] text-white/30 font-mono">makrotv-ten.vercel.app</div>
            </div>
          </Link>
        </div>

        <nav className="px-3 space-y-1 flex-1">
          {nav.map((item) => {
            const Icon = item.icon;
            return (
              <Link key={item.href} href={item.href} className={`flex items-center gap-3 px-3 py-3 rounded-xl text-sm font-medium transition ${isActive(item.href) ? "bg-white text-black" : "text-white/70 hover:bg-white/5 hover:text-white"}`}>
                <Icon className="w-5 h-5" /> {item.label}
              </Link>
            );
          })}
          <div className="pt-6 mt-6 border-t border-white/10 space-y-3">
            <div className="px-3 py-3 rounded-xl bg-[#1a1a1a] border border-white/10">
              <div className="text-xs text-white/50 flex items-center gap-2"><Shield className="w-3 h-3" /> API status</div>
              <div className="text-sm mt-1 flex items-center gap-2"><span className="w-2 h-2 bg-green-500 rounded-full animate-pulse" /> Operacional</div>
              <div className="text-[11px] text-white/30 font-mono mt-1 truncate">https://makrotv-ten.vercel.app</div>
              <Link href="/api/dns" target="_blank" className="text-xs text-white/50 hover:text-white flex items-center gap-1 mt-2">Testar DNS <ExternalLink className="w-3 h-3" /></Link>
            </div>
            <div className="px-3 py-3 rounded-xl bg-gradient-to-br from-red-600 to-red-700 border border-red-500/30 text-white">
              <div className="text-xs font-black flex items-center gap-2"><Tv className="w-3 h-3" /> MakroTV APK</div>
              <div className="text-xs text-white/90 mt-1">brstore.makro.app • v7 • 62 MB</div>
              <div className="text-xs text-white/70">Apontado para makrotv-ten.vercel.app</div>
              <a href="/api/apk/download" className="mt-3 w-full py-2 rounded-xl bg-white text-red-700 text-xs font-black flex items-center justify-center gap-1.5 hover:bg-white/90">
                <Download className="w-3.5 h-3.5" /> Baixar APK
              </a>
              <Link href="/api/apk/info" target="_blank" className="mt-2 text-xs text-white/70 hover:text-white flex items-center justify-center gap-1">Ver info <ExternalLink className="w-3 h-3" /></Link>
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
            <button onClick={logout} className="w-8 h-8 rounded-full bg-white/5 hover:bg-white/10 flex items-center justify-center"><LogOut className="w-4 h-4" /></button>
          </div>
        </div>
      </aside>

      <div className="flex-1 flex flex-col min-w-0">
        <header className="lg:hidden sticky top-0 z-30 bg-[#111111] border-b border-white/10 px-4 py-3 flex items-center justify-between">
          <Link href="/dashboard" className="flex items-center gap-2 font-black"><div className="w-8 h-8 rounded-lg bg-red-600 flex items-center justify-center">M</div> MakroTV</Link>
          <div className="flex items-center gap-2">
            <a href="/api/apk/download" className="px-3 py-2 rounded-full bg-red-600 text-white text-xs font-bold flex items-center gap-1"><Download className="w-4 h-4" /> APK</a>
            <button onClick={() => setMobile(!mobile)} className="w-9 h-9 rounded-xl bg-white/5 flex items-center justify-center">{mobile ? <X className="w-5 h-5" /> : <Menu className="w-5 h-5" />}</button>
          </div>
        </header>

        {mobile && (
          <div className="lg:hidden bg-[#111111] border-b border-white/10 p-4 space-y-2">
            {nav.map((item) => {
              const Icon = item.icon;
              return <Link key={item.href} href={item.href} onClick={() => setMobile(false)} className={`flex items-center gap-3 px-3 py-3 rounded-xl ${isActive(item.href) ? "bg-white text-black" : "bg-white/5 text-white"}`}><Icon className="w-5 h-5" /> {item.label}</Link>;
            })}
            <a href="/api/apk/download" className="flex items-center gap-3 px-3 py-3 rounded-xl bg-red-600 text-white font-bold"><Download className="w-5 h-5" /> Baixar APK MakroTV</a>
            <button onClick={logout} className="w-full flex items-center gap-3 px-3 py-3 rounded-xl bg-white/5 text-white"><LogOut className="w-5 h-5" /> Sair</button>
          </div>
        )}

        <main className="flex-1 p-4 md:p-8 overflow-auto">{children}</main>
      </div>
    </div>
  );
}
