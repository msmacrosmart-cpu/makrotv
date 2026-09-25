package f.j.a.h.h.d;

/* loaded from: classes.dex */
public abstract class b {
    public final java.lang.String a;
    public final int b;
    public java.net.ServerSocket c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set<java.net.Socket> f10046d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Thread f10047e;

    /* renamed from: f, reason: collision with root package name */
    public f.j.a.h.h.d.b.InterfaceC0268b f10048f;

    /* renamed from: g, reason: collision with root package name */
    public f.j.a.h.h.d.b.o f10049g;

    /* loaded from: classes.dex */
    public class a implements java.lang.Runnable {

        /* renamed from: f.j.a.h.h.d.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0267a implements java.lang.Runnable {
            public final /* synthetic */ java.net.Socket b;
            public final /* synthetic */ java.io.InputStream c;

            public RunnableC0267a(java.net.Socket socket, java.io.InputStream inputStream) {
                this.b = socket;
                this.c = inputStream;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.io.OutputStream outputStream = null;
                try {
                    try {
                        outputStream = this.b.getOutputStream();
                        f.j.a.h.h.d.b.h hVar = new f.j.a.h.h.d.b.h(f.j.a.h.h.d.b.this.f10049g.a(), this.c, outputStream, this.b.getInetAddress());
                        while (!this.b.isClosed()) {
                            hVar.f();
                        }
                    } catch (java.lang.Exception e2) {
                        if (!(e2 instanceof java.net.SocketException) || !"NanoHttpd Shutdown".equals(e2.getMessage())) {
                            e2.printStackTrace();
                        }
                    }
                } finally {
                    f.j.a.h.h.d.b.i(outputStream);
                    f.j.a.h.h.d.b.i(this.c);
                    f.j.a.h.h.d.b.k(this.b);
                    f.j.a.h.h.d.b.this.q(this.b);
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    java.net.Socket accept = f.j.a.h.h.d.b.this.c.accept();
                    f.j.a.h.h.d.b.this.h(accept);
                    accept.setSoTimeout(org.jsoup.examples.HtmlToPlainText.timeout);
                    f.j.a.h.h.d.b.this.f10048f.a(new f.j.a.h.h.d.b.a.RunnableC0267a(accept, accept.getInputStream()));
                } catch (java.io.IOException unused) {
                }
            } while (!f.j.a.h.h.d.b.this.c.isClosed());
        }
    }

    /* renamed from: f.j.a.h.h.d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0268b {
        void a(java.lang.Runnable runnable);
    }

    /* loaded from: classes.dex */
    public static class c {
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;

        public java.lang.String a() {
            return java.lang.String.format("%s=%s; expires=%s", this.a, this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public class d implements java.lang.Iterable<java.lang.String> {
        public final java.util.HashMap<java.lang.String, java.lang.String> b = new java.util.HashMap<>();
        public final java.util.ArrayList<f.j.a.h.h.d.b.c> c = new java.util.ArrayList<>();

        public d(f.j.a.h.h.d.b bVar, java.util.Map<java.lang.String, java.lang.String> map) {
            java.lang.String str = map.get("cookie");
            if (str != null) {
                for (java.lang.String str2 : str.split(com.facebook.ads.ExtraHints.KEYWORD_SEPARATOR)) {
                    java.lang.String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.b.put(split[0], split[1]);
                    }
                }
            }
        }

        public void c(f.j.a.h.h.d.b.k kVar) {
            java.util.Iterator<f.j.a.h.h.d.b.c> it = this.c.iterator();
            while (it.hasNext()) {
                kVar.a("Set-Cookie", it.next().a());
            }
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<java.lang.String> iterator() {
            return this.b.keySet().iterator();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements f.j.a.h.h.d.b.InterfaceC0268b {
        public long a;

        @Override // f.j.a.h.h.d.b.InterfaceC0268b
        public void a(java.lang.Runnable runnable) {
            this.a++;
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.a + ")");
            thread.start();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements f.j.a.h.h.d.b.n {
        public final java.util.List<f.j.a.h.h.d.b.m> a;

        public f() {
            java.lang.System.getProperty("java.io.tmpdir");
            this.a = new java.util.ArrayList();
        }

        @Override // f.j.a.h.h.d.b.n
        public void clear() {
            java.util.Iterator<f.j.a.h.h.d.b.m> it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (java.lang.Exception unused) {
                }
            }
            this.a.clear();
        }
    }

    /* loaded from: classes.dex */
    public class g implements f.j.a.h.h.d.b.o {
        public g(f.j.a.h.h.d.b bVar) {
        }

        public /* synthetic */ g(f.j.a.h.h.d.b bVar, f.j.a.h.h.d.b.a aVar) {
            this(bVar);
        }

        @Override // f.j.a.h.h.d.b.o
        public f.j.a.h.h.d.b.n a() {
            return new f.j.a.h.h.d.b.f();
        }
    }

    /* loaded from: classes.dex */
    public class h implements f.j.a.h.h.d.b.i {
        public final f.j.a.h.h.d.b.n a;
        public final java.io.OutputStream b;
        public final java.io.PushbackInputStream c;

        /* renamed from: d, reason: collision with root package name */
        public int f10051d;

        /* renamed from: e, reason: collision with root package name */
        public int f10052e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f10053f;

        /* renamed from: g, reason: collision with root package name */
        public f.j.a.h.h.d.b.j f10054g;

        /* renamed from: h, reason: collision with root package name */
        public java.util.Map<java.lang.String, java.lang.String> f10055h;

        /* renamed from: i, reason: collision with root package name */
        public java.util.Map<java.lang.String, java.lang.String> f10056i;

        /* renamed from: j, reason: collision with root package name */
        public f.j.a.h.h.d.b.d f10057j;

        public h(f.j.a.h.h.d.b.n nVar, java.io.InputStream inputStream, java.io.OutputStream outputStream, java.net.InetAddress inetAddress) {
            this.a = nVar;
            this.c = new java.io.PushbackInputStream(inputStream, 8192);
            this.b = outputStream;
            java.lang.String str = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            java.util.HashMap hashMap = new java.util.HashMap();
            this.f10056i = hashMap;
            hashMap.put("remote-addr", str);
            this.f10056i.put("http-client-ip", str);
        }

        @Override // f.j.a.h.h.d.b.i
        public final java.util.Map<java.lang.String, java.lang.String> a() {
            return this.f10056i;
        }

        @Override // f.j.a.h.h.d.b.i
        public final java.lang.String b() {
            return this.f10053f;
        }

        @Override // f.j.a.h.h.d.b.i
        public final java.util.Map<java.lang.String, java.lang.String> c() {
            return this.f10055h;
        }

        public final void d(java.io.BufferedReader bufferedReader, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
            f.j.a.h.h.d.b bVar;
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(readLine);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new f.j.a.h.h.d.b.l(f.j.a.h.h.d.b.k.EnumC0269b.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new f.j.a.h.h.d.b.l(f.j.a.h.h.d.b.k.EnumC0269b.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                java.lang.String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(63);
                if (indexOf >= 0) {
                    e(nextToken.substring(indexOf + 1), map2);
                    bVar = f.j.a.h.h.d.b.this;
                    nextToken = nextToken.substring(0, indexOf);
                } else {
                    bVar = f.j.a.h.h.d.b.this;
                }
                java.lang.String g2 = bVar.g(nextToken);
                if (stringTokenizer.hasMoreTokens()) {
                    while (true) {
                        java.lang.String readLine2 = bufferedReader.readLine();
                        if (readLine2 == null || readLine2.trim().length() <= 0) {
                            break;
                        }
                        int indexOf2 = readLine2.indexOf(58);
                        if (indexOf2 >= 0) {
                            map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(java.util.Locale.US), readLine2.substring(indexOf2 + 1).trim());
                        }
                    }
                }
                map.put("uri", g2);
            } catch (java.io.IOException e2) {
                throw new f.j.a.h.h.d.b.l(f.j.a.h.h.d.b.k.EnumC0269b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e2.getMessage(), e2);
            }
        }

        public final void e(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            if (str == null) {
                return;
            }
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                java.lang.String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    map.put(f.j.a.h.h.d.b.this.g(nextToken.substring(0, indexOf)).trim(), f.j.a.h.h.d.b.this.g(nextToken.substring(indexOf + 1)));
                } else {
                    map.put(f.j.a.h.h.d.b.this.g(nextToken).trim(), "");
                }
            }
        }

        public void f() {
            java.io.OutputStream outputStream;
            byte[] bArr;
            try {
                try {
                    try {
                        try {
                            bArr = new byte[8192];
                            this.f10051d = 0;
                            this.f10052e = 0;
                        } catch (java.net.SocketException e2) {
                            throw e2;
                        }
                    } catch (java.net.SocketTimeoutException e3) {
                        throw e3;
                    }
                } catch (f.j.a.h.h.d.b.l e4) {
                    new f.j.a.h.h.d.b.k(e4.a(), "text/plain", e4.getMessage()).c(this.b);
                    outputStream = this.b;
                    f.j.a.h.h.d.b.i(outputStream);
                } catch (java.io.IOException e5) {
                    new f.j.a.h.h.d.b.k(f.j.a.h.h.d.b.k.EnumC0269b.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e5.getMessage()).c(this.b);
                    outputStream = this.b;
                    f.j.a.h.h.d.b.i(outputStream);
                }
                try {
                    int read = this.c.read(bArr, 0, 8192);
                    if (read == -1) {
                        f.j.a.h.h.d.b.i(this.c);
                        f.j.a.h.h.d.b.i(this.b);
                        throw new java.net.SocketException("NanoHttpd Shutdown");
                    }
                    while (read > 0) {
                        int i2 = this.f10052e + read;
                        this.f10052e = i2;
                        int g2 = g(bArr, i2);
                        this.f10051d = g2;
                        if (g2 > 0) {
                            break;
                        } else {
                            read = this.c.read(bArr, this.f10052e, 8192 - this.f10052e);
                        }
                    }
                    if (this.f10051d < this.f10052e) {
                        this.c.unread(bArr, this.f10051d, this.f10052e - this.f10051d);
                    }
                    this.f10055h = new java.util.HashMap();
                    if (this.f10056i == null) {
                        this.f10056i = new java.util.HashMap();
                    }
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr, 0, this.f10052e)));
                    java.util.HashMap hashMap = new java.util.HashMap();
                    d(bufferedReader, hashMap, this.f10055h, this.f10056i);
                    f.j.a.h.h.d.b.j e6 = f.j.a.h.h.d.b.j.e(hashMap.get("method"));
                    this.f10054g = e6;
                    if (e6 == null) {
                        throw new f.j.a.h.h.d.b.l(f.j.a.h.h.d.b.k.EnumC0269b.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                    }
                    this.f10053f = hashMap.get("uri");
                    this.f10057j = new f.j.a.h.h.d.b.d(f.j.a.h.h.d.b.this, this.f10056i);
                    f.j.a.h.h.d.b.k l2 = f.j.a.h.h.d.b.this.l(this);
                    if (l2 == null) {
                        throw new f.j.a.h.h.d.b.l(f.j.a.h.h.d.b.k.EnumC0269b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                    }
                    this.f10057j.c(l2);
                    l2.h(this.f10054g);
                    l2.c(this.b);
                } catch (java.lang.Exception unused) {
                    f.j.a.h.h.d.b.i(this.c);
                    f.j.a.h.h.d.b.i(this.b);
                    throw new java.net.SocketException("NanoHttpd Shutdown");
                }
            } finally {
                this.a.clear();
            }
        }

        public final int g(byte[] bArr, int i2) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 3;
                if (i4 >= i2) {
                    return 0;
                }
                if (bArr[i3] == 13 && bArr[i3 + 1] == 10 && bArr[i3 + 2] == 13 && bArr[i4] == 10) {
                    return i3 + 4;
                }
                i3++;
            }
        }

        @Override // f.j.a.h.h.d.b.i
        public final f.j.a.h.h.d.b.j getMethod() {
            return this.f10054g;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        java.util.Map<java.lang.String, java.lang.String> a();

        java.lang.String b();

        java.util.Map<java.lang.String, java.lang.String> c();

        f.j.a.h.h.d.b.j getMethod();
    }

    /* loaded from: classes.dex */
    public enum j {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        public static f.j.a.h.h.d.b.j e(java.lang.String str) {
            for (f.j.a.h.h.d.b.j jVar : values()) {
                if (jVar.toString().equalsIgnoreCase(str)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public f.j.a.h.h.d.b.k.a a;
        public java.lang.String b;
        public java.io.InputStream c;

        /* renamed from: d, reason: collision with root package name */
        public final java.util.Map<java.lang.String, java.lang.String> f10064d = new java.util.HashMap();

        /* renamed from: e, reason: collision with root package name */
        public f.j.a.h.h.d.b.j f10065e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f10066f;

        /* loaded from: classes.dex */
        public interface a {
            java.lang.String e();
        }

        /* renamed from: f.j.a.h.h.d.b$k$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0269b implements f.j.a.h.h.d.b.k.a {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(me.zhanghai.android.materialprogressbar.internal.ObjectAnimatorCompatBase.NUM_POINTS, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(org.joda.time.format.DateTimeFormat.PATTERN_CACHE_SIZE, "Internal Server Error");

            public final int b;
            public final java.lang.String c;

            EnumC0269b(int i2, java.lang.String str) {
                this.b = i2;
                this.c = str;
            }

            @Override // f.j.a.h.h.d.b.k.a
            public java.lang.String e() {
                return "" + this.b + " " + this.c;
            }
        }

        public k(f.j.a.h.h.d.b.k.a aVar, java.lang.String str, java.io.InputStream inputStream) {
            this.a = aVar;
            this.b = str;
            this.c = inputStream;
        }

        public k(f.j.a.h.h.d.b.k.a aVar, java.lang.String str, java.lang.String str2) {
            java.io.ByteArrayInputStream byteArrayInputStream;
            this.a = aVar;
            this.b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new java.io.ByteArrayInputStream(str2.getBytes(org.jsoup.helper.DataUtil.defaultCharset));
                } catch (java.io.UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.c = byteArrayInputStream;
        }

        public void a(java.lang.String str, java.lang.String str2) {
            this.f10064d.put(str, str2);
        }

        public final boolean b(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
            java.util.Iterator<java.lang.String> it = map.keySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= it.next().equalsIgnoreCase(str);
            }
            return z;
        }

        public void c(java.io.OutputStream outputStream) {
            java.lang.String str = this.b;
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            try {
                if (this.a == null) {
                    throw new java.lang.Error("sendResponse(): Status can't be null.");
                }
                java.io.PrintWriter printWriter = new java.io.PrintWriter(outputStream);
                printWriter.print("HTTP/1.1 " + this.a.e() + " \r\n");
                if (str != null) {
                    printWriter.print("Content-Type: " + str + "\r\n");
                }
                if (this.f10064d == null || this.f10064d.get("Date") == null) {
                    printWriter.print("Date: " + simpleDateFormat.format(new java.util.Date()) + "\r\n");
                }
                if (this.f10064d != null) {
                    for (java.lang.String str2 : this.f10064d.keySet()) {
                        printWriter.print(str2 + ": " + this.f10064d.get(str2) + "\r\n");
                    }
                }
                f(printWriter, this.f10064d);
                if (this.f10065e == f.j.a.h.h.d.b.j.HEAD || !this.f10066f) {
                    int available = this.c != null ? this.c.available() : 0;
                    g(printWriter, this.f10064d, available);
                    printWriter.print("\r\n");
                    printWriter.flush();
                    e(outputStream, available);
                } else {
                    d(outputStream, printWriter);
                }
                outputStream.flush();
                f.j.a.h.h.d.b.i(this.c);
            } catch (java.io.IOException unused) {
            }
        }

        public final void d(java.io.OutputStream outputStream, java.io.PrintWriter printWriter) {
            printWriter.print("Transfer-Encoding: chunked\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
            byte[] bytes = "\r\n".getBytes();
            byte[] bArr = new byte[262144];
            while (true) {
                int read = this.c.read(bArr);
                if (read <= 0) {
                    outputStream.write(java.lang.String.format("0\r\n\r\n", new java.lang.Object[0]).getBytes());
                    return;
                } else {
                    outputStream.write(java.lang.String.format("%x\r\n", java.lang.Integer.valueOf(read)).getBytes());
                    outputStream.write(bArr, 0, read);
                    outputStream.write(bytes);
                }
            }
        }

        public final void e(java.io.OutputStream outputStream, int i2) {
            if (this.f10065e == f.j.a.h.h.d.b.j.HEAD || this.c == null) {
                return;
            }
            byte[] bArr = new byte[262144];
            while (i2 > 0) {
                int read = this.c.read(bArr, 0, i2 > 262144 ? 262144 : i2);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                i2 -= read;
            }
        }

        public void f(java.io.PrintWriter printWriter, java.util.Map<java.lang.String, java.lang.String> map) {
            if (b(map, "connection")) {
                return;
            }
            printWriter.print("Connection: keep-alive\r\n");
        }

        public void g(java.io.PrintWriter printWriter, java.util.Map<java.lang.String, java.lang.String> map, int i2) {
            if (b(map, "content-length")) {
                return;
            }
            printWriter.print("Content-Length: " + i2 + "\r\n");
        }

        public void h(f.j.a.h.h.d.b.j jVar) {
            this.f10065e = jVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends java.lang.Exception {
        public final f.j.a.h.h.d.b.k.EnumC0269b b;

        public l(f.j.a.h.h.d.b.k.EnumC0269b enumC0269b, java.lang.String str) {
            super(str);
            this.b = enumC0269b;
        }

        public l(f.j.a.h.h.d.b.k.EnumC0269b enumC0269b, java.lang.String str, java.lang.Exception exc) {
            super(str, exc);
            this.b = enumC0269b;
        }

        public f.j.a.h.h.d.b.k.EnumC0269b a() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a();
    }

    /* loaded from: classes.dex */
    public interface n {
        void clear();
    }

    /* loaded from: classes.dex */
    public interface o {
        f.j.a.h.h.d.b.n a();
    }

    public b(java.lang.String str, int i2) {
        this.a = str;
        this.b = i2;
        n(new f.j.a.h.h.d.b.g(this, null));
        m(new f.j.a.h.h.d.b.e());
    }

    public static final void i(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static final void j(java.net.ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static final void k(java.net.Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public synchronized void f() {
        java.util.Iterator<java.net.Socket> it = this.f10046d.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    public java.lang.String g(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, "UTF8");
        } catch (java.io.UnsupportedEncodingException unused) {
            return null;
        }
    }

    public synchronized void h(java.net.Socket socket) {
        this.f10046d.add(socket);
    }

    public abstract f.j.a.h.h.d.b.k l(f.j.a.h.h.d.b.i iVar);

    public void m(f.j.a.h.h.d.b.InterfaceC0268b interfaceC0268b) {
        this.f10048f = interfaceC0268b;
    }

    public void n(f.j.a.h.h.d.b.o oVar) {
        this.f10049g = oVar;
    }

    public void o() {
        java.net.ServerSocket serverSocket = new java.net.ServerSocket();
        this.c = serverSocket;
        serverSocket.bind(this.a != null ? new java.net.InetSocketAddress(this.a, this.b) : new java.net.InetSocketAddress(this.b));
        java.lang.Thread thread = new java.lang.Thread(new f.j.a.h.h.d.b.a());
        this.f10047e = thread;
        thread.setDaemon(true);
        this.f10047e.setName("NanoHttpd Main Listener");
        this.f10047e.start();
    }

    public void p() {
        try {
            j(this.c);
            f();
            if (this.f10047e != null) {
                this.f10047e.join();
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void q(java.net.Socket socket) {
        this.f10046d.remove(socket);
    }
}
