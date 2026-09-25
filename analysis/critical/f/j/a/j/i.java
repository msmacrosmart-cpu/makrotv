package f.j.a.j;

/* loaded from: classes.dex */
public class i {
    public f.j.a.k.f.l a;
    public android.content.Context b;

    /* loaded from: classes.dex */
    public class a implements q.d<boxbr.apksrebrand.smarters.model.callback.VodInfoCallback> {
        public a() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.VodInfoCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.i.this.a.b();
            f.j.a.j.i.this.a.e(th.getMessage());
            f.j.a.j.i.this.a.Y(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.VodInfoCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.VodInfoCallback> lVar) {
            f.j.a.j.i.this.a.b();
            if (lVar.d()) {
                f.j.a.j.i.this.a.g(lVar.a());
            } else if (lVar.a() == null) {
                f.j.a.j.i.this.a.e("Invalid Request");
            }
        }
    }

    public i(f.j.a.k.f.l lVar, android.content.Context context) {
        this.a = lVar;
        this.b = context;
    }

    public void b(java.lang.String str, java.lang.String str2, int i2) {
        this.a.a();
        q.m Y = f.j.a.h.i.e.Y(this.b);
        if (Y != null) {
            ((f.j.a.i.q.a) Y.d(f.j.a.i.q.a.class)).n(org.jsoup.helper.HttpConnection.FORM_URL_ENCODED, str, str2, "get_vod_info", i2).B(new f.j.a.j.i.a());
        }
    }
}
