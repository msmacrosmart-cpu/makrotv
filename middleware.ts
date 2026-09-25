import { NextResponse, type NextRequest } from "next/server";

export function middleware(req: NextRequest) {
  const { pathname } = req.nextUrl;

  // Protect dashboard routes — lightweight check (only existence of cookie)
  // Full verification is done in the server components / API routes via lib/auth (Node runtime)
  if (pathname.startsWith("/dashboard")) {
    const token = req.cookies.get("admin_token")?.value;
    if (!token) {
      const loginUrl = new URL("/login", req.url);
      loginUrl.searchParams.set("next", pathname);
      return NextResponse.redirect(loginUrl);
    }
    // Basic structure check (JWT has 3 parts)
    if (token.split(".").length !== 3) {
      const loginUrl = new URL("/login", req.url);
      return NextResponse.redirect(loginUrl);
    }
  }

  return NextResponse.next();
}

export const config = {
  matcher: ["/dashboard/:path*", "/api/clients/:path*", "/api/servers/:path*", "/api/banners/:path*"],
};
