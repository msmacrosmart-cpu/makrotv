package f.j.a.j;

/* loaded from: classes.dex */
public class h {
    public f.j.a.k.f.e a;
    public android.content.Context b;

    /* loaded from: classes.dex */
    public class a implements q.d<boxbr.apksrebrand.smarters.model.callback.LiveStreamsEpgCallback> {
        public final /* synthetic */ java.lang.String a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ java.lang.String c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f10238d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f10239e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f10240f;

        public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f10238d = str4;
            this.f10239e = str5;
            this.f10240f = str6;
        }

        @Override // q.d
        public void a(q.b<boxbr.apksrebrand.smarters.model.callback.LiveStreamsEpgCallback> bVar, java.lang.Throwable th) {
            f.j.a.j.h.this.a.b();
            f.j.a.j.h.this.a.e(th.getMessage());
        }

        @Override // q.d
        public void b(q.b<boxbr.apksrebrand.smarters.model.callback.LiveStreamsEpgCallback> bVar, q.l<boxbr.apksrebrand.smarters.model.callback.LiveStreamsEpgCallback> lVar) {
            f.j.a.j.h.this.a.b();
            if (lVar.d()) {
                f.j.a.j.h.this.a.b0(lVar.a(), this.a, this.b, this.c, this.f10238d, this.f10239e, this.f10240f);
            } else if (lVar.a() == null) {
                f.j.a.j.h.this.a.e("Invalid Request");
            }
        }
    }

    public h(f.j.a.k.f.e eVar, android.content.Context context) {
        this.a = eVar;
        this.b = context;
    }

    public void b(java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.a.a();
        q.m Y = f.j.a.h.i.e.Y(this.b);
        if (Y != null) {
            ((f.j.a.i.q.a) Y.d(f.j.a.i.q.a.class)).c(org.jsoup.helper.HttpConnection.FORM_URL_ENCODED, str, str2, "get_simple_data_table", i2).B(new f.j.a.j.h.a(str3, str4, str5, str6, str7, str8));
        }
    }
}
