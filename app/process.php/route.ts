import { NextRequest } from "next/server";
import { createUniversalHandlers } from "@/lib/universal-api";

const handlers = createUniversalHandlers();
export const GET = (request: NextRequest) => handlers.GET(request);
export const POST = (request: NextRequest) => handlers.POST(request);
export const OPTIONS = handlers.OPTIONS;
