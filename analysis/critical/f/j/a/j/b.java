package f.j.a.j;

/* loaded from: classes.dex */
public class b {
    public android.content.Context a;
    public f.j.a.k.f.d b;

    /* loaded from: classes.dex */
    public class a implements q.d<boxbr.apksrebrand.smarters.model.callback.RegisterClientCallback> {
        public a() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.RegisterClientCallback> bVar, java.lang.Throwable th) {
            android.util.Log.e("honey", "onFailure: ");
            f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.RegisterClientCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.RegisterClientCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
            } else {
                f.j.a.j.b.this.b.R(lVar.a());
            }
        }
    }

    /* renamed from: f.j.a.j.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0278b implements q.d<boxbr.apksrebrand.smarters.model.callback.BillingLoginClientCallback> {
        public C0278b() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.BillingLoginClientCallback> bVar, java.lang.Throwable th) {
            android.util.Log.e("honey", "onFailure: ");
            f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.BillingLoginClientCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.BillingLoginClientCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
            } else {
                f.j.a.j.b.this.b.t(lVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements q.d<boxbr.apksrebrand.smarters.model.callback.BillingIsPurchasedCallback> {
        public c() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.BillingIsPurchasedCallback> bVar, java.lang.Throwable th) {
            android.util.Log.e("honey", "onFailure: ");
            f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.BillingIsPurchasedCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.BillingIsPurchasedCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
            } else {
                f.j.a.j.b.this.b.f0(lVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements q.d<boxbr.apksrebrand.smarters.model.callback.BillingGetDevicesCallback> {
        public d() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.BillingGetDevicesCallback> bVar, java.lang.Throwable th) {
            android.util.Log.e("honey", "onFailure: ");
            f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.BillingGetDevicesCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.BillingGetDevicesCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
            } else {
                f.j.a.j.b.this.b.T(lVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements q.d<boxbr.apksrebrand.smarters.model.callback.BillingUpdateDevicesCallback> {
        public e() {
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.BillingUpdateDevicesCallback> bVar, java.lang.Throwable th) {
            android.util.Log.e("honey", "onFailure: ");
            f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.BillingUpdateDevicesCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.BillingUpdateDevicesCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                f.j.a.j.b.this.b.e(f.j.a.j.b.this.a.getResources().getString(brstore.makro.app.R.string.something_wrong));
            } else {
                f.j.a.j.b.this.b.m(lVar.a());
            }
        }
    }

    public b(android.content.Context context, f.j.a.k.f.d dVar) {
        this.a = context;
        this.b = dVar;
    }

    public void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, java.lang.String str6, java.lang.String str7) {
        this.b.a();
        q.m Z = f.j.a.h.i.e.Z(this.a);
        if (Z != null) {
            ((f.j.a.i.q.a) Z.d(f.j.a.i.q.a.class)).a("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", f.j.a.f.b.b, str4, str2, "checkorder", str3, i2, str6, str7).B(new f.j.a.j.b.c());
        }
    }

    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i2) {
        this.b.a();
        q.m Z = f.j.a.h.i.e.Z(this.a);
        if (Z != null) {
            ((f.j.a.i.q.a) Z.d(f.j.a.i.q.a.class)).j("Vu6HilnbLo63", str, str3, "T6Vk3rLFQBeu3n6s", f.j.a.f.b.b, str2, i2, "alldevices").B(new f.j.a.j.b.d());
        }
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.b.a();
        q.m Z = f.j.a.h.i.e.Z(this.a);
        if (Z != null) {
            ((f.j.a.i.q.a) Z.d(f.j.a.i.q.a.class)).k("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", f.j.a.f.b.b, str4, str2, "login", str3).B(new f.j.a.j.b.C0278b());
        }
    }

    public void f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.b.a();
        q.m Z = f.j.a.h.i.e.Z(this.a);
        if (Z != null) {
            ((f.j.a.i.q.a) Z.d(f.j.a.i.q.a.class)).x(str, str5, "Vu6HilnbLo63", f.j.a.f.b.b, str2, "T6Vk3rLFQBeu3n6s", "register", str3, str4).B(new f.j.a.j.b.a());
        }
    }

    public void g(java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.b.a();
        q.m Z = f.j.a.h.i.e.Z(this.a);
        if (Z != null) {
            ((f.j.a.i.q.a) Z.d(f.j.a.i.q.a.class)).o("Vu6HilnbLo63", str, str2, "T6Vk3rLFQBeu3n6s", f.j.a.f.b.b, i2, "updatedevice", str3, str4, str5).B(new f.j.a.j.b.e());
        }
    }
}
