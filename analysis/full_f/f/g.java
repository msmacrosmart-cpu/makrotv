package f.j.a.f;

/* loaded from: classes.dex */
public class g {
    public static java.util.List<f.j.a.f.e> b = new java.util.ArrayList();
    public static f.j.a.f.g c;
    public android.content.Context a;

    /* loaded from: classes.dex */
    public static class a {
        public static java.lang.String a = "http://appstop.site/makrotv/api/";
        public static java.lang.String b = "dns";
        public static java.lang.String c = "note";

        /* renamed from: d, reason: collision with root package name */
        public static java.lang.String f9947d = "intro";

        /* renamed from: e, reason: collision with root package name */
        public static java.lang.String f9948e = "vpn";

        /* renamed from: f, reason: collision with root package name */
        public static java.lang.String f9949f = "update";
    }

    public g(android.content.Context context) {
        this.a = context;
    }

    public static f.j.a.f.e a(java.lang.String str, java.lang.String str2) {
        return new f.j.a.f.e(str, str2);
    }

    public void b(f.j.a.f.c<java.lang.String> cVar) {
        new f.j.a.f.d(this.a, f.j.a.f.g.a.b, 1, cVar, "Form", b, java.lang.Boolean.FALSE).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.String[0]);
    }

    public void c(f.j.a.f.c<java.lang.String> cVar) {
        new f.j.a.f.d(this.a, f.j.a.f.g.a.c, 1, cVar, "Form", b, java.lang.Boolean.FALSE).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.String[0]);
    }
}
