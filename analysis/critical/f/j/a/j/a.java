package f.j.a.j;

/* loaded from: classes.dex */
public class a {
    public android.content.Context a;
    public f.j.a.k.f.a b;

    /* renamed from: f.j.a.j.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0277a implements q.d<boxbr.apksrebrand.smarters.model.callback.ActivationCallBack> {
        public C0277a() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.ActivationCallBack> bVar, java.lang.Throwable th) {
            f.j.a.j.a aVar = f.j.a.j.a.this;
            aVar.b.j0(aVar.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.ActivationCallBack> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.ActivationCallBack> lVar) {
            if (!lVar.d() || lVar.a() == null) {
                f.j.a.j.a aVar = f.j.a.j.a.this;
                aVar.b.j0(aVar.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
                return;
            }
            if (lVar.a().c() != null && lVar.a().c().equalsIgnoreCase("success")) {
                if (lVar.a().a() != null) {
                    f.j.a.i.p.l.h0(lVar.a().a().a(), f.j.a.j.a.this.a);
                    f.j.a.i.p.l.g0(lVar.a().a().b(), f.j.a.j.a.this.a);
                    f.j.a.j.a.this.b.Z(lVar.a(), "validateLogin");
                    android.util.Log.e("ActivationPresenter", "Respone is successfull");
                } else if (lVar.a().b() != null) {
                    f.j.a.h.i.e.j0(f.j.a.j.a.this.a, lVar.a().b());
                }
            }
            if (lVar.a().c().equalsIgnoreCase(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR)) {
                f.j.a.j.a.this.b.j0(lVar.a().b());
                android.util.Log.e("ActivationPresenter", "Response is not sucessfull");
            }
        }
    }

    public a(f.j.a.k.f.a aVar, android.content.Context context) {
        this.a = context;
        this.b = aVar;
    }

    public void a(java.lang.String str) {
        q.m n2 = f.j.a.h.i.e.n(this.a);
        if (n2 != null) {
            f.j.a.i.q.a aVar = (f.j.a.i.q.a) n2.d(f.j.a.i.q.a.class);
            f.f.d.m mVar = new f.f.d.m();
            mVar.x("api_username", "EJzcbx8B4J2mBEa");
            mVar.x("api_password", "CutwKMP2fF3er29");
            mVar.x("activation_code", str);
            mVar.x("mac_address", f.j.a.h.i.e.u(this.a));
            aVar.e(mVar).B(new f.j.a.j.a.C0277a());
        }
    }
}
