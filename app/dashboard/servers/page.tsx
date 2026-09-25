import { redirect } from "next/navigation";

export default function LegacyServersPage() {
  redirect("/dashboard/dns");
}
