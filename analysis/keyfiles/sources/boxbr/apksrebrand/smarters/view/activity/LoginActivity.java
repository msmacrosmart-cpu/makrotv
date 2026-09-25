package boxbr.apksrebrand.smarters.view.activity;

/* loaded from: classes.dex */
public class LoginActivity extends d.a.k.c implements f.j.a.k.f.f, f.j.a.f.c<java.lang.String>, f.j.a.k.f.a {
    public static android.text.InputFilter l0 = new boxbr.apksrebrand.smarters.view.activity.LoginActivity.a();
    public java.lang.String A;
    public java.lang.String B;
    public android.app.ProgressDialog C;
    public android.content.SharedPreferences D;
    public android.content.SharedPreferences.Editor E;
    public android.content.SharedPreferences F;
    public android.content.SharedPreferences.Editor G;
    public android.content.SharedPreferences H;
    public android.content.SharedPreferences.Editor I;
    public android.content.SharedPreferences J;
    public android.content.SharedPreferences K;
    public android.content.SharedPreferences L;
    public android.content.SharedPreferences M;
    public android.content.SharedPreferences N;
    public android.content.SharedPreferences.Editor O;
    public android.content.SharedPreferences.Editor P;
    public android.content.SharedPreferences.Editor Q;
    public android.content.SharedPreferences.Editor R;
    public android.content.SharedPreferences.Editor S;
    public android.content.SharedPreferences T;
    public android.content.SharedPreferences U;
    public android.content.SharedPreferences.Editor V;
    public f.j.a.i.p.f W;
    public java.lang.String Y;
    public android.content.SharedPreferences Z;
    public android.content.SharedPreferences a0;

    @butterknife.BindView
    public android.widget.LinearLayout activityLogin;

    @butterknife.BindView
    public android.widget.Button btn_free_trail;
    public java.lang.String d0;
    public java.lang.String e0;

    @butterknife.BindView
    public android.widget.ImageView eyepass;
    public java.lang.String f0;
    public java.lang.String g0;
    public int h0;
    public java.lang.String i0;

    @butterknife.BindView
    public android.widget.ImageView iv_connect_vpn;

    @butterknife.BindView
    public android.widget.ImageView iv_list_users;
    public f.j.a.j.a j0;
    public f.j.a.k.d.a.a k0;

    @butterknife.BindView
    public android.widget.LinearLayout linearLayout;

    @butterknife.BindView
    public android.widget.TextView link_transform;

    @butterknife.BindView
    public android.widget.TextView loginTV;

    @butterknife.BindView
    public android.widget.LinearLayout password_full;
    public android.widget.EditText r;

    @butterknife.BindView
    public android.widget.Button rl_bt_refresh;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_bt_submit;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_connect_vpn;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_email;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_list_users;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_name;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_password;

    @butterknife.BindView
    public android.widget.RelativeLayout rl_server_url;
    public android.widget.EditText s;
    public android.widget.EditText t;

    @butterknife.BindView
    public android.widget.TextView tv_add_user;

    @butterknife.BindView
    public android.widget.TextView tv_list_users;

    @butterknife.BindView
    public android.widget.TextView tv_vpn_con;
    public android.widget.EditText u;
    public f.j.a.j.c x;

    @butterknife.BindView
    public android.widget.ImageView yourLogioTV;
    public java.lang.String z;
    public int v = -1;
    public boolean w = false;
    public android.content.Context y = this;
    public java.lang.String X = "";
    public java.lang.String b0 = "";
    public java.util.ArrayList<java.lang.String> c0 = new java.util.ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements android.text.InputFilter {
        @Override // android.text.InputFilter
        public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i2, int i3, android.text.Spanned spanned, int i4, int i5) {
            while (i2 < i3) {
                if (java.lang.Character.getType(charSequence.charAt(i2)) == 19) {
                    return "";
                }
                i2++;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class b implements android.view.View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.i.a.c = true;
            f.j.a.i.p.l.e0("login", boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.y);
            android.content.Intent intent = new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.y, (java.lang.Class<?>) boxbr.apksrebrand.smarters.vpn.activities.ProfileActivity.class);
            intent.putExtra("typeid", "login");
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.startActivity(intent);
        }
    }

    /* loaded from: classes.dex */
    public class c implements android.view.View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.o1();
        }
    }

    /* loaded from: classes.dex */
    public class d implements android.view.View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.l1();
        }
    }

    /* loaded from: classes.dex */
    public class e implements android.view.View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.startActivity(new android.content.Intent(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.WHMCSClientapp.activities.FreeTrailActivity.class));
        }
    }

    /* loaded from: classes.dex */
    public class f implements android.view.View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            f.j.a.h.i.a.f10100j = f.j.a.h.i.a.f10100j.booleanValue() ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.g1();
        }
    }

    /* loaded from: classes.dex */
    public class g implements android.view.View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            boxbr.apksrebrand.smarters.view.activity.LoginActivity loginActivity = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this;
            int i2 = loginActivity.v;
            if (i2 != -1) {
                loginActivity.v = i2 - 1;
                loginActivity.s.setInputType(129);
                boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.eyepass.setImageResource(brstore.makro.app.R.drawable.hidepassword);
            } else {
                loginActivity.s.setInputType(145);
                boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.eyepass.setImageResource(brstore.makro.app.R.drawable.showpassword);
                boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.v++;
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements java.lang.Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.w = false;
        }
    }

    /* loaded from: classes.dex */
    public class i extends android.app.Dialog implements android.view.View.OnClickListener {
        public android.widget.TextView b;
        public android.widget.TextView c;

        /* renamed from: d, reason: collision with root package name */
        public android.widget.LinearLayout f834d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.LinearLayout f835e;

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
                        linearLayout = boxbr.apksrebrand.smarters.view.activity.LoginActivity.i.this.f835e;
                    }
                    linearLayout = boxbr.apksrebrand.smarters.view.activity.LoginActivity.i.this.f834d;
                } else {
                    android.view.View view4 = this.b;
                    i2 = brstore.makro.app.R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.b.getTag().equals("1")) {
                        android.view.View view5 = this.b;
                        if (view5 == null || view5.getTag() == null || !this.b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = boxbr.apksrebrand.smarters.view.activity.LoginActivity.i.this.f835e;
                    }
                    linearLayout = boxbr.apksrebrand.smarters.view.activity.LoginActivity.i.this.f834d;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public i(android.app.Activity activity) {
            super(activity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int id = view.getId();
            try {
                if (id != brstore.makro.app.R.id.btn_close) {
                    if (id == brstore.makro.app.R.id.btn_try_again) {
                        dismiss();
                        boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.o1();
                    }
                }
                dismiss();
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            setContentView(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.k0.w().equals(f.j.a.h.i.a.i0) ? brstore.makro.app.R.layout.custom_internet_not_working_layout_tv : brstore.makro.app.R.layout.custom_internet_not_working_layout);
            this.b = (android.widget.TextView) findViewById(brstore.makro.app.R.id.btn_try_again);
            this.c = (android.widget.TextView) findViewById(brstore.makro.app.R.id.btn_close);
            this.f834d = (android.widget.LinearLayout) findViewById(brstore.makro.app.R.id.ll_yes_button_main_layout);
            this.f835e = (android.widget.LinearLayout) findViewById(brstore.makro.app.R.id.ll_no_button_main_layout);
            this.b.setOnClickListener(this);
            this.c.setOnClickListener(this);
            android.widget.TextView textView = this.b;
            textView.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.i.a(textView));
            android.widget.TextView textView2 = this.c;
            textView2.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.i.a(textView2));
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
            if (!bool.booleanValue()) {
                boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.b();
                boxbr.apksrebrand.smarters.view.activity.LoginActivity loginActivity = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this;
                boxbr.apksrebrand.smarters.view.activity.LoginActivity.i iVar = new boxbr.apksrebrand.smarters.view.activity.LoginActivity.i((android.app.Activity) loginActivity.y);
                iVar.setCancelable(false);
                iVar.show();
                return;
            }
            if (!f.j.a.h.i.a.f10100j.booleanValue()) {
                boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.P0();
                return;
            }
            boxbr.apksrebrand.smarters.view.activity.LoginActivity loginActivity2 = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this;
            loginActivity2.j0 = new f.j.a.j.a(loginActivity2, loginActivity2.y);
            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.j0.a(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.z);
        }
    }

    /* loaded from: classes.dex */
    public class k implements android.view.View.OnFocusChangeListener {
        public final android.view.View b;

        public k(android.view.View view) {
            this.b = view;
        }

        public final void a(boolean z) {
            if (z) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.b, "alpha", z ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        public final void b(float f2) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.b, "scaleX", f2);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        public final void c(float f2) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.b, "scaleY", f2);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        public void onFocusChange(android.view.View view, boolean z) {
            float f2;
            boxbr.apksrebrand.smarters.view.activity.LoginActivity loginActivity;
            android.widget.TextView textView;
            android.widget.EditText editText;
            int length;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                android.view.View view2 = this.b;
                if (view2 == null || view2.getTag() == null || !this.b.getTag().equals("rl_list_users")) {
                    android.view.View view3 = this.b;
                    if (view3 == null || view3.getTag() == null || !this.b.getTag().equals("rl_connect_vpn")) {
                        android.view.View view4 = this.b;
                        if (view4 == null || view4.getTag() == null || !this.b.getTag().equals("rl_bt_submit")) {
                            return;
                        }
                        boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.rl_bt_submit.setBackgroundResource(brstore.makro.app.R.drawable.shape_button1);
                        loginActivity = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this;
                        textView = loginActivity.tv_add_user;
                    } else {
                        boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.rl_connect_vpn.setBackgroundResource(brstore.makro.app.R.drawable.shape_button1);
                        boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.iv_connect_vpn.setImageResource(brstore.makro.app.R.drawable.login_icon1_focused);
                        loginActivity = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this;
                        textView = loginActivity.tv_vpn_con;
                    }
                } else {
                    boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.rl_list_users.setBackgroundResource(brstore.makro.app.R.drawable.shape_button1);
                    boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.iv_list_users.setImageResource(brstore.makro.app.R.drawable.login_icon2_focused);
                    loginActivity = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this;
                    textView = loginActivity.tv_list_users;
                }
                textView.setTextColor(loginActivity.y.getResources().getColor(brstore.makro.app.R.color.white));
                return;
            }
            f2 = z ? 1.11f : 1.0f;
            try {
                android.util.Log.e("id is", "" + this.b.getTag());
                if (this.b.getTag().equals("1")) {
                    editText = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.r;
                    length = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.r.length();
                } else if (this.b.getTag().equals("2")) {
                    editText = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.s;
                    length = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.s.length();
                } else {
                    if (!this.b.getTag().equals("3")) {
                        if (this.b.getTag().equals("rl_list_users")) {
                            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.rl_list_users.setBackgroundResource(brstore.makro.app.R.drawable.shape_button_focused1);
                            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.iv_list_users.setImageResource(brstore.makro.app.R.drawable.login_icon2_focused);
                            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.tv_list_users.setTextColor(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.y.getResources().getColor(brstore.makro.app.R.color.white));
                            b(f2);
                        } else {
                            if (!this.b.getTag().equals("rl_connect_vpn")) {
                                if (this.b.getTag().equals("rl_bt_submit")) {
                                    boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.rl_bt_submit.setBackgroundResource(brstore.makro.app.R.drawable.shape_button_focused1);
                                    boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.tv_add_user.setTextColor(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.y.getResources().getColor(brstore.makro.app.R.color.white));
                                    return;
                                }
                                return;
                            }
                            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.rl_connect_vpn.setBackgroundResource(brstore.makro.app.R.drawable.shape_button_focused1);
                            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.iv_connect_vpn.setImageResource(brstore.makro.app.R.drawable.login_icon1_focused);
                            boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.tv_vpn_con.setTextColor(boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.y.getResources().getColor(brstore.makro.app.R.color.white));
                            b(f2);
                        }
                        c(f2);
                        return;
                    }
                    editText = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.t;
                    length = boxbr.apksrebrand.smarters.view.activity.LoginActivity.this.t.length();
                }
                editText.setSelection(length);
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public LoginActivity() {
        e1();
        new java.text.SimpleDateFormat("dd/MM/yyyy");
        java.lang.String str = android.os.Build.MODEL;
    }

    public static java.lang.String a1(java.lang.String str) {
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

    public static java.lang.String f1() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.startsWith(str)) {
            return a1(str2);
        }
        return a1(str) + " " + str2;
    }

    public static java.lang.String i1(java.lang.String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:54:0x037e, code lost:
    
        if (f.j.a.h.i.a.f10094d.booleanValue() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03fa, code lost:
    
        f.j.a.h.i.e.j0(r18.y, "Your Account is invalid or has expired !");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03ff, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03e9, code lost:
    
        r0 = getResources().getString(brstore.makro.app.R.string.invalid_detail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03e7, code lost:
    
        if (f.j.a.h.i.a.f10094d.booleanValue() != false) goto L69;
     */
    @Override // f.j.a.k.f.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(boxbr.apksrebrand.smarters.model.callback.LoginCallback r19, java.lang.String r20, java.util.ArrayList<java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: boxbr.apksrebrand.smarters.view.activity.LoginActivity.H(boxbr.apksrebrand.smarters.model.callback.LoginCallback, java.lang.String, java.util.ArrayList):void");
    }

    @Override // f.j.a.k.f.f
    public void M(java.lang.String str) {
        android.app.ProgressDialog progressDialog = this.C;
        if (progressDialog != null) {
            progressDialog.dismiss();
            android.widget.Toast.makeText(this, this.y.getResources().getString(brstore.makro.app.R.string.invalid_server_url), 0).show();
        }
    }

    public void N0() {
        this.f0 = android.os.Build.VERSION.RELEASE + " " + android.os.Build.VERSION_CODES.class.getFields()[android.os.Build.VERSION.SDK_INT].getName();
    }

    public void O0() {
        int nextInt = new java.util.Random().nextInt(8378600) + 10000;
        this.h0 = nextInt;
        f.j.a.f.b.b = java.lang.String.valueOf(nextInt);
    }

    @Override // f.j.a.k.f.f
    public void P(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (f.j.a.h.i.a.f10094d.booleanValue()) {
                android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.invalid_detail), 0).show();
                return;
            } else {
                f.j.a.h.i.e.j0(this.y, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.I.putString(f.j.a.h.i.a.f10105o, arrayList.get(0).trim());
            this.I.apply();
            arrayList.remove(0);
            this.x.h(this.z, this.A, arrayList);
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }

    public void P0() {
        this.d0 = i1(f.j.a.f.f.c(this) + "*" + f.j.a.f.f.d(this) + "-" + this.z + "-" + f.j.a.f.b.b + "-" + this.g0 + "-unknown-" + f1() + "-" + this.f0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f.j.a.f.g.b = arrayList;
        arrayList.add(f.j.a.f.g.a(com.facebook.internal.m.a, "gu"));
        f.j.a.f.g.b.add(f.j.a.f.g.a("k", f.j.a.f.f.c(this)));
        f.j.a.f.g.b.add(f.j.a.f.g.a("sc", this.d0));
        f.j.a.f.g.b.add(f.j.a.f.g.a("u", this.z));
        f.j.a.f.g.b.add(f.j.a.f.g.a("pw", "no_password"));
        f.j.a.f.g.b.add(f.j.a.f.g.a("r", f.j.a.f.b.b));
        f.j.a.f.g.b.add(f.j.a.f.g.a("av", this.g0));
        f.j.a.f.g.b.add(f.j.a.f.g.a("dt", tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN));
        f.j.a.f.g.b.add(f.j.a.f.g.a("d", f1()));
        f.j.a.f.g.b.add(f.j.a.f.g.a("do", this.f0));
        f.j.a.f.g.c.b(this);
    }

    @Override // f.j.a.k.f.f
    public void U(boxbr.apksrebrand.smarters.model.callback.LoginCallback loginCallback, java.lang.String str) {
        int i2;
        java.lang.String string;
        int i3;
        if (this.y != null) {
            if (loginCallback == null || loginCallback.b() == null) {
                b();
                e(getResources().getString(brstore.makro.app.R.string.invalid_server_response));
                return;
            }
            if (loginCallback.b().c().intValue() == 1) {
                java.lang.String i4 = loginCallback.b().i();
                if (i4.equals("Active")) {
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
                    this.y.getSharedPreferences("loginPrefsserverurl", 0).getString(f.j.a.h.i.a.f10105o, "").toLowerCase();
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
                    this.J = this.y.getSharedPreferences("allowedFormat", 0);
                    this.K = this.y.getSharedPreferences("timeFormat", 0);
                    this.L = this.y.getSharedPreferences("epgchannelupdate", 0);
                    this.M = this.y.getSharedPreferences("automation_channels", 0);
                    this.N = this.y.getSharedPreferences("automation_epg", 0);
                    this.Q = this.J.edit();
                    this.O = this.K.edit();
                    this.P = this.L.edit();
                    this.R = this.M.edit();
                    this.S = this.N.edit();
                    android.content.SharedPreferences sharedPreferences = this.y.getSharedPreferences("auto_start", 0);
                    this.U = sharedPreferences;
                    android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    this.V = edit2;
                    if (edit2 != null) {
                        edit2.putBoolean("full_epg", true);
                        this.V.apply();
                    }
                    if (this.M.getString("automation_channels", "").equals("")) {
                        this.R.putString("automation_channels", "checked");
                        this.R.apply();
                    }
                    if (this.N.getString("automation_epg", "").equals("")) {
                        this.S.putString("automation_epg", "checked");
                        this.S.apply();
                    }
                    f.j.a.h.i.a.B = java.lang.Boolean.FALSE;
                    if (this.J.getString("allowedFormat", "").equals("")) {
                        this.Q.putString("allowedFormat", "ts");
                        this.Q.apply();
                    }
                    if (this.K.getString("timeFormat", f.j.a.h.i.a.d0).equals("")) {
                        this.O.putString("timeFormat", f.j.a.h.i.a.d0);
                        this.O.apply();
                    }
                    if (this.L.getString("epgchannelupdate", "").equals("")) {
                        this.P.putString("epgchannelupdate", "all");
                        this.P.apply();
                    }
                    this.W = new f.j.a.i.p.f(this.y);
                    boolean booleanValue = f.j.a.h.i.a.D.booleanValue();
                    f.j.a.i.p.f fVar = this.W;
                    if (booleanValue) {
                        if (fVar.p(this.Y, j2, h2, f2, "api", f2)) {
                            b();
                            i3 = 0;
                            android.widget.Toast.makeText(this, getString(brstore.makro.app.R.string.already_exist_with_name) + this.Y + getString(brstore.makro.app.R.string.username_with_cllon) + j2 + getString(brstore.makro.app.R.string.and_portal) + f.j.a.h.i.a.z, 0).show();
                        } else {
                            this.W.a(this.Y, j2, h2, f.j.a.h.i.a.z, f2);
                            android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.user_added), 0).show();
                            i3 = 0;
                        }
                        android.content.SharedPreferences.Editor edit3 = this.y.getSharedPreferences("loginprefsmultiuser", i3).edit();
                        edit3.putString("name", this.Y);
                        edit3.putString("username", j2);
                        edit3.putString("password", h2);
                        edit3.putString(f.j.a.h.i.a.f10105o, f2);
                        edit3.apply();
                    } else if (!fVar.p("", j2, h2, f2, "api", f2)) {
                        this.W.a("", j2, h2, f.j.a.h.i.a.z, f2);
                    }
                    if (this.y != null) {
                        f.j.a.i.p.l.f0(this.W.D(this.Y, j2, h2, f2, "api", f2), this.y);
                    }
                    android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.logged_in), 0).show();
                    b();
                    startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.NewDashboardActivity.class));
                    finish();
                    return;
                }
                b();
                string = getResources().getString(brstore.makro.app.R.string.invalid_status) + i4;
                i2 = 0;
            } else {
                i2 = 0;
                if (!str.equals("validateLogin")) {
                    return;
                }
                b();
                string = getResources().getString(brstore.makro.app.R.string.invalid_details);
            }
            android.widget.Toast.makeText(this, string, i2).show();
        }
    }

    @Override // f.j.a.k.f.a
    public void Z(boxbr.apksrebrand.smarters.model.callback.ActivationCallBack activationCallBack, java.lang.String str) {
        P0();
    }

    public void Z0() {
        try {
            this.g0 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Override // f.j.a.k.f.b
    public void a() {
        android.app.ProgressDialog progressDialog = this.C;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // f.j.a.k.f.b
    public void b() {
        try {
            if (this.C != null) {
                this.C.dismiss();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b1() {
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

    @Override // f.j.a.k.f.f
    public void c0(java.lang.String str) {
        b();
        if (!str.equals("")) {
            f.j.a.h.i.e.j0(this.y, str);
        } else if (f.j.a.h.i.a.f10094d.booleanValue()) {
            android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.invalid_detail), 0).show();
        } else {
            f.j.a.h.i.e.j0(this.y, "Your Account is invalid or has expired !");
        }
    }

    public boolean c1() {
        android.widget.EditText editText;
        android.content.res.Resources resources;
        int i2;
        android.widget.EditText editText2;
        android.content.res.Resources resources2;
        int i3;
        if (f.j.a.h.i.a.f10096f.booleanValue() && this.u.getText().toString().trim().length() == 0) {
            this.u.requestFocus();
            editText = this.u;
            resources = getResources();
            i2 = brstore.makro.app.R.string.enter_any_name;
        } else {
            if (this.r.getText().toString().trim().length() == 0) {
                this.r.requestFocus();
                if (f.j.a.h.i.a.f10100j.booleanValue()) {
                    editText2 = this.r;
                    resources2 = getResources();
                    i3 = brstore.makro.app.R.string.enter_act_code;
                } else {
                    editText2 = this.r;
                    resources2 = getResources();
                    i3 = brstore.makro.app.R.string.enter_username_error;
                }
                editText2.setError(resources2.getString(i3));
                return false;
            }
            if (!f.j.a.h.i.a.f10100j.booleanValue() && this.s.getText().toString().trim().length() == 0) {
                this.s.requestFocus();
                editText = this.s;
                resources = getResources();
                i2 = brstore.makro.app.R.string.enter_password_error;
            } else {
                if (!f.j.a.h.i.a.D.booleanValue() || this.t.getText().toString().trim().length() != 0) {
                    return true;
                }
                this.t.requestFocus();
                editText = this.t;
                resources = getResources();
                i2 = brstore.makro.app.R.string.enter_server_url_error;
            }
        }
        editText.setError(resources.getString(i2));
        return false;
    }

    @android.annotation.SuppressLint({"ResourceType"})
    public void d1() {
        android.widget.Button button;
        int i2;
        k1();
        this.rl_connect_vpn.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.b());
        this.rl_bt_submit.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.c());
        this.rl_list_users.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.d());
        if (f.j.a.h.i.a.f10099i.booleanValue()) {
            button = this.btn_free_trail;
            i2 = 0;
        } else {
            button = this.btn_free_trail;
            i2 = 8;
        }
        button.setVisibility(i2);
        this.btn_free_trail.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.e());
        this.link_transform.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.f());
    }

    @Override // f.j.a.k.f.b
    public void e(java.lang.String str) {
        if (this.y == null || str.isEmpty()) {
            return;
        }
        f.j.a.h.i.e.j0(this.y, str);
    }

    public final java.lang.String e1() {
        return f.j.a.h.i.e.P(java.util.Calendar.getInstance().getTime().toString());
    }

    public final void g1() {
        android.widget.RelativeLayout relativeLayout;
        android.widget.RelativeLayout relativeLayout2;
        android.app.ProgressDialog progressDialog;
        java.lang.String string;
        try {
            this.y = this;
            this.W = new f.j.a.i.p.f(this.y);
            new f.j.a.i.p.e(this.y);
            if (f.j.a.h.i.a.f10101k.booleanValue()) {
                this.link_transform.setVisibility(0);
            }
            if (f.j.a.h.i.a.f10096f.booleanValue()) {
                this.link_transform.setNextFocusLeftId(brstore.makro.app.R.id.rl_list_users);
            } else {
                this.link_transform.setNextFocusLeftId(brstore.makro.app.R.id.rl_connect_vpn);
            }
            if (f.j.a.h.i.a.f10100j.booleanValue()) {
                this.r.setHint((java.lang.CharSequence) null);
                this.r.setHint("");
                this.link_transform.setText(getResources().getString(brstore.makro.app.R.string.with_act_code));
                this.loginTV.setText(getResources().getString(brstore.makro.app.R.string.enter_act_code));
                this.rl_server_url.setVisibility(8);
                this.password_full.setVisibility(8);
                this.r.setVisibility(8);
                this.r.setVisibility(0);
                this.r.setHint(getResources().getString(brstore.makro.app.R.string.act_code));
                this.tv_add_user.setText(getResources().getString(brstore.makro.app.R.string.code_act));
                if (f.j.a.h.i.a.f10096f.booleanValue()) {
                    this.rl_name.setVisibility(0);
                } else {
                    this.rl_name.setVisibility(8);
                }
                if (f.j.a.h.i.a.f10095e.booleanValue() && f.j.a.h.i.a.f10096f.booleanValue()) {
                    relativeLayout2 = this.rl_list_users;
                } else if (f.j.a.h.i.a.f10097g.booleanValue()) {
                    relativeLayout2 = this.rl_list_users;
                } else {
                    relativeLayout = this.rl_list_users;
                    relativeLayout.setVisibility(8);
                }
                relativeLayout2.setVisibility(0);
            } else {
                if (f.j.a.h.i.a.f10096f.booleanValue()) {
                    this.r.setHint((java.lang.CharSequence) null);
                    this.r.setHint("");
                    this.link_transform.setText(getResources().getString(brstore.makro.app.R.string.with_user_pass));
                    this.tv_add_user.setText(getResources().getString(brstore.makro.app.R.string.add_user));
                    this.r.setVisibility(8);
                    this.r.setVisibility(0);
                    this.r.setHint(getResources().getString(brstore.makro.app.R.string.username));
                    this.password_full.setVisibility(0);
                    this.rl_name.setVisibility(8);
                    if (f.j.a.h.i.a.D.booleanValue()) {
                        this.rl_server_url.setVisibility(0);
                    } else {
                        this.rl_server_url.setVisibility(8);
                    }
                    if (f.j.a.h.i.a.f10095e.booleanValue() && f.j.a.h.i.a.f10096f.booleanValue()) {
                        relativeLayout2 = this.rl_list_users;
                    } else if (f.j.a.h.i.a.f10097g.booleanValue()) {
                        relativeLayout2 = this.rl_list_users;
                    } else {
                        relativeLayout = this.rl_list_users;
                    }
                    relativeLayout2.setVisibility(0);
                } else {
                    this.r.setHint((java.lang.CharSequence) null);
                    this.r.setHint("");
                    this.link_transform.setText(getResources().getString(brstore.makro.app.R.string.with_user_pass));
                    this.loginTV.setText(getResources().getString(brstore.makro.app.R.string.credential_detail));
                    this.r.setVisibility(8);
                    this.r.setVisibility(0);
                    this.password_full.setVisibility(0);
                    this.r.setHint(getResources().getString(brstore.makro.app.R.string.username));
                    this.tv_add_user.setText(getResources().getString(brstore.makro.app.R.string.submit));
                    this.rl_server_url.setVisibility(8);
                    this.rl_name.setVisibility(8);
                    relativeLayout = this.rl_list_users;
                }
                relativeLayout.setVisibility(8);
            }
            this.u.setError(null);
            this.r.setError(null);
            this.s.setError(null);
            new f.j.a.i.p.a(this.y);
            if (this.y != null) {
                this.C = new android.app.ProgressDialog(this.y);
                if (this.i0 != null && this.i0.equalsIgnoreCase("login_perform")) {
                    progressDialog = this.C;
                    string = "Auto Login";
                } else if (f.j.a.h.i.a.f10100j.booleanValue()) {
                    this.C.setMessage("");
                    progressDialog = this.C;
                    string = getResources().getString(brstore.makro.app.R.string.please_wait_act);
                } else {
                    this.C.setMessage("");
                    progressDialog = this.C;
                    string = getResources().getString(brstore.makro.app.R.string.please_wait);
                }
                progressDialog.setMessage(string);
                this.C.setCanceledOnTouchOutside(false);
                this.C.setCancelable(false);
                this.C.setProgressStyle(0);
            }
            this.z = this.r.getText().toString();
            this.A = this.s.getText().toString();
            this.x = new f.j.a.j.c(this, this.y);
            this.D = getSharedPreferences("sharedPreference", 0);
            getSharedPreferences("loginPrefs", 0);
            getSharedPreferences("selected_language", 0);
            android.content.SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.H = sharedPreferences;
            this.I = sharedPreferences.edit();
            android.content.SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
            this.T = sharedPreferences2;
            sharedPreferences2.edit();
            this.G = this.F.edit();
            this.E = this.D.edit();
            android.content.SharedPreferences sharedPreferences3 = getSharedPreferences("multiDNS", 0);
            this.Z = sharedPreferences3;
            sharedPreferences3.edit();
            android.content.SharedPreferences sharedPreferences4 = getSharedPreferences("multiDNSValid", 0);
            this.a0 = sharedPreferences4;
            sharedPreferences4.edit();
            getSharedPreferences("serverUrlDNS", 0);
            if (f.j.a.h.i.a.f10096f.booleanValue()) {
                this.r.setText("");
                this.s.setText("");
            }
            h1();
        } catch (android.content.res.Resources.NotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public void h1() {
        android.widget.EditText editText;
        try {
            if (f.j.a.h.i.a.f10096f.booleanValue()) {
                this.u.requestFocus();
                editText = this.u;
            } else {
                this.r.requestFocus();
                editText = this.r;
            }
            editText.requestFocusFromTouch();
            b();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // f.j.a.k.f.a
    public void j0(java.lang.String str) {
        b();
        if (str != null) {
            f.j.a.h.i.e.j0(this.y, str);
        } else {
            f.j.a.h.i.e.j0(this.y, "Your Activation code is not invalid");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 6 */
    @Override // f.j.a.f.c
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public void h0(java.lang.String str, int i2, boolean z) {
        java.lang.String trim;
        if (!z) {
            b();
            android.widget.Toast.makeText(this, this.y.getResources().getString(brstore.makro.app.R.string.could_not_connect), 0).show();
            return;
        }
        if (i2 == 1) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                f.j.a.f.b.a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    b();
                    android.widget.Toast.makeText(this, this.y.getResources().getString(brstore.makro.app.R.string.status_suspend), 0).show();
                    return;
                }
                this.X = f.j.a.f.b.a.getString("su");
                f.j.a.f.b.a.getString("ndd");
                java.lang.System.currentTimeMillis();
                try {
                    if (f.j.a.h.i.a.f10100j.booleanValue()) {
                        this.z = f.j.a.i.p.l.A(this.y);
                        trim = f.j.a.i.p.l.B(this.y);
                    } else {
                        this.z = this.r.getText().toString().trim();
                        trim = this.s.getText().toString().trim();
                    }
                    this.A = trim;
                    f.j.a.f.f.e(this, f.j.a.f.b.a.optString("su"));
                    this.e0 = i1(f.j.a.f.b.a.optString("su") + "*" + f.j.a.f.f.d(this) + "*" + f.j.a.f.b.b);
                    f.j.a.f.b.a.getString("sc").equalsIgnoreCase(this.e0);
                    this.I.putString(f.j.a.h.i.a.f10105o, f.j.a.f.f.a(this));
                    this.I.apply();
                    this.E.putString(f.j.a.h.i.a.f10105o, f.j.a.f.f.a(this));
                    this.E.putString("username", this.z);
                    this.E.apply();
                    m1(f.j.a.h.i.a.f10096f.booleanValue() ? this.X.toLowerCase() : this.X.toLowerCase());
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                }
            } catch (java.lang.Exception e3) {
                android.util.Log.e("Login check", e3.getMessage());
            }
        }
    }

    @android.annotation.SuppressLint({"ResourceType"})
    public final void k1() {
        android.widget.EditText editText;
        this.u = new android.widget.EditText(this);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.u.setPaddingRelative(35, 0, 35, 0);
        this.u.setLayoutParams(layoutParams);
        this.u.setText(getResources().getString(brstore.makro.app.R.string.app_name));
        this.u.setHintTextColor(getResources().getColor(brstore.makro.app.R.color.white));
        this.u.setTextColor(-1);
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.u.setNextFocusLeftId(brstore.makro.app.R.id.rl_list_users);
        } else {
            this.u.setNextFocusLeftId(brstore.makro.app.R.id.rl_connect_vpn);
        }
        this.u.setTextSize(22.0f);
        this.u.setId(101);
        this.u.setBackground(getResources().getDrawable(brstore.makro.app.R.drawable.selector_line_login_fieldss));
        this.u.setFocusable(true);
        this.u.setTypeface(android.graphics.Typeface.SANS_SERIF);
        this.u.setInputType(161);
        this.rl_name.addView(this.u);
        this.r = new android.widget.EditText(this);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.r.setPaddingRelative(35, 0, 35, 0);
        this.r.setLayoutParams(layoutParams2);
        if (f.j.a.h.i.a.f10101k.booleanValue()) {
            this.linearLayout.setGravity(16);
        }
        this.r.setHint(getResources().getString(brstore.makro.app.R.string.username));
        this.r.setHintTextColor(getResources().getColor(brstore.makro.app.R.color.white));
        this.r.setTextColor(-1);
        this.r.setTextSize(22.0f);
        this.r.setId(102);
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.r.setNextFocusLeftId(brstore.makro.app.R.id.rl_list_users);
        } else {
            this.r.setNextFocusLeftId(brstore.makro.app.R.id.rl_connect_vpn);
        }
        this.r.setFocusable(true);
        this.r.setBackground(getResources().getDrawable(brstore.makro.app.R.drawable.selector_line_login_fieldss));
        this.r.setTypeface(android.graphics.Typeface.SANS_SERIF);
        this.r.setInputType(161);
        this.rl_email.addView(this.r);
        this.s = new android.widget.EditText(this);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.s.setPaddingRelative(35, 0, 35, 0);
        this.s.setLayoutParams(layoutParams3);
        this.s.setHint(getResources().getString(brstore.makro.app.R.string.password));
        this.s.setHintTextColor(getResources().getColor(brstore.makro.app.R.color.white));
        this.s.setTextColor(-1);
        this.s.setTextSize(22.0f);
        this.s.setId(103);
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.s.setNextFocusLeftId(brstore.makro.app.R.id.rl_list_users);
        } else {
            this.s.setNextFocusLeftId(brstore.makro.app.R.id.rl_connect_vpn);
        }
        this.s.setBackground(getResources().getDrawable(brstore.makro.app.R.drawable.selector_line_login_fieldss));
        this.s.setFocusable(true);
        this.s.setTypeface(android.graphics.Typeface.SANS_SERIF);
        this.s.setInputType(129);
        this.rl_password.addView(this.s);
        this.eyepass.setId(110);
        this.eyepass.setFocusable(true);
        this.s.setNextFocusDownId(104);
        this.s.setNextFocusUpId(102);
        this.eyepass.setNextFocusDownId(104);
        this.eyepass.setNextFocusUpId(102);
        this.eyepass.setBackground(getResources().getDrawable(brstore.makro.app.R.drawable.selector_line_login_fieldss));
        this.eyepass.setOnClickListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.g());
        if (f.j.a.h.i.a.D.booleanValue()) {
            this.t = new android.widget.EditText(this);
            android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            this.t.setPaddingRelative(35, 0, 35, 0);
            this.t.setLayoutParams(layoutParams4);
            this.t.setHint(getResources().getString(brstore.makro.app.R.string.serverurl));
            this.t.setHintTextColor(getResources().getColor(brstore.makro.app.R.color.white));
            this.t.setTextColor(-1);
            this.t.setTextSize(22.0f);
            this.t.setId(104);
            this.t.setBackground(getResources().getDrawable(brstore.makro.app.R.drawable.selector_line_login_fieldss));
            this.t.setFocusable(true);
            this.t.setTypeface(android.graphics.Typeface.SANS_SERIF);
            this.t.setInputType(161);
            this.rl_server_url.addView(this.t);
        }
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.u.requestFocus();
            editText = this.u;
        } else {
            this.r.requestFocus();
            editText = this.r;
        }
        editText.requestFocusFromTouch();
    }

    public final void l1() {
        f.j.a.i.p.l.N("api", this.y);
        startActivity(new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.MultiUserActivity.class));
        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
        finish();
    }

    public final void m1(java.lang.String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.c0 = new java.util.ArrayList<>(java.util.Arrays.asList(str.split(",")));
        }
        java.util.ArrayList<java.lang.String> arrayList = this.c0;
        if (arrayList == null || arrayList.size() < 1) {
            java.util.ArrayList<java.lang.String> arrayList2 = this.c0;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            b();
            android.widget.Toast.makeText(this, this.y.getResources().getString(brstore.makro.app.R.string.please_check_portal), 0).show();
            return;
        }
        try {
            this.I.putString(f.j.a.h.i.a.f10105o, this.c0.get(0).trim());
            this.I.commit();
            this.c0.remove(0);
            this.x.h(this.z, this.A, this.c0);
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }

    public final void o1() {
        f.j.a.j.c cVar;
        java.lang.String str;
        this.z = this.r.getText().toString().trim();
        this.A = this.s.getText().toString().trim();
        this.Y = this.u.getText().toString().trim();
        this.I = this.H.edit();
        if (f.j.a.h.i.a.f10100j.booleanValue() || !c1()) {
            if (f.j.a.h.i.a.f10100j.booleanValue() && c1()) {
                f.j.a.i.p.l.J(this.y, this.z);
                a();
                this.Y = this.u.getText().toString().trim();
                new boxbr.apksrebrand.smarters.view.activity.LoginActivity.j().execute(new java.lang.Void[0]);
                return;
            }
            return;
        }
        a();
        if (f.j.a.h.i.a.f10094d.booleanValue()) {
            this.I.putString(f.j.a.h.i.a.f10105o, "http://qqtv.nl");
            this.I.apply();
            this.E.putString(f.j.a.h.i.a.f10105o, "http://qqtv.nl");
            this.E.putString("username", this.z);
            this.E.apply();
            if (f.j.a.h.i.a.f10096f.booleanValue()) {
                m1("http://qqtv.nl");
                this.G.putString("username", this.z);
                this.G.putString("password", this.A);
                this.G.putString("activationCode", "");
                this.G.putString("loginWith", "loginWithDetails");
                this.G.apply();
                this.I.apply();
            }
            cVar = this.x;
            str = this.z;
        } else {
            if (!f.j.a.h.i.a.D.booleanValue()) {
                new boxbr.apksrebrand.smarters.view.activity.LoginActivity.j().execute(new java.lang.Void[0]);
                this.G.putString("username", this.z);
                this.G.putString("password", this.A);
                this.G.putString("activationCode", "");
                this.G.putString("loginWith", "loginWithDetails");
                this.G.apply();
                this.I.apply();
            }
            java.lang.String lowerCase = this.t.getText().toString().trim().toLowerCase();
            this.B = lowerCase;
            this.I.putString(f.j.a.h.i.a.f10105o, lowerCase);
            this.I.apply();
            this.E.putString(f.j.a.h.i.a.f10105o, this.B);
            this.E.apply();
            cVar = this.x;
            str = this.z;
        }
        cVar.g(str, this.A);
        this.G.putString("username", this.z);
        this.G.putString("password", this.A);
        this.G.putString("activationCode", "");
        this.G.putString("loginWith", "loginWithDetails");
        this.G.apply();
        this.I.apply();
    }

    @Override // d.k.a.e, android.app.Activity
    public void onBackPressed() {
        if (f.j.a.h.i.a.f10097g.booleanValue()) {
            super.onBackPressed();
        } else {
            if (this.w) {
                super.onBackPressed();
                return;
            }
            this.w = true;
            android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.press_back_to_exit), 0).show();
            new android.os.Handler().postDelayed(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.h(), 2000L);
        }
    }

    @Override // d.a.k.c, d.k.a.e, d.h.h.e, android.app.Activity
    @android.annotation.SuppressLint({"RtlHardcoded"})
    public void onCreate(android.os.Bundle bundle) {
        android.widget.EditText editText;
        int i2;
        android.widget.EditText editText2;
        this.y = this;
        f.j.a.f.g.c = new f.j.a.f.g(this);
        super.onCreate(bundle);
        f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(this.y);
        this.k0 = aVar;
        setContentView(aVar.w().equals(f.j.a.h.i.a.i0) ? brstore.makro.app.R.layout.login_new_tv : brstore.makro.app.R.layout.login_new);
        butterknife.ButterKnife.a(this);
        if (!f.j.a.h.i.a.D.booleanValue()) {
            Z0();
            N0();
            f1();
            O0();
        }
        this.F = getSharedPreferences("sharedprefremberme", 0);
        d1();
        g1();
        b1();
        java.lang.String string = this.y.getSharedPreferences("selected_language", 0).getString("selected_language", "English");
        this.b0 = string;
        if (string.equalsIgnoreCase("Arabic")) {
            editText = this.s;
            i2 = 21;
        } else {
            editText = this.s;
            i2 = 19;
        }
        editText.setGravity(i2);
        (f.j.a.h.i.a.f10096f.booleanValue() ? this.u : this.r).requestFocus();
        android.widget.RelativeLayout relativeLayout = this.rl_connect_vpn;
        relativeLayout.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.k(relativeLayout));
        android.widget.RelativeLayout relativeLayout2 = this.rl_list_users;
        relativeLayout2.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.k(relativeLayout2));
        android.widget.RelativeLayout relativeLayout3 = this.rl_bt_submit;
        relativeLayout3.setOnFocusChangeListener(new boxbr.apksrebrand.smarters.view.activity.LoginActivity.k(relativeLayout3));
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.rl_bt_submit.setNextFocusLeftId(brstore.makro.app.R.id.rl_list_users);
            if (f.j.a.h.i.a.D.booleanValue() && (editText2 = this.t) != null) {
                editText2.setNextFocusLeftId(brstore.makro.app.R.id.rl_list_users);
            }
        } else {
            this.rl_bt_submit.setNextFocusLeftId(brstore.makro.app.R.id.rl_connect_vpn);
        }
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.rl_connect_vpn.setNextFocusRightId(brstore.makro.app.R.id.rl_list_users);
        } else {
            this.rl_connect_vpn.setNextFocusRightId(brstore.makro.app.R.id.rl_bt_submit);
        }
        this.rl_list_users.setNextFocusRightId(brstore.makro.app.R.id.rl_bt_submit);
        f.j.a.k.h.b.a(this.s);
        this.r.setFilters(new android.text.InputFilter[]{l0});
        java.lang.String action = getIntent().getAction();
        this.i0 = action;
        if (action == null || !action.equalsIgnoreCase("login_perform")) {
            return;
        }
        this.r.setText(f.j.a.i.p.l.A(this.y));
        this.s.setText(f.j.a.i.p.l.B(this.y));
        if (f.j.a.h.i.a.f10096f.booleanValue()) {
            this.u.setText("Free Trial");
        }
        this.rl_bt_submit.performClick();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, android.view.KeyEvent keyEvent) {
        if (i2 != 19) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // d.k.a.e, android.app.Activity
    public void onResume() {
        super.onResume();
        f.j.a.h.i.e.f(this.y);
        overridePendingTransition(brstore.makro.app.R.anim.fade_out, brstore.makro.app.R.anim.fade_in);
    }

    @Override // f.j.a.f.c
    public void p(int i2) {
        if (this.y != null) {
            b();
            android.widget.Toast.makeText(this, this.y.getResources().getString(brstore.makro.app.R.string.could_not_connect), 0).show();
        }
    }

    @Override // f.j.a.k.f.f
    public void x(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            b();
            if (f.j.a.h.i.a.f10094d.booleanValue()) {
                android.widget.Toast.makeText(this, getResources().getString(brstore.makro.app.R.string.invalid_detail), 0).show();
                return;
            } else {
                f.j.a.h.i.e.j0(this.y, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.I.putString(f.j.a.h.i.a.f10105o, arrayList.get(0).trim());
            this.I.apply();
            arrayList.remove(0);
            this.x.h(this.z, this.A, arrayList);
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }
}
