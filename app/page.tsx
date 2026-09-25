import Link from "next/link";
import { Tv, Shield, Zap, Server, Smartphone, Download, CheckCircle, ArrowRight, ExternalLink } from "lucide-react";

export default function HomePage() {
  return (
    <div className="min-h-screen bg-gradient-to-b from-[#0a0a0a] to-[#1a1a1a]">
      {/* Header */}
      <header className="border-b border-white/10 backdrop-blur sticky top-0 z-40 bg-[#0a0a0a]/80">
        <div className="max-w-7xl mx-auto px-6 py-4 flex items-center justify-between">
          <div className="flex items-center gap-3">
            <div className="w-9 h-9 rounded-xl bg-gradient-to-br from-red-600 to-red-700 flex items-center justify-center font-black text-white text-lg">M</div>
            <span className="text-xl font-bold tracking-tight">MakroTV</span>
            <span className="hidden sm:inline text-xs px-2 py-1 rounded-full bg-white/10 text-white/70 border border-white/10">PAINEL v2</span>
          </div>
          <div className="flex items-center gap-2">
            <Link href="/api/apk/download" className="hidden md:inline-flex px-4 py-2 rounded-full bg-white/10 hover:bg-white/15 border border-white/10 font-medium text-sm items-center gap-2 transition">
              <Download className="w-4 h-4" /> Baixar APK
            </Link>
            <Link href="/login" className="px-5 py-2 rounded-full bg-white text-black font-semibold hover:bg-white/90 transition text-sm">
              Acessar Painel
            </Link>
          </div>
        </div>
      </header>

      {/* Hero */}
      <section className="max-w-7xl mx-auto px-6 pt-16 pb-10">
        <div className="grid lg:grid-cols-2 gap-12 items-center">
          <div>
            <div className="inline-flex items-center gap-2 text-xs tracking-widest text-red-400 bg-red-500/10 border border-red-500/20 rounded-full px-3 py-1 mb-4">
              <span className="w-2 h-2 rounded-full bg-red-500 animate-pulse" />
              INFRAESTRUTURA PRÓPRIA • https://makrotv-ten.vercel.app
            </div>
            <h1 className="text-4xl md:text-5xl font-black leading-[0.95] tracking-tight">
              Seu IPTV, <span className="bg-gradient-to-r from-red-500 to-orange-500 bg-clip-text text-transparent">seu controle.</span>
            </h1>
            <p className="text-white/60 mt-4 text-lg leading-relaxed">
              Gerencie banners e DNS/URL no painel do MakroTV — sem depender de painéis de terceiros. API própria, hospedada na Vercel.
            </p>
            <div className="flex flex-wrap gap-3 mt-8">
              <Link href="/api/apk/download" className="px-6 py-3 rounded-full bg-red-600 hover:bg-red-700 font-bold flex items-center gap-2 transition shadow-lg shadow-red-600/20">
                <Download className="w-5 h-5" /> Baixar APK MakroTV
              </Link>
              <Link href="/login" className="px-6 py-3 rounded-full bg-white text-black hover:bg-white/90 font-semibold flex items-center gap-2 transition">
                <Shield className="w-5 h-5" /> Entrar no Painel
              </Link>
              <Link href="/api/dns" target="_blank" className="px-6 py-3 rounded-full bg-white/10 hover:bg-white/15 border border-white/10 font-medium flex items-center gap-2 transition">
                <Server className="w-5 h-5" /> Testar API DNS
              </Link>
            </div>
            <p className="text-xs text-white/40 mt-3 flex items-center gap-2">
              <CheckCircle className="w-3 h-3 text-green-500" /> APK já apontado para <span className="font-mono text-white/70">https://makrotv-ten.vercel.app</span> • 62 MB • Android 5.0+
            </p>
            <div className="flex items-center gap-6 mt-6 text-sm text-white/50">
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
                <span className="text-xs text-white/40">makrotv-ten.vercel.app/dashboard</span>
              </div>
              <div className="space-y-4">
                <div className="grid grid-cols-3 gap-3">
                  <div className="bg-[#262626] rounded-2xl p-4 border border-white/5">
                    <div className="text-2xl font-black">—</div>
                    <div className="text-xs text-white/50">Banners Ativos</div>
                  </div>
                  <div className="bg-[#262626] rounded-2xl p-4 border border-white/5">
                    <div className="text-2xl font-black">12</div>
                    <div className="text-xs text-white/50">DNS / URLs</div>
                  </div>
                  <div className="bg-gradient-to-br from-red-600 to-red-700 rounded-2xl p-4 text-white">
                    <div className="text-2xl font-black">99.8%</div>
                    <div className="text-xs text-white/80">Uptime API</div>
                  </div>
                </div>
                <div className="bg-[#262626] rounded-2xl p-4 border border-white/5">
                  <div className="text-sm font-semibold flex items-center gap-2"><Tv className="w-4 h-4" /> Banners publicados</div>
                  <div className="mt-3 space-y-2 text-sm">
                    <div className="flex justify-between items-center bg-[#1a1a1a] rounded-xl px-3 py-2 border border-white/5"><span>Banner principal</span><span className="text-xs px-2 py-1 rounded-full bg-green-500/20 text-green-400 border border-green-500/20">Publicado</span></div>
                    <div className="flex justify-between items-center bg-[#1a1a1a] rounded-xl px-3 py-2 border border-white/5"><span>Oferta especial</span><span className="text-xs px-2 py-1 rounded-full bg-white/10 text-white/60 border border-white/10">Opcional</span></div>
                    <div className="flex justify-between items-center bg-[#1a1a1a] rounded-xl px-3 py-2 border border-white/5"><span>DNS configurado</span><span className="text-xs px-2 py-1 rounded-full bg-green-500/20 text-green-400 border border-green-500/20">Online</span></div>
                  </div>
                </div>
                <Link href="/api/apk/download" className="flex items-center justify-center gap-2 w-full py-3 rounded-xl bg-red-600 hover:bg-red-700 font-bold text-white transition">
                  <Download className="w-4 h-4" /> Baixar APK — 1 clique <ArrowRight className="w-4 h-4" />
                </Link>
              </div>
            </div>
          </div>
        </div>
      </section>

      {/* APK Download highlight */}
      <section className="max-w-7xl mx-auto px-6 py-8">
        <div className="bg-gradient-to-br from-red-600 via-red-600 to-orange-600 rounded-3xl p-8 md:p-10 text-white relative overflow-hidden">
          <div className="absolute inset-0 bg-gradient-to-br from-white/10 to-transparent pointer-events-none" />
          <div className="absolute -right-20 -top-20 w-80 h-80 bg-white/10 rounded-full blur-3xl" />
          <div className="relative grid md:grid-cols-2 gap-8 items-center">
            <div>
              <div className="inline-flex items-center gap-2 bg-white/15 backdrop-blur rounded-full px-3 py-1 text-xs font-bold tracking-widest border border-white/20">
                <Download className="w-3 h-3" /> APK FUNCIONAL • PRONTO PARA INSTALAR
              </div>
              <h2 className="text-3xl font-black mt-4 leading-tight">Baixe o MakroTV<br />já configurado</h2>
              <p className="text-white/80 mt-3 leading-relaxed">
                APK patcheado para <span className="font-mono bg-white/20 px-1.5 py-0.5 rounded text-white">https://makrotv-ten.vercel.app</span>.
                DNS dinâmico: altere servidores no painel e o app atualiza sem recompilar.
              </p>
              <ul className="mt-4 space-y-2 text-sm text-white/90">
                <li className="flex items-center gap-2"><CheckCircle className="w-4 h-4 text-white" /> Sem appstop.site — 100% seu domínio</li>
                <li className="flex items-center gap-2"><CheckCircle className="w-4 h-4 text-white" /> Login Xtream validado no seu painel</li>
                <li className="flex items-center gap-2"><CheckCircle className="w-4 h-4 text-white" /> Instalação: permitir “fontes desconhecidas”</li>
              </ul>
              <div className="flex flex-wrap gap-3 mt-6">
                <a href="/api/apk/download" className="px-7 py-3.5 rounded-full bg-white text-red-700 font-black flex items-center gap-2 hover:bg-white/90 transition shadow-xl">
                  <Download className="w-5 h-5" /> Baixar APK (62 MB)
                </a>
                <Link href="/login" className="px-6 py-3.5 rounded-full bg-black/20 backdrop-blur hover:bg-black/30 border border-white/20 font-semibold flex items-center gap-2 transition">
                  Gerenciar banners <ArrowRight className="w-4 h-4" />
                </Link>
              </div>
              <p className="text-xs text-white/60 mt-3">Versão 7 • brstore.makro.app • Se o download não iniciar, <a href="/api/apk/info" target="_blank" className="underline hover:text-white">ver status</a></p>
            </div>
            <div className="bg-white rounded-3xl p-6 text-black shadow-2xl">
              <div className="flex items-center gap-3">
                <div className="w-12 h-12 rounded-2xl bg-black text-white flex items-center justify-center font-black text-xl">M</div>
                <div>
                  <div className="font-black">MakroTV</div>
                  <div className="text-xs text-black/50">v7 • Patcheado • 62 MB</div>
                </div>
                <span className="ml-auto text-xs px-2.5 py-1 rounded-full bg-green-500 text-white font-bold">✓ ATIVO</span>
              </div>
              <div className="mt-6 space-y-3 text-sm">
                <div className="flex justify-between p-3 rounded-xl bg-black/5 border border-black/5">
                  <span className="text-black/50">Painel</span>
                  <span className="font-mono font-bold text-xs">makrotv-ten.vercel.app</span>
                </div>
                <div className="flex justify-between p-3 rounded-xl bg-black/5 border border-black/5">
                  <span className="text-black/50">API DNS</span>
                  <span className="font-mono text-xs">/api/dns • /makrotv/api/dns</span>
                </div>
                <div className="flex justify-between p-3 rounded-xl bg-green-50 border border-green-200">
                  <span className="text-green-700 font-medium">Status</span>
                  <span className="font-bold text-green-700 flex items-center gap-1"><span className="w-2 h-2 bg-green-500 rounded-full animate-pulse" /> Operacional</span>
                </div>
              </div>
              <div className="mt-6 grid grid-cols-2 gap-3">
                <a href="/api/apk/download" className="py-3 rounded-xl bg-black text-white font-bold text-center flex items-center justify-center gap-2 hover:bg-black/90">
                  <Download className="w-4 h-4" /> Baixar
                </a>
                <Link href="/api/dns" target="_blank" className="py-3 rounded-xl bg-black/5 border border-black/10 font-semibold text-center flex items-center justify-center gap-2 hover:bg-black/10">
                  Testar API <ExternalLink className="w-4 h-4" />
                </Link>
              </div>
              <p className="text-xs text-black/40 text-center mt-3">Após instalar, use demo/demo123 para teste</p>
            </div>
          </div>
        </div>
      </section>

      {/* Features */}
      <section className="max-w-7xl mx-auto px-6 py-12">
        <div className="grid md:grid-cols-3 gap-6">
          <Feature icon={<Tv className="w-6 h-6" />} title="Banners do aplicativo" desc="Cadastre imagens, links e ordem de exibição. Publique ou pause cada banner sem recompilar o APK." />
          <Feature icon={<Server className="w-6 h-6" />} title="DNS / URL dinâmico" desc="Altere o endereço do servidor sem recompilar o APK. A configuração ativa é entregue pela API própria." />
          <Feature icon={<Tv className="w-6 h-6" />} title="API Xtream Compatível" desc="Autenticação segura, validação de expiração e compatibilidade total com player_api.php do app original." />
        </div>
      </section>

      <footer className="border-t border-white/10 mt-8 py-8 text-center text-sm text-white/40">
        <p>© {new Date().getFullYear()} MakroTV • Painel próprio • https://makrotv-ten.vercel.app • APK {`brstore.makro.app`}</p>
        <p className="mt-2 text-xs text-white/30">App original: IPTV Smarters Pro rebrand • Base original: http://appstop.site/makrotv/api/ (suspenso) • Nova URL: https://makrotv-ten.vercel.app</p>
        <p className="mt-2">
          <a href="/api/apk/download" className="inline-flex items-center gap-2 text-red-400 hover:text-red-300 font-medium"><Download className="w-4 h-4" /> Baixar APK MakroTV</a>
          <span className="mx-2">•</span>
          <Link href="/login" className="hover:text-white">Acessar Painel</Link>
        </p>
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
