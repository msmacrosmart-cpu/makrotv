package f.j.a.h.h;

/* loaded from: classes.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    public static f.j.a.h.h.b f10036k;
    public final android.content.Context a;

    /* renamed from: d, reason: collision with root package name */
    public final f.f.a.d.d.u.r<f.f.a.d.d.u.d> f10037d;

    /* renamed from: e, reason: collision with root package name */
    public final f.f.a.d.d.u.t.i.a f10038e;

    /* renamed from: f, reason: collision with root package name */
    public int f10039f;

    /* renamed from: g, reason: collision with root package name */
    public f.f.a.d.d.o f10040g;

    /* renamed from: h, reason: collision with root package name */
    public f.f.a.d.d.o f10041h;

    /* renamed from: i, reason: collision with root package name */
    public f.j.a.h.h.b.d f10042i;
    public final java.util.List<f.f.a.d.d.o> b = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.lang.Object c = new java.lang.Object();

    /* renamed from: j, reason: collision with root package name */
    public boolean f10043j = true;

    /* renamed from: f.j.a.h.h.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0266b extends f.f.a.d.d.u.t.i.a {
        public C0266b() {
        }

        @Override // f.f.a.d.d.u.t.i.a
        public void d() {
            f.f.a.d.d.q l2;
            f.f.a.d.d.u.t.i r = f.j.a.h.h.b.this.r();
            if (r == null || (l2 = r.l()) == null) {
                return;
            }
            f.j.a.h.h.b.this.f10041h = l2.P(l2.M());
            android.util.Log.d("QueueDataProvider", "onRemoteMediaPreloadStatusUpdated() with item=" + f.j.a.h.h.b.this.f10041h);
            if (f.j.a.h.h.b.this.f10042i != null) {
                f.j.a.h.h.b.this.f10042i.a();
            }
        }

        @Override // f.f.a.d.d.u.t.i.a
        public void e() {
            m();
            if (f.j.a.h.h.b.this.f10042i != null) {
                f.j.a.h.h.b.this.f10042i.a();
            }
            android.util.Log.d("QueueDataProvider", "Queue was updated");
        }

        @Override // f.f.a.d.d.u.t.i.a
        public void g() {
            m();
            if (f.j.a.h.h.b.this.f10042i != null) {
                f.j.a.h.h.b.this.f10042i.a();
            }
        }

        public final void m() {
            java.util.List<f.f.a.d.d.o> list;
            f.j.a.h.h.b bVar;
            boolean z;
            f.f.a.d.d.q l2;
            f.f.a.d.d.u.t.i r = f.j.a.h.h.b.this.r();
            if (r == null || (l2 = r.l()) == null) {
                list = null;
            } else {
                list = l2.R();
                f.j.a.h.h.b.this.f10039f = l2.S();
                f.j.a.h.h.b.this.f10040g = l2.P(l2.A());
            }
            f.j.a.h.h.b.this.b.clear();
            if (list == null) {
                android.util.Log.d("QueueDataProvider", "Queue is cleared");
                return;
            }
            android.util.Log.d("QueueDataProvider", "Queue is updated with a list of size: " + list.size());
            if (list.size() > 0) {
                f.j.a.h.h.b.this.b.addAll(list);
                bVar = f.j.a.h.h.b.this;
                z = false;
            } else {
                bVar = f.j.a.h.h.b.this;
                z = true;
            }
            bVar.f10043j = z;
        }
    }

    /* loaded from: classes.dex */
    public class c implements f.f.a.d.d.u.r<f.f.a.d.d.u.d> {
        public c() {
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(f.f.a.d.d.u.d dVar, int i2) {
            f.j.a.h.h.b.this.j();
            if (f.j.a.h.h.b.this.f10042i != null) {
                f.j.a.h.h.b.this.f10042i.a();
            }
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void o(f.f.a.d.d.u.d dVar) {
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m(f.f.a.d.d.u.d dVar, int i2) {
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void l(f.f.a.d.d.u.d dVar, boolean z) {
            f.j.a.h.h.b.this.A();
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void h(f.f.a.d.d.u.d dVar, java.lang.String str) {
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void k(f.f.a.d.d.u.d dVar, int i2) {
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void j(f.f.a.d.d.u.d dVar, java.lang.String str) {
            f.j.a.h.h.b.this.A();
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void n(f.f.a.d.d.u.d dVar) {
        }

        @Override // f.f.a.d.d.u.r
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(f.f.a.d.d.u.d dVar, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public b(android.content.Context context) {
        this.f10037d = new f.j.a.h.h.b.c();
        this.f10038e = new f.j.a.h.h.b.C0266b();
        android.content.Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f10040g = null;
        f.f.a.d.d.u.b.f(applicationContext).d().b(this.f10037d, f.f.a.d.d.u.d.class);
        A();
    }

    public static synchronized f.j.a.h.h.b n(android.content.Context context) {
        f.j.a.h.h.b bVar;
        synchronized (f.j.a.h.h.b.class) {
            if (f10036k == null) {
                f10036k = new f.j.a.h.h.b(context);
            }
            bVar = f10036k;
        }
        return bVar;
    }

    public final void A() {
        java.util.List<f.f.a.d.d.o> R;
        f.f.a.d.d.u.t.i r = r();
        if (r != null) {
            r.N(this.f10038e);
            f.f.a.d.d.q l2 = r.l();
            if (l2 == null || (R = l2.R()) == null || R.isEmpty()) {
                return;
            }
            this.b.clear();
            this.b.addAll(R);
            l2.S();
            this.f10040g = l2.P(l2.A());
            this.f10043j = false;
            this.f10041h = l2.P(l2.M());
        }
    }

    public void j() {
        this.b.clear();
        this.f10043j = true;
        this.f10040g = null;
    }

    public int k() {
        return this.b.size();
    }

    public f.f.a.d.d.o l() {
        return this.f10040g;
    }

    public int m() {
        return this.f10040g.B();
    }

    public f.f.a.d.d.o o(int i2) {
        return this.b.get(i2);
    }

    public java.util.List<f.f.a.d.d.o> p() {
        return this.b;
    }

    public int q(int i2) {
        if (this.b.isEmpty()) {
            return -1;
        }
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            if (this.b.get(i3).B() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final f.f.a.d.d.u.t.i r() {
        f.f.a.d.d.u.d d2 = f.f.a.d.d.u.b.f(this.a).d().d();
        if (d2 != null && d2.c()) {
            return d2.p();
        }
        android.util.Log.w("QueueDataProvider", "Trying to get a RemoteMediaClient when no CastSession is started.");
        return null;
    }

    public f.f.a.d.d.o s() {
        android.util.Log.d("QueueDataProvider", "[upcoming] getUpcomingItem() returning " + this.f10041h);
        return this.f10041h;
    }

    public boolean t() {
        return this.f10043j;
    }

    public void u(int i2, int i3) {
        f.f.a.d.d.u.t.i r;
        if (i2 == i3 || (r = r()) == null) {
            return;
        }
        r.I(this.b.get(i2).B(), i3, null);
        this.b.add(i3, this.b.remove(i2));
    }

    public void v(android.view.View view, f.f.a.d.d.o oVar) {
        f.f.a.d.d.u.t.i r = r();
        if (r == null) {
            return;
        }
        r.F(oVar.B(), null);
    }

    public void w(android.view.View view, f.f.a.d.d.o oVar) {
        f.f.a.d.d.u.t.i r = r();
        if (r == null) {
            return;
        }
        int q2 = q(oVar.B());
        int k2 = k() - q2;
        int[] iArr = new int[k2];
        for (int i2 = 0; i2 < k2; i2++) {
            iArr[i2] = this.b.get(i2 + q2).B();
        }
        r.M(iArr, null);
    }

    public void x() {
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                return;
            }
            f.f.a.d.d.u.t.i r = r();
            if (r == null) {
                return;
            }
            int[] iArr = new int[this.b.size()];
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                iArr[i2] = this.b.get(i2).B();
            }
            r.M(iArr, null);
            this.b.clear();
        }
    }

    public void y(int i2) {
        synchronized (this.c) {
            f.f.a.d.d.u.t.i r = r();
            if (r == null) {
                return;
            }
            r.L(this.b.get(i2).B(), null);
        }
    }

    public void z(f.j.a.h.h.b.d dVar) {
        this.f10042i = dVar;
    }
}
