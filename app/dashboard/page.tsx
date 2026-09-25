"use client";

import { useEffect, useState } from "react";
import Link from "next/link";
import { Download, ExternalLink, Globe, Image as ImageIcon, Plus, Tv } from "lucide-react";

type Banner = { id: string; title: string; imageUrl: string; active: boolean; order: number };
type Server = { id: string; name: string; url: string; status: string };

export default function DashboardPage() {
  const [banners, setBanners] = useState<Banner[]>([]);
  const [servers, setServers] = useState<Server[]>([]);
  const [loading, setLoading] = useState(true);

  async function load() {
    setLoading(true);
    const [bannerResponse, serverResponse] = await Promise.all([fetch("/api/banners", { cache: "no-store" }), fetch("/api/servers", { cache: "no-store" })]);
    const bannerData = await bannerResponse.json();
    const serverData = await serverResponse.json();
    setBanners(bannerData.banners || []);
    setServers(serverData.servers || []);
    setLoading(false);
  }

  useEffect(() => { load(); }, []);

  const activeBanners = banners.filter((banner) => banner.active).length;
  const activeServers = servers.filter((server) => server.status === "active").length;

  return (
    <div className="space-y-8 max-w-6xl mx-auto">
      <div className="flex flex-wrap items-start justify-between gap-4">
        <div>
          <div className="inline-flex items-center gap-2 text-xs tracking-widest text-red-400 bg-red-500/10 border border-red-500/20 rounded-full px-3 py-1">
            <span className="w-2 h-2 rounded-full bg-red-500 animate-pulse" /> PAINEL MAKROTV
          </div>
          <h1 className="text-3xl md:text-4xl font-black tracking-tight mt-4">Gerencie banners e DNS/URL</h1>
          <p className="text-white/50 mt-2">Publique imagens no aplicativo e altere o endereço do servidor sem recompilar o APK.</p>
        </div>
        <div className="flex gap-2">
          <Link href="/dashboard/banners" className="px-4 py-2 rounded-full bg-white text-black text-sm font-semibold flex items-center gap-2 hover:bg-white/90"><Plus className="w-4 h-4" /> Novo banner</Link>
          <Link href="/dashboard/dns" className="px-4 py-2 rounded-full bg-white/10 border border-white/10 text-sm font-semibold flex items-center gap-2 hover:bg-white/15"><Globe className="w-4 h-4" /> DNS / URL</Link>
        </div>
      </div>

      <div className="bg-gradient-to-br from-red-600 to-red-700 rounded-2xl p-6 text-white flex flex-col md:flex-row items-center justify-between gap-4 shadow-xl shadow-red-900/20">
        <div className="flex items-center gap-4">
          <div className="w-12 h-12 rounded-2xl bg-white text-red-600 flex items-center justify-center font-black text-xl">M</div>
          <div>
            <div className="font-black flex items-center gap-2"><Download className="w-4 h-4" /> APK MakroTV — pronto para instalar</div>
            <div className="text-sm text-white/80">Assinado v1 + v2 + v3 • apontado para <span className="font-mono bg-white/20 px-1.5 rounded">https://makrotv-ten.vercel.app</span></div>
          </div>
        </div>
        <div className="flex gap-2 w-full md:w-auto">
          <a href="/api/apk/download" className="flex-1 md:flex-none px-6 py-3 rounded-full bg-white text-red-700 font-black flex items-center justify-center gap-2 hover:bg-white/90 transition"><Download className="w-4 h-4" /> Baixar APK</a>
          <Link href="/api/apk/info" target="_blank" className="px-4 py-3 rounded-full bg-white/15 border border-white/20 font-semibold flex items-center gap-2 hover:bg-white/20"><ExternalLink className="w-4 h-4" /> Info</Link>
        </div>
      </div>

      <div className="grid sm:grid-cols-3 gap-4">
        <StatCard label="Banners publicados" value={loading ? "-" : activeBanners} sub={`${banners.length} cadastrados`} icon={<ImageIcon className="w-5 h-5" />} />
        <StatCard label="DNS / URLs ativos" value={loading ? "-" : activeServers} sub={`${servers.length} configurações`} icon={<Globe className="w-5 h-5" />} accent />
        <StatCard label="API" value="Online" sub="makrotv-ten.vercel.app" icon={<Tv className="w-5 h-5 text-green-400" />} />
      </div>

      <div className="grid lg:grid-cols-2 gap-6">
        <section className="bg-[#1a1a1a] border border-white/10 rounded-2xl p-6">
          <div className="flex items-center justify-between gap-3">
            <div><h2 className="font-bold flex items-center gap-2"><ImageIcon className="w-5 h-5" /> Banners</h2><p className="text-sm text-white/50 mt-1">Conteúdo publicado no app.</p></div>
            <Link href="/dashboard/banners" className="text-sm text-white/50 hover:text-white">Gerenciar</Link>
          </div>
          <div className="mt-5 space-y-3">
            {banners.slice(0, 4).map((banner) => (
              <div key={banner.id} className="flex items-center gap-3 bg-[#262626] border border-white/5 rounded-xl p-3">
                <img src={banner.imageUrl} alt="" className="w-16 h-10 object-cover rounded-lg bg-black/20" />
                <div className="min-w-0 flex-1"><div className="font-semibold text-sm truncate">{banner.title}</div><div className={`text-xs mt-1 ${banner.active ? "text-green-400" : "text-white/40"}`}>{banner.active ? "Publicado" : "Pausado"}</div></div>
                <span className="text-xs text-white/30">#{banner.order}</span>
              </div>
            ))}
            {!loading && banners.length === 0 && <div className="text-sm text-white/50 text-center py-8">Nenhum banner cadastrado.</div>}
          </div>
        </section>

        <section className="bg-gradient-to-br from-[#242424] to-[#171717] border border-white/10 rounded-2xl p-6">
          <div className="flex items-center justify-between gap-3"><div><h2 className="font-bold flex items-center gap-2"><Globe className="w-5 h-5 text-red-400" /> DNS / URL</h2><p className="text-sm text-white/50 mt-1">Endereço retornado ao APK.</p></div><Link href="/dashboard/dns" className="text-sm text-white/50 hover:text-white">Gerenciar</Link></div>
          <div className="mt-5 space-y-3">
            {servers.slice(0, 3).map((server) => (
              <div key={server.id} className="bg-white/5 border border-white/5 rounded-xl p-4"><div className="flex items-center justify-between gap-3"><div className="font-semibold text-sm truncate">{server.name}</div><span className={`text-xs ${server.status === "active" ? "text-green-400" : "text-white/40"}`}>{server.status === "active" ? "Ativo" : "Inativo"}</span></div><div className="font-mono text-xs text-white/50 truncate mt-2">{server.url}</div></div>
            ))}
            {!loading && servers.length === 0 && <div className="text-sm text-white/50 text-center py-8">Nenhum DNS cadastrado.</div>}
          </div>
          <div className="mt-5 flex flex-wrap gap-2"><Link href="/api/dns" target="_blank" className="px-4 py-2 rounded-xl bg-white/10 border border-white/10 text-sm font-semibold flex items-center gap-2"><ExternalLink className="w-4 h-4" /> Testar /api/dns</Link><a href="/api/apk/download" className="px-4 py-2 rounded-xl bg-red-600 text-sm font-bold flex items-center gap-2"><Download className="w-4 h-4" /> Baixar APK</a></div>
        </section>
      </div>

      <div className="bg-[#1a1a1a] border border-white/10 rounded-2xl p-6">
        <h2 className="font-bold">URLs públicas</h2>
        <div className="grid md:grid-cols-3 gap-3 mt-4 text-xs font-mono">
          <code className="bg-[#262626] rounded-xl p-3 text-white/70">/makrotv/api/intro<br /><span className="text-white/40">banners do app</span></code>
          <code className="bg-[#262626] rounded-xl p-3 text-white/70">/makrotv/api/dns<br /><span className="text-white/40">DNS / URL</span></code>
          <code className="bg-[#262626] rounded-xl p-3 text-white/70">/api/apk/download<br /><span className="text-white/40">APK assinado</span></code>
        </div>
      </div>
    </div>
  );
}

function StatCard({ label, value, sub, icon, accent }: { label: string; value: string | number; sub: string; icon: React.ReactNode; accent?: boolean }) {
  return <div className={`rounded-2xl p-5 border ${accent ? "bg-white text-black border-white" : "bg-[#1a1a1a] border-white/10 text-white"}`}><div className={`w-9 h-9 rounded-xl flex items-center justify-center ${accent ? "bg-black text-white" : "bg-white/5 border border-white/10"}`}>{icon}</div><div className="text-3xl font-black mt-3">{value}</div><div className={`text-sm font-medium ${accent ? "text-black/70" : "text-white"}`}>{label}</div><div className={`text-xs mt-1 ${accent ? "text-black/50" : "text-white/50"}`}>{sub}</div></div>;
}
