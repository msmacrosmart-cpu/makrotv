"use client";

import { useEffect, useState } from "react";
import Link from "next/link";
import { Users, Server, ShieldCheck, AlertTriangle, Clock, Plus, Activity, ExternalLink } from "lucide-react";

type Stats = {
  total: number;
  active: number;
  blocked: number;
  expired: number;
  servers: number;
};

export default function DashboardPage() {
  const [stats, setStats] = useState<Stats | null>(null);
  const [clients, setClients] = useState<any[]>([]);
  const [servers, setServers] = useState<any[]>([]);

  async function load() {
    const [cRes, sRes] = await Promise.all([fetch("/api/clients"), fetch("/api/servers")]);
    const cData = await cRes.json();
    const sData = await sRes.json();
    setClients(cData.clients || []);
    setServers(sData.servers || []);
    const active = (cData.clients || []).filter((c: any) => c.status === "active" && !c.isExpired).length;
    const blocked = (cData.clients || []).filter((c: any) => c.status === "blocked").length;
    const expired = (cData.clients || []).filter((c: any) => c.isExpired).length;
    setStats({
      total: cData.clients?.length || 0,
      active,
      blocked,
      expired,
      servers: sData.servers?.length || 0,
    });
  }

  useEffect(() => {
    load();
  }, []);

  return (
    <div className="space-y-8 max-w-6xl mx-auto">
      <div className="flex flex-wrap items-start justify-between gap-4">
        <div>
          <h1 className="text-3xl font-black tracking-tight">Visão Geral</h1>
          <p className="text-white/50 mt-1">Gerencie clientes, DNS e a saúde da sua API em tempo real.</p>
        </div>
        <div className="flex gap-2">
          <Link href="/dashboard/clients" className="px-4 py-2 rounded-full bg-white text-black text-sm font-semibold flex items-center gap-2 hover:bg-white/90">
            <Plus className="w-4 h-4" /> Novo Cliente
          </Link>
          <Link href="/dashboard/servers" className="px-4 py-2 rounded-full bg-white/10 border border-white/10 text-sm font-semibold flex items-center gap-2 hover:bg-white/15">
            <Server className="w-4 h-4" /> Novo Servidor
          </Link>
        </div>
      </div>

      <div className="grid sm:grid-cols-2 lg:grid-cols-4 gap-4">
        <StatCard label="Total Clientes" value={stats?.total ?? "-"} sub={`${stats?.active ?? 0} ativos`} icon={<Users className="w-5 h-5" />} />
        <StatCard label="Ativos" value={stats?.active ?? "-"} sub="com acesso liberado" icon={<ShieldCheck className="w-5 h-5 text-green-500" />} accent />
        <StatCard label="Bloqueados / Expirados" value={(stats ? stats.blocked + stats.expired : "-") as any} sub={`${stats?.blocked ?? 0} bloqueados, ${stats?.expired ?? 0} expirados`} icon={<AlertTriangle className="w-5 h-5 text-yellow-500" />} />
        <StatCard label="Servidores DNS" value={stats?.servers ?? "-"} sub={`${servers.filter((s) => s.status === "active").length} ativos`} icon={<Server className="w-5 h-5" />} />
      </div>

      <div className="grid lg:grid-cols-3 gap-6">
        <div className="lg:col-span-2 bg-[#1a1a1a] border border-white/10 rounded-2xl p-6">
          <div className="flex items-center justify-between">
            <h2 className="font-bold flex items-center gap-2"><Activity className="w-5 h-5" /> Atividade recente</h2>
            <Link href="/dashboard/clients" className="text-sm text-white/50 hover:text-white">Ver todos</Link>
          </div>
          <div className="mt-6 space-y-3">
            {clients.slice(0, 5).map((c) => (
              <div key={c.id} className="flex items-center justify-between bg-[#262626] border border-white/5 rounded-xl px-4 py-3">
                <div>
                  <div className="font-semibold text-sm flex items-center gap-2">
                    {c.name} <span className="text-white/40 font-normal">@{c.username}</span>
                  </div>
                  <div className="text-xs text-white/50 flex items-center gap-2 mt-1">
                    <Clock className="w-3 h-3" /> Expira: {c.expiry ? new Date(c.expiry).toLocaleDateString("pt-BR") : "sem expiração"} • {c.serverName || "sem servidor"}
                  </div>
                </div>
                <span className={`text-xs px-3 py-1 rounded-full border font-medium ${c.isExpired ? "bg-red-500/10 text-red-400 border-red-500/20" : c.status === "blocked" ? "bg-yellow-500/10 text-yellow-400 border-yellow-500/20" : "bg-green-500/10 text-green-400 border-green-500/20"}`}>
                  {c.isExpired ? "Expirado" : c.status === "blocked" ? "Bloqueado" : "Ativo"}
                </span>
              </div>
            ))}
            {clients.length === 0 && <div className="text-sm text-white/50 text-center py-8">Nenhum cliente ainda. Clique em Novo Cliente.</div>}
          </div>
        </div>

        <div className="space-y-6">
          <div className="bg-gradient-to-br from-red-600 to-red-700 rounded-2xl p-6 text-white">
            <h3 className="font-black text-lg flex items-center gap-2"><Server className="w-5 h-5" /> DNS Atual</h3>
            <p className="text-white/80 text-sm mt-2">Endereço que o APK busca em <code className="bg-white/20 px-1 rounded">/api/dns</code> e <code className="bg-white/20 px-1 rounded">/makrotv/api/dns</code></p>
            <div className="mt-4 bg-white/15 backdrop-blur rounded-xl p-3 border border-white/20">
              <div className="text-xs text-white/70">Servidor principal</div>
              <div className="font-mono text-sm font-bold truncate">{servers[0]?.url || "—"}</div>
              <div className="text-xs text-white/70 mt-1">{servers[0]?.name || "Nenhum servidor"}</div>
            </div>
            <div className="mt-4 flex gap-2">
              <Link href="/api/dns" target="_blank" className="flex-1 py-2 rounded-xl bg-white text-red-700 text-sm font-bold text-center flex items-center justify-center gap-2">Testar API <ExternalLink className="w-4 h-4" /></Link>
            </div>
          </div>

          <div className="bg-[#1a1a1a] border border-white/10 rounded-2xl p-6">
            <h3 className="font-bold">Como funciona?</h3>
            <ol className="text-sm text-white/60 mt-3 space-y-2 list-decimal list-inside">
              <li>App inicia e chama <code className="text-white">/api/dns</code> para obter DNS.</li>
              <li>Retornamos <code className="text-white">su</code> com o(s) servidor(es) vinculados.</li>
              <li>Usuário faz login com usuário/senha.</li>
              <li>App chama <code className="text-white">/player_api.php</code> que valida no painel.</li>
            </ol>
            <div className="mt-4 text-xs text-white/40">Original: <span className="line-through">http://appstop.site/makrotv/api/dns</span> (suspenso) → Agora: seu domínio Vercel.</div>
          </div>
        </div>
      </div>
    </div>
  );
}

function StatCard({ label, value, sub, icon, accent }: { label: string; value: any; sub: string; icon: React.ReactNode; accent?: boolean }) {
  return (
    <div className={`rounded-2xl p-5 border ${accent ? "bg-white text-black border-white" : "bg-[#1a1a1a] border-white/10 text-white"}`}>
      <div className={`w-9 h-9 rounded-xl flex items-center justify-center ${accent ? "bg-black text-white" : "bg-white/5 border border-white/10"}`}>{icon}</div>
      <div className="text-3xl font-black mt-3">{value}</div>
      <div className={`text-sm font-medium ${accent ? "text-black/70" : "text-white"}`}>{label}</div>
      <div className={`text-xs mt-1 ${accent ? "text-black/50" : "text-white/50"}`}>{sub}</div>
    </div>
  );
}
