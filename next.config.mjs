/** @type {import('next').NextConfig} */
const nextConfig = {
  async rewrites() {
    return [
      { source: "/player_api.php", destination: "/api/player" },
      { source: "/makrotv/api/:path*", destination: "/api/makrotv/:path*" },
    ];
  },
  async headers() {
    return [
      {
        source: "/api/:path*",
        headers: [
          { key: "Access-Control-Allow-Origin", value: "*" },
          { key: "Access-Control-Allow-Methods", value: "GET, POST, PUT, DELETE, OPTIONS" },
          { key: "Access-Control-Allow-Headers", value: "Content-Type, Authorization" },
        ],
      },
      {
        source: "/:path*.apk",
        headers: [
          { key: "Content-Type", value: "application/vnd.android.package-archive" },
        ],
      },
    ];
  },
};

export default nextConfig;
