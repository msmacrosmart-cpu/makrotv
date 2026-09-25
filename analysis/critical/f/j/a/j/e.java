package f.j.a.j;

/* loaded from: classes.dex */
public class e {
    public f.j.a.k.f.i a;
    public android.content.Context b;

    /* loaded from: classes.dex */
    public class a implements q.d<boxbr.apksrebrand.smarters.model.callback.SearchTMDBMoviesCallback> {
        public a() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.SearchTMDBMoviesCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.e.this.a.b();
            f.j.a.j.e.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.SearchTMDBMoviesCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.SearchTMDBMoviesCallback> lVar) {
            f.j.a.j.e.this.a.b();
            if (lVar.d()) {
                f.j.a.j.e.this.a.W(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.e.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> {
        public b() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.e.this.a.b();
            f.j.a.j.e.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> lVar) {
            f.j.a.j.e.this.a.b();
            if (lVar.d()) {
                f.j.a.j.e.this.a.J(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.e.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> {
        public c() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.e.this.a.b();
            f.j.a.j.e.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> lVar) {
            f.j.a.j.e.this.a.b();
            if (lVar.d()) {
                f.j.a.j.e.this.a.i0(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.e.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBGenreCallback> {
        public d() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBGenreCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.e.this.a.b();
            f.j.a.j.e.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBGenreCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBGenreCallback> lVar) {
            f.j.a.j.e.this.a.b();
            if (lVar.d()) {
                f.j.a.j.e.this.a.v(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.e.this.a.e("Invalid Request");
            }
        }
    }

    /* renamed from: f.j.a.j.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0280e implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> {
        public C0280e() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.e.this.a.b();
            f.j.a.j.e.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> lVar) {
            f.j.a.j.e.this.a.b();
            if (lVar.d()) {
                f.j.a.j.e.this.a.h(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.e.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBPersonInfoCallback> {
        public f() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBPersonInfoCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.e.this.a.b();
            f.j.a.j.e.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBPersonInfoCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBPersonInfoCallback> lVar) {
            f.j.a.j.e.this.a.b();
            if (lVar.d()) {
                f.j.a.j.e.this.a.z(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.e.this.a.e("Invalid Request");
            }
        }
    }

    public e(f.j.a.k.f.i iVar, android.content.Context context) {
        this.a = iVar;
        this.b = context;
    }

    public void b(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).m(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.e.b());
        }
    }

    public void c(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).m(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.e.c());
        }
    }

    public void d(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).d(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.e.d());
        }
    }

    public void e(java.lang.String str) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).b("f584f73e8848d9ace559deee1e5a849f", str).B(new f.j.a.j.e.a());
        }
    }

    public void f(java.lang.String str) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).v(str, "f584f73e8848d9ace559deee1e5a849f", "images").B(new f.j.a.j.e.f());
        }
    }

    public void g(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).h(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.e.C0280e());
        }
    }
}
