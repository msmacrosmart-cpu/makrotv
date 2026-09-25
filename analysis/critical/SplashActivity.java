package boxbr.apksrebrand.smarters.view.activity;

/* loaded from: classes.dex */
public class SplashActivity extends d.a.k.c implements f.j.a.k.f.f, f.j.a.f.c<java.lang.String> {
    public f.j.a.k.d.a.a A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public android.content.SharedPreferences I;
    public android.content.SharedPreferences J;
    public android.content.SharedPreferences.Editor K;
    public android.content.SharedPreferences.Editor L;
    public android.content.SharedPreferences M;
    public android.content.SharedPreferences N;
    public android.content.SharedPreferences O;
    public android.content.SharedPreferences P;
    public android.content.SharedPreferences Q;
    public android.content.SharedPreferences.Editor R;
    public android.content.SharedPreferences.Editor S;
    public android.content.SharedPreferences.Editor T;
    public android.content.SharedPreferences.Editor U;
    public android.content.SharedPreferences.Editor V;
    public android.content.SharedPreferences W;
    public android.content.SharedPreferences.Editor X;
    public f.j.a.i.p.e Y;
    public android.content.SharedPreferences Z;
    public java.lang.String b0;
    public java.lang.String c0;
    public java.lang.String d0;
    public f.j.a.j.c f0;
    public java.io.InputStream g0;
    public java.lang.String i0;
    public android.widget.LinearLayout j0;
    public android.content.SharedPreferences r;
    public android.content.SharedPreferences s;
    public android.content.Context t;
    public f.j.a.i.p.f u;
    public d.a.k.b v;
    public android.widget.ImageView w;
    public android.widget.ImageView x;
    public android.widget.VideoView z;
    public int y = 0;
    public java.lang.String H = "";
    public java.util.ArrayList<java.lang.String> a0 = new java.util.ArrayList<>();
    public int e0 = 1500;
    public final f.j.a.k.g.a h0 = new f.j.a.k.g.a();

    /* loaded from: classes.dex */
    public class a implements android.view.View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.v.dismiss();
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes.dex */
    public class b implements android.media.MediaPlayer.OnCompletionListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.e0 = 0;
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.g1();
        }
    }

    /* loaded from: classes.dex */
    public class c implements android.media.MediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
            splashActivity.z.seekTo(splashActivity.y);
            boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity2 = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
            int i2 = splashActivity2.y;
            android.widget.VideoView videoView = splashActivity2.z;
            if (i2 == 0) {
                videoView.start();
            } else {
                videoView.pause();
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.g1();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements java.lang.Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.h1();
        }
    }

    /* loaded from: classes.dex */
    public class e implements java.lang.Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.h1();
        }
    }

    /* loaded from: classes.dex */
    public class f implements java.lang.Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.h1();
        }
    }

    /* loaded from: classes.dex */
    public class g implements android.view.View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            try {
                android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(android.net.Uri.fromParts("package", boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.getPackageName(), null));
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivityForResult(intent, 1);
                android.widget.Toast.makeText(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t.getResources().getString(brstore.makro.app.R.string.grant_the_permission), 1).show();
            } catch (java.lang.Exception unused) {
            }
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.v.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class h extends android.app.Dialog implements android.view.View.OnClickListener {
        public android.widget.TextView b;
        public android.widget.TextView c;

        /* renamed from: d, reason: collision with root package name */
        public android.widget.LinearLayout f1009d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.LinearLayout f1010e;

        /* loaded from: classes.dex */
        public class a implements android.view.View.OnFocusChangeListener {
            public android.view.View b;

            public a(android.view.View view) {
                this.b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @android.annotation.SuppressLint({"ResourceType"})
            public void onFocusChange(android.view.View view, boolean z) {
                int i2;
                android.widget.LinearLayout linearLayout;
                if (z) {
                    android.view.View view2 = this.b;
                    i2 = brstore.makro.app.R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.b.getTag().equals("1")) {
                        android.view.View view3 = this.b;
                        if (view3 == null || view3.getTag() == null || !this.b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = boxbr.apksrebrand.smarters.view.activity.SplashActivity.h.this.f1010e;
                    }
                    linearLayout = boxbr.apksrebrand.smarters.view.activity.SplashActivity.h.this.f1009d;
                } else {
                    android.view.View view4 = this.b;
                    i2 = brstore.makro.app.R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.b.getTag().equals("1")) {
                        android.view.View view5 = this.b;
                        if (view5 == null || view5.getTag() == null || !this.b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = boxbr.apksrebrand.smarters.view.activity.SplashActivity.h.this.f1010e;
                    }
                    linearLayout = boxbr.apksrebrand.smarters.view.activity.SplashActivity.h.this.f1009d;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public h(android.app.Activity activity) {
            super(activity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int id = view.getId();
            try {
                if (id != brstore.makro.app.R.id.btn_close) {
                    if (id == brstore.makro.app.R.id.btn_try_again) {
                        dismiss();
                        new boxbr.apksrebrand.smarters.view.activity.SplashActivity.j().execute(new java.lang.Void[0]);
                    }
                }
                dismiss();
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.finishAffinity();
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            setContentView(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.A.w().equals(f.j.a.h.i.a.i0) ? brstore.makro.app.R.layout.custom_internet_not_working_layout_tv : brstore.makro.app.R.layout.custom_internet_not_working_layout);
            this.b = (android.widget.TextView) findViewById(brstore.makro.app.R.id.btn_try_again);
            this.c = (android.widget.TextView) findViewById(brstore.makro.app.R.id.btn_close);
            this.f1009d = (android.widget.LinearLayout) findViewById(brstore.makro.app.R.id.ll_yes_button_main_layout);
            this.f1010e = (android.widget.LinearLayout) findViewById(brstore.makro.app.R.id.ll_no_button_main_layout);
            this.b.setOnClickListener(this);
            this.c.setOnClickListener(this);
            android.widget.TextView textView = this.b;
            textView.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.SplashActivity.h.a(textView));
            android.widget.TextView textView2 = this.c;
            textView2.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.SplashActivity.h.a(textView2));
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class i extends android.os.AsyncTask<java.lang.String, java.lang.String, java.lang.Boolean> {
        public i() {
        }

        public /* synthetic */ i(boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity, boxbr.apksrebrand.smarters.view.activity.SplashActivity.b bVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:16:0x00c8->B:33:?, LOOP_END, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.String... r8) {
            /*
                Method dump skipped, instructions count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: boxbr.apksrebrand.smarters.view.activity.SplashActivity.i.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.P0();
                    return;
                }
                f.j.a.h.i.e.j0(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t.getResources().getString(brstore.makro.app.R.string.file_url_not_valid));
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.finish();
            } catch (java.lang.Exception unused) {
                android.content.Context context = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t;
                f.j.a.h.i.e.j0(context, context.getResources().getString(brstore.makro.app.R.string.file_url_not_valid));
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.finish();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(java.lang.String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class j extends android.os.AsyncTask<java.lang.Void, java.lang.Boolean, java.lang.Boolean> {
        public j() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.Void... voidArr) {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return java.lang.Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (java.lang.Exception e2) {
                android.util.Log.e("LOG_TAG", e2.toString());
                return java.lang.Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.P0();
                return;
            }
            boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.h hVar = new boxbr.apksrebrand.smarters.view.activity.SplashActivity.h((android.app.Activity) splashActivity.t);
            hVar.setCancelable(false);
            hVar.show();
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class k extends android.os.AsyncTask<java.lang.Void, java.lang.Boolean, java.lang.Boolean> {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.Void... voidArr) {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return java.lang.Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (java.lang.Exception e2) {
                android.util.Log.e("LOG_TAG", e2.toString());
                return java.lang.Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new boxbr.apksrebrand.smarters.view.activity.SplashActivity.l(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, null).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.d0);
                return;
            }
            boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.h hVar = new boxbr.apksrebrand.smarters.view.activity.SplashActivity.h((android.app.Activity) splashActivity.t);
            hVar.setCancelable(false);
            hVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class l extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Boolean> {
        public l() {
        }

        public /* synthetic */ l(boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity, boxbr.apksrebrand.smarters.view.activity.SplashActivity.b bVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.String... strArr) {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                return java.lang.Boolean.valueOf(responseCode == 200 || responseCode == 405 || responseCode == 404);
            } catch (java.lang.Exception e2) {
                android.util.Log.e("Google", e2.toString());
                return java.lang.Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new boxbr.apksrebrand.smarters.view.activity.SplashActivity.i(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, null).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.d0);
                return;
            }
            android.content.Context context = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t;
            f.j.a.h.i.e.j0(context, context.getResources().getString(brstore.makro.app.R.string.file_url_not_valid));
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class m extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        public m() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.String doInBackground(java.lang.String... strArr) {
            try {
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.g0 = new java.io.FileInputStream(new java.io.File(strArr[0]));
                return boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.h0.c(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.g0, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t);
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.String str) {
            boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity;
            super.onPostExecute(str);
            try {
                boolean z = true;
                if (str.equals("")) {
                    android.widget.Toast.makeText(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t.getResources().getString(brstore.makro.app.R.string.unable_to_login), 1).show();
                    boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
                    boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                    splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
                } else {
                    boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.i0 = str;
                    if (f.j.a.h.i.a.f10096f.booleanValue()) {
                        boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.H = f.j.a.f.f.a(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t);
                        if (boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.H != null && !boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.H.equals("") && !boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.H.isEmpty()) {
                            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.a0 = new java.util.ArrayList<>(java.util.Arrays.asList(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.H.split(",")));
                        }
                        if (boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.a0 == null || boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.a0.size() < 1) {
                            android.widget.Toast.makeText(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t.getResources().getString(brstore.makro.app.R.string.please_check_portal), 0).show();
                            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                            splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.a0.size()) {
                                    z = false;
                                    break;
                                } else {
                                    if (boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.i0 != null && boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.i0.contains(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.a0.get(i2))) {
                                        boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.Z0();
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            if (z) {
                                return;
                            }
                            android.widget.Toast.makeText(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.getResources().getString(brstore.makro.app.R.string.invalid_server_url), 0).show();
                            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
                            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                            splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
                        }
                    } else {
                        if (boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.i0.contains(f.j.a.f.f.a(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t))) {
                            boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.Z0();
                            return;
                        }
                        android.widget.Toast.makeText(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t, boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.getResources().getString(brstore.makro.app.R.string.invalid_server_url), 0).show();
                        boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                        boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                        splashActivity = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this;
                    }
                }
                splashActivity.finish();
            } catch (java.lang.Exception unused) {
                android.content.Context context = boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.t;
                android.widget.Toast.makeText(context, context.getResources().getString(brstore.makro.app.R.string.file_url_not_valid), 0).show();
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.SplashActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                boxbr.apksrebrand.smarters.view.activity.SplashActivity.this.finish();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static java.lang.String b1(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        for (char c2 : charArray) {
            if (z && java.lang.Character.isLetter(c2)) {
                sb.append(java.lang.Character.toUpperCase(c2));
                z = false;
            } else {
                if (java.lang.Character.isWhitespace(c2)) {
                    z = true;
                }
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static java.lang.String e1() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.startsWith(str)) {
            return b1(str2);
        }
        return b1(str) + " " + str2;
    }

    public static java.lang.String j1(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b2 : digest) {
                java.lang.String hexString = java.lang.Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Override // f.j.a.k.f.f
    public void H(boxbr.apksrebrand.smarters.model.callback.LoginCallback loginCallback, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        android.content.Intent intent;
        try {
            if (loginCallback.b() == null || loginCallback.a() == null) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    f.j.a.h.i.e.j0(this.t, "Your Account is invalid or has expired !");
                    return;
                }
                this.K.putString(f.j.a.h.i.a.f10105o, arrayList.get(0).trim());
                this.K.apply();
                arrayList.remove(0);
                this.f0.h(this.F, this.G, arrayList);
                return;
            }
            if (loginCallback == null || loginCallback.b() == null) {
                e(getResources().getString(brstore.makro.app.R.string.invalid_server_response));
                return;
            }
            if (loginCallback.b().c().intValue() != 1) {
                if (str.equals("validateLogin")) {
                    android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.invalid_details), 0).show();
                    return;
                }
                return;
            }
            if (!loginCallback.b().i().equals("Active")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    f.j.a.h.i.e.j0(this.t, "Your Account is invalid or has expired !");
                    return;
                }
                this.K.putString(f.j.a.h.i.a.f10105o, arrayList.get(0).trim());
                this.K.apply();
                arrayList.remove(0);
                this.f0.h(this.F, this.G, arrayList);
                return;
            }
            java.lang.String j2 = loginCallback.b().j();
            java.lang.String h2 = loginCallback.b().h();
            java.lang.String b2 = loginCallback.a().b();
            java.lang.String f2 = loginCallback.a().f();
            java.lang.String e2 = loginCallback.b().e();
            java.lang.String f3 = loginCallback.b().f();
            java.lang.String a2 = loginCallback.b().a();
            java.lang.String d2 = loginCallback.b().d();
            java.lang.String g2 = loginCallback.b().g();
            java.util.List<java.lang.String> b3 = loginCallback.b().b();
            java.lang.String d3 = loginCallback.a().d();
            java.lang.String a3 = loginCallback.a().a();
            java.lang.String c2 = loginCallback.a().c();
            java.lang.String e3 = loginCallback.a().e();
            if (b3.size() != 0) {
                b3.get(0);
            }
            this.t.getSharedPreferences("loginPrefsserverurl", 0).getString(f.j.a.h.i.a.f10105o, "").toLowerCase();
            android.content.SharedPreferences.Editor edit = getSharedPreferences("loginPrefs", 0).edit();
            edit.putString("username", j2);
            edit.putString("password", h2);
            edit.putString("serverPort", b2);
            edit.putString("serverUrl", f2);
            edit.putString("expDate", e2);
            edit.putString("isTrial", f3);
            edit.putString("activeCons", a2);
            edit.putString("createdAt", d2);
            edit.putString("maxConnections", g2);
            edit.putString(f.j.a.h.i.a.f10105o, f2 + ":" + b2);
            edit.putString("serverProtocol", d3);
            edit.putString("serverPortHttps", a3);
            edit.putString("serverPortRtmp", c2);
            edit.putString("serverTimeZone", e3);
            edit.apply();
            this.M = this.t.getSharedPreferences("allowedFormat", 0);
            this.N = this.t.getSharedPreferences("timeFormat", 0);
            this.O = this.t.getSharedPreferences("epgchannelupdate", 0);
            this.P = this.t.getSharedPreferences("automation_channels", 0);
            this.Q = this.t.getSharedPreferences("automation_epg", 0);
            this.T = this.M.edit();
            this.R = this.N.edit();
            this.S = this.O.edit();
            this.U = this.P.edit();
            this.V = this.Q.edit();
            android.content.SharedPreferences sharedPreferences = this.t.getSharedPreferences("auto_start", 0);
            this.W = sharedPreferences;
            android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
            this.X = edit2;
            if (edit2 != null) {
                edit2.putBoolean("full_epg", true);
                this.X.apply();
            }
            if (this.P.getString("automation_channels", "").equals("")) {
                this.U.putString("automation_channels", "checked");
                this.U.apply();
            }
            if (this.Q.getString("automation_epg", "").equals("")) {
                this.V.putString("automation_epg", "checked");
                this.V.apply();
            }
            f.j.a.h.i.a.B = java.lang.Boolean.FALSE;
            if (this.M.getString("allowedFormat", "").equals("")) {
                this.T.putString("allowedFormat", "ts");
                this.T.apply();
            }
            if (this.N.getString("timeFormat", f.j.a.h.i.a.d0).equals("")) {
                this.R.putString("timeFormat", f.j.a.h.i.a.d0);
                this.R.apply();
            }
            if (this.O.getString("epgchannelupdate", "").equals("")) {
                this.S.putString("epgchannelupdate", "all");
                this.S.apply();
            }
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
            finish();
            return;
        } catch (java.io.IOException e4) {
            e4.printStackTrace();
        }
        e4.printStackTrace();
    }

    @Override // f.j.a.k.f.f
    public void M(java.lang.String str) {
    }

    public void N0() {
        this.C = android.os.Build.VERSION.RELEASE + " " + android.os.Build.VERSION_CODES.class.getFields()[android.os.Build.VERSION.SDK_INT].getName();
    }

    public void O0() {
        int nextInt = new java.util.Random().nextInt(8378600) + 10000;
        this.E = nextInt;
        f.j.a.f.b.b = java.lang.String.valueOf(nextInt);
    }

    @Override // f.j.a.k.f.f
    public void P(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
            finish();
            f.j.a.h.i.e.j0(this.t, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.K.putString(f.j.a.h.i.a.f10105o, arrayList.get(0).trim());
            this.K.apply();
            arrayList.remove(0);
            this.f0.h(this.F, this.G, arrayList);
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }

    public void P0() {
        java.lang.StringBuilder sb;
        java.util.List<f.j.a.f.e> list;
        java.lang.String str = "playlist";
        if (f.j.a.i.p.l.f(this.t).equals("m3u")) {
            sb = new java.lang.StringBuilder();
            sb.append(f.j.a.f.f.c(this));
            sb.append("*");
            sb.append(f.j.a.f.f.d(this));
            sb.append("-");
            sb.append("playlist");
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(f.j.a.f.f.c(this));
            sb.append("*");
            sb.append(f.j.a.f.f.d(this));
            sb.append("-");
            sb.append(this.F);
        }
        sb.append("-");
        sb.append(f.j.a.f.b.b);
        sb.append("-");
        sb.append(this.D);
        sb.append("-unknown-");
        sb.append(e1());
        sb.append("-");
        sb.append(this.C);
        this.B = j1(sb.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f.j.a.f.g.b = arrayList;
        arrayList.add(f.j.a.f.g.a(com.facebook.internal.m.a, "gu"));
        f.j.a.f.g.b.add(f.j.a.f.g.a("k", f.j.a.f.f.c(this)));
        f.j.a.f.g.b.add(f.j.a.f.g.a("sc", this.B));
        if (f.j.a.i.p.l.f(this.t).equals("m3u")) {
            list = f.j.a.f.g.b;
        } else {
            list = f.j.a.f.g.b;
            str = this.F;
        }
        list.add(f.j.a.f.g.a("u", str));
        f.j.a.f.g.b.add(f.j.a.f.g.a("pw", "no_password"));
        f.j.a.f.g.b.add(f.j.a.f.g.a("r", f.j.a.f.b.b));
        f.j.a.f.g.b.add(f.j.a.f.g.a("av", this.D));
        f.j.a.f.g.b.add(f.j.a.f.g.a("dt", tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN));
        f.j.a.f.g.b.add(f.j.a.f.g.a("d", e1()));
        f.j.a.f.g.b.add(f.j.a.f.g.a("do", this.C));
        f.j.a.f.g.c.b(this);
    }

    @Override // f.j.a.k.f.f
    public void U(boxbr.apksrebrand.smarters.model.callback.LoginCallback loginCallback, java.lang.String str) {
        java.lang.String string;
        if (this.t != null) {
            if (loginCallback == null || loginCallback.b() == null) {
                startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                finish();
                e(getResources().getString(brstore.makro.app.R.string.invalid_server_response));
                return;
            }
            if (loginCallback.b().c().intValue() == 1) {
                java.lang.String i2 = loginCallback.b().i();
                if (i2.equals("Active")) {
                    java.lang.String j2 = loginCallback.b().j();
                    java.lang.String h2 = loginCallback.b().h();
                    java.lang.String b2 = loginCallback.a().b();
                    java.lang.String f2 = loginCallback.a().f();
                    java.lang.String e2 = loginCallback.b().e();
                    java.lang.String f3 = loginCallback.b().f();
                    java.lang.String a2 = loginCallback.b().a();
                    java.lang.String d2 = loginCallback.b().d();
                    java.lang.String g2 = loginCallback.b().g();
                    java.util.List<java.lang.String> b3 = loginCallback.b().b();
                    java.lang.String d3 = loginCallback.a().d();
                    java.lang.String a3 = loginCallback.a().a();
                    java.lang.String c2 = loginCallback.a().c();
                    java.lang.String e3 = loginCallback.a().e();
                    if (b3.size() != 0) {
                        b3.get(0);
                    }
                    this.t.getSharedPreferences("loginPrefsserverurl", 0).getString(f.j.a.h.i.a.f10105o, "").toLowerCase();
                    android.content.SharedPreferences.Editor edit = getSharedPreferences("loginPrefs", 0).edit();
                    edit.putString("username", j2);
                    edit.putString("password", h2);
                    edit.putString("serverPort", b2);
                    edit.putString("serverUrl", f2);
                    edit.putString("expDate", e2);
                    edit.putString("isTrial", f3);
                    edit.putString("activeCons", a2);
                    edit.putString("createdAt", d2);
                    edit.putString("maxConnections", g2);
                    edit.putString(f.j.a.h.i.a.f10105o, f2 + ":" + b2);
                    edit.putString("serverProtocol", d3);
                    edit.putString("serverPortHttps", a3);
                    edit.putString("serverPortRtmp", c2);
                    edit.putString("serverTimeZone", e3);
                    edit.apply();
                    this.M = this.t.getSharedPreferences("allowedFormat", 0);
                    this.N = this.t.getSharedPreferences("timeFormat", 0);
                    this.O = this.t.getSharedPreferences("epgchannelupdate", 0);
                    this.P = this.t.getSharedPreferences("automation_channels", 0);
                    this.Q = this.t.getSharedPreferences("automation_epg", 0);
                    this.T = this.M.edit();
                    this.R = this.N.edit();
                    this.S = this.O.edit();
                    this.U = this.P.edit();
                    this.V = this.Q.edit();
                    android.content.SharedPreferences sharedPreferences = this.t.getSharedPreferences("auto_start", 0);
                    this.W = sharedPreferences;
                    android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    this.X = edit2;
                    if (edit2 != null) {
                        edit2.putBoolean("full_epg", true);
                        this.X.apply();
                    }
                    if (this.P.getString("automation_channels", "").equals("")) {
                        this.U.putString("automation_channels", "checked");
                        this.U.apply();
                    }
                    if (this.Q.getString("automation_epg", "").equals("")) {
                        this.V.putString("automation_epg", "checked");
                        this.V.apply();
                    }
                    f.j.a.h.i.a.B = java.lang.Boolean.FALSE;
                    if (this.M.getString("allowedFormat", "").equals("")) {
                        this.T.putString("allowedFormat", "ts");
                        this.T.apply();
                    }
                    if (this.N.getString("timeFormat", f.j.a.h.i.a.d0).equals("")) {
                        this.R.putString("timeFormat", f.j.a.h.i.a.d0);
                        this.R.apply();
                    }
                    if (this.O.getString("epgchannelupdate", "").equals("")) {
                        this.S.putString("epgchannelupdate", "all");
                        this.S.apply();
                    }
                    startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                    finish();
                    return;
                }
                startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                finish();
                string = getResources().getString(brstore.makro.app.R.string.invalid_status) + i2;
            } else {
                startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                finish();
                string = getResources().getString(brstore.makro.app.R.string.invalid_details);
            }
            android.widget.Toast.makeText(this, string, 0).show();
        }
    }

    public final void Z0() {
        android.app.Activity activity;
        try {
            if (this.Y.n1("m3u") == 0) {
                java.util.ArrayList<f.j.a.i.p.d> arrayList = new java.util.ArrayList<>();
                f.j.a.i.p.d dVar = new f.j.a.i.p.d();
                dVar.l("all");
                dVar.j("0");
                dVar.g("");
                arrayList.add(0, dVar);
                this.Y.M1(arrayList, "m3u");
            }
            f.j.a.i.p.d J1 = this.Y.J1("all");
            if (J1 != null) {
                if ((J1.d() == null || !J1.d().equals("0")) && (J1.d() == null || !J1.d().equals("2"))) {
                    if (J1.d() != null && J1.d().equals("1")) {
                        long q2 = f.j.a.h.i.e.q(new java.text.SimpleDateFormat("dd/MM/yyyy", java.util.Locale.US), J1.a(), f.j.a.h.i.e.h());
                        if (!d1() || q2 < this.A.c()) {
                            this.t.startActivity(new android.content.Intent(this.t, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                            activity = (android.app.Activity) this.t;
                        } else {
                            this.t.startActivity(new android.content.Intent(this.t, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.ImportM3uActivity.class));
                            activity = (android.app.Activity) this.t;
                        }
                    } else {
                        if (J1.d() == null || !J1.d().equals("3")) {
                            return;
                        }
                        this.t.startActivity(new android.content.Intent(this.t, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.ImportM3uActivity.class));
                        activity = (android.app.Activity) this.t;
                    }
                } else {
                    if (this.t == null) {
                        return;
                    }
                    this.t.startActivity(new android.content.Intent(this.t, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.ImportM3uActivity.class));
                    activity = (android.app.Activity) this.t;
                }
                activity.finish();
            }
        } catch (java.lang.Exception unused) {
            android.content.Context context = this.t;
            android.widget.Toast.makeText(context, context.getResources().getString(brstore.makro.app.R.string.file_url_not_valid), 0).show();
            startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
            overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
            finish();
        }
    }

    @Override // f.j.a.k.f.b
    public void a() {
    }

    public void a1() {
        try {
            this.D = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Override // f.j.a.k.f.b
    public void b() {
    }

    @Override // f.j.a.k.f.f
    public void c0(java.lang.String str) {
        startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
        finish();
    }

    public final void c1() {
        android.view.Window window = getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            window.clearFlags(67108864);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(d.h.i.b.d(this, brstore.makro.app.R.color.colorPrimaryDark));
        }
    }

    public boolean d1() {
        return this.t.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    @Override // f.j.a.k.f.b
    public void e(java.lang.String str) {
    }

    public void f1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (java.lang.Exception unused) {
        }
    }

    public void g1() {
        android.os.Handler handler;
        java.lang.Runnable fVar;
        if (!f.j.a.h.i.a.D.booleanValue()) {
            if (f.j.a.i.p.l.f(this.t).equals("m3u")) {
                android.content.SharedPreferences sharedPreferences = this.r;
                if (sharedPreferences != null) {
                    java.lang.String string = sharedPreferences.getString("serverUrl", "");
                    this.d0 = string;
                    if (string == null || string.equals("")) {
                        handler = new android.os.Handler();
                        fVar = new boxbr.apksrebrand.smarters.view.activity.SplashActivity.e();
                    }
                    h1();
                    return;
                }
                return;
            }
            android.content.SharedPreferences sharedPreferences2 = this.r;
            if (sharedPreferences2 != null) {
                java.lang.String string2 = sharedPreferences2.getString("username", "");
                java.lang.String string3 = this.r.getString("password", "");
                if (string2 == null || string3 == null || string2.equals("") || string3.equals("") || f.j.a.h.i.a.f10094d.booleanValue()) {
                    handler = new android.os.Handler();
                    fVar = new boxbr.apksrebrand.smarters.view.activity.SplashActivity.f();
                }
            }
            h1();
            return;
        }
        handler = new android.os.Handler();
        fVar = new boxbr.apksrebrand.smarters.view.activity.SplashActivity.d();
        handler.postDelayed(fVar, this.e0);
    }

    public void h1() {
        android.content.Intent intent;
        f.j.a.k.d.a.a aVar = this.A;
        if (aVar != null) {
            java.lang.String w = aVar.w();
            if (w == null || w.equals("")) {
                startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.ScreenTypeActivity.class));
                finish();
            }
            if (f.j.a.h.i.a.D.booleanValue()) {
                android.content.SharedPreferences sharedPreferences = this.r;
                if (sharedPreferences != null) {
                    java.lang.String string = sharedPreferences.getString("username", "");
                    if (string == null || string.equals("")) {
                        java.lang.String string2 = this.t.getSharedPreferences("loginprefsmultiuser", 0).getString("username", "");
                        intent = (string2 == null || string2.equals("")) ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class);
                    } else {
                        intent = new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class);
                    }
                } else {
                    intent = new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class);
                }
            } else {
                try {
                    if (f.j.a.i.p.l.f(this.t).equals("m3u")) {
                        if (!f.j.a.h.i.a.f10097g.booleanValue()) {
                            return;
                        }
                        if (this.r != null) {
                            java.lang.String string3 = this.r.getString("serverUrl", "");
                            this.d0 = string3;
                            if (string3 == null || string3.equals("")) {
                                startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                                overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                            } else {
                                java.util.ArrayList<f.j.a.i.i> G = this.u.G(f.j.a.i.p.l.z(this.t));
                                if (G == null || G.size() <= 0) {
                                    android.widget.Toast.makeText(this.t, getResources().getString(brstore.makro.app.R.string.user_not_found), 0).show();
                                    startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                                    overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                                } else if (G.get(0).a().equals("file")) {
                                    this.c0 = "file";
                                    if (new java.io.File(this.d0).exists()) {
                                        new boxbr.apksrebrand.smarters.view.activity.SplashActivity.j().execute(new java.lang.Void[0]);
                                        return;
                                    } else {
                                        android.widget.Toast.makeText(this.t, getResources().getString(brstore.makro.app.R.string.m3u_file_not_found), 0).show();
                                        startActivity(f.j.a.h.i.a.f10095e.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                                        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                                    }
                                } else if (G.get(0).a().equals(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                                    this.c0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL;
                                    new boxbr.apksrebrand.smarters.view.activity.SplashActivity.k().execute(new java.lang.Void[0]);
                                    return;
                                } else {
                                    startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                                    overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                                }
                            }
                        } else {
                            startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class));
                            overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                        }
                    } else if (f.j.a.h.i.a.f10096f.booleanValue()) {
                        if (this.r != null) {
                            java.lang.String string4 = this.r.getString("username", "");
                            java.lang.String string5 = this.r.getString("password", "");
                            if (string4 == null || string5 == null || string4.equals("") || string5.equals("")) {
                                startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
                                overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                            } else {
                                this.F = string4;
                                this.G = string5;
                                if (!f.j.a.h.i.a.f10094d.booleanValue()) {
                                    new boxbr.apksrebrand.smarters.view.activity.SplashActivity.j().execute(new java.lang.Void[0]);
                                    return;
                                } else {
                                    startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                                    overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                                }
                            }
                        } else {
                            startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
                            overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                        }
                    } else if (this.r != null) {
                        java.lang.String string6 = this.r.getString("username", "");
                        java.lang.String string7 = this.r.getString("password", "");
                        if (string6 == null || string7 == null || string6.equals("") || string7.equals("")) {
                            startActivity(f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class));
                            overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                        } else {
                            this.F = string6;
                            this.G = string7;
                            if (!f.j.a.h.i.a.f10094d.booleanValue()) {
                                new boxbr.apksrebrand.smarters.view.activity.SplashActivity.j().execute(new java.lang.Void[0]);
                                return;
                            } else {
                                startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                                overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                            }
                        }
                    } else {
                        startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class));
                        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                    }
                    finish();
                    return;
                } catch (java.lang.Exception unused) {
                    intent = f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class);
                }
            }
        } else {
            intent = new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
        finish();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 12 */
    public void i1() {
        try {
            if (android.os.Build.VERSION.SDK_INT < 23) {
                new java.io.File("/sys/tgg").exists();
                g1();
            } else if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                new java.io.File("/sys/tgg").exists();
                g1();
                android.util.Log.v("TAG", "Permission is granted");
            } else {
                d.h.h.a.o(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            }
        } catch (java.lang.Exception unused) {
            b();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 18 */
    @Override // f.j.a.f.c
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public void h0(java.lang.String str, int i2, boolean z) {
        android.content.Intent intent;
        java.io.File file;
        if (z) {
            try {
                if (i2 == 1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    f.j.a.f.b.a = jSONObject;
                    if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                        this.H = f.j.a.f.b.a.getString("su");
                        f.j.a.f.b.a.getString("ndd");
                        java.lang.System.currentTimeMillis();
                        try {
                            f.j.a.f.f.e(this, f.j.a.f.b.a.optString("su"));
                            this.b0 = j1(f.j.a.f.b.a.optString("su") + "*" + f.j.a.f.f.d(this) + "*" + f.j.a.f.b.b);
                            f.j.a.f.b.a.getString("sc").equalsIgnoreCase(this.b0);
                            if (!f.j.a.i.p.l.f(this.t).equals("m3u")) {
                                java.lang.String string = this.r.getString("username", "");
                                java.lang.String string2 = this.r.getString("password", "");
                                if (string != null && string2 != null && !string.equals("") && !string2.equals("")) {
                                    this.F = string;
                                    this.G = string2;
                                }
                                this.K.putString(f.j.a.h.i.a.f10105o, f.j.a.f.f.a(this));
                                this.K.apply();
                                this.L.putString(f.j.a.h.i.a.f10105o, f.j.a.f.f.a(this));
                                this.L.putString("username", this.F);
                                this.L.apply();
                                l1((f.j.a.h.i.a.f10096f.booleanValue() ? this.H : this.H).toLowerCase());
                                return;
                            }
                            if (this.c0 != null && this.c0.equals("file")) {
                                new boxbr.apksrebrand.smarters.view.activity.SplashActivity.m().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, this.d0);
                                return;
                            }
                            if (this.c0 == null || !this.c0.equals(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                                return;
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 19) {
                                file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks");
                            } else {
                                file = new java.io.File(android.os.Environment.getExternalStorageDirectory() + "/Download", "BoxBRApks");
                            }
                            new boxbr.apksrebrand.smarters.view.activity.SplashActivity.m().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, file + "/data.txt");
                            return;
                        } catch (java.lang.Exception unused) {
                            startActivity(f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class));
                            overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                        }
                    } else {
                        android.widget.Toast.makeText(this, this.t.getResources().getString(brstore.makro.app.R.string.status_suspend), 0).show();
                        startActivity(f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class));
                        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                    }
                } else {
                    startActivity(f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class));
                    overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
                }
                finish();
                return;
            } catch (java.lang.Exception unused2) {
                intent = f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class);
            }
        } else {
            android.widget.Toast.makeText(this, this.t.getResources().getString(brstore.makro.app.R.string.could_not_connect), 0).show();
            intent = f.j.a.h.i.a.f10098h.booleanValue() ? new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
        finish();
    }

    public final void l1(java.lang.String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.a0 = new java.util.ArrayList<>(java.util.Arrays.asList(str.split(",")));
        }
        java.util.ArrayList<java.lang.String> arrayList = this.a0;
        if (arrayList == null || arrayList.size() < 1) {
            java.util.ArrayList<java.lang.String> arrayList2 = this.a0;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            android.widget.Toast.makeText(this, this.t.getResources().getString(brstore.makro.app.R.string.please_check_portal), 0).show();
            return;
        }
        try {
            this.K.putString(f.j.a.h.i.a.f10105o, this.a0.get(0).trim());
            this.K.commit();
            this.a0.remove(0);
            this.f0.h(this.F, this.G, this.a0);
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }

    public void m1() {
        this.z.setVisibility(8);
        this.x.setVisibility(0);
        this.w.setVisibility(0);
    }

    public void o1() {
        this.z.setVisibility(0);
        this.x.setVisibility(8);
        this.w.setVisibility(8);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 8 */
    @Override // d.k.a.e, android.app.Activity
    public void onActivityResult(int i2, int i3, android.content.Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            new java.io.File("/sys/tgg").exists();
            g1();
            android.util.Log.v("TAG", "Permission is granted");
        } else if (i3 == 0) {
            if (i2 == 1) {
                try {
                    i1();
                    return;
                } catch (java.lang.Exception unused) {
                }
            }
            finish();
        }
    }

    @Override // d.a.k.c, d.k.a.e, d.h.h.e, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.t = this;
        super.onCreate(bundle);
        try {
            startService(new android.content.Intent(getBaseContext(), (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.StopProcessingTasksService.class));
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        f1();
        setContentView(brstore.makro.app.R.layout.activity_splash);
        if (!f.j.a.h.i.a.D.booleanValue()) {
            a1();
            N0();
            e1();
            O0();
        }
        this.A = new f.j.a.k.d.a.a(this.t);
        f.j.a.f.g.c = new f.j.a.f.g(this);
        this.z = (android.widget.VideoView) findViewById(brstore.makro.app.R.id.video_splash);
        this.j0 = (android.widget.LinearLayout) findViewById(brstore.makro.app.R.id.ll_tagline);
        if (f.j.a.h.i.a.D.booleanValue()) {
            this.j0.setVisibility(0);
        } else {
            this.j0.setVisibility(8);
        }
        ((android.widget.RelativeLayout) findViewById(brstore.makro.app.R.id.main_layout)).setSystemUiVisibility(4871);
        this.w = (android.widget.ImageView) findViewById(brstore.makro.app.R.id.iv_splash_bg);
        this.x = (android.widget.ImageView) findViewById(brstore.makro.app.R.id.iv_logo);
        this.Y = new f.j.a.i.p.e(this.t);
        android.content.SharedPreferences sharedPreferences = getSharedPreferences("sharedPreference", 0);
        this.Z = sharedPreferences;
        this.L = sharedPreferences.edit();
        this.r = getSharedPreferences("loginPrefs", 0);
        android.content.SharedPreferences sharedPreferences2 = getSharedPreferences("sharedprefremberme", 0);
        this.I = sharedPreferences2;
        sharedPreferences2.getBoolean("savelogin", true);
        android.content.SharedPreferences sharedPreferences3 = getSharedPreferences("loginPrefsserverurl", 0);
        this.J = sharedPreferences3;
        this.K = sharedPreferences3.edit();
        this.s = getSharedPreferences("selected_language", 0);
        this.I.edit();
        java.lang.String string = this.s.getString("selected_language", "");
        if (!string.equals("")) {
            f.j.a.h.i.e.d0(this.t, string);
        }
        this.f0 = new f.j.a.j.c(this, this.t);
        this.u = new f.j.a.i.p.f(this.t);
        if (f.j.a.i.p.l.G(this.t)) {
            f.j.a.i.p.l.m0(true, this.t);
        }
        if (f.j.a.h.i.a.f10103m.booleanValue()) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(f.j.a.f.g.a.a);
                sb.append(f.j.a.f.g.a.f9947d);
                this.z.setVideoURI(android.net.Uri.parse(sb.toString()));
                o1();
            } catch (java.lang.Exception unused) {
                m1();
                this.e0 = 1500;
                g1();
            }
            this.z.setOnCompletionListener(new boxbr.apksrebrand.smarters.view.activity.SplashActivity.b());
            this.z.setOnPreparedListener(new boxbr.apksrebrand.smarters.view.activity.SplashActivity.c());
        } else {
            m1();
            this.e0 = 1500;
            try {
                i1();
            } catch (java.lang.Exception unused2) {
            }
        }
        c1();
        this.t.getSharedPreferences("update_version", 0);
        f.j.a.f.f.g(this, "K8d249e8e6a5562c77951f1540cbeae4e");
        f.j.a.f.f.f(this, "K8d249e8e6a5562c77951f1540cbeae4e");
        f.j.a.f.f.h(this, "NB!@#12ZKWd");
        this.s = getSharedPreferences("selected_language", 0);
    }

    @Override // d.k.a.e, android.app.Activity
    public void onPause() {
        super.onPause();
        java.lang.String string = this.s.getString("selected_language", "");
        if (string.equals("")) {
            return;
        }
        f.j.a.h.i.e.d0(this.t, string);
    }

    @Override // d.k.a.e, android.app.Activity, d.h.h.a.b
    public void onRequestPermissionsResult(int i2, java.lang.String[] strArr, int[] iArr) {
        if (i2 == 1) {
            try {
                if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                    i1();
                } else if (android.os.Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                    onBackPressed();
                } else {
                    d.a.k.b.a aVar = new d.a.k.b.a(this, brstore.makro.app.R.style.AlertDialogCustom);
                    android.view.View inflate = android.view.LayoutInflater.from(this).inflate(brstore.makro.app.R.layout.permission_alertbox, (android.view.ViewGroup) null);
                    android.widget.Button button = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.btn_grant);
                    android.widget.Button button2 = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.btn_cancel);
                    button.setOnFocusChangeListener(new f.j.a.h.i.e.i((android.view.View) button, this));
                    button2.setOnFocusChangeListener(new f.j.a.h.i.e.i((android.view.View) button2, this));
                    button.requestFocus();
                    button.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.SplashActivity.g());
                    button2.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.SplashActivity.a());
                    aVar.r(inflate);
                    this.v = aVar.a();
                    android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
                    android.view.Window window = this.v.getWindow();
                    window.getClass();
                    layoutParams.copyFrom(window.getAttributes());
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    this.v.show();
                    this.v.getWindow().setAttributes(layoutParams);
                    this.v.setCancelable(false);
                    this.v.show();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        f1();
    }

    @Override // f.j.a.f.c
    public void p(int i2) {
        java.io.File file;
        android.content.Context context = this.t;
        if (context != null) {
            try {
                if (!f.j.a.i.p.l.f(context).equals("m3u")) {
                    this.f0.g(this.F, this.G);
                    return;
                }
                if (this.c0 != null && this.c0.equals("file")) {
                    new boxbr.apksrebrand.smarters.view.activity.SplashActivity.m().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, this.d0);
                    return;
                }
                if (this.c0 == null || !this.c0.equals(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 19) {
                    file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks");
                } else {
                    file = new java.io.File(android.os.Environment.getExternalStorageDirectory() + "/Download", "BoxBRApks");
                }
                new boxbr.apksrebrand.smarters.view.activity.SplashActivity.m().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, file + "/data.txt");
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // f.j.a.k.f.f
    public void x(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
            finish();
            f.j.a.h.i.e.j0(this.t, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.K.putString(f.j.a.h.i.a.f10105o, arrayList.get(0).trim());
            this.K.apply();
            arrayList.remove(0);
            this.f0.h(this.F, this.G, arrayList);
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }
}
