package f.j.a.h.i;

/* loaded from: classes.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.PopupWindow f10111f;

    /* renamed from: g, reason: collision with root package name */
    public static android.content.SharedPreferences f10112g;

    /* renamed from: h, reason: collision with root package name */
    public static android.content.SharedPreferences f10113h;

    /* renamed from: i, reason: collision with root package name */
    public static f.j.a.k.d.a.a f10114i;

    /* renamed from: j, reason: collision with root package name */
    public static android.os.AsyncTask f10115j;

    /* renamed from: k, reason: collision with root package name */
    public static android.os.AsyncTask f10116k;

    /* renamed from: l, reason: collision with root package name */
    public static android.os.AsyncTask f10117l;

    /* renamed from: m, reason: collision with root package name */
    public static android.os.AsyncTask f10118m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f10119n;

    /* renamed from: o, reason: collision with root package name */
    public static android.os.AsyncTask f10120o;

    /* renamed from: p, reason: collision with root package name */
    public static android.app.Dialog f10121p;
    public android.content.SharedPreferences a;
    public int b = 0;
    public boolean c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f10122d = 5;

    /* renamed from: e, reason: collision with root package name */
    public int[] f10123e = {1};

    /* loaded from: classes.dex */
    public class a implements android.view.View.OnClickListener {
        public a(f.j.a.h.i.e eVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.i.e.f10111f.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity b;

        /* loaded from: classes.dex */
        public class a implements java.lang.Runnable {
            public a(f.j.a.h.i.e.b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.j.a.h.i.e.f10111f.dismiss();
            }
        }

        public b(android.app.Activity activity) {
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.i.e.this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(this.b);
            android.content.SharedPreferences.Editor edit = f.j.a.h.i.e.this.a.edit();
            edit.putBoolean("CANCELLED", true);
            edit.apply();
            f.j.a.h.i.e.this.n0(this.b, "stopped");
            android.app.Activity activity = this.b;
            android.widget.Toast.makeText(activity, activity.getResources().getString(brstore.makro.app.R.string.download_stopped), 0).show();
            new android.os.Handler().postDelayed(new f.j.a.h.i.e.b.a(this), 500L);
        }
    }

    /* loaded from: classes.dex */
    public class c implements android.view.View.OnClickListener {
        public c(f.j.a.h.i.e eVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.i.e.f10111f.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class d implements android.view.View.OnClickListener {
        public java.lang.String b;
        public boolean c = true;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f10124d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ android.widget.EditText f10125e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ android.content.SharedPreferences f10126f;

        /* loaded from: classes.dex */
        public class a implements f.j.a.h.c.j {
            public a() {
            }

            @Override // f.j.a.h.c.j
            public void a(java.lang.String str) {
                f.j.a.h.i.e.d.this.b = str;
                f.j.a.h.i.e.d.this.f10125e.setText(str);
                android.content.SharedPreferences.Editor edit = f.j.a.h.i.e.d.this.f10126f.edit();
                edit.putString("recordingDir", str);
                edit.apply();
                android.widget.Toast.makeText(f.j.a.h.i.e.d.this.f10124d, "Chosen directory: " + str, 1).show();
            }
        }

        public d(f.j.a.h.i.e eVar, android.app.Activity activity, android.widget.EditText editText, android.content.SharedPreferences sharedPreferences) {
            this.f10124d = activity;
            this.f10125e = editText;
            this.f10126f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.c cVar = new f.j.a.h.c(this.f10124d, new f.j.a.h.i.e.d.a());
            cVar.K(this.c);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                cVar.E("");
            } else {
                cVar.D("");
            }
            this.c = !this.c;
        }
    }

    /* renamed from: f.j.a.h.i.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0274e implements android.view.View.OnClickListener {
        public final /* synthetic */ android.widget.EditText b;
        public final /* synthetic */ android.app.Activity c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f10127d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ android.widget.EditText f10128e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ android.widget.EditText f10129f;

        /* renamed from: f.j.a.h.i.e$e$a */
        /* loaded from: classes.dex */
        public class a implements java.lang.Runnable {
            public a(f.j.a.h.i.e.ViewOnClickListenerC0274e viewOnClickListenerC0274e) {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.j.a.h.i.e.f10111f.dismiss();
            }
        }

        public ViewOnClickListenerC0274e(android.widget.EditText editText, android.app.Activity activity, java.lang.String str, android.widget.EditText editText2, android.widget.EditText editText3) {
            this.b = editText;
            this.c = activity;
            this.f10127d = str;
            this.f10128e = editText2;
            this.f10129f = editText3;
        }

        public final boolean a() {
            android.app.Activity activity;
            android.content.res.Resources resources;
            int i2;
            if (this.f10128e.getText().toString().trim().length() == 0) {
                activity = this.c;
                resources = activity.getResources();
                i2 = brstore.makro.app.R.string.input_filename;
            } else if (this.b.getText().toString().trim().length() == 0) {
                activity = this.c;
                resources = activity.getResources();
                i2 = brstore.makro.app.R.string.input_duration;
            } else {
                if (this.b.getText().toString().trim().length() == 0) {
                    return true;
                }
                try {
                    f.j.a.h.i.e.R(this.b.getText().toString());
                    return true;
                } catch (java.lang.NumberFormatException unused) {
                    activity = this.c;
                    resources = activity.getResources();
                    i2 = brstore.makro.app.R.string.enter_correct_duaration;
                }
            }
            android.widget.Toast.makeText(activity, resources.getString(i2), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int i2;
            if (a()) {
                try {
                    i2 = f.j.a.h.i.e.R(this.b.getText().toString());
                } catch (java.lang.NumberFormatException unused) {
                    i2 = 0;
                }
                new f.j.a.h.i.e.h(this.c, this.f10127d, i2, this.f10128e.getText().toString(), true, this.f10129f.getText().toString());
                new android.os.Handler().postDelayed(new f.j.a.h.i.e.ViewOnClickListenerC0274e.a(this), 500L);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements android.view.View.OnClickListener {
        public f(f.j.a.h.i.e eVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.i.e.f10111f.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class g implements android.view.View.OnClickListener {
        public final /* synthetic */ java.io.File b;
        public final /* synthetic */ boxbr.apksrebrand.smarters.view.activity.RecordingActivity c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f10131d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boxbr.apksrebrand.smarters.view.adapter.RecordingAdapter f10132e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ android.widget.TextView f10133f;

        /* loaded from: classes.dex */
        public class a implements java.lang.Runnable {
            public a(f.j.a.h.i.e.g gVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.j.a.h.i.e.f10111f.dismiss();
            }
        }

        public g(f.j.a.h.i.e eVar, java.io.File file, boxbr.apksrebrand.smarters.view.activity.RecordingActivity recordingActivity, java.util.ArrayList arrayList, boxbr.apksrebrand.smarters.view.adapter.RecordingAdapter recordingAdapter, android.widget.TextView textView) {
            this.b = file;
            this.c = recordingActivity;
            this.f10131d = arrayList;
            this.f10132e = recordingAdapter;
            this.f10133f = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (this.b.exists() && this.b.delete()) {
                boxbr.apksrebrand.smarters.view.activity.RecordingActivity recordingActivity = this.c;
                android.widget.Toast.makeText(recordingActivity, recordingActivity.getResources().getString(brstore.makro.app.R.string.recording_deleted), 0).show();
                java.io.File[] A = f.j.a.h.i.e.A(this.c);
                if (A != null && A.length > 0) {
                    this.f10131d.clear();
                    for (java.io.File file : A) {
                        if (file.toString().endsWith(".ts")) {
                            this.f10131d.addAll(java.util.Arrays.asList(file));
                        }
                    }
                    java.util.ArrayList arrayList = this.f10131d;
                    if (arrayList != null && arrayList.size() > 0) {
                        this.f10132e.t();
                        new android.os.Handler().postDelayed(new f.j.a.h.i.e.g.a(this), 500L);
                    }
                }
                this.f10131d.clear();
                this.f10132e.t();
                this.f10133f.setVisibility(0);
                new android.os.Handler().postDelayed(new f.j.a.h.i.e.g.a(this), 500L);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h {
        public android.content.Context a;
        public int b;
        public int c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f10134d;

        /* renamed from: e, reason: collision with root package name */
        public int f10135e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f10136f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f10137g;

        /* renamed from: i, reason: collision with root package name */
        public android.app.NotificationManager f10139i;

        /* renamed from: j, reason: collision with root package name */
        public android.app.NotificationManager f10140j;

        /* renamed from: k, reason: collision with root package name */
        public android.app.Notification f10141k;

        /* renamed from: l, reason: collision with root package name */
        public d.h.h.h.d f10142l;

        /* renamed from: m, reason: collision with root package name */
        public d.h.h.h.d f10143m;
        public android.os.CountDownTimer r;
        public android.os.CountDownTimer s;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f10138h = "";

        /* renamed from: n, reason: collision with root package name */
        public int f10144n = 234231;

        /* renamed from: o, reason: collision with root package name */
        public boolean f10145o = false;

        /* renamed from: p, reason: collision with root package name */
        public boolean f10146p = false;

        /* renamed from: q, reason: collision with root package name */
        public boolean f10147q = false;
        public boolean t = false;
        public boolean u = false;

        /* loaded from: classes.dex */
        public class a extends android.os.CountDownTimer {

            /* renamed from: f.j.a.h.i.e$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class CountDownTimerC0275a extends android.os.CountDownTimer {
                public CountDownTimerC0275a(long j2, long j3) {
                    super(j2, j3);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    f.j.a.h.i.e.h.this.s.cancel();
                    f.j.a.h.i.e.h.this.f10145o = true;
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    android.app.NotificationManager notificationManager;
                    int i2;
                    android.app.Notification c;
                    if (f.j.a.h.i.e.h.this.t) {
                        f.j.a.h.i.e.h hVar = f.j.a.h.i.e.h.this;
                        if (!f.j.a.h.i.e.this.c) {
                            android.util.Log.e("Debugging:", "cancelled recording");
                            f.j.a.h.i.e.h.this.f10139i.cancelAll();
                            f.j.a.h.i.e.h.this.s.cancel();
                            f.j.a.h.i.e.h.this.C("stopped");
                            return;
                        }
                        hVar.b -= f.j.a.h.i.e.this.f10123e[0];
                        f.j.a.h.i.e.h hVar2 = f.j.a.h.i.e.h.this;
                        hVar2.c = hVar2.b * 1000;
                        android.util.Log.e("Debugging:", "retrying: " + f.j.a.h.i.e.h.this.c);
                        f.j.a.h.i.e.h.this.s.cancel();
                        return;
                    }
                    int[] iArr = f.j.a.h.i.e.this.f10123e;
                    int i3 = iArr[0];
                    iArr[0] = i3 + 1;
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        f.j.a.h.i.e.h hVar3 = f.j.a.h.i.e.h.this;
                        f.j.a.h.i.e.this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(hVar3.a);
                        android.content.SharedPreferences.Editor edit = f.j.a.h.i.e.this.a.edit();
                        edit.putBoolean("CANCELLED", false);
                        edit.apply();
                        f.j.a.h.i.e.h hVar4 = f.j.a.h.i.e.h.this;
                        boxbr.apksrebrand.smarters.view.activity.NotificationActivity.a(hVar4.f10144n, hVar4.a);
                        f.j.a.h.i.e.h hVar5 = f.j.a.h.i.e.h.this;
                        android.app.Notification.Builder builder = new android.app.Notification.Builder(f.j.a.h.i.e.h.this.a);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.recording_dots));
                        sb.append(f.j.a.h.i.e.this.c0(i3));
                        sb.append(" - ");
                        f.j.a.h.i.e.h hVar6 = f.j.a.h.i.e.h.this;
                        sb.append(f.j.a.h.i.e.this.c0(hVar6.f10135e / 1000));
                        hVar5.f10141k = builder.setContentTitle(sb.toString()).setSmallIcon(brstore.makro.app.R.mipmap.ic_launcher).setChannelId("ksjadf87").setSound((android.net.Uri) null, (android.media.AudioAttributes) null).build();
                        f.j.a.h.i.e.h.this.f10139i.createNotificationChannel(new android.app.NotificationChannel("ksjadf87", f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.recording_dots), 2));
                        f.j.a.h.i.e.h hVar7 = f.j.a.h.i.e.h.this;
                        notificationManager = hVar7.f10139i;
                        i2 = hVar7.f10144n;
                        c = hVar7.f10141k;
                    } else {
                        d.h.h.h.d dVar = f.j.a.h.i.e.h.this.f10142l;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.recording_dots));
                        sb2.append(f.j.a.h.i.e.this.c0(i3));
                        sb2.append(" - ");
                        f.j.a.h.i.e.h hVar8 = f.j.a.h.i.e.h.this;
                        sb2.append(f.j.a.h.i.e.this.c0(hVar8.f10135e / 1000));
                        dVar.n(sb2.toString());
                        f.j.a.h.i.e.h hVar9 = f.j.a.h.i.e.h.this;
                        notificationManager = hVar9.f10139i;
                        i2 = hVar9.f10144n;
                        c = hVar9.f10142l.c();
                    }
                    notificationManager.notify(i2, c);
                    if (f.j.a.h.i.e.h.this.u) {
                        f.j.a.h.i.e.h.this.f10139i.cancelAll();
                        f.j.a.h.i.e.h.this.s.cancel();
                    }
                    android.util.Log.e("Debugging:", "Seconds:" + f.j.a.h.i.e.this.c0(i3) + "   Reverse Seconds:" + f.j.a.h.i.e.this.c0((int) (j2 / 1000)) + " asdf:" + f.j.a.h.i.e.h.this.c + " Timeinseconds:" + f.j.a.h.i.e.h.this.b);
                    f.j.a.h.i.e.h hVar10 = f.j.a.h.i.e.h.this;
                    f.j.a.h.i.e.this.n0(hVar10.a, "processing");
                }
            }

            public a(long j2, long j3) {
                super(j2, j3);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                cancel();
                f.j.a.h.i.e.h hVar = f.j.a.h.i.e.h.this;
                if (f.j.a.h.i.e.this.c || !hVar.f10147q) {
                    return;
                }
                f.j.a.h.i.e.h.this.C("failed");
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                android.util.Log.e("onTick", "Testing:" + j2);
                if (f.j.a.h.i.e.h.this.f10146p) {
                    android.util.Log.e("download started", "Testing:" + j2);
                    cancel();
                    f.j.a.h.i.e.h hVar = f.j.a.h.i.e.h.this;
                    hVar.s = new f.j.a.h.i.e.h.a.CountDownTimerC0275a((long) hVar.c, 1000L).start();
                }
            }
        }

        @android.annotation.SuppressLint({"StaticFieldLeak"})
        /* loaded from: classes.dex */
        public class b extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
            public java.io.FileOutputStream a;

            /* loaded from: classes.dex */
            public class a implements java.lang.Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    f.j.a.h.i.e.h hVar = f.j.a.h.i.e.h.this;
                    f.j.a.h.i.e.this.b++;
                    f.j.a.h.i.e.j0(hVar.a, "Retrying (" + f.j.a.h.i.e.this.b + "/" + f.j.a.h.i.e.this.f10122d + ")");
                    new f.j.a.h.i.e.h.b(f.j.a.h.i.e.h.this, null).execute(new java.lang.Void[0]);
                }
            }

            /* renamed from: f.j.a.h.i.e$h$b$b, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0276b implements java.lang.Runnable {
                public RunnableC0276b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    f.j.a.h.i.e.h hVar = f.j.a.h.i.e.h.this;
                    f.j.a.h.i.e.this.b++;
                    f.j.a.h.i.e.j0(hVar.a, "Retrying (" + f.j.a.h.i.e.this.b + "/" + f.j.a.h.i.e.this.f10122d + ")");
                    new f.j.a.h.i.e.h.b(f.j.a.h.i.e.h.this, null).execute(new java.lang.Void[0]);
                }
            }

            public b() {
                this.a = null;
            }

            public /* synthetic */ b(f.j.a.h.i.e.h hVar, f.j.a.h.i.d dVar) {
                this();
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.Void doInBackground(java.lang.Void... voidArr) {
                java.io.File file;
                f.j.a.h.i.e.h hVar;
                java.lang.String valueOf;
                java.io.File file2;
                try {
                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(f.j.a.h.i.e.h.this.f10136f).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        android.util.Log.e("Download Task", "Server returned HTTP " + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
                        android.content.SharedPreferences.Editor edit = f.j.a.h.i.e.this.a.edit();
                        edit.putBoolean("CANCELLED", true);
                        edit.apply();
                        f.j.a.h.i.e.h.this.t = true;
                        f.j.a.h.i.e.this.c = true;
                        f.j.a.h.i.e.h.this.f10146p = false;
                        return null;
                    }
                    if (f.j.a.h.i.e.h.this.f10134d == null || f.j.a.h.i.e.h.this.f10134d.equals("")) {
                        if (android.os.Build.VERSION.SDK_INT >= 19) {
                            file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks");
                        } else {
                            file = new java.io.File(android.os.Environment.getExternalStorageDirectory() + "/Download", "BoxBRApks");
                        }
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 19) {
                            hVar = f.j.a.h.i.e.h.this;
                            valueOf = java.lang.String.valueOf(new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks"));
                        } else {
                            hVar = f.j.a.h.i.e.h.this;
                            valueOf = java.lang.String.valueOf(new java.io.File(android.os.Environment.getExternalStorageDirectory() + "/Download", "BoxBRApks"));
                        }
                        hVar.f10134d = valueOf;
                    }
                    if (f.j.a.h.i.e.h.this.f10138h == null || f.j.a.h.i.e.h.this.f10138h.equals("")) {
                        if (!f.j.a.h.i.e.h.this.f10137g.contains(".ts")) {
                            f.j.a.h.i.e.h.this.f10137g = f.j.a.h.i.e.h.this.f10137g + ".ts";
                        }
                        file2 = new java.io.File(java.lang.String.valueOf(f.j.a.h.i.e.h.this.f10134d + "/" + f.j.a.h.i.e.h.this.f10137g));
                        if (file2.exists() && !f.j.a.h.i.e.this.c) {
                            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss", java.util.Locale.US);
                            java.util.Date date = new java.util.Date();
                            f.j.a.h.i.e.h.this.f10138h = simpleDateFormat.format(date) + "_" + f.j.a.h.i.e.h.this.f10137g;
                            file2 = new java.io.File(java.lang.String.valueOf(f.j.a.h.i.e.h.this.f10134d + "/" + f.j.a.h.i.e.h.this.f10138h));
                        }
                    } else {
                        file2 = new java.io.File(java.lang.String.valueOf(f.j.a.h.i.e.h.this.f10134d + "/" + f.j.a.h.i.e.h.this.f10138h));
                    }
                    this.a = new java.io.FileOutputStream(file2, true);
                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(this.a);
                    java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(httpURLConnection.getInputStream());
                    byte[] bArr = new byte[org.joda.time.chrono.BasicChronology.CACHE_SIZE];
                    long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) + f.j.a.h.i.e.h.this.b;
                    f.j.a.h.i.e.h.this.f10146p = true;
                    f.j.a.h.i.e.h.this.t = false;
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1 && java.lang.System.currentTimeMillis() / 1000 < currentTimeMillis && !f.j.a.h.i.e.h.this.f10145o) {
                            f.j.a.h.i.e.this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(f.j.a.h.i.e.h.this.a);
                            f.j.a.h.i.e.h.this.t = f.j.a.h.i.e.this.a.getBoolean("CANCELLED", false);
                            if (f.j.a.h.i.e.h.this.t) {
                                f.j.a.h.i.e.h.this.t = true;
                                f.j.a.h.i.e.this.b = 0;
                                f.j.a.h.i.e.this.c = false;
                                android.content.SharedPreferences.Editor edit2 = f.j.a.h.i.e.this.a.edit();
                                edit2.putBoolean("CANCELLED", true);
                                edit2.apply();
                                break;
                            }
                            f.j.a.h.i.e.this.b = 0;
                            f.j.a.h.i.e.this.c = false;
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            break;
                        }
                    }
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return null;
                } catch (java.lang.Exception e2) {
                    android.content.SharedPreferences.Editor edit3 = f.j.a.h.i.e.this.a.edit();
                    edit3.putBoolean("CANCELLED", true);
                    edit3.apply();
                    f.j.a.h.i.e.h.this.t = true;
                    f.j.a.h.i.e.h hVar2 = f.j.a.h.i.e.h.this;
                    f.j.a.h.i.e.this.c = true;
                    hVar2.f10146p = false;
                    android.util.Log.e("Download Task", "Retrying " + e2.getMessage());
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(java.lang.Void r8) {
                android.os.Handler handler;
                java.lang.Runnable runnableC0276b;
                f.j.a.h.i.e.h hVar;
                java.lang.String string;
                try {
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                    f.j.a.h.i.e.h.this.f10147q = true;
                    f.j.a.h.i.e.h hVar2 = f.j.a.h.i.e.h.this;
                    hVar2.C(hVar2.a.getResources().getString(brstore.makro.app.R.string.failed));
                }
                if (this.a == null) {
                    if (f.j.a.h.i.e.this.c) {
                        if (f.j.a.h.i.e.this.b >= f.j.a.h.i.e.this.f10122d) {
                            f.j.a.h.i.e.this.c = false;
                            f.j.a.h.i.e.h.this.f10147q = true;
                            hVar = f.j.a.h.i.e.h.this;
                            string = f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.failed);
                            hVar.C(string);
                        } else {
                            f.j.a.h.i.e.this.c = true;
                            handler = new android.os.Handler();
                            runnableC0276b = new f.j.a.h.i.e.h.b.RunnableC0276b();
                            handler.postDelayed(runnableC0276b, 10000L);
                        }
                    }
                    super.onPostExecute(r8);
                }
                if (f.j.a.h.i.e.h.this.t) {
                    if (f.j.a.h.i.e.this.c) {
                        if (f.j.a.h.i.e.this.b >= f.j.a.h.i.e.this.f10122d) {
                            f.j.a.h.i.e.j0(f.j.a.h.i.e.h.this.a, f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.DownloadFailed));
                            f.j.a.h.i.e.this.c = false;
                            f.j.a.h.i.e.h.this.f10147q = true;
                            hVar = f.j.a.h.i.e.h.this;
                            string = f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.failed);
                        } else {
                            f.j.a.h.i.e.this.c = true;
                            handler = new android.os.Handler();
                            runnableC0276b = new f.j.a.h.i.e.h.b.a();
                            handler.postDelayed(runnableC0276b, 10000L);
                        }
                    }
                    super.onPostExecute(r8);
                }
                hVar = f.j.a.h.i.e.h.this;
                string = f.j.a.h.i.e.h.this.a.getResources().getString(brstore.makro.app.R.string.completed);
                hVar.C(string);
                super.onPostExecute(r8);
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                super.onPreExecute();
                f.j.a.h.i.e.h.this.B();
                f.j.a.h.i.e.h.this.A();
            }
        }

        public h(android.app.Activity activity, java.lang.String str, int i2, java.lang.String str2, boolean z, java.lang.String str3) {
            this.f10136f = "";
            this.f10137g = "";
            this.a = activity;
            this.f10136f = str;
            int i3 = i2 * 60;
            int i4 = i3 * 1000;
            this.c = i4;
            this.f10135e = i4;
            this.b = i3;
            this.f10134d = str3;
            this.f10137g = str2;
            f.j.a.h.i.e.this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(activity);
            new f.j.a.h.i.e.h.b(this, null).execute(new java.lang.Void[0]);
        }

        public void A() {
            f.j.a.h.i.e.this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(this.a);
            android.content.SharedPreferences.Editor edit = f.j.a.h.i.e.this.a.edit();
            edit.putBoolean("CANCELLED", false);
            edit.apply();
            android.app.PendingIntent a2 = boxbr.apksrebrand.smarters.view.activity.NotificationActivity.a(this.f10144n, this.a);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                return;
            }
            this.f10142l.a(brstore.makro.app.R.drawable.stop_icon, "Stop", a2);
        }

        public void B() {
            android.app.NotificationManager notificationManager;
            int i2;
            android.app.Notification c;
            android.app.NotificationManager notificationManager2 = this.f10139i;
            if (notificationManager2 != null) {
                notificationManager2.cancelAll();
            }
            android.app.NotificationManager notificationManager3 = this.f10140j;
            if (notificationManager3 != null) {
                notificationManager3.cancelAll();
            }
            if (!f.j.a.h.i.e.this.c) {
                android.content.Context context = this.a;
                android.widget.Toast.makeText(context, context.getResources().getString(brstore.makro.app.R.string.download_started), 0).show();
            }
            this.f10139i = (android.app.NotificationManager) this.a.getSystemService("notification");
            d.h.h.h.d dVar = new d.h.h.h.d(this.a);
            this.f10142l = dVar;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("ksjadf87", this.a.getResources().getString(brstore.makro.app.R.string.recording_dots), 2);
                this.f10141k = new android.app.Notification.Builder(this.a).setContentTitle(this.a.getResources().getString(brstore.makro.app.R.string.live_recording)).setContentText(this.a.getResources().getString(brstore.makro.app.R.string.recording_dots)).setSmallIcon(brstore.makro.app.R.mipmap.ic_launcher).setChannelId("ksjadf87").setProgress(100, 0, true).build();
                this.f10139i.createNotificationChannel(notificationChannel);
                notificationManager = this.f10139i;
                i2 = this.f10144n;
                c = this.f10141k;
            } else {
                dVar.o(this.a.getResources().getString(brstore.makro.app.R.string.live_recording));
                dVar.y(100, 0, true);
                dVar.n(this.a.getResources().getString(brstore.makro.app.R.string.recording_dots));
                dVar.A(brstore.makro.app.R.mipmap.ic_launcher);
                notificationManager = this.f10139i;
                i2 = this.f10144n;
                c = this.f10142l.c();
            }
            notificationManager.notify(i2, c);
            android.os.CountDownTimer countDownTimer = this.r;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.r = new f.j.a.h.i.e.h.a(20000L, 1000L).start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
        
            if (r3.v.c == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
        
            if (r3.v.c == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
        
            if (r3.v.c == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
        
            r4 = r3.a;
            android.widget.Toast.makeText(r4, r4.getResources().getString(r1), 0).show();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void C(java.lang.String r4) {
            /*
                r3 = this;
                android.app.NotificationManager r0 = r3.f10139i
                r0.cancelAll()
                android.os.CountDownTimer r0 = r3.s
                if (r0 == 0) goto Lc
                r0.cancel()
            Lc:
                d.h.h.h$d r0 = new d.h.h.h$d
                android.content.Context r1 = r3.a
                r0.<init>(r1)
                r1 = 2131689473(0x7f0f0001, float:1.9007962E38)
                r0.A(r1)
                android.content.Context r1 = r3.a
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131886824(0x7f1202e8, float:1.9408238E38)
                java.lang.String r1 = r1.getString(r2)
                r0.o(r1)
                r3.f10143m = r0
                java.lang.String r0 = "completed"
                boolean r1 = r4.equals(r0)
                r2 = 0
                if (r1 == 0) goto L68
                f.j.a.h.i.e r4 = f.j.a.h.i.e.this
                android.content.Context r1 = r3.a
                r4.n0(r1, r0)
                r4 = 1
                r3.u = r4
                d.h.h.h$d r4 = r3.f10143m
                android.content.Context r0 = r3.a
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131886518(0x7f1201b6, float:1.9407617E38)
                java.lang.String r0 = r0.getString(r1)
                r4.n(r0)
                f.j.a.h.i.e r4 = f.j.a.h.i.e.this
                boolean r4 = r4.c
                if (r4 != 0) goto Lb8
            L56:
                android.content.Context r4 = r3.a
                android.content.res.Resources r0 = r4.getResources()
                java.lang.String r0 = r0.getString(r1)
                android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r2)
                r4.show()
                goto Lb8
            L68:
                java.lang.String r0 = "failed"
                boolean r1 = r4.equals(r0)
                if (r1 == 0) goto L90
                f.j.a.h.i.e r4 = f.j.a.h.i.e.this
                android.content.Context r1 = r3.a
                r4.n0(r1, r0)
                d.h.h.h$d r4 = r3.f10143m
                android.content.Context r0 = r3.a
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131886520(0x7f1201b8, float:1.9407621E38)
                java.lang.String r0 = r0.getString(r1)
                r4.n(r0)
                f.j.a.h.i.e r4 = f.j.a.h.i.e.this
                boolean r4 = r4.c
                if (r4 != 0) goto Lb8
                goto L56
            L90:
                java.lang.String r0 = "stopped"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto Lb8
                f.j.a.h.i.e r4 = f.j.a.h.i.e.this
                android.content.Context r1 = r3.a
                r4.n0(r1, r0)
                d.h.h.h$d r4 = r3.f10143m
                android.content.Context r0 = r3.a
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131886526(0x7f1201be, float:1.9407633E38)
                java.lang.String r0 = r0.getString(r1)
                r4.n(r0)
                f.j.a.h.i.e r4 = f.j.a.h.i.e.this
                boolean r4 = r4.c
                if (r4 != 0) goto Lb8
                goto L56
            Lb8:
                android.content.Context r4 = r3.a
                java.lang.String r0 = "notification"
                java.lang.Object r4 = r4.getSystemService(r0)
                android.app.NotificationManager r4 = (android.app.NotificationManager) r4
                r3.f10140j = r4
                r0 = 455(0x1c7, float:6.38E-43)
                d.h.h.h$d r1 = r3.f10143m
                android.app.Notification r1 = r1.c()
                r4.notify(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.j.a.h.i.e.h.C(java.lang.String):void");
        }
    }

    /* loaded from: classes.dex */
    public static class i implements android.view.View.OnFocusChangeListener {
        public android.view.View b;
        public android.app.Activity c;

        public i(android.view.View view, android.app.Activity activity) {
            this.b = view;
            this.c = activity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.activity.CheckAppupdateActivity checkAppupdateActivity) {
            this.b = view;
            this.c = checkAppupdateActivity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.activity.MultiUserActivity multiUserActivity) {
            this.b = view;
            this.c = multiUserActivity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity newDashboardActivity) {
            this.b = view;
            this.c = newDashboardActivity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.activity.RateUsActivity rateUsActivity) {
            this.b = view;
            this.c = rateUsActivity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.activity.RecordingActivity recordingActivity) {
            this.b = view;
            this.c = recordingActivity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.activity.SplashActivity splashActivity) {
            this.b = view;
            this.c = splashActivity;
        }

        public i(android.view.View view, boxbr.apksrebrand.smarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.b = view;
            this.c = nSTIJKPlayerSkyActivity;
        }

        public final void a(float f2) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.b, "scaleX", f2);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        public final void b(float f2) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.b, "scaleY", f2);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        public void onFocusChange(android.view.View view, boolean z) {
            int i2;
            if (this.c != null) {
                if (!z) {
                    if (z) {
                        return;
                    }
                    a(1.0f);
                    b(1.0f);
                    android.view.View view2 = this.b;
                    if (view2 != null && view2.getTag() != null && this.b.getTag().equals("1")) {
                        view.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                    }
                    android.view.View view3 = this.b;
                    if (view3 != null && view3.getTag() != null && this.b.getTag().equals("2")) {
                        view.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                    }
                    android.view.View view4 = this.b;
                    if (view4 == null || view4.getTag() == null || !this.b.getTag().equals("3")) {
                        return;
                    }
                    view.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                    return;
                }
                float f2 = z ? 1.12f : 1.0f;
                android.view.View view5 = this.b;
                if (view5 == null || view5.getTag() == null || !this.b.getTag().equals("1")) {
                    android.view.View view6 = this.b;
                    if (view6 == null || view6.getTag() == null || !this.b.getTag().equals("2")) {
                        android.view.View view7 = this.b;
                        if (view7 == null || view7.getTag() == null || !this.b.getTag().equals("3")) {
                            view.setBackground(this.c.getResources().getDrawable(brstore.makro.app.R.drawable.selector_checkbox));
                            return;
                        } else {
                            a(f2);
                            b(f2);
                            i2 = brstore.makro.app.R.drawable.blue_btn_effect;
                        }
                    } else {
                        a(f2);
                        b(f2);
                        i2 = brstore.makro.app.R.drawable.logout_btn_effect;
                    }
                } else {
                    a(f2);
                    b(f2);
                    i2 = brstore.makro.app.R.drawable.back_btn_effect;
                }
                view.setBackgroundResource(i2);
            }
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public static class j extends android.os.AsyncTask<java.lang.Void, java.lang.Boolean, java.lang.Boolean> {
        public final android.content.Context a;
        public final f.j.a.i.p.e b;
        public java.util.ArrayList<boxbr.apksrebrand.smarters.model.pojo.XMLTVProgrammePojo> c;

        /* renamed from: d, reason: collision with root package name */
        public f.j.a.k.h.c f10148d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f10149e;

        @android.annotation.SuppressLint({"StaticFieldLeak"})
        /* loaded from: classes.dex */
        public class a extends android.os.AsyncTask<java.lang.String, java.lang.Integer, java.lang.Boolean> {
            public a(android.content.Context context) {
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean doInBackground(java.lang.String... strArr) {
                publishProgress(0);
                if (f.j.a.h.i.e.j.this.b != null) {
                    f.j.a.h.i.e.j.this.b.G(f.j.a.h.i.e.j.this.c);
                    f.j.a.h.i.e.j.this.c.clear();
                    f.j.a.h.i.e.j.this.b.g2("epg", "1", f.j.a.h.i.e.j.this.f10149e);
                }
                return java.lang.Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(java.lang.Boolean bool) {
            }

            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(java.lang.Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public j(int i2, android.content.Context context, f.j.a.i.p.e eVar) {
            this.f10149e = "0";
            this.f10149e = java.lang.String.valueOf(i2);
            this.a = context;
            this.b = eVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.Void... voidArr) {
            f.j.a.i.p.e eVar;
            if (!this.f10149e.equals("0") && (eVar = this.b) != null) {
                eVar.S1(this.f10149e);
            }
            android.util.Log.e("honey", "epg u 1");
            this.f10148d = new f.j.a.k.h.c();
            android.util.Log.e("honey", "epg u 2");
            this.f10148d.a(this.a);
            android.util.Log.e("honey", "epg u 3");
            this.c = this.f10148d.b();
            android.util.Log.e("honey", "epg u 4");
            java.util.ArrayList<boxbr.apksrebrand.smarters.model.pojo.XMLTVProgrammePojo> arrayList = this.c;
            if (arrayList == null || arrayList.size() <= 0) {
                f.j.a.i.p.e eVar2 = this.b;
                if (eVar2 == null || eVar2.h1(this.f10149e) == 0) {
                    return java.lang.Boolean.FALSE;
                }
                this.b.g2("epg", "1", this.f10149e);
            } else {
                android.util.Log.e("honey", "size u :" + this.c.size());
            }
            return java.lang.Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.Boolean bool) {
            f.j.a.i.p.e eVar;
            java.lang.String str;
            try {
                if (bool.booleanValue()) {
                    f.j.a.h.i.a.g0 = false;
                    java.util.ArrayList<boxbr.apksrebrand.smarters.model.pojo.XMLTVProgrammePojo> arrayList = this.c;
                    if (arrayList == null || arrayList.size() <= 0) {
                        return;
                    }
                    try {
                        f.j.a.h.i.e.f10120o = new f.j.a.h.i.e.j.a(this.a).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.String[0]);
                        return;
                    } catch (java.lang.Exception unused) {
                        eVar = this.b;
                        str = "0";
                    }
                } else {
                    eVar = this.b;
                    str = "2";
                }
                eVar.g2("epg", str, this.f10149e);
            } catch (java.lang.Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public e() {
        new java.util.ArrayList();
    }

    public static java.io.File[] A(android.content.Context context) {
        java.io.File file;
        if (context == null) {
            return null;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("recordingDir", 0);
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks");
        } else {
            file = new java.io.File(android.os.Environment.getExternalStorageDirectory() + "/Download", "BoxBRApks");
        }
        return new java.io.File(sharedPreferences.getString("recordingDir", java.lang.String.valueOf(file))).listFiles();
    }

    public static java.lang.String B(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            return new java.text.SimpleDateFormat(context.getSharedPreferences("timeFormat", 0).getString("timeFormat", f.j.a.h.i.a.d0), java.util.Locale.US).format(new java.util.Date());
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static long C(android.content.Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            f10112g = sharedPreferences;
            if (sharedPreferences != null) {
                return v(sharedPreferences.getString("selectedEPGShift", f.j.a.h.i.a.b0));
            }
            return 0L;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    public static java.lang.String D(android.content.Context context, int i2, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb;
        java.lang.String str3;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("allowedFormat", 0);
        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences("loginPrefs", 0);
        java.lang.String string = sharedPreferences2.getString("username", "");
        java.lang.String string2 = sharedPreferences2.getString("password", "");
        java.lang.String string3 = sharedPreferences.getString("allowedFormat", "");
        java.lang.String string4 = sharedPreferences2.getString("serverUrl", "");
        java.lang.String string5 = sharedPreferences2.getString("serverProtocol", "");
        java.lang.String string6 = sharedPreferences2.getString("serverPortHttps", "");
        java.lang.String string7 = sharedPreferences2.getString("serverPort", "");
        java.lang.String string8 = sharedPreferences2.getString("serverPortRtmp", "");
        if (string3 != null && string3.equals("default")) {
            string3 = "ts";
        }
        if (string5 == null) {
            return null;
        }
        char c2 = 65535;
        int hashCode = string5.hashCode();
        if (hashCode != 3213448) {
            if (hashCode != 3504631) {
                if (hashCode == 99617003 && string5.equals("https")) {
                    c2 = 1;
                }
            } else if (string5.equals("rmtp")) {
                c2 = 2;
            }
        } else if (string5.equals("http")) {
            c2 = 0;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                if (string4 != null && !string4.startsWith("https://")) {
                    string4 = "https://" + string4;
                }
                sb = new java.lang.StringBuilder();
                sb.append(string4);
                sb.append(":");
                str3 = string6;
            } else if (c2 != 2) {
                if (string4 != null && !string4.startsWith("http://") && !string4.startsWith("https://")) {
                    string4 = "http://" + string4;
                }
                sb = new java.lang.StringBuilder();
            } else {
                if (string4 != null && !string4.startsWith("rmtp://")) {
                    string4 = "rmtp://" + string4;
                }
                sb = new java.lang.StringBuilder();
                sb.append(string4);
                sb.append(":");
                str3 = string8;
            }
            sb.append(str3);
            sb.append("/timeshift/");
            sb.append(string);
            sb.append("/");
            sb.append(string2);
            sb.append("/");
            sb.append(str2);
            sb.append("/");
            sb.append(str);
            sb.append("/");
            sb.append(i2);
            sb.append(".");
            sb.append(string3);
            return sb.toString();
        }
        if (string4 != null && !string4.startsWith("http://")) {
            string4 = "http://" + string4;
        }
        sb = new java.lang.StringBuilder();
        sb.append(string4);
        sb.append(":");
        sb.append(string7);
        sb.append("/timeshift/");
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(i2);
        sb.append(".");
        sb.append(string3);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        if (r9.equals("http") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String E(android.content.Context r16, int r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.a.h.i.e.E(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    public static java.lang.String F(android.content.Context context, int i2, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        java.lang.String string = sharedPreferences.getString("username", "");
        java.lang.String string2 = sharedPreferences.getString("password", "");
        java.lang.String string3 = sharedPreferences.getString("serverUrl", "");
        java.lang.String string4 = sharedPreferences.getString("serverProtocol", "");
        java.lang.String string5 = sharedPreferences.getString("serverPortHttps", "");
        java.lang.String string6 = sharedPreferences.getString("serverPort", "");
        java.lang.String string7 = sharedPreferences.getString("serverPortRtmp", "");
        if (string4 == null) {
            return null;
        }
        char c2 = 65535;
        int hashCode = string4.hashCode();
        if (hashCode != 3213448) {
            if (hashCode != 3504631) {
                if (hashCode == 99617003 && string4.equals("https")) {
                    c2 = 1;
                }
            } else if (string4.equals("rmtp")) {
                c2 = 2;
            }
        } else if (string4.equals("http")) {
            c2 = 0;
        }
        if (c2 == 0) {
            if (string3 != null && !string3.startsWith("http://")) {
                string3 = "http://" + string3;
            }
            if (str.equals("")) {
                return string3 + ":" + string6 + "/" + string + "/" + string2 + "/" + i2 + str;
            }
            return string3 + ":" + string6 + "/" + str2 + "/" + string + "/" + string2 + "/" + i2 + str;
        }
        if (c2 == 1) {
            if (string3 != null && !string3.startsWith("https://")) {
                string3 = "https://" + string3;
            }
            if (str.equals("")) {
                return string3 + ":" + string5 + "/" + string + "/" + string2 + "/" + i2 + str;
            }
            return string3 + ":" + string5 + "/" + str2 + "/" + string + "/" + string2 + "/" + i2 + str;
        }
        if (c2 == 2) {
            if (string3 != null && !string3.startsWith("rmtp://")) {
                string3 = "rmtp://" + string3;
            }
            if (str.equals("")) {
                return string3 + ":" + string7 + "/" + string + "/" + string2 + "/" + i2 + str;
            }
            return string3 + ":" + string7 + "/" + str2 + "/" + string + "/" + string2 + "/" + i2 + str;
        }
        if (string3 != null && !string3.startsWith("http://") && !string3.startsWith("https://")) {
            string3 = "http://" + string3;
        }
        if (str.equals("")) {
            return string3 + ":" + string6 + "/" + string + "/" + string2 + "/" + i2 + str;
        }
        return string3 + ":" + string6 + "/" + str2 + "/" + string + "/" + string2 + "/" + i2 + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0061, code lost:
    
        if (r3.equals("http") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String G(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.a.h.i.e.G(android.content.Context):java.lang.String");
    }

    public static void H() {
        try {
            if (f10121p == null || !f10121p.isShowing()) {
                return;
            }
            f10121p.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    public static void I(android.content.Context context) {
        f.j.a.i.p.e eVar = new f.j.a.i.p.e(context);
        f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(context);
        java.util.ArrayList<f.j.a.i.p.b> D0 = eVar.D0();
        java.lang.String valueOf = (D0 == null || D0.size() <= 0) ? "0" : java.lang.String.valueOf(D0.get(0).c());
        if (valueOf.equals("0")) {
            return;
        }
        f.j.a.i.p.d K1 = eVar.K1("epg", valueOf);
        if (K1.d() == null && K1.e() == null && K1.f() == null) {
            K1 = new f.j.a.i.p.d();
            K1.l("epg");
            K1.j("0");
            K1.g("");
            K1.k("");
            K1.i(valueOf);
            java.util.ArrayList<f.j.a.i.p.d> arrayList = new java.util.ArrayList<>();
            arrayList.add(0, K1);
            eVar.M1(arrayList, f.j.a.i.p.l.f(context));
        }
        if ((K1.d() == null || !K1.d().equals("2")) && (K1.d() == null || !K1.d().equals("0"))) {
            if (K1.d() == null || !K1.d().equals("1")) {
                if (K1.d() != null) {
                    K1.d().equals("3");
                    return;
                }
                return;
            } else {
                long q2 = q(new java.text.SimpleDateFormat("dd/MM/yyyy", java.util.Locale.US), K1.a(), h());
                if (!g(context) || q2 < aVar.d()) {
                    return;
                }
            }
        }
        J(eVar, valueOf, context);
    }

    public static void J(f.j.a.i.p.e eVar, java.lang.String str, android.content.Context context) {
        if (f.j.a.h.i.a.g0) {
            f.j.a.h.i.a.g0 = false;
        }
        eVar.f2("epg", "3");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            new f.j.a.h.i.e.j(R(str), context, eVar).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        } else {
            new f.j.a.h.i.e.j(R(str), context, eVar).execute(new java.lang.Void[0]);
        }
    }

    public static boolean K(long j2, long j3, android.content.Context context) {
        if (context != null) {
            try {
                long millis = org.joda.time.LocalDateTime.now().toDateTime().getMillis() + C(context);
                if (j2 <= millis && j3 >= millis) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static java.lang.String L(android.content.Context context) {
        return java.lang.String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public static void M(android.content.Context context) {
        if (context != null && f.j.a.h.i.a.f10097g.booleanValue() && f.j.a.i.p.l.f(context).equals("m3u")) {
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.ImportM3uActivity.class));
        }
    }

    public static void N(android.content.Context context) {
        if (context != null) {
            if (!f.j.a.h.i.a.A.booleanValue()) {
                android.widget.Toast.makeText(context, context.getString(brstore.makro.app.R.string.logged_out), 0).show();
            }
            f.j.a.h.i.a.A = java.lang.Boolean.FALSE;
            android.content.Intent intent = f.j.a.h.i.a.f10096f.booleanValue() ? new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class) : (f.j.a.h.i.a.f10097g.booleanValue() && f.j.a.h.i.a.f10098h.booleanValue()) ? new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.RoutingActivity.class) : new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.LoginActivity.class);
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            java.lang.String string = sharedPreferences.getString("selectedEPGShift", "");
            edit.clear();
            edit.apply();
            if (edit != null) {
                edit.putString("selectedEPGShift", string);
                edit.apply();
            }
            android.content.SharedPreferences.Editor edit2 = context.getSharedPreferences("sharedprefremberme", 0).edit();
            edit2.clear();
            edit2.apply();
            if (f.j.a.h.i.a.f10097g.booleanValue() && f.j.a.h.i.a.f10098h.booleanValue()) {
                android.content.SharedPreferences.Editor edit3 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                edit3.putBoolean("savelogin", false);
                edit3.apply();
                if (f.j.a.i.p.l.f(context).equalsIgnoreCase("m3u")) {
                    android.content.SharedPreferences.Editor edit4 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                    edit4.clear();
                    edit4.apply();
                }
            }
            if (f.j.a.h.i.a.f10095e.booleanValue() && !(f.j.a.h.i.a.f10097g.booleanValue() && f.j.a.h.i.a.f10098h.booleanValue())) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent);
                ((android.app.Activity) context).finish();
            }
        }
    }

    public static java.lang.String O(java.lang.String str) {
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

    public static java.lang.String P(java.lang.String str) {
        try {
            return new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.text.SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", java.util.Locale.US).parse(str));
        } catch (java.text.ParseException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int Q(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public static int R(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static void S(android.content.Context context, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        f10114i = new f.j.a.k.d.a.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.class);
        intent.putExtra("MultiPlayer", "true");
        intent.putExtra("OPENED_STREAM_ID", i2);
        intent.putExtra("STREAM_TYPE", str);
        intent.putExtra("VIDEO_NUM", !str2.equals("") ? R(str2) : -1);
        intent.putExtra("VIDEO_TITLE", str3);
        intent.putExtra("EPG_CHANNEL_ID", str4);
        intent.putExtra("EPG_CHANNEL_LOGO", str5);
        intent.putExtra("OPENED_CAT_ID", str6);
        intent.putExtra("VIDEO_URL", str7);
        context.startActivity(intent);
    }

    public static void T(android.content.Context context, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        android.content.Intent intent;
        if (context != null) {
            try {
                java.lang.String d2 = f.j.a.i.p.l.d(context);
                if (!f.j.a.i.p.l.d(context).equals("default") && !new f.j.a.i.p.c(context).a(d2)) {
                    f.j.a.i.p.l.M("default", "default", context);
                }
                f10114i = new f.j.a.k.d.a.a(context);
                java.lang.String e2 = f.j.a.i.p.l.e(context);
                if (!e2.equals("default")) {
                    java.lang.String D = D(context, i2, str6, str8);
                    java.lang.String d3 = f.j.a.i.p.l.d(context);
                    android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.PlayExternalPlayerActivity.class);
                    intent2.putExtra(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, D);
                    intent2.putExtra("packagename", e2);
                    intent2.putExtra("app_name", d3);
                    context.startActivity(intent2);
                    return;
                }
                if (f10114i.t() == 3) {
                    f10114i.I(context.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                    intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                } else {
                    intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                }
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra(tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE, "catch_up");
                intent.putExtra("VIDEO_NUM", R(str2));
                intent.putExtra("VIDEO_TITLE", str3);
                intent.putExtra("STREAM_START_TIME", str6);
                intent.putExtra("STREAM_STOP_TIME", str8);
                context.startActivity(intent);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void U(android.content.Context context, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<boxbr.apksrebrand.smarters.model.callback.GetEpisdoeDetailsCallback> list, java.lang.String str6) {
        java.lang.String str7;
        java.lang.String str8;
        android.content.Intent intent;
        if (context != null) {
            java.lang.String u = f.j.a.i.p.l.u(context);
            if (!f.j.a.i.p.l.v(context).equals("default") && !new f.j.a.i.p.c(context).a(u)) {
                f.j.a.i.p.l.a0("default", "default", context);
            }
            java.lang.String v = f.j.a.i.p.l.v(context);
            if (!v.equals("default")) {
                java.lang.String E = f.j.a.i.p.l.f(context).equals("m3u") ? str6 : E(context, i2, str3, "series");
                java.lang.String u2 = f.j.a.i.p.l.u(context);
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.PlayExternalPlayerActivity.class);
                intent2.putExtra(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, E);
                intent2.putExtra("packagename", v);
                intent2.putExtra("app_name", u2);
                context.startActivity(intent2);
                return;
            }
            f10114i = new f.j.a.k.d.a.a(context);
            java.lang.String str9 = f.j.a.i.p.l.f(context).equalsIgnoreCase("m3u") ? "movies_m3u" : "series";
            if (f10114i.t() == 3) {
                f10114i.I(context.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                intent.putExtra(tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE, str9);
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra("STREAM_TYPE", str2);
                intent.putExtra("VIDEO_NUM", R(str4));
                intent.putExtra("VIDEO_TITLE", str5);
                intent.putExtra("CONTAINER_EXTENSION", str3);
                intent.putExtra("EPISODES", (java.io.Serializable) list);
                str7 = "VIDEO_URL";
                str8 = tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE;
                intent.putExtra(str7, str6);
            } else {
                str7 = "VIDEO_URL";
                str8 = tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE;
                intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
            }
            intent.putExtra(str8, str9);
            intent.putExtra("OPENED_STREAM_ID", i2);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", R(str4));
            intent.putExtra("VIDEO_TITLE", str5);
            intent.putExtra("CONTAINER_EXTENSION", str3);
            intent.putExtra("EPISODES", (java.io.Serializable) list);
            intent.putExtra(str7, str6);
            context.startActivity(intent);
        }
    }

    public static void V(android.content.Context context, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i3) {
        android.content.Intent intent;
        if (context != null) {
            java.lang.String C = f.j.a.i.p.l.C(context);
            if (!f.j.a.i.p.l.D(context).equals("default") && !new f.j.a.i.p.c(context).a(C)) {
                f.j.a.i.p.l.i0("default", "default", context);
            }
            java.lang.String str7 = f.j.a.i.p.l.f(context).equalsIgnoreCase("m3u") ? "movies_m3u" : "movies";
            java.lang.String C2 = f.j.a.i.p.l.C(context);
            java.lang.String D = f.j.a.i.p.l.D(context);
            if (!D.equals("default")) {
                if (!f.j.a.i.p.l.f(context).equalsIgnoreCase("m3u")) {
                    str6 = E(context, i2, str3, "movie");
                }
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.PlayExternalPlayerActivity.class);
                intent2.putExtra(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, str6);
                intent2.putExtra("packagename", D);
                intent2.putExtra("app_name", C2);
                context.startActivity(intent2);
                return;
            }
            f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(context);
            f10114i = aVar;
            if (aVar.t() == 3) {
                f10114i.I(context.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
            } else {
                intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
            }
            intent.putExtra(tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE, str7);
            intent.putExtra("OPENED_STREAM_ID", i2);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("STREAM_TOTAL_DURATION", i3);
            intent.putExtra("VIDEO_NUM", R(str4));
            intent.putExtra("VIDEO_TITLE", str5);
            intent.putExtra("CONTAINER_EXTENSION", str3);
            intent.putExtra("VIDEO_URL", str6);
            context.startActivity(intent);
        }
    }

    public static void W(android.content.Context context, java.lang.String str, int i2, java.lang.String str2, int i3, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        android.content.Intent intent;
        if (context != null) {
            f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(context);
            f10114i = aVar;
            if (aVar.t() == 3) {
                f10114i.I(context.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.class);
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra("STREAM_TYPE", str2);
            } else {
                intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.class);
            }
            intent.putExtra("OPENED_STREAM_ID", i2);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", i3);
            intent.putExtra("VIDEO_TITLE", str3);
            intent.putExtra("EPG_CHANNEL_ID", str4);
            intent.putExtra("EPG_CHANNEL_LOGO", str5);
            intent.putExtra("OPENED_CAT_ID", str6);
            intent.putExtra("VIDEO_URL", str7);
            intent.putExtra("OPENED_CAT_NAME", str8);
            context.startActivity(intent);
        }
    }

    public static void X(android.content.Context context, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        android.content.Intent intent;
        if (context != null) {
            java.lang.String g2 = f.j.a.i.p.l.g(context);
            if (!f.j.a.i.p.l.h(context).equals("default") && !new f.j.a.i.p.c(context).a(g2)) {
                f.j.a.i.p.l.O("default", "default", context);
            }
            java.lang.String h2 = f.j.a.i.p.l.h(context);
            java.lang.String str9 = "";
            if (h2.equals("default")) {
                f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(context);
                f10114i = aVar;
                if (aVar.t() == 3) {
                    f10114i.I(context.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                    intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.class);
                } else {
                    intent = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.class);
                }
                intent.putExtra("MultiPlayer", "false");
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra("STREAM_TYPE", str2);
                intent.putExtra("VIDEO_NUM", str3.equals("") ? -1 : R(str3));
                intent.putExtra("VIDEO_TITLE", str4);
                intent.putExtra("EPG_CHANNEL_ID", str5);
                intent.putExtra("EPG_CHANNEL_LOGO", str6);
                intent.putExtra("OPENED_CAT_ID", str7);
                intent.putExtra("VIDEO_URL", str8);
                context.startActivity(intent);
                return;
            }
            java.lang.String string = context.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", "");
            if (string == null || string.isEmpty() || string.equals("") || !string.equals("default")) {
                if (string != null && !string.isEmpty() && !string.equals("") && string.equals("ts")) {
                    str9 = ".ts";
                } else if (string != null && !string.isEmpty() && !string.equals("") && string.equals("m3u8")) {
                    str9 = ".m3u8";
                }
            }
            if (!f.j.a.i.p.l.f(context).equalsIgnoreCase("m3u")) {
                str8 = F(context, i2, str9, "live");
            }
            java.lang.String g3 = f.j.a.i.p.l.g(context);
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.PlayExternalPlayerActivity.class);
            intent2.putExtra(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, str8);
            intent2.putExtra("packagename", h2);
            intent2.putExtra("app_name", g3);
            context.startActivity(intent2);
        }
    }

    public static q.m Y(android.content.Context context) {
        if (context != null) {
            try {
                java.lang.String lowerCase = context.getSharedPreferences("loginPrefsserverurl", 0).getString(f.j.a.h.i.a.f10105o, "").toLowerCase();
                android.util.Log.e("URl from Back", ">>>>>>>>" + lowerCase);
                if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                    lowerCase = "http://" + lowerCase;
                }
                if (!lowerCase.endsWith("/")) {
                    lowerCase = lowerCase + "/";
                }
                f.j.a.h.i.a.z = lowerCase;
                m.x.b bVar = new m.x.b();
                bVar.c(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.g(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.e(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.d(true);
                m.x a2 = bVar.a();
                q.m.b bVar2 = new q.m.b();
                bVar2.b(lowerCase);
                bVar2.f(a2);
                bVar2.a(q.p.a.a.d());
                return bVar2.d();
            } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException | java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static q.m Z(android.content.Context context) {
        if (context != null) {
            try {
                m.x.b bVar = new m.x.b();
                bVar.c(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.g(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.e(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.d(false);
                m.x a2 = bVar.a();
                q.m.b bVar2 = new q.m.b();
                bVar2.b("https://users.iptvsmarters.com/");
                bVar2.f(a2);
                bVar2.a(q.p.a.a.d());
                return bVar2.d();
            } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException | java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static void a(android.content.Context context) {
        context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
    }

    public static q.m a0(android.content.Context context) {
        if (context != null) {
            try {
                m.x.b bVar = new m.x.b();
                bVar.c(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.g(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.e(60L, java.util.concurrent.TimeUnit.SECONDS);
                bVar.d(false);
                m.x a2 = bVar.a();
                q.m.b bVar2 = new q.m.b();
                bVar2.b("http://api.themoviedb.org/3/");
                bVar2.f(a2);
                bVar2.a(q.p.a.a.d());
                return bVar2.d();
            } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException | java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static void b0(android.content.Context context) {
        if (context != null) {
            try {
                new f.j.a.k.d.a.a(context).w().equals(f.j.a.h.i.a.i0);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void d0(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = "en";
        if (!str.equals("English")) {
            if (str.equals("Polish")) {
                str2 = "pl";
            } else if (str.equals("Portuguese")) {
                str2 = "pt";
            } else if (str.equals("Turkish")) {
                str2 = "tr";
            } else if (str.equals("Croatian")) {
                str2 = "hr";
            } else if (str.equals("Spanish")) {
                str2 = "es";
            } else if (str.equals("Arabic")) {
                str2 = "ar";
            } else if (str.equals("French")) {
                str2 = "fr";
            } else if (str.equals("German")) {
                str2 = "de";
            } else if (str.equals("Italian")) {
                str2 = "it";
            } else if (str.equals("Romanian")) {
                str2 = "ro";
            } else if (str.equals("Hungary")) {
                str2 = "hu";
            } else if (str.equals("Albanian")) {
                str2 = "sq";
            } else if (str.equals("Korean")) {
                str2 = "ko";
            } else if (str.equals("Hebrew")) {
                str2 = "he";
            } else if (str.equals("Ukrainian")) {
                str2 = "uk";
            } else if (str.equals("Malay")) {
                str2 = "ms";
            } else if (str.equals("Dutch")) {
                str2 = "nl";
            } else if (str.equals("Indonesian")) {
                str2 = "in";
            } else if (str.equals("Swedish")) {
                str2 = "sv";
            }
        }
        if (context != null) {
            android.content.res.Resources resources = context.getResources();
            android.content.res.Resources resources2 = context.getApplicationContext().getResources();
            java.util.Locale locale = new java.util.Locale(str2);
            java.util.Locale.setDefault(locale);
            android.content.res.Configuration configuration = new android.content.res.Configuration();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            resources2.updateConfiguration(configuration, resources.getDisplayMetrics());
            android.content.res.Configuration configuration2 = resources.getConfiguration();
            configuration2.setLocale(locale);
            context.getApplicationContext().createConfigurationContext(configuration2);
            context.createConfigurationContext(configuration2);
        }
    }

    public static boolean e(java.lang.String str, android.content.Context context) {
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static void f(android.content.Context context) {
        if (context != null) {
            java.lang.String string = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
            if (string.equals("")) {
                return;
            }
            d0(context, string);
        }
    }

    public static boolean g(android.content.Context context) {
        return context.getSharedPreferences("automation_epg", 0).getString("automation_epg", "").equals("checked");
    }

    public static void g0(android.app.Activity activity) {
        try {
            android.app.Dialog dialog = new android.app.Dialog(activity);
            f10121p = dialog;
            dialog.setContentView(brstore.makro.app.R.layout.spinkitanimation);
            f10121p.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            f10121p.getWindow().setGravity(17);
            f10121p.setCancelable(false);
            f10121p.show();
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.lang.String h() {
        return P(java.util.Calendar.getInstance().getTime().toString());
    }

    public static void h0(android.content.Context context) {
        android.app.Dialog dialog = new android.app.Dialog(context);
        f10121p = dialog;
        dialog.setContentView(brstore.makro.app.R.layout.spinkitanimation);
        f10121p.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        f10121p.getWindow().setGravity(17);
        f10121p.setCancelable(false);
        f10121p.show();
    }

    public static void i(android.content.Context context) {
        try {
            j(context.getCacheDir());
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean j(java.io.File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (java.lang.String str : file.list()) {
            if (!j(new java.io.File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    public static void j0(android.content.Context context, java.lang.String str) {
        if (context == null || str == "" || str.isEmpty()) {
            return;
        }
        android.widget.Toast.makeText(context, str, 0).show();
    }

    public static long k(java.text.SimpleDateFormat simpleDateFormat, java.lang.String str, java.lang.String str2) {
        try {
            return java.util.concurrent.TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static void k0(android.content.Context context, java.lang.String str) {
        if (context == null || str == "" || str.isEmpty()) {
            return;
        }
        android.widget.Toast.makeText(context, str, 1).show();
    }

    public static long l(java.lang.String str, android.content.Context context) {
        if (str == null) {
            return 0L;
        }
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss", java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(new f.j.a.k.d.a.a(context).y()));
            return simpleDateFormat.parse(str.substring(0, 14)).getTime();
        } catch (java.lang.NumberFormatException e2) {
            android.util.Log.e("XMLTVReader", "Exception", e2);
            return 0L;
        } catch (java.lang.Exception e3) {
            android.util.Log.e("XMLTVReader", "Exception", e3);
            return 0L;
        }
    }

    public static java.lang.String l0(long j2) {
        try {
            int i2 = 0;
            java.util.List asList = java.util.Arrays.asList(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.DAYS.toMillis(365L)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.DAYS.toMillis(30L)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.DAYS.toMillis(1L)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.HOURS.toMillis(1L)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(1L)));
            java.util.List asList2 = java.util.Arrays.asList("year", "month", "day", "hour", "min", "sec");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            while (true) {
                if (i2 >= asList.size()) {
                    break;
                }
                long longValue = j2 / ((java.lang.Long) asList.get(i2)).longValue();
                if (longValue > 0) {
                    stringBuffer.append(longValue);
                    stringBuffer.append(" ");
                    stringBuffer.append((java.lang.String) asList2.get(i2));
                    stringBuffer.append(longValue != 1 ? f.d.s.c : "");
                    stringBuffer.append(" ago");
                } else {
                    i2++;
                }
            }
            return "".equals(stringBuffer.toString()) ? "0 sec ago" : stringBuffer.toString();
        } catch (java.lang.Exception unused) {
            return "0 sec ago";
        }
    }

    public static void m(android.content.Context context) {
        java.lang.String m0 = m0(f.j.a.k.d.c.a.a.a());
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        java.lang.String L = L(context);
        java.lang.String m02 = m0(f.j.a.k.d.c.a.e.d());
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss", java.util.Locale.US);
        if (k(simpleDateFormat, simpleDateFormat.format(new java.util.Date(f.j.a.k.d.c.a.f.a(context))), simpleDateFormat.format(new java.util.Date())) < f.j.a.k.d.c.a.d.p() || m0 == null || m02 == null) {
            return;
        }
        if (L.equals(m0) && (m0 == null || m02 == null || packageName.equals(m02))) {
            return;
        }
        android.widget.Toast.makeText(context, m0(f.j.a.k.d.c.a.h.a() + f.j.a.k.d.c.a.h.i()) + m0(f.j.a.k.d.c.a.i.i() + f.j.a.k.d.c.a.i.h()) + m0(f.j.a.k.d.c.a.g.f() + f.j.a.k.d.c.a.g.h()), 1).show();
        ((android.app.Activity) context).finishAffinity();
    }

    public static java.lang.String m0(java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? new java.lang.String(android.util.Base64.decode(str, 0), java.nio.charset.StandardCharsets.UTF_8) : "";
    }

    public static q.m n(android.content.Context context) {
        m.x.b bVar = new m.x.b();
        bVar.c(60L, java.util.concurrent.TimeUnit.SECONDS);
        bVar.g(60L, java.util.concurrent.TimeUnit.SECONDS);
        bVar.e(60L, java.util.concurrent.TimeUnit.SECONDS);
        bVar.d(false);
        m.x a2 = bVar.a();
        q.m.b bVar2 = new q.m.b();
        bVar2.b("http://135.148.33.103/");
        bVar2.f(a2);
        bVar2.a(q.p.a.a.d());
        return bVar2.d();
    }

    public static q.m o(android.content.Context context) {
        m.x.b bVar = new m.x.b();
        bVar.c(60L, java.util.concurrent.TimeUnit.SECONDS);
        bVar.g(60L, java.util.concurrent.TimeUnit.SECONDS);
        bVar.e(60L, java.util.concurrent.TimeUnit.SECONDS);
        bVar.d(false);
        m.x a2 = bVar.a();
        q.m.b bVar2 = new q.m.b();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(f.j.a.f.g.a.a);
        bVar2.b(sb.toString());
        bVar2.f(a2);
        bVar2.a(q.p.a.a.d());
        return bVar2.d();
    }

    public static java.lang.String p(java.lang.String str) {
        try {
            return new java.text.SimpleDateFormat(" MMMM dd,yyyy").format(new java.text.SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", java.util.Locale.US).parse(str));
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static long q(java.text.SimpleDateFormat simpleDateFormat, java.lang.String str, java.lang.String str2) {
        try {
            return java.util.concurrent.TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static java.lang.String r() {
        return android.os.Build.MANUFACTURER + " " + android.os.Build.PRODUCT;
    }

    public static java.lang.String s(java.lang.String str) {
        return str.replaceAll(" ", "%20");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int t(java.lang.String str) {
        char c2;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3201:
                if (str.equals("de")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3241:
                if (str.equals("en")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3246:
                if (str.equals("es")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3276:
                if (str.equals("fr")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3325:
                if (str.equals("he")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 3338:
                if (str.equals("hr")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3341:
                if (str.equals("hu")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3365:
                if (str.equals("in")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 3371:
                if (str.equals("it")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3428:
                if (str.equals("ko")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                if (str.equals("ms")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 3518:
                if (str.equals("nl")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 3580:
                if (str.equals("pl")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3588:
                if (str.equals("pt")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3645:
                if (str.equals("ro")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3678:
                if (str.equals("sq")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 3683:
                if (str.equals("sv")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3734:
                if (str.equals("uk")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            default:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case '\b':
                return 8;
            case '\t':
                return 9;
            case '\n':
                return 10;
            case 11:
                return 11;
            case '\f':
                return 12;
            case '\r':
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
        }
    }

    @android.annotation.SuppressLint({"HardwareIds"})
    public static java.lang.String u(android.content.Context context) {
        java.lang.String string;
        try {
            string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (java.lang.Exception unused) {
        }
        if (string != null && !string.equals("")) {
            return string;
        }
        for (java.net.NetworkInterface networkInterface : java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces())) {
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    try {
                        return ((android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                    } catch (java.lang.Exception unused2) {
                        return "";
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (byte b2 : hardwareAddress) {
                    sb.append(java.lang.String.format("%02X:", java.lang.Byte.valueOf(b2)));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
        }
        return "";
    }

    public static int v(java.lang.String str) {
        int i2;
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        try {
            if (str.isEmpty()) {
                return 0;
            }
            if (str.contains("+")) {
                i2 = R(str.split("\\+")[1]);
            } else {
                if (!str.contains("-")) {
                    return 0;
                }
                i2 = -R(str.split("\\-")[1]);
            }
            i3 = i2 * 60 * 60 * 1000;
            return i3;
        } catch (java.lang.Exception unused) {
            return i3;
        }
    }

    public static java.lang.String w(java.lang.String str, android.content.Context context) {
        try {
            java.lang.String string = context.getSharedPreferences("timeFormat", 0).getString("timeFormat", f.j.a.h.i.a.d0);
            f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(context);
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
            java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(string, java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(aVar.y()));
            java.lang.String format = simpleDateFormat2.format(new java.util.Date(java.lang.Long.parseLong(java.lang.String.valueOf(java.lang.Long.valueOf(simpleDateFormat.parse(str).getTime())))));
            android.util.Log.e("TimeZone", java.util.TimeZone.getDefault().getID());
            return format;
        } catch (java.lang.Exception unused) {
            return "00-00-0000 00:00";
        }
    }

    public static int x(android.content.Context context) {
        return (int) ((r1.widthPixels / context.getResources().getDisplayMetrics().density) / 180.0f);
    }

    public static int y(long j2, long j3, android.content.Context context) {
        if (context != null) {
            try {
                long millis = org.joda.time.LocalDateTime.now().toDateTime().getMillis() + C(context);
                if (j2 < j3 && millis < j3) {
                    if (millis <= j2) {
                        return 100;
                    }
                    return (int) (((j3 - millis) * 100) / (j3 - j2));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int z(java.lang.String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            switch (hashCode) {
                case 1382:
                    if (str.equals("+1")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1383:
                    if (str.equals("+2")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1384:
                    if (str.equals("+3")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1385:
                    if (str.equals("+4")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1386:
                    if (str.equals("+5")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1387:
                    if (str.equals("+6")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1388:
                    if (str.equals("+7")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1389:
                    if (str.equals("+8")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1390:
                    if (str.equals("+9")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    switch (hashCode) {
                        case 1444:
                            if (str.equals("-1")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1445:
                            if (str.equals("-2")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1446:
                            if (str.equals("-3")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1447:
                            if (str.equals("-4")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1448:
                            if (str.equals("-5")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1449:
                            if (str.equals("-6")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1450:
                            if (str.equals("-7")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1451:
                            if (str.equals("-8")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1452:
                            if (str.equals("-9")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            switch (hashCode) {
                                case 42890:
                                    if (str.equals("+10")) {
                                        c2 = 22;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 42891:
                                    if (str.equals("+11")) {
                                        c2 = 23;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 42892:
                                    if (str.equals("+12")) {
                                        c2 = 24;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    switch (hashCode) {
                                        case 44812:
                                            if (str.equals("-10")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 44813:
                                            if (str.equals("-11")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 44814:
                                            if (str.equals("-12")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                            }
                    }
            }
        } else {
            if (str.equals("0")) {
                c2 = '\f';
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case '\b':
                return 8;
            case '\t':
                return 9;
            case '\n':
                return 10;
            case 11:
                return 11;
            case '\f':
            default:
                return 12;
            case '\r':
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
        }
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    public java.lang.String c0(int i2) {
        return java.lang.String.format("%02d:%02d:%02d", java.lang.Integer.valueOf(i2 / org.joda.time.DateTimeConstants.SECONDS_PER_HOUR), java.lang.Integer.valueOf((i2 % org.joda.time.DateTimeConstants.SECONDS_PER_HOUR) / 60), java.lang.Integer.valueOf(i2 % 60));
    }

    public void e0(boxbr.apksrebrand.smarters.view.activity.RecordingActivity recordingActivity, java.io.File file, boxbr.apksrebrand.smarters.view.adapter.RecordingAdapter recordingAdapter, java.util.ArrayList<java.io.File> arrayList, android.widget.TextView textView) {
        if (recordingActivity != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) recordingActivity.findViewById(brstore.makro.app.R.id.rl_password_verification);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) recordingActivity.getSystemService("layout_inflater");
            f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(recordingActivity);
            f10114i = aVar;
            android.view.View inflate = layoutInflater.inflate(aVar.w().equals(f.j.a.h.i.a.i0) ? brstore.makro.app.R.layout.delete_recording_popup_tv : brstore.makro.app.R.layout.delete_recording_popup, relativeLayout);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(recordingActivity);
            f10111f = popupWindow;
            popupWindow.setContentView(inflate);
            f10111f.setWidth(-1);
            f10111f.setHeight(-1);
            f10111f.setFocusable(true);
            f10111f.showAtLocation(inflate, 17, 0, 0);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_start_recording);
            android.widget.Button button2 = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new f.j.a.h.i.e.i((android.view.View) button, recordingActivity));
                button.requestFocus();
                button.requestFocusFromTouch();
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new f.j.a.h.i.e.i((android.view.View) button2, recordingActivity));
            }
            button2.setOnClickListener(new f.j.a.h.i.e.f(this));
            if (button != null) {
                button.setOnClickListener(new f.j.a.h.i.e.g(this, file, recordingActivity, arrayList, recordingAdapter, textView));
            }
        }
    }

    public void f0(android.app.Activity activity) {
        if (activity != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) activity.findViewById(brstore.makro.app.R.id.rl_password_verification);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) activity.getSystemService("layout_inflater");
            f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(activity);
            f10114i = aVar;
            android.view.View inflate = layoutInflater.inflate(aVar.w().equals(f.j.a.h.i.a.i0) ? brstore.makro.app.R.layout.download_running_popup_tv : brstore.makro.app.R.layout.download_running_popup, relativeLayout);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(activity);
            f10111f = popupWindow;
            popupWindow.setContentView(inflate);
            f10111f.setWidth(-1);
            f10111f.setHeight(-1);
            f10111f.setFocusable(true);
            f10111f.showAtLocation(inflate, 17, 0, 0);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_start_recording);
            android.widget.Button button2 = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new f.j.a.h.i.e.i(button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new f.j.a.h.i.e.i(button2, activity));
            }
            button2.setOnClickListener(new f.j.a.h.i.e.a(this));
            if (button != null) {
                button.setOnClickListener(new f.j.a.h.i.e.b(activity));
            }
        }
    }

    public void i0(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        java.io.File file;
        android.widget.EditText editText;
        java.io.File file2;
        if (activity != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) activity.findViewById(brstore.makro.app.R.id.rl_password_verification);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) activity.getSystemService("layout_inflater");
            f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(activity);
            f10114i = aVar;
            android.view.View inflate = layoutInflater.inflate(aVar.w().equals(f.j.a.h.i.a.i0) ? brstore.makro.app.R.layout.recording_popup_tv : brstore.makro.app.R.layout.recording_popup, relativeLayout);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(activity);
            f10111f = popupWindow;
            popupWindow.setContentView(inflate);
            f10111f.setWidth(-1);
            f10111f.setHeight(-1);
            f10111f.setFocusable(true);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_start_recording);
            android.widget.Button button2 = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_close);
            android.widget.EditText editText2 = (android.widget.EditText) inflate.findViewById(brstore.makro.app.R.id.et_file_name);
            android.widget.EditText editText3 = (android.widget.EditText) inflate.findViewById(brstore.makro.app.R.id.et_duration);
            android.widget.Button button3 = (android.widget.Button) inflate.findViewById(brstore.makro.app.R.id.bt_browse);
            android.widget.EditText editText4 = (android.widget.EditText) inflate.findViewById(brstore.makro.app.R.id.et_browse);
            if (button != null) {
                button.setOnFocusChangeListener(new f.j.a.h.i.e.i(button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new f.j.a.h.i.e.i(button2, activity));
            }
            if (button3 != null) {
                button3.setOnFocusChangeListener(new f.j.a.h.i.e.i(button3, activity));
            }
            java.lang.String str7 = str + ".ts";
            if (f.j.a.i.p.l.f(activity).equals("m3u")) {
                str6 = str4;
            } else {
                if (str2.equals("")) {
                    str5 = str3 + i2;
                } else {
                    str5 = str3 + i2 + ".ts";
                }
                str6 = str5;
            }
            editText2.setText(str7);
            editText2.requestFocus();
            editText4.setEnabled(false);
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks");
            } else {
                file = new java.io.File(android.os.Environment.getExternalStorageDirectory() + "/Download", "BoxBRApks");
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences("recordingDir", 0);
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                file2 = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "BoxBRApks");
                editText = editText2;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                editText = editText2;
                sb.append(android.os.Environment.getExternalStorageDirectory());
                sb.append("/");
                sb.append("Download");
                file2 = new java.io.File(sb.toString(), "BoxBRApks");
            }
            editText4.setText(sharedPreferences.getString("recordingDir", java.lang.String.valueOf(file2)));
            button2.setOnClickListener(new f.j.a.h.i.e.c(this));
            button3.setOnClickListener(new f.j.a.h.i.e.d(this, activity, editText4, sharedPreferences));
            if (button != null) {
                button.setOnClickListener(new f.j.a.h.i.e.ViewOnClickListenerC0274e(editText3, activity, str6, editText, editText4));
            }
            f10111f.showAtLocation(inflate, 17, 0, 0);
        }
    }

    public void n0(android.content.Context context, java.lang.String str) {
        if (context != null) {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("downloadStatus", 0);
            f10113h = sharedPreferences;
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("downloadStatus", str);
            edit.apply();
        }
    }
}
