"use client";

import { useEffect, useState } from "react";
import { Server, Plus, Edit2, Trash2, ExternalLink, X, Save, Globe } from "lucide-react";

type Srv = { id: string; name: string; url: string; status: string; createdAt: string };

export default function DnsPage() {
  const [servers, setServers] = useState<Srv[]>([]);
  const [show, setShow] = useState(false);
  const [editing, setEditing] = useState<Srv | null>(null);
  const [form, setForm] = useState({ name: "", url: "", status: "active" });
  const [msg, setMsg] = useState("");

  async function load() {
    const r = await fetch("/api/servers");
    const data = await r.json();
    setServers(data.servers || []);
  }
  useEffect(() => { load(); }, []);

  function openCreate() {
    setEditing(null);
    setForm({ name: "", url: "http://", status: "active" });
    setShow(true);
  }
  function openEdit(s: Srv) {
    setEditing(s);
    setForm({ name: s.name, url: s.url, status: s.status });
    setShow(true);
  }

  async function submit(e: React.FormEvent) {
    e.preventDefault();
    const url = editing ? `/api/servers/${editing.id}` : "/api/servers";
    const method = editing ? "PUT" : "POST";
    const res = await fetch(url, { method, headers: { "Content-Type": "application/json" }, body: JSON.stringify(form) });
    const data = await res.json();
    if (!res.ok) return setMsg(data.error || "Erro");
    setShow(false);
    load();
  }

  async function del(id: string) {
    if (!confirm("Excluir esta configuração de DNS?")) return;
    const r = await fetch(`/api/servers/${id}`, { method: "DELETE" });
    if (r.ok) load();
  }

  return (
    <div className="max-w-6xl mx-auto space-y-6">
      <div className="flex flex-wrap gap-4 items-start justify-between">
        <div>
          <h1 className="text-2xl font-black flex items-center gap-3"><Server className="w-7 h-7 text-red-500" /> DNS / URL</h1>
          <p className="text-white/50 text-sm mt-1">Cadastre e altere os endereços dos servidores sem recompilar o APK. O APK consulta a configuração ativa para descobrir o endereço do servidor.</p>
        </div>
        <button onClick={openCreate} className="px-5 py-3 rounded-full bg-red-600 hover:bg-red-700 font-semibold flex items-center gap-2"><Plus className="w-5 h-5" /> Novo DNS / URL</button>
      </div>

      <div className="bg-amber-500/10 border border-amber-500/20 rounded-2xl p-4 flex gap-3">
        <Globe className="w-5 h-5 text-amber-500 mt-0.5" />
        <div className="text-sm">
          <div className="font-semibold text-amber-400">Como o DNS funciona?</div>
          <div className="text-white/60 mt-1">O aplicativo busca o DNS em <code className="bg-white/10 px-1 rounded">/makrotv/api/dns</code> e <code className="bg-white/10 px-1 rounded">/api/dns</code>. Antes, apontava para <span className="line-through">http://appstop.site/makrotv/api/dns</span> (suspenso). Agora, você controla o retorno pelo painel. Se um cliente tem servidor vinculado, ele recebe o URL desse servidor; caso contrário, recebe o servidor padrão.</div>
        </div>
      </div>

      <div className="grid md:grid-cols-2 lg:grid-cols-3 gap-4">
        {servers.map((s) => (
          <div key={s.id} className="bg-[#1a1a1a] border border-white/10 rounded-2xl p-5 hover:border-white/15 transition">
            <div className="flex items-start justify-between">
              <div className="w-10 h-10 rounded-xl bg-white/5 border border-white/10 flex items-center justify-center"><Server className="w-5 h-5" /></div>
              <span className={`text-xs px-2.5 py-1 rounded-full border ${s.status === "active" ? "bg-green-500/10 text-green-400 border-green-500/20" : "bg-white/5 text-white/50 border-white/10"}`}>{s.status === "active" ? "Ativo" : "Inativo"}</span>
            </div>
            <div className="font-bold mt-4 truncate">{s.name}</div>
            <div className="text-sm text-white/60 font-mono truncate flex items-center gap-1 mt-1"><Globe className="w-3 h-3" /> {s.url}</div>
            <div className="text-xs text-white/30 mt-2">Criado: {new Date(s.createdAt).toLocaleDateString("pt-BR")}</div>
            <div className="flex gap-2 mt-4">
              <a href={s.url} target="_blank" className="flex-1 py-2 rounded-xl bg-white/5 hover:bg-white/10 border border-white/10 text-xs font-semibold flex items-center justify-center gap-1">Abrir <ExternalLink className="w-3 h-3" /></a>
              <button onClick={() => openEdit(s)} className="w-9 h-9 rounded-xl bg-white/5 hover:bg-white/10 flex items-center justify-center"><Edit2 className="w-4 h-4" /></button>
              <button onClick={() => del(s.id)} className="w-9 h-9 rounded-xl bg-red-500/10 hover:bg-red-500/20 text-red-400 flex items-center justify-center"><Trash2 className="w-4 h-4" /></button>
            </div>
          </div>
        ))}
      </div>

      {servers.length === 0 && <div className="text-center py-16 text-white/40 bg-[#1a1a1a] border border-white/10 rounded-2xl">Nenhum DNS cadastrado. Crie o primeiro para o app voltar a funcionar.</div>}

      {show && (
        <div className="fixed inset-0 z-50 bg-black/70 backdrop-blur flex items-center justify-center p-4">
          <div className="w-full max-w-md bg-[#1a1a1a] border border-white/10 rounded-3xl p-6">
            <div className="flex items-center justify-between mb-6">
              <h2 className="text-xl font-black">{editing ? "Editar DNS / URL" : "Novo DNS / URL"}</h2>
              <button onClick={() => setShow(false)} className="w-8 h-8 rounded-full bg-white/5 flex items-center justify-center"><X className="w-5 h-5" /></button>
            </div>
            <form onSubmit={submit} className="space-y-4">
              <div>
                <label className="text-sm font-medium">Nome da configuração</label>
                <input value={form.name} onChange={(e) => setForm({ ...form, name: e.target.value })} required placeholder="Ex: DNS Principal" className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none" />
              </div>
              <div>
                <label className="text-sm font-medium">URL DNS</label>
                <input value={form.url} onChange={(e) => setForm({ ...form, url: e.target.value })} required placeholder="http://seu-servidor.com:8080" className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none font-mono text-sm" />
                <p className="text-xs text-white/40 mt-2">Use com ou sem porta. Exemplos: http://51.75.16.104:8080, http://meudns.com, http://135.148.33.103</p>
              </div>
              <div>
                <label className="text-sm font-medium">Status</label>
                <select value={form.status} onChange={(e) => setForm({ ...form, status: e.target.value })} className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10">
                  <option value="active">Ativo</option>
                  <option value="inactive">Inativo</option>
                </select>
              </div>
              {msg && <div className="text-sm text-red-400 bg-red-500/10 border border-red-500/20 rounded-xl px-3 py-2">{msg}</div>}
              <div className="flex gap-3 pt-2">
                <button type="button" onClick={() => setShow(false)} className="flex-1 py-3 rounded-xl bg-white/5 border border-white/10">Cancelar</button>
                <button type="submit" className="flex-1 py-3 rounded-xl bg-red-600 hover:bg-red-700 font-semibold flex items-center justify-center gap-2"><Save className="w-5 h-5" /> {editing ? "Salvar" : "Criar"}</button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
}
