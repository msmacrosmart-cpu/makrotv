package f.j.a.h.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f.j.a.h.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0261a implements f.f.a.d.d.u.t.i.b {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ f.f.a.d.d.u.t.i b;

        public C0261a(android.content.Context context, f.f.a.d.d.u.t.i iVar) {
            this.a = context;
            this.b = iVar;
        }

        @Override // f.f.a.d.d.u.t.i.b
        public void a() {
            android.util.Log.e("", "onMetadataUpdated()");
        }

        @Override // f.f.a.d.d.u.t.i.b
        public void b() {
            android.util.Log.e("", "onQueueStatusUpdated()");
        }

        @Override // f.f.a.d.d.u.t.i.b
        public void c() {
            android.util.Log.e("", "onPreloadStatusUpdated()");
        }

        @Override // f.f.a.d.d.u.t.i.b
        public void d() {
            android.util.Log.e("", "onStatusUpdated()");
            this.a.startActivity(new android.content.Intent(this.a, (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.ExpandedControlsActivity.class));
            this.b.O(this);
        }

        @Override // f.f.a.d.d.u.t.i.b
        public void e() {
            android.util.Log.e("", "onAdBreakStatusUpdated()");
        }

        @Override // f.f.a.d.d.u.t.i.b
        public void f() {
            android.util.Log.e("", "onSendingRemoteMediaRequest()");
        }
    }

    /* loaded from: classes.dex */
    public class b extends f.f.a.d.d.u.t.i.a {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ f.f.a.d.d.u.t.i b;

        public b(android.content.Context context, f.f.a.d.d.u.t.i iVar) {
            this.a = context;
            this.b = iVar;
        }

        @Override // f.f.a.d.d.u.t.i.a
        public void g() {
            android.content.Intent intent = new android.content.Intent(this.a, (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.ExpandedControlsActivity.class);
            if (((android.app.Activity) this.a).getClass().getSimpleName().equals("HoneyPlayer")) {
                ((android.app.Activity) this.a).finish();
            }
            this.a.startActivity(intent);
            this.b.X(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements m.f {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ f.f.a.d.d.l b;
        public final /* synthetic */ android.os.Handler c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f.f.a.d.d.u.t.i f10034d;

        /* renamed from: f.j.a.h.h.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0262a implements java.lang.Runnable {
            public final /* synthetic */ com.google.android.gms.cast.MediaInfo b;

            /* renamed from: f.j.a.h.h.a$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0263a extends f.f.a.d.d.u.t.i.a {
                public C0263a() {
                }

                @Override // f.f.a.d.d.u.t.i.a
                public void g() {
                    android.content.Intent intent = new android.content.Intent(f.j.a.h.h.a.c.this.a, (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.ExpandedControlsActivity.class);
                    if (((android.app.Activity) f.j.a.h.h.a.c.this.a).getClass().getSimpleName().equals("NSTIJKPlayerSkyActivity")) {
                        ((android.app.Activity) f.j.a.h.h.a.c.this.a).finish();
                    }
                    f.j.a.h.h.a.c.this.a.startActivity(intent);
                    f.j.a.h.h.a.c.this.f10034d.X(this);
                }
            }

            public RunnableC0262a(com.google.android.gms.cast.MediaInfo mediaInfo) {
                this.b = mediaInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.j.a.h.h.a.c.this.f10034d.N(new f.j.a.h.h.a.c.RunnableC0262a.C0263a());
                f.f.a.d.d.u.t.i iVar = f.j.a.h.h.a.c.this.f10034d;
                f.f.a.d.d.k.a aVar = new f.f.a.d.d.k.a();
                aVar.h(this.b);
                aVar.c(java.lang.Boolean.TRUE);
                aVar.f(0L);
                iVar.z(aVar.a());
            }
        }

        public c(android.content.Context context, f.f.a.d.d.l lVar, android.os.Handler handler, f.f.a.d.d.u.t.i iVar) {
            this.a = context;
            this.b = lVar;
            this.c = handler;
            this.f10034d = iVar;
        }

        @Override // m.f
        public void a(@org.jetbrains.annotations.NotNull m.e eVar, @org.jetbrains.annotations.NotNull m.c0 c0Var) {
            android.util.Log.e("url with token==> ", "" + c0Var.N().h().toString());
            com.google.android.gms.cast.MediaInfo.a aVar = new com.google.android.gms.cast.MediaInfo.a(c0Var.N().h().toString());
            aVar.e(1);
            aVar.b("application/x-mpegurl");
            aVar.d(this.b);
            this.c.post(new f.j.a.h.h.a.c.RunnableC0262a(aVar.a()));
        }

        @Override // m.f
        public void b(@org.jetbrains.annotations.NotNull m.e eVar, @org.jetbrains.annotations.NotNull java.io.IOException iOException) {
            try {
                iOException.printStackTrace();
                android.util.Log.e("chrome cast ====>  ", "Unable to cast,please try again");
                android.widget.Toast.makeText(this.a, "Unable to cast,please try again ", 0).show();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements m.f {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ f.f.a.d.d.l b;
        public final /* synthetic */ android.os.Handler c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f.f.a.d.d.u.t.i f10035d;

        /* renamed from: f.j.a.h.h.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0264a implements java.lang.Runnable {
            public final /* synthetic */ com.google.android.gms.cast.MediaInfo b;

            /* renamed from: f.j.a.h.h.a$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0265a implements f.f.a.d.d.u.t.i.b {
                public C0265a() {
                }

                @Override // f.f.a.d.d.u.t.i.b
                public void a() {
                    android.util.Log.e("chromecastUtile clas", "onMetadataUpdated()");
                }

                @Override // f.f.a.d.d.u.t.i.b
                public void b() {
                    android.util.Log.e("chromecastUtile clas", "onQueueStatusUpdated()");
                }

                @Override // f.f.a.d.d.u.t.i.b
                public void c() {
                    android.util.Log.e("chromecastUtile clas", "onPreloadStatusUpdated()");
                }

                @Override // f.f.a.d.d.u.t.i.b
                public void d() {
                    android.util.Log.e("chromecastUtile class=", "onStatusUpdated()");
                    f.j.a.h.h.a.d.this.a.startActivity(new android.content.Intent(f.j.a.h.h.a.d.this.a, (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.ExpandedControlsActivity.class));
                    f.j.a.h.h.a.d.this.f10035d.O(this);
                }

                @Override // f.f.a.d.d.u.t.i.b
                public void e() {
                    android.util.Log.e("chromecastUtile clas", "onAdBreakStatusUpdated()");
                }

                @Override // f.f.a.d.d.u.t.i.b
                public void f() {
                    android.util.Log.e("chromecastUtile clas", "onSendingRemoteMediaRequest()");
                }
            }

            public RunnableC0264a(com.google.android.gms.cast.MediaInfo mediaInfo) {
                this.b = mediaInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.j.a.h.h.a.d.this.f10035d.b(new f.j.a.h.h.a.d.RunnableC0264a.C0265a());
                f.j.a.h.h.a.d.this.f10035d.y(this.b, true, 0L);
            }
        }

        public d(android.content.Context context, f.f.a.d.d.l lVar, android.os.Handler handler, f.f.a.d.d.u.t.i iVar) {
            this.a = context;
            this.b = lVar;
            this.c = handler;
            this.f10035d = iVar;
        }

        @Override // m.f
        public void a(@org.jetbrains.annotations.NotNull m.e eVar, @org.jetbrains.annotations.NotNull m.c0 c0Var) {
            f.j.a.h.i.e.H();
            android.util.Log.e("url with token==> ", "" + c0Var.N().h().toString());
            com.google.android.gms.cast.MediaInfo.a aVar = new com.google.android.gms.cast.MediaInfo.a(c0Var.N().h().toString());
            aVar.e(1);
            aVar.b("application/x-mpegurl");
            aVar.d(this.b);
            this.c.post(new f.j.a.h.h.a.d.RunnableC0264a(aVar.a()));
        }

        @Override // m.f
        public void b(@org.jetbrains.annotations.NotNull m.e eVar, @org.jetbrains.annotations.NotNull java.io.IOException iOException) {
            try {
                iOException.printStackTrace();
                f.j.a.h.i.e.H();
                android.util.Log.e("chrome cast ====>  ", "Unable to cast,please try again");
                android.widget.Toast.makeText(this.a, "Unable to cast,please try again ", 0).show();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static com.google.android.gms.cast.MediaInfo a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List<com.google.android.gms.cast.MediaTrack> list) {
        org.json.JSONObject jSONObject;
        org.json.JSONException e2;
        f.f.a.d.d.l lVar = new f.f.a.d.d.l(1);
        lVar.G("com.google.android.gms.cast.metadata.SUBTITLE", str2);
        lVar.G("com.google.android.gms.cast.metadata.TITLE", str);
        lVar.p(new f.f.a.d.f.n.a(android.net.Uri.parse(str6)));
        lVar.p(new f.f.a.d.f.n.a(android.net.Uri.parse(str7)));
        try {
            jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("description", str3);
            } catch (org.json.JSONException e3) {
                e2 = e3;
                android.util.Log.e("honey", "Failed to add description to the json object", e2);
                com.google.android.gms.cast.MediaInfo.a aVar = new com.google.android.gms.cast.MediaInfo.a(str4);
                aVar.e(1);
                aVar.b(str5);
                aVar.d(lVar);
                aVar.c(jSONObject);
                return aVar.a();
            }
        } catch (org.json.JSONException e4) {
            jSONObject = null;
            e2 = e4;
        }
        com.google.android.gms.cast.MediaInfo.a aVar2 = new com.google.android.gms.cast.MediaInfo.a(str4);
        aVar2.e(1);
        aVar2.b(str5);
        aVar2.d(lVar);
        aVar2.c(jSONObject);
        return aVar2.a();
    }

    public static void b(android.os.Handler handler, f.f.a.d.d.u.t.i iVar, java.lang.String str, f.f.a.d.d.l lVar, android.content.Context context) {
        f.j.a.h.i.e.g0((android.app.Activity) context);
        m.x xVar = new m.x();
        m.a0.a aVar = new m.a0.a();
        aVar.j(str);
        xVar.a(aVar.b()).p(new f.j.a.h.h.a.d(context, lVar, handler, iVar));
    }

    public static void c(android.os.Handler handler, f.f.a.d.d.u.t.i iVar, java.lang.String str, f.f.a.d.d.l lVar, android.content.Context context) {
        m.x xVar = new m.x();
        m.a0.a aVar = new m.a0.a();
        aVar.j(str);
        xVar.a(aVar.b()).p(new f.j.a.h.h.a.c(context, lVar, handler, iVar));
    }

    public static void d(int i2, boolean z, com.google.android.gms.cast.MediaInfo mediaInfo, f.f.a.d.d.u.d dVar, android.content.Context context) {
        f.f.a.d.d.u.t.i p2;
        if (dVar == null || (p2 = dVar.p()) == null) {
            return;
        }
        p2.N(new f.j.a.h.h.a.b(context, p2));
        f.f.a.d.d.k.a aVar = new f.f.a.d.d.k.a();
        aVar.h(mediaInfo);
        aVar.c(java.lang.Boolean.valueOf(z));
        aVar.f(i2);
        p2.z(aVar.a());
    }

    public static void e(com.google.android.gms.cast.MediaInfo mediaInfo, f.f.a.d.d.u.d dVar, android.content.Context context) {
        f.f.a.d.d.u.t.i p2;
        if (dVar == null || (p2 = dVar.p()) == null) {
            return;
        }
        p2.b(new f.j.a.h.h.a.C0261a(context, p2));
        p2.y(mediaInfo, true, 0L);
    }
}
