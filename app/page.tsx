import Link from "next/link";
import { Tv, Shield, Zap, Users, Server, Smartphone } from "lucide-react";

export default function HomePage() {
  return (
    <div className="min-h-screen bg-gradient-to-b from-[#0a0a0a] to-[#1a1a1a]">
      {/* Header */}
      <header className="border-b border-white/10 backdrop-blur">
        <div className="max-w-7xl mx-auto px-6 py-4 flex items-center justify-between">
          <div className="flex items-center gap-3">
            <div className="w-9 h-9 rounded-xl bg-gradient-to-br from-red-600 to-red-700 flex items-center justify-center font-black text-white text-lg">M</div>
            <span className="text-xl font-bold tracking-tight">MakroTV</span>
            <span className="hidden sm:inline text-xs px-2 py-1 rounded-full bg-white/10 text-white/70 border border-white/10">PAINEL v2</span>
          </div>
          <Link href="/login" className="px-5 py-2 rounded-full bg-white text-black font-semibold hover:bg-white/90 transition text-sm">
            Acessar Painel
          </Link>
        </div>
      </header>

      {/* Hero */}
      <section className="max-w-7xl mx-auto px-6 pt-16 pb-10">
        <div className="grid lg:grid-cols-2 gap-12 items-center">
          <div>
            <div className="inline-flex items-center gap-2 text-xs tracking-widest text-red-400 bg-red-500/10 border border-red-500/20 rounded-full px-3 py-1 mb-4">
              <span className="w-2 h-2 rounded-full bg-red-500 animate-pulse" />
              INFRAESTRUTURA PRÓPRIA • SEM DEPENDÊNCIA EXTERNA
            </div>
            <h1 className="text-4xl md:text-5xl font-black leading-[0.95] tracking-tight">
              Seu IPTV, <span className="bg-gradient-to-r from-red-500 to-orange-500 bg-clip-text text-transparent">seu controle.</span>
            </h1>
            <p className="text-white/60 mt-4 text-lg leading-relaxed">
              Painel administrativo completo para o MakroTV. Gerencie clientes, senhas, servidores DNS e validade — sem depender de painéis de terceiros. API própria, pronta para Vercel.
            </p>
            <div className="flex flex-wrap gap-3 mt-8">
              <Link href="/login" className="px-6 py-3 rounded-full bg-red-600 hover:bg-red-700 font-semibold flex items-center gap-2 transition">
                <Shield className="w-5 h-5" /> Entrar no Painel
              </Link>
              <Link href="/api/dns" className="px-6 py-3 rounded-full bg-white/10 hover:bg-white/15 border border-white/10 font-medium flex items-center gap-2 transition">
                <Server className="w-5 h-5" /> Testar API DNS
              </Link>
            </div>
            <div className="flex items-center gap-6 mt-8 text-sm text-white/50">
              <span className="flex items-center gap-2"><Zap className="w-4 h-4 text-yellow-500" /> Resposta &lt; 100ms</span>
              <span className="flex items-center gap-2"><Shield className="w-4 h-4 text-green-500" /> Senhas com bcrypt</span>
              <span className="flex items-center gap-2"><Smartphone className="w-4 h-4" /> APK compatível</span>
            </div>
          </div>

          {/* Mock preview */}
          <div className="relative">
            <div className="absolute -inset-6 bg-gradient-to-r from-red-600/20 to-orange-600/20 blur-3xl rounded-full" />
            <div className="relative bg-[#1a1a1a] border border-white/10 rounded-3xl p-6 shadow-2xl">
              <div className="flex items-center justify-between mb-6">
                <div className="flex items-center gap-2">
                  <div className="w-3 h-3 rounded-full bg-red-500" />
                  <div className="w-3 h-3 rounded-full bg-yellow-500" />
                  <div className="w-3 h-3 rounded-full bg-green-500" />
                </div>
                <span className="text-xs text-white/40">makrotv.vercel.app/dashboard</span>
              </div>
              <div className="space-y-4">
                <div className="grid grid-cols-3 gap-3">
                  <div className="bg-[#262626] rounded-2xl p-4 border border-white/5">
                    <div className="text-2xl font-black">847</div>
                    <div className="text-xs text-white/50">Clientes Ativos</div>
                  </div>
                  <div className="bg-[#262626] rounded-2xl p-4 border border-white/5">
                    <div className="text-2xl font-black">12</div>
                    <div className="text-xs text-white/50">Servidores</div>
                  </div>
                  <div className="bg-gradient-to-br from-red-600 to-red-700 rounded-2xl p-4 text-white">
                    <div className="text-2xl font-black">99.8%</div>
                    <div className="text-xs text-white/80">Uptime API</div>
                  </div>
                </div>
                <div className="bg-[#262626] rounded-2xl p-4 border border-white/5">
                  <div className="text-sm font-semibold flex items-center gap-2"><Users className="w-4 h-4" /> Últimos clientes</div>
                  <div className="mt-3 space-y-2 text-sm">
                    <div className="flex justify-between items-center bg-[#1a1a1a] rounded-xl px-3 py-2 border border-white/5"><span>demo</span><span className="text-xs px-2 py-1 rounded-full bg-green-500/20 text-green-400 border border-green-500/20">Ativo</span></div>
                    <div className="flex justify-between items-center bg-[#1a1a1a] rounded-xl px-3 py-2 border border-white/5"><span>cliente72</span><span className="text-xs px-2 py-1 rounded-full bg-yellow-500/20 text-yellow-400 border border-yellow-500/20">Expira em 3d</span></div>
                    <div className="flex justify-between items-center bg-[#1a1a1a] rounded-xl px-3 py-2 border border-white/5"><span>vip_user</span><span className="text-xs px-2 py-1 rounded-full bg-red-500/20 text-red-400 border border-red-500/20">Bloqueado</span></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      {/* Features */}
      <section className="max-w-7xl mx-auto px-6 py-12">
        <div className="grid md:grid-cols-3 gap-6">
          <Feature icon={<Users className="w-6 h-6" />} title="Gestão de Clientes" desc="Crie logins individuais, defina validade, bloqueie e edite com 1 clique. Histórico completo e busca instantânea." />
          <Feature icon={<Server className="w-6 h-6" />} title="DNS Dinâmico" desc="Altere o endereço do servidor sem recompilar o APK. Cada cliente pode ter seu próprio servidor vinculado." />
          <Feature icon={<Tv className="w-6 h-6" />} title="API Xtream Compatível" desc="Autenticação segura, validação de expiração e compatibilidade total com player_api.php do app original." />
        </div>
      </section>

      <footer className="border-t border-white/10 mt-8 py-8 text-center text-sm text-white/40">
        <p>© {new Date().getFullYear()} MakroTV • Painel próprio • Hospedagem Vercel • APK {`brstore.makro.app`}</p>
        <p className="mt-2 text-xs text-white/30">App original: IPTV Smarters Pro rebrand • Base URL original: http://appstop.site/makrotv/api/ (suspenso) • Nova URL: /api/dns</p>
      </footer>
    </div>
  );
}

function Feature({ icon, title, desc }: { icon: React.ReactNode; title: string; desc: string }) {
  return (
    <div className="bg-[#1a1a1a] border border-white/10 rounded-2xl p-6 hover:border-white/15 transition">
      <div className="w-10 h-10 rounded-xl bg-white/5 border border-white/10 flex items-center justify-center mb-4">{icon}</div>
      <h3 className="font-bold">{title}</h3>
      <p className="text-sm text-white/60 mt-2 leading-relaxed">{desc}</p>
    </div>
  );
}
