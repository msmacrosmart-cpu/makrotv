"use client";

import { useState } from "react";
import { useRouter } from "next/navigation";
import { Tv, Lock, User, AlertCircle, Eye, EyeOff } from "lucide-react";

export default function LoginPage() {
  const router = useRouter();
  const [username, setUsername] = useState("admin");
  const [password, setPassword] = useState("admin123");
  const [show, setShow] = useState(false);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  async function onSubmit(e: React.FormEvent) {
    e.preventDefault();
    setLoading(true);
    setError("");
    try {
      const res = await fetch("/api/auth/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password }),
      });
      const data = await res.json();
      if (!res.ok) throw new Error(data.error || "Falha");
      router.push("/dashboard");
    } catch (err: any) {
      setError(err.message || "Erro ao autenticar");
    } finally {
      setLoading(false);
    }
  }

  return (
    <div className="min-h-screen flex">
      {/* Left branding */}
      <div className="hidden lg:flex w-[46%] bg-gradient-to-br from-red-700 via-red-600 to-orange-600 p-10 flex-col justify-between relative overflow-hidden">
        <div className="absolute -right-20 -bottom-20 w-[500px] h-[500px] bg-white/10 rounded-full blur-3xl" />
        <div>
          <div className="flex items-center gap-3 text-white">
            <div className="w-10 h-10 rounded-xl bg-white text-red-600 flex items-center justify-center font-black text-xl">M</div>
            <span className="text-2xl font-black tracking-tight">MakroTV</span>
          </div>
          <h1 className="text-4xl font-black text-white mt-14 leading-[0.9]">Bem-vindo de volta.</h1>
          <p className="text-white/80 mt-4 max-w-md leading-relaxed">
            Acesse o painel administrativo para gerenciar clientes, servidores e a infraestrutura do seu aplicativo Android.
          </p>
          <div className="grid grid-cols-2 gap-4 mt-10 max-w-md">
            <MiniStat label="Clientes" value="847+" />
            <MiniStat label="Uptime" value="99.9%" />
            <MiniStat label="API" value="<100ms" />
            <MiniStat label="Segurança" value="bcrypt" />
          </div>
        </div>
        <p className="text-white/60 text-sm">© MakroTV • Painel v2 • brstore.makro.app</p>
      </div>

      {/* Right form */}
      <div className="flex-1 flex items-center justify-center p-6 bg-[#0a0a0a]">
        <div className="w-full max-w-md">
          <div className="lg:hidden flex items-center gap-3 mb-8 justify-center">
            <div className="w-9 h-9 rounded-xl bg-red-600 flex items-center justify-center font-black">M</div>
            <span className="font-bold text-xl">MakroTV</span>
          </div>

          <div className="bg-[#1a1a1a] border border-white/10 rounded-3xl p-8 shadow-2xl">
            <div className="w-12 h-12 rounded-2xl bg-red-600 flex items-center justify-center mx-auto">
              <Tv className="w-6 h-6 text-white" />
            </div>
            <h2 className="text-2xl font-black text-center mt-4">Acesso Administrativo</h2>
            <p className="text-center text-white/50 text-sm mt-2">Use suas credenciais do painel. Padrão: admin / admin123</p>

            <form onSubmit={onSubmit} className="mt-8 space-y-4">
              <div>
                <label className="text-sm font-medium text-white/80">Usuário</label>
                <div className="mt-2 relative">
                  <User className="w-5 h-5 absolute left-3 top-1/2 -translate-y-1/2 text-white/40" />
                  <input
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                    className="w-full pl-11 pr-4 py-3 rounded-xl bg-[#262626] border border-white/10 focus:border-red-500/50 focus:outline-none focus:ring-4 focus:ring-red-500/10 transition text-white placeholder:text-white/30"
                    placeholder="admin"
                    required
                  />
                </div>
              </div>
              <div>
                <label className="text-sm font-medium text-white/80">Senha</label>
                <div className="mt-2 relative">
                  <Lock className="w-5 h-5 absolute left-3 top-1/2 -translate-y-1/2 text-white/40" />
                  <input
                    type={show ? "text" : "password"}
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    className="w-full pl-11 pr-11 py-3 rounded-xl bg-[#262626] border border-white/10 focus:border-red-500/50 focus:outline-none focus:ring-4 focus:ring-red-500/10 transition text-white placeholder:text-white/30"
                    placeholder="••••••••"
                    required
                  />
                  <button type="button" onClick={() => setShow(!show)} className="absolute right-3 top-1/2 -translate-y-1/2 text-white/40 hover:text-white">
                    {show ? <EyeOff className="w-5 h-5" /> : <Eye className="w-5 h-5" />}
                  </button>
                </div>
              </div>

              {error && (
                <div className="flex items-center gap-2 text-sm text-red-400 bg-red-500/10 border border-red-500/20 rounded-xl px-3 py-2">
                  <AlertCircle className="w-4 h-4" /> {error}
                </div>
              )}

              <button
                disabled={loading}
                className="w-full py-3 rounded-xl bg-red-600 hover:bg-red-700 disabled:opacity-60 font-semibold transition flex items-center justify-center gap-2"
              >
                {loading ? "Entrando..." : "Entrar no Painel"}
              </button>

              <div className="text-xs text-white/30 text-center pt-2">
                Dica: altere a senha padrão em <span className="text-white/60">.env</span> (ADMIN_USERNAME / ADMIN_PASSWORD) e em <span className="text-white/60">data/db.json</span>
              </div>
            </form>
          </div>

          <div className="mt-6 bg-[#1a1a1a] border border-white/10 rounded-2xl p-4">
            <h3 className="text-sm font-semibold">Para testar a API sem login:</h3>
            <code className="text-xs bg-black rounded-lg px-2 py-1 text-white/70 block mt-2 overflow-auto">
              curl https://seu-dominio.vercel.app/api/dns<br />
              curl https://seu-dominio.vercel.app/player_api.php?username=demo&password=demo123
            </code>
          </div>
        </div>
      </div>
    </div>
  );
}

function MiniStat({ label, value }: { label: string; value: string }) {
  return (
    <div className="bg-white/10 backdrop-blur rounded-2xl p-4 border border-white/15">
      <div className="text-2xl font-black text-white">{value}</div>
      <div className="text-xs text-white/70">{label}</div>
    </div>
  );
}
