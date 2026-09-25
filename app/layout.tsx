import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "MakroTV - Painel Administrativo",
  description: "Painel administrativo MakroTV - Gerenciamento de clientes IPTV, servidores e DNS",
  icons: {
    icon: "/favicon.ico",
  },
};

export default function RootLayout({ children }: { children: React.ReactNode }) {
  return (
    <html lang="pt-BR" className="dark">
      <body className="min-h-screen bg-[#0a0a0a] text-white antialiased">
        {children}
      </body>
    </html>
  );
}
