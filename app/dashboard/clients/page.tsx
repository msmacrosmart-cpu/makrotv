"use client";

import { useEffect, useState } from "react";
import { Plus, Search, Edit2, Trash2, Shield, Calendar, Server as ServerIcon, Eye, EyeOff, X, Save } from "lucide-react";

type Client = {
  id: string;
  name: string;
  username: string;
  email?: string;
  serverId?: string | null;
  serverName?: string | null;
  serverUrl?: string | null;
  status: string;
  expiry?: string | null;
  isExpired?: boolean;
  createdAt: string;
};

type Server = {
  id: string;
  name: string;
  url: string;
  status: string;
};

export default function ClientsPage() {
  const [clients, setClients] = useState<Client[]>([]);
  const [servers, setServers] = useState<Server[]>([]);
  const [q, setQ] = useState("");
  const [showModal, setShowModal] = useState(false);
  const [editing, setEditing] = useState<Client | null>(null);
  const [showPass, setShowPass] = useState(false);
  const [form, setForm] = useState({ name: "", username: "", password: "", email: "", serverId: "", status: "active", expiry: "" });
  const [msg, setMsg] = useState("");

  async function load() {
    const [cRes, sRes] = await Promise.all([fetch("/api/clients"), fetch("/api/servers")]);
    if (cRes.ok) {
      const data = await cRes.json();
      setClients(data.clients || []);
    }
    if (sRes.ok) {
      const data = await sRes.json();
      setServers(data.servers || []);
    }
  }

  useEffect(() => { load(); }, []);

  function openCreate() {
    setEditing(null);
    setForm({ name: "", username: "", password: "", email: "", serverId: servers[0]?.id || "", status: "active", expiry: "" });
    setShowModal(true);
  }

  function openEdit(c: Client) {
    setEditing(c);
    setForm({
      name: c.name,
      username: c.username,
      password: "",
      email: c.email || "",
      serverId: c.serverId || "",
      status: c.isExpired ? "expired" : c.status,
      expiry: c.expiry ? new Date(c.expiry).toISOString().slice(0, 10) : "",
    });
    setShowModal(true);
  }

  async function submit(e: React.FormEvent) {
    e.preventDefault();
    const payload: any = {
      name: form.name,
      username: form.username,
      email: form.email,
      serverId: form.serverId || null,
      status: form.status,
      expiry: form.expiry ? new Date(form.expiry).toISOString() : null,
    };
    if (form.password) payload.password = form.password;
    else if (!editing) payload.password = form.password; // required for create, already validated
    if (!editing && !payload.password) {
      setMsg("Senha é obrigatória para novo cliente");
      return;
    }
    const url = editing ? `/api/clients/${editing.id}` : "/api/clients";
    const method = editing ? "PUT" : "POST";
    const res = await fetch(url, { method, headers: { "Content-Type": "application/json" }, body: JSON.stringify(payload) });
    const data = await res.json();
    if (!res.ok) {
      setMsg(data.error || "Erro");
      return;
    }
    setShowModal(false);
    setMsg("");
    load();
  }

  async function del(id: string) {
    if (!confirm("Excluir cliente? Esta ação não pode ser desfeita.")) return;
    const res = await fetch(`/api/clients/${id}`, { method: "DELETE" });
    if (res.ok) load();
  }

  async function toggleBlock(c: Client) {
    const newStatus = c.status === "blocked" ? "active" : "blocked";
    await fetch(`/api/clients/${c.id}`, { method: "PUT", headers: { "Content-Type": "application/json" }, body: JSON.stringify({ status: newStatus }) });
    load();
  }

  const filtered = clients.filter((c) => {
    const hay = `${c.name} ${c.username} ${c.email || ""} ${c.serverName || ""}`.toLowerCase();
    return hay.includes(q.toLowerCase());
  });

  return (
    <div className="max-w-6xl mx-auto space-y-6">
      <div className="flex flex-wrap gap-4 items-start justify-between">
        <div>
          <h1 className="text-2xl font-black flex items-center gap-3"><Shield className="w-7 h-7 text-red-500" /> Clientes</h1>
          <p className="text-white/50 text-sm mt-1">Cadastre, edite, bloqueie e vincule cada cliente ao seu servidor DNS.</p>
        </div>
        <button onClick={openCreate} className="px-5 py-3 rounded-full bg-red-600 hover:bg-red-700 font-semibold flex items-center gap-2">
          <Plus className="w-5 h-5" /> Novo Cliente
        </button>
      </div>

      <div className="bg-[#1a1a1a] border border-white/10 rounded-2xl p-4 flex flex-wrap gap-4 items-center justify-between">
        <div className="relative flex-1 max-w-md">
          <Search className="w-5 h-5 absolute left-3 top-1/2 -translate-y-1/2 text-white/40" />
          <input value={q} onChange={(e) => setQ(e.target.value)} placeholder="Buscar por nome, usuário, email ou servidor..." className="w-full pl-11 pr-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:border-white/20 focus:outline-none text-sm" />
        </div>
        <div className="text-sm text-white/50">{filtered.length} cliente(s) • {clients.filter((c) => c.status === "active" && !c.isExpired).length} ativos</div>
      </div>

      <div className="bg-[#1a1a1a] border border-white/10 rounded-2xl overflow-hidden">
        <div className="overflow-x-auto">
          <table className="w-full text-sm">
            <thead className="bg-[#262626]/50 text-white/60 text-xs uppercase tracking-widest">
              <tr>
                <th className="text-left px-4 py-3">Cliente</th>
                <th className="text-left px-4 py-3">Login</th>
                <th className="text-left px-4 py-3">Servidor DNS</th>
                <th className="text-left px-4 py-3">Validade</th>
                <th className="text-left px-4 py-3">Status</th>
                <th className="text-right px-4 py-3">Ações</th>
              </tr>
            </thead>
            <tbody className="divide-y divide-white/5">
              {filtered.map((c) => (
                <tr key={c.id} className="hover:bg-white/[0.02]">
                  <td className="px-4 py-4">
                    <div className="font-semibold">{c.name}</div>
                    <div className="text-xs text-white/50">{c.email || "—"}</div>
                  </td>
                  <td className="px-4 py-4 font-mono text-xs">{c.username}</td>
                  <td className="px-4 py-4">
                    <div className="flex items-center gap-2 text-xs">
                      <ServerIcon className="w-3 h-3 text-white/40" />
                      <span className="truncate max-w-[180px]">{c.serverName || "Sem servidor"}</span>
                    </div>
                    <div className="text-xs text-white/40 truncate max-w-[180px]">{c.serverUrl || "—"}</div>
                  </td>
                  <td className="px-4 py-4 text-xs flex items-center gap-1">
                    <Calendar className="w-3 h-3 text-white/40" />
                    {c.expiry ? new Date(c.expiry).toLocaleDateString("pt-BR") : "Vitalício"}
                  </td>
                  <td className="px-4 py-4">
                    <span className={`text-xs px-2.5 py-1 rounded-full border font-medium ${c.isExpired ? "bg-red-500/10 text-red-400 border-red-500/20" : c.status === "blocked" ? "bg-yellow-500/10 text-yellow-400 border-yellow-500/20" : "bg-green-500/10 text-green-400 border-green-500/20"}`}>
                      {c.isExpired ? "Expirado" : c.status === "blocked" ? "Bloqueado" : "Ativo"}
                    </span>
                  </td>
                  <td className="px-4 py-4">
                    <div className="flex items-center justify-end gap-1">
                      <button onClick={() => openEdit(c)} className="w-8 h-8 rounded-full bg-white/5 hover:bg-white/10 flex items-center justify-center"><Edit2 className="w-4 h-4" /></button>
                      <button onClick={() => toggleBlock(c)} className={`w-8 h-8 rounded-full flex items-center justify-center text-xs font-bold ${c.status === "blocked" ? "bg-green-500/20 text-green-400" : "bg-yellow-500/20 text-yellow-400"}`} title={c.status === "blocked" ? "Desbloquear" : "Bloquear"}>{c.status === "blocked" ? "✓" : "◼"}</button>
                      <button onClick={() => del(c.id)} className="w-8 h-8 rounded-full bg-red-500/10 hover:bg-red-500/20 text-red-400 flex items-center justify-center"><Trash2 className="w-4 h-4" /></button>
                    </div>
                  </td>
                </tr>
              ))}
              {filtered.length === 0 && (
                <tr>
                  <td colSpan={6} className="text-center py-12 text-white/40">
                    Nenhum cliente encontrado.
                  </td>
                </tr>
              )}
            </tbody>
          </table>
        </div>
      </div>

      {showModal && (
        <div className="fixed inset-0 z-50 bg-black/70 backdrop-blur flex items-center justify-center p-4">
          <div className="w-full max-w-lg bg-[#1a1a1a] border border-white/10 rounded-3xl p-6 max-h-[90vh] overflow-auto">
            <div className="flex items-center justify-between mb-6">
              <h2 className="text-xl font-black">{editing ? "Editar Cliente" : "Novo Cliente"}</h2>
              <button onClick={() => setShowModal(false)} className="w-8 h-8 rounded-full bg-white/5 flex items-center justify-center"><X className="w-5 h-5" /></button>
            </div>
            <form onSubmit={submit} className="space-y-4">
              <div>
                <label className="text-sm font-medium">Nome completo</label>
                <input value={form.name} onChange={(e) => setForm({ ...form, name: e.target.value })} required className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none focus:border-red-500/50" placeholder="Ex: João Silva" />
              </div>
              <div className="grid grid-cols-2 gap-4">
                <div>
                  <label className="text-sm font-medium">Usuário (login)</label>
                  <input value={form.username} onChange={(e) => setForm({ ...form, username: e.target.value })} required className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none" placeholder="joao123" />
                </div>
                <div>
                  <label className="text-sm font-medium">Senha {editing && <span className="text-white/40 text-xs">(deixe vazio para manter)</span>}</label>
                  <div className="relative mt-2">
                    <input type={showPass ? "text" : "password"} value={form.password} onChange={(e) => setForm({ ...form, password: e.target.value })} required={!editing} className="w-full px-4 pr-10 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none" placeholder="••••••" />
                    <button type="button" onClick={() => setShowPass(!showPass)} className="absolute right-3 top-1/2 -translate-y-1/2 text-white/40">{showPass ? <EyeOff className="w-5 h-5" /> : <Eye className="w-5 h-5" />}</button>
                  </div>
                </div>
              </div>
              <div>
                <label className="text-sm font-medium">E-mail (opcional)</label>
                <input value={form.email} onChange={(e) => setForm({ ...form, email: e.target.value })} className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none" placeholder="joao@email.com" />
              </div>
              <div>
                <label className="text-sm font-medium">Servidor DNS vinculado</label>
                <select value={form.serverId} onChange={(e) => setForm({ ...form, serverId: e.target.value })} className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none">
                  <option value="">Sem servidor (usará padrão)</option>
                  {servers.map((s) => (
                    <option key={s.id} value={s.id}>{s.name} — {s.url}</option>
                  ))}
                </select>
                <p className="text-xs text-white/40 mt-1">O app receberá este DNS ao fazer login. Altere sem precisar recompilar o APK.</p>
              </div>
              <div className="grid grid-cols-2 gap-4">
                <div>
                  <label className="text-sm font-medium">Status</label>
                  <select value={form.status} onChange={(e) => setForm({ ...form, status: e.target.value })} className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10">
                    <option value="active">Ativo</option>
                    <option value="blocked">Bloqueado</option>
                  </select>
                </div>
                <div>
                  <label className="text-sm font-medium">Validade</label>
                  <input type="date" value={form.expiry} onChange={(e) => setForm({ ...form, expiry: e.target.value })} className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10" />
                </div>
              </div>
              {msg && <div className="text-sm text-red-400 bg-red-500/10 border border-red-500/20 rounded-xl px-3 py-2">{msg}</div>}
              <div className="flex gap-3 pt-2">
                <button type="button" onClick={() => setShowModal(false)} className="flex-1 py-3 rounded-xl bg-white/5 border border-white/10 font-semibold">Cancelar</button>
                <button type="submit" className="flex-1 py-3 rounded-xl bg-red-600 hover:bg-red-700 font-semibold flex items-center justify-center gap-2"><Save className="w-5 h-5" /> {editing ? "Salvar" : "Criar Cliente"}</button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
}
