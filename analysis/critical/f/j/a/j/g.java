package f.j.a.j;

/* loaded from: classes.dex */
public class g {
    public android.content.Context a;
    public f.j.a.k.f.k b;

    /* loaded from: classes.dex */
    public class a implements q.d<f.f.d.j> {
        public a() {
        }

        @Override // q.d
        public void a(q.b<f.f.d.j> bVar, java.lang.Throwable th) {
            f.j.a.j.g.this.b.b();
            f.j.a.j.g.this.b.e(th.getMessage());
            f.j.a.j.g.this.b.o(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<f.f.d.j> bVar, q.l<f.f.d.j> lVar) {
            if (lVar.a() != null) {
                f.j.a.j.g.this.b.e0(lVar.a());
            }
        }
    }

    public g(android.content.Context context, f.j.a.k.f.k kVar) {
        this.a = context;
        this.b = kVar;
    }

    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        q.m Y = f.j.a.h.i.e.Y(this.a);
        if (Y != null) {
            ((f.j.a.i.q.a) Y.d(f.j.a.i.q.a.class)).z(org.jsoup.helper.HttpConnection.FORM_URL_ENCODED, str, str2, "get_series_info", str3).B(new f.j.a.j.g.a());
        }
    }
}
