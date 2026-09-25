package f.j.a.h.h.f;

/* loaded from: classes.dex */
public class a {
    public static f.j.a.h.h.f.a c;

    /* renamed from: d, reason: collision with root package name */
    public static android.content.Context f10093d;
    public f.b.b.o a;
    public f.b.b.w.h b;

    /* renamed from: f.j.a.h.h.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0273a implements f.b.b.w.h.f {
        public final d.e.g<java.lang.String, android.graphics.Bitmap> a = new d.e.g<>(20);

        public C0273a(f.j.a.h.h.f.a aVar) {
        }

        @Override // f.b.b.w.h.f
        public android.graphics.Bitmap a(java.lang.String str) {
            return this.a.d(str);
        }

        @Override // f.b.b.w.h.f
        public void b(java.lang.String str, android.graphics.Bitmap bitmap) {
            this.a.f(str, bitmap);
        }
    }

    public a(android.content.Context context) {
        f10093d = context;
        f.b.b.o c2 = c();
        this.a = c2;
        this.b = new f.b.b.w.h(c2, new f.j.a.h.h.f.a.C0273a(this));
    }

    public static synchronized f.j.a.h.h.f.a b(android.content.Context context) {
        f.j.a.h.h.f.a aVar;
        synchronized (f.j.a.h.h.f.a.class) {
            if (c == null) {
                c = new f.j.a.h.h.f.a(context);
            }
            aVar = c;
        }
        return aVar;
    }

    public f.b.b.w.h a() {
        return this.b;
    }

    public final f.b.b.o c() {
        if (this.a == null) {
            f.b.b.o oVar = new f.b.b.o(new f.b.b.w.d(f10093d.getCacheDir(), 10485760), new f.b.b.w.b(new f.b.b.w.g()));
            this.a = oVar;
            oVar.d();
        }
        return this.a;
    }
}
