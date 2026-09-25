package f.j.a.h.h.d;

/* loaded from: classes.dex */
public class c extends f.j.a.h.h.d.b {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List<java.lang.String> f10081j = new f.j.a.h.h.d.c.a();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map<java.lang.String, java.lang.String> f10082k = new f.j.a.h.h.d.c.b();

    /* renamed from: l, reason: collision with root package name */
    public static java.util.Map<java.lang.String, f.j.a.h.h.d.d> f10083l = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List<java.io.File> f10084h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10085i;

    /* loaded from: classes.dex */
    public class a extends java.util.ArrayList<java.lang.String> {
        public a() {
            add("index.html");
            add("index.htm");
        }
    }

    /* loaded from: classes.dex */
    public class b extends java.util.HashMap<java.lang.String, java.lang.String> {
        public b() {
            put("css", "text/css");
            put("htm", "text/html");
            put("html", "text/html");
            put(org.simpleframework.xml.stream.DocumentReader.RESERVED, "text/xml");
            put("java", "text/x-java-source, text/java");
            put("md", "text/plain");
            put("txt", "text/plain");
            put("asc", "text/plain");
            put("gif", "image/gif");
            put("jpg", "image/jpeg");
            put("jpeg", "image/jpeg");
            put("png", "image/png");
            put("mp3", "audio/mpeg");
            put("m3u", "audio/mpeg-url");
            put("mp4", "video/mp4");
            put("ogv", "video/ogg");
            put("flv", "video/x-flv");
            put("mov", "video/quicktime");
            put("swf", "application/x-shockwave-flash");
            put("js", "application/javascript");
            put("pdf", "application/pdf");
            put("doc", "application/msword");
            put("ogg", "application/x-ogg");
            put("zip", "application/octet-stream");
            put("exe", "application/octet-stream");
            put(org.simpleframework.xml.strategy.Name.LABEL, "application/octet-stream");
        }
    }

    /* renamed from: f.j.a.h.h.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0270c extends java.io.FileInputStream {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0270c(f.j.a.h.h.d.c cVar, java.io.File file, long j2) {
            super(file);
            this.b = j2;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() {
            return (int) this.b;
        }
    }

    /* loaded from: classes.dex */
    public class d implements java.io.FilenameFilter {
        public d(f.j.a.h.h.d.c cVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return new java.io.File(file, str).isFile();
        }
    }

    /* loaded from: classes.dex */
    public class e implements java.io.FilenameFilter {
        public e(f.j.a.h.h.d.c cVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return new java.io.File(file, str).isDirectory();
        }
    }

    public c(java.lang.String str, int i2, java.io.File file, boolean z) {
        super(str, i2);
        this.f10085i = z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f10084h = arrayList;
        arrayList.add(file);
        B();
    }

    public final java.util.List<java.io.File> A() {
        return this.f10084h;
    }

    public void B() {
    }

    public java.lang.String C(java.lang.String str, java.io.File file) {
        java.lang.String str2;
        java.lang.String substring;
        int lastIndexOf;
        java.lang.String str3 = "Directory " + str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<html><head><title>" + str3 + "</title><style><!--\nspan.dirname { font-weight: bold; }\nspan.filesize { font-size: 75%; }\n// -->\n</style></head><body><h1>" + str3 + "</h1>");
        java.lang.String substring2 = (str.length() <= 1 || (lastIndexOf = (substring = str.substring(0, str.length() - 1)).lastIndexOf(47)) < 0 || lastIndexOf >= substring.length()) ? null : str.substring(0, lastIndexOf + 1);
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(file.list(new f.j.a.h.h.d.c.d(this)));
        java.util.Collections.sort(asList);
        java.util.List asList2 = java.util.Arrays.asList(file.list(new f.j.a.h.h.d.c.e(this)));
        java.util.Collections.sort(asList2);
        if (substring2 != null || asList2.size() + asList.size() > 0) {
            sb.append("<ul>");
            if (substring2 != null || asList2.size() > 0) {
                sb.append("<section class=\"directories\">");
                if (substring2 != null) {
                    sb.append("<li><a rel=\"directory\" href=\"");
                    sb.append(substring2);
                    sb.append("\"><span class=\"dirname\">..</span></a></b></li>");
                }
                java.util.Iterator it = asList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = ((java.lang.String) it.next()) + "/";
                    sb.append("<li><a rel=\"directory\" href=\"");
                    sb.append(u(str + str4));
                    sb.append("\"><span class=\"dirname\">");
                    sb.append(str4);
                    sb.append("</span></a></b></li>");
                }
                sb.append("</section>");
            }
            if (asList.size() > 0) {
                sb.append("<section class=\"files\">");
                for (java.lang.String str5 : asList) {
                    sb.append("<li><a href=\"");
                    sb.append(u(str + str5));
                    sb.append("\"><span class=\"filename\">");
                    sb.append(str5);
                    sb.append("</span></a>");
                    long length = new java.io.File(file, str5).length();
                    sb.append("&nbsp;<span class=\"filesize\">(");
                    if (length < 1024) {
                        sb.append(length);
                        str2 = " bytes";
                    } else if (length < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        sb.append(length / 1024);
                        sb.append(".");
                        sb.append(((length % 1024) / 10) % 100);
                        str2 = " KB";
                    } else {
                        sb.append(length / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        sb.append(".");
                        sb.append(((length % android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 10) % 100);
                        str2 = " MB";
                    }
                    sb.append(str2);
                    sb.append(")</span></li>");
                }
                sb.append("</section>");
            }
            sb.append("</ul>");
        }
        sb.append("</body></html>");
        return sb.toString();
    }

    public final f.j.a.h.h.d.b.k D(java.util.Map<java.lang.String, java.lang.String> map, f.j.a.h.h.d.b.i iVar, java.lang.String str) {
        f.j.a.h.h.d.b.k E;
        java.lang.String replace = str.trim().replace(java.io.File.separatorChar, '/');
        boolean z = false;
        if (replace.indexOf(63) >= 0) {
            replace = replace.substring(0, replace.indexOf(63));
        }
        java.lang.String str2 = replace;
        if (str2.startsWith("src/main") || str2.endsWith("src/main") || str2.contains("../")) {
            return w("Won't serve ../ for security reasons.");
        }
        java.io.File file = null;
        java.util.List<java.io.File> A = A();
        for (int i2 = 0; !z && i2 < A.size(); i2++) {
            file = A.get(i2);
            z = r(str2, file);
        }
        if (!z) {
            return z();
        }
        java.io.File file2 = new java.io.File(file, str2);
        if (file2.isDirectory() && !str2.endsWith("/")) {
            java.lang.String str3 = str2 + "/";
            f.j.a.h.h.d.b.k t = t(f.j.a.h.h.d.b.k.EnumC0269b.REDIRECT, "text/html", "<html><body>Redirected: <a href=\"" + str3 + "\">" + str3 + "</a></body></html>");
            t.a(org.jsoup.helper.HttpConnection.Response.LOCATION, str3);
            return t;
        }
        if (file2.isDirectory()) {
            java.lang.String v = v(file2);
            if (v == null) {
                return file2.canRead() ? t(f.j.a.h.h.d.b.k.EnumC0269b.OK, "text/html", C(str2, file2)) : w("No directory listing.");
            }
            return D(map, iVar, str2 + v);
        }
        java.lang.String y = y(str2);
        f.j.a.h.h.d.d dVar = f10083l.get(y);
        if (dVar != null) {
            E = dVar.b(str2, map, iVar, file2, y);
            if (E != null && (E instanceof f.j.a.h.h.d.a)) {
                f.j.a.h.h.d.a aVar = (f.j.a.h.h.d.a) E;
                return D(aVar.i(), iVar, aVar.j());
            }
        } else {
            E = E(str2, map, file2, y);
        }
        return E != null ? E : z();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:3:0x000a, B:5:0x0041, B:7:0x0049, B:11:0x0057, B:14:0x0061, B:15:0x006b, B:22:0x007f, B:23:0x009b, B:28:0x00a6, B:29:0x00a8, B:32:0x00b5, B:34:0x00fc, B:36:0x010b, B:38:0x0112), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112 A[Catch: IOException -> 0x0133, TRY_LEAVE, TryCatch #0 {IOException -> 0x0133, blocks: (B:3:0x000a, B:5:0x0041, B:7:0x0049, B:11:0x0057, B:14:0x0061, B:15:0x006b, B:22:0x007f, B:23:0x009b, B:28:0x00a6, B:29:0x00a8, B:32:0x00b5, B:34:0x00fc, B:36:0x010b, B:38:0x0112), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f.j.a.h.h.d.b.k E(java.lang.String r21, java.util.Map<java.lang.String, java.lang.String> r22, java.io.File r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.a.h.h.d.c.E(java.lang.String, java.util.Map, java.io.File, java.lang.String):f.j.a.h.h.d.b$k");
    }

    @Override // f.j.a.h.h.d.b
    public f.j.a.h.h.d.b.k l(f.j.a.h.h.d.b.i iVar) {
        java.util.Map<java.lang.String, java.lang.String> a2 = iVar.a();
        java.util.Map<java.lang.String, java.lang.String> c = iVar.c();
        java.lang.String b2 = iVar.b();
        if (!this.f10085i) {
            java.lang.System.out.println(iVar.getMethod() + " '" + b2 + "' ");
            for (java.lang.String str : a2.keySet()) {
                java.lang.System.out.println("  HDR: '" + str + "' = '" + a2.get(str) + "'");
            }
            for (java.lang.String str2 : c.keySet()) {
                java.lang.System.out.println("  PRM: '" + str2 + "' = '" + c.get(str2) + "'");
            }
        }
        for (java.io.File file : A()) {
            if (!file.isDirectory()) {
                return x("given path is not a directory (" + file + ").");
            }
        }
        return D(java.util.Collections.unmodifiableMap(a2), iVar, b2);
    }

    public final boolean r(java.lang.String str, java.io.File file) {
        boolean exists = new java.io.File(file, str).exists();
        if (exists) {
            return exists;
        }
        f.j.a.h.h.d.d dVar = f10083l.get(y(str));
        return dVar != null ? dVar.a(str, file) : exists;
    }

    public final f.j.a.h.h.d.b.k s(f.j.a.h.h.d.b.k.EnumC0269b enumC0269b, java.lang.String str, java.io.InputStream inputStream) {
        f.j.a.h.h.d.b.k kVar = new f.j.a.h.h.d.b.k(enumC0269b, str, inputStream);
        kVar.a("Accept-Ranges", "bytes");
        return kVar;
    }

    public final f.j.a.h.h.d.b.k t(f.j.a.h.h.d.b.k.EnumC0269b enumC0269b, java.lang.String str, java.lang.String str2) {
        f.j.a.h.h.d.b.k kVar = new f.j.a.h.h.d.b.k(enumC0269b, str, str2);
        kVar.a("Accept-Ranges", "bytes");
        return kVar;
    }

    public final java.lang.String u(java.lang.String str) {
        java.lang.StringBuilder sb;
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, "/ ", true);
        java.lang.String str2 = "";
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("/")) {
                sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append("/");
            } else if (nextToken.equals(" ")) {
                sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append("%20");
            } else {
                try {
                    str2 = str2 + java.net.URLEncoder.encode(nextToken, org.jsoup.helper.DataUtil.defaultCharset);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
            str2 = sb.toString();
        }
        return str2;
    }

    public final java.lang.String v(java.io.File file) {
        for (java.lang.String str : f10081j) {
            if (new java.io.File(file, str).exists()) {
                return str;
            }
        }
        return null;
    }

    public f.j.a.h.h.d.b.k w(java.lang.String str) {
        return t(f.j.a.h.h.d.b.k.EnumC0269b.FORBIDDEN, "text/plain", "FORBIDDEN: " + str);
    }

    public f.j.a.h.h.d.b.k x(java.lang.String str) {
        return t(f.j.a.h.h.d.b.k.EnumC0269b.INTERNAL_ERROR, "text/plain", "INTERNAL ERRROR: " + str);
    }

    public final java.lang.String y(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(46);
        java.lang.String str2 = lastIndexOf >= 0 ? f10082k.get(str.substring(lastIndexOf + 1).toLowerCase()) : null;
        return str2 == null ? "application/octet-stream" : str2;
    }

    public f.j.a.h.h.d.b.k z() {
        return t(f.j.a.h.h.d.b.k.EnumC0269b.NOT_FOUND, "text/plain", "Error 404, file not found.");
    }
}
