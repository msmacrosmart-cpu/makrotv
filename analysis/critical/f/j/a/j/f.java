package f.j.a.j;

/* loaded from: classes.dex */
public class f {
    public f.j.a.k.f.j a;
    public android.content.Context b;

    /* loaded from: classes.dex */
    public class a implements q.d<boxbr.apksrebrand.smarters.model.callback.SearchTMDBTVShowsCallback> {
        public a() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.SearchTMDBTVShowsCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.f.this.a.b();
            f.j.a.j.f.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.SearchTMDBTVShowsCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.SearchTMDBTVShowsCallback> lVar) {
            f.j.a.j.f.this.a.b();
            if (lVar.d()) {
                f.j.a.j.f.this.a.q(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.f.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBTVShowsInfoCallback> {
        public b() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBTVShowsInfoCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.f.this.a.b();
            f.j.a.j.f.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBTVShowsInfoCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBTVShowsInfoCallback> lVar) {
            f.j.a.j.f.this.a.b();
            if (lVar.d()) {
                f.j.a.j.f.this.a.l(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.f.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> {
        public c() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.f.this.a.b();
            f.j.a.j.f.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBTrailerCallback> lVar) {
            f.j.a.j.f.this.a.b();
            if (lVar.d()) {
                f.j.a.j.f.this.a.B(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.f.this.a.e("Invalid Request");
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements q.d<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> {
        public d() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.f.this.a.b();
            f.j.a.j.f.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.TMDBCastsCallback> lVar) {
            f.j.a.j.f.this.a.b();
            if (lVar.d()) {
                f.j.a.j.f.this.a.m0(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.f.this.a.e("Invalid Request");
            }
        }
    }

    public f(f.j.a.k.f.j jVar, android.content.Context context) {
        this.a = jVar;
        this.b = context;
    }

    public void b(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).t(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.f.d());
        }
    }

    public void c(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).g(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.f.b());
        }
    }

    public void d(java.lang.String str) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            try {
                ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).y("f584f73e8848d9ace559deee1e5a849f", str).B(new f.j.a.j.f.a());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void e(int i2) {
        this.a.a();
        q.m a0 = f.j.a.h.i.e.a0(this.b);
        if (a0 != null) {
            ((f.j.a.i.q.a) a0.d(f.j.a.i.q.a.class)).p(i2, "f584f73e8848d9ace559deee1e5a849f").B(new f.j.a.j.f.c());
        }
    }
}
