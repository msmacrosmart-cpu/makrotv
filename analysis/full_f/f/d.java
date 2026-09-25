package f.j.a.f;

/* loaded from: classes.dex */
public class d extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
    public f.j.a.f.c<java.lang.String> a;
    public int b;
    public boolean c = false;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f9941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f9942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f9943f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List<f.j.a.f.e> f9944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f9945h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f9946i;

    /* loaded from: classes.dex */
    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.j.a.f.d dVar = f.j.a.f.d.this;
            dVar.d(dVar.f9941d, "Loading data...");
        }
    }

    /* loaded from: classes.dex */
    public class b implements java.lang.Runnable {
        public b(f.j.a.f.d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements java.lang.Runnable {
        public c(f.j.a.f.d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public d(android.content.Context context, java.lang.String str, int i2, f.j.a.f.c<java.lang.String> cVar, java.lang.String str2, java.util.List<f.j.a.f.e> list, java.lang.Boolean bool) {
        this.f9941d = context;
        this.f9942e = str;
        this.b = i2;
        this.a = cVar;
        this.f9943f = str2;
        this.f9944g = list;
        this.f9945h = bool;
    }

    public void a() {
        try {
            if (this.f9946i == null || !this.f9946i.isShowing()) {
                return;
            }
            this.f9946i.cancel();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.String doInBackground(java.lang.String... strArr) {
        java.lang.String str = null;
        try {
            str = f.j.a.f.a.a(this.f9941d, this.f9942e, this.b, this.f9943f, this.f9944g);
            if (str != null) {
                this.c = true;
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new f.j.a.f.d.b(this));
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    @Override // android.os.AsyncTask
    @android.annotation.TargetApi(11)
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        try {
            if (this.c) {
                if (str == null) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new f.j.a.f.d.c(this));
                }
                this.a.h0(str, this.b, this.c);
            } else {
                this.a.p(this.b);
            }
        } catch (java.lang.Exception unused) {
        }
        if (this.f9945h.booleanValue()) {
            try {
                a();
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public void d(android.content.Context context, java.lang.String str) {
        android.app.Dialog dialog = new android.app.Dialog(context, android.R.style.Theme.Translucent.NoTitleBar);
        this.f9946i = dialog;
        dialog.setContentView(brstore.makro.app.R.layout.layout_progress_bar);
        this.f9946i.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f9946i.setCancelable(false);
        ((android.widget.TextView) this.f9946i.findViewById(brstore.makro.app.R.id.message)).setText(str);
        try {
            if (((android.app.Activity) this.f9941d).isFinishing()) {
                android.util.Log.e("FINISHED", "FINISHED");
            } else {
                this.f9946i.show();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (this.f9945h.booleanValue()) {
            try {
                if (this.f9946i != null && this.f9946i.isShowing()) {
                    a();
                }
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new f.j.a.f.d.a());
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
