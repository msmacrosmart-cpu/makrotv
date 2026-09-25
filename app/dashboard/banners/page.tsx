"use client";

import { useEffect, useState } from "react";
import { Edit2, ExternalLink, Eye, EyeOff, Image as BannerIcon, ImagePlus, Plus, Save, Trash2, X } from "lucide-react";

type Banner = {
  id: string;
  title: string;
  imageUrl: string;
  linkUrl?: string;
  active: boolean;
  order: number;
  createdAt: string;
  updatedAt: string;
};

type FormState = {
  title: string;
  imageUrl: string;
  linkUrl: string;
  active: boolean;
  order: string;
};

const emptyForm: FormState = { title: "", imageUrl: "", linkUrl: "", active: true, order: "0" };

export default function BannersPage() {
  const [banners, setBanners] = useState<Banner[]>([]);
  const [show, setShow] = useState(false);
  const [editing, setEditing] = useState<Banner | null>(null);
  const [form, setForm] = useState<FormState>(emptyForm);
  const [loading, setLoading] = useState(true);
  const [saving, setSaving] = useState(false);
  const [message, setMessage] = useState("");

  async function load() {
    setLoading(true);
    try {
      const response = await fetch("/api/banners", { cache: "no-store" });
      const data = await response.json();
      if (!response.ok) throw new Error(data.error || "Não foi possível carregar os banners");
      setBanners(data.banners || []);
    } catch (error: any) {
      setMessage(error.message || "Erro ao carregar banners");
    } finally {
      setLoading(false);
    }
  }

  useEffect(() => { load(); }, []);

  function openCreate() {
    setEditing(null);
    setForm({ ...emptyForm, order: String(banners.length) });
    setMessage("");
    setShow(true);
  }

  function openEdit(banner: Banner) {
    setEditing(banner);
    setForm({
      title: banner.title,
      imageUrl: banner.imageUrl,
      linkUrl: banner.linkUrl || "",
      active: banner.active,
      order: String(banner.order),
    });
    setMessage("");
    setShow(true);
  }

  async function submit(event: React.FormEvent) {
    event.preventDefault();
    setSaving(true);
    setMessage("");
    const endpoint = editing ? `/api/banners/${editing.id}` : "/api/banners";
    try {
      const response = await fetch(endpoint, {
        method: editing ? "PUT" : "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ ...form, order: Number(form.order) || 0 }),
      });
      const data = await response.json();
      if (!response.ok) throw new Error(data.error || "Não foi possível salvar o banner");
      setShow(false);
      await load();
    } catch (error: any) {
      setMessage(error.message || "Erro ao salvar banner");
    } finally {
      setSaving(false);
    }
  }

  async function remove(id: string) {
    if (!window.confirm("Excluir este banner?")) return;
    const response = await fetch(`/api/banners/${id}`, { method: "DELETE" });
    if (response.ok) await load();
    else {
      const data = await response.json().catch(() => ({}));
      setMessage(data.error || "Não foi possível excluir o banner");
    }
  }

  async function toggle(banner: Banner) {
    const response = await fetch(`/api/banners/${banner.id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ active: !banner.active }),
    });
    if (response.ok) await load();
  }

  return (
    <div className="max-w-6xl mx-auto space-y-6">
      <div className="flex flex-wrap items-start justify-between gap-4">
        <div>
          <div className="flex items-center gap-3">
            <div className="w-11 h-11 rounded-2xl bg-red-600/15 border border-red-500/20 flex items-center justify-center">
              <BannerIcon className="w-6 h-6 text-red-400" />
            </div>
            <div>
              <h1 className="text-2xl md:text-3xl font-black">Banners</h1>
              <p className="text-white/50 text-sm mt-1">Gerencie as imagens exibidas pelo aplicativo MakroTV.</p>
            </div>
          </div>
        </div>
        <button onClick={openCreate} className="px-5 py-3 rounded-full bg-red-600 hover:bg-red-700 font-semibold flex items-center gap-2">
          <Plus className="w-5 h-5" /> Novo banner
        </button>
      </div>

      <div className="bg-blue-500/10 border border-blue-500/20 rounded-2xl p-4 text-sm text-white/70">
        <div className="font-semibold text-blue-300">Como funciona</div>
        <p className="mt-1">Banners ativos são publicados em <code className="bg-white/10 px-1 rounded">/makrotv/api/intro</code>. Informe uma URL pública de imagem; o app consulta a lista sem precisar de um novo APK.</p>
      </div>

      {message && <div className="bg-red-500/10 border border-red-500/20 rounded-xl px-4 py-3 text-sm text-red-300">{message}</div>}

      {loading ? (
        <div className="rounded-2xl bg-[#1a1a1a] border border-white/10 p-12 text-center text-white/50">Carregando banners...</div>
      ) : banners.length === 0 ? (
        <div className="rounded-2xl bg-[#1a1a1a] border border-dashed border-white/15 p-12 text-center">
          <ImagePlus className="w-10 h-10 mx-auto text-white/30" />
          <h2 className="font-bold mt-4">Nenhum banner cadastrado</h2>
          <p className="text-sm text-white/50 mt-2">Adicione o primeiro banner para começar a divulgar conteúdo no aplicativo.</p>
          <button onClick={openCreate} className="mt-5 px-5 py-2.5 rounded-full bg-white text-black font-semibold">Adicionar banner</button>
        </div>
      ) : (
        <div className="grid md:grid-cols-2 lg:grid-cols-3 gap-5">
          {banners.map((banner) => (
            <article key={banner.id} className="overflow-hidden rounded-2xl bg-[#1a1a1a] border border-white/10">
              <div className="relative aspect-[16/9] bg-[#262626]">
                <img src={banner.imageUrl} alt={banner.title} className="w-full h-full object-cover" onError={(event) => { event.currentTarget.style.display = "none"; }} />
                <div className="absolute top-3 left-3 text-xs px-2.5 py-1 rounded-full bg-black/60 backdrop-blur text-white/80">#{banner.order}</div>
                <button onClick={() => toggle(banner)} title={banner.active ? "Desativar" : "Ativar"} className={`absolute top-3 right-3 w-9 h-9 rounded-full flex items-center justify-center backdrop-blur ${banner.active ? "bg-green-500/90 text-white" : "bg-black/60 text-white/60"}`}>
                  {banner.active ? <Eye className="w-4 h-4" /> : <EyeOff className="w-4 h-4" />}
                </button>
              </div>
              <div className="p-4">
                <div className="flex items-start justify-between gap-3">
                  <div className="min-w-0">
                    <h2 className="font-bold truncate">{banner.title}</h2>
                    <p className={`text-xs mt-1 ${banner.active ? "text-green-400" : "text-white/40"}`}>{banner.active ? "Publicado" : "Pausado"}</p>
                  </div>
                  {banner.linkUrl && <a href={banner.linkUrl} target="_blank" rel="noreferrer" className="text-white/40 hover:text-white"><ExternalLink className="w-4 h-4" /></a>}
                </div>
                <p className="font-mono text-[11px] text-white/40 truncate mt-3">{banner.imageUrl}</p>
                <div className="flex gap-2 mt-4">
                  <button onClick={() => openEdit(banner)} className="flex-1 py-2 rounded-xl bg-white/5 hover:bg-white/10 border border-white/10 text-sm font-semibold flex items-center justify-center gap-2"><Edit2 className="w-4 h-4" /> Editar</button>
                  <button onClick={() => remove(banner.id)} className="w-10 h-9 rounded-xl bg-red-500/10 hover:bg-red-500/20 text-red-400 flex items-center justify-center"><Trash2 className="w-4 h-4" /></button>
                </div>
              </div>
            </article>
          ))}
        </div>
      )}

      {show && (
        <div className="fixed inset-0 z-50 bg-black/75 backdrop-blur-sm flex items-center justify-center p-4">
          <div className="w-full max-w-lg bg-[#1a1a1a] border border-white/10 rounded-3xl p-6 shadow-2xl">
            <div className="flex items-center justify-between mb-6">
              <div>
                <h2 className="text-xl font-black">{editing ? "Editar banner" : "Novo banner"}</h2>
                <p className="text-sm text-white/50 mt-1">A imagem deve estar acessível publicamente.</p>
              </div>
              <button onClick={() => setShow(false)} className="w-9 h-9 rounded-full bg-white/5 flex items-center justify-center"><X className="w-5 h-5" /></button>
            </div>
            <form onSubmit={submit} className="space-y-4">
              <div>
                <label className="text-sm font-medium">Título</label>
                <input value={form.title} onChange={(event) => setForm({ ...form, title: event.target.value })} required placeholder="Ex: Oferta de lançamento" className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none focus:border-red-500/50" />
              </div>
              <div>
                <label className="text-sm font-medium">URL da imagem</label>
                <input type="url" value={form.imageUrl} onChange={(event) => setForm({ ...form, imageUrl: event.target.value })} required placeholder="https://.../banner.jpg" className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none focus:border-red-500/50 font-mono text-sm" />
              </div>
              <div>
                <label className="text-sm font-medium">Link ao clicar <span className="text-white/40">(opcional)</span></label>
                <input type="url" value={form.linkUrl} onChange={(event) => setForm({ ...form, linkUrl: event.target.value })} placeholder="https://..." className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none focus:border-red-500/50 font-mono text-sm" />
              </div>
              <div className="grid grid-cols-2 gap-4">
                <div>
                  <label className="text-sm font-medium">Ordem</label>
                  <input type="number" min="0" value={form.order} onChange={(event) => setForm({ ...form, order: event.target.value })} className="mt-2 w-full px-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:outline-none" />
                </div>
                <label className="flex items-center gap-3 mt-7 text-sm cursor-pointer">
                  <input type="checkbox" checked={form.active} onChange={(event) => setForm({ ...form, active: event.target.checked })} className="w-4 h-4 accent-red-600" /> Publicar agora
                </label>
              </div>
              <div className="flex gap-3 pt-2">
                <button type="button" onClick={() => setShow(false)} className="flex-1 py-3 rounded-xl bg-white/5 border border-white/10 font-semibold">Cancelar</button>
                <button type="submit" disabled={saving} className="flex-1 py-3 rounded-xl bg-red-600 hover:bg-red-700 disabled:opacity-60 font-semibold flex items-center justify-center gap-2"><Save className="w-5 h-5" /> {saving ? "Salvando..." : "Salvar banner"}</button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
}
