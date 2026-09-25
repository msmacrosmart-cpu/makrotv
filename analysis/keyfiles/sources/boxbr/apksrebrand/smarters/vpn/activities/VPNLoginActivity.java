package boxbr.apksrebrand.smarters.vpn.activities;

/* loaded from: classes.dex */
public class VPNLoginActivity extends d.a.k.c {
    public java.lang.String A;
    public java.lang.String B;
    public android.content.Intent E;

    @butterknife.BindView
    public android.widget.Button btn_back;

    @butterknife.BindView
    public android.widget.Button btn_connect;

    @butterknife.BindView
    public android.widget.Button btn_save;

    @butterknife.BindView
    public android.widget.EditText et_password;

    @butterknife.BindView
    public android.widget.EditText et_username;

    @butterknife.BindView
    public android.widget.ImageView iv_spinner_down;

    @butterknife.BindView
    public android.widget.LinearLayout password_p;
    public android.content.Context r;
    public java.util.List<java.io.File> s;

    @butterknife.BindView
    public android.widget.Spinner spinner_server;
    public f.j.a.l.a.d t;
    public java.lang.String u;

    @butterknife.BindView
    public android.widget.LinearLayout username_p;
    public java.lang.String v;
    public java.lang.String w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;
    public java.lang.String C = "";
    public int D = 0;
    public java.lang.String F = "";

    /* loaded from: classes.dex */
    public class a implements android.widget.AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j2) {
            ((android.widget.TextView) boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.spinner_server.getSelectedView()).setTextColor(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.getResources().getColor(brstore.makro.app.R.color.White));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements f.j.a.l.a.d.a {
        public b() {
        }

        @Override // f.j.a.l.a.d.a
        public void a() {
            f.j.a.l.e.b bVar = new f.j.a.l.e.b();
            bVar.f(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.x);
            bVar.d(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.y);
            bVar.e(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.z);
            bVar.l(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.u);
            bVar.h(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.v);
        }

        @Override // f.j.a.l.a.d.a
        public void b(java.lang.String str) {
            android.widget.Toast.makeText(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.r, boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.getResources().getString(brstore.makro.app.R.string.failed_import), 0).show();
        }
    }

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class c extends android.os.AsyncTask<java.lang.Boolean, java.lang.Void, java.lang.Boolean> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean doInBackground(java.lang.Boolean... boolArr) {
            return boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.R0();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.lang.Boolean bool) {
            super.onPostExecute(bool);
            f.j.a.h.i.e.H();
            if (bool.booleanValue()) {
                boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.X0();
            } else {
                android.widget.Toast.makeText(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.r, boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.getResources().getString(brstore.makro.app.R.string.list_not_found), 0).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            f.j.a.h.i.e.h0(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.this.r);
        }
    }

    /* loaded from: classes.dex */
    public class d extends android.widget.ArrayAdapter<java.util.List<java.io.File>> {
        public java.util.List<java.io.File> b;

        public d(boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity vPNLoginActivity, android.content.Context context, int i2, java.util.List<java.io.File> list) {
            super(context, i2, java.util.Collections.singletonList(list));
            this.b = list;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.List<java.io.File> getItem(int i2) {
            return this.b;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return this.b.size();
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int i2, android.view.View view, @org.jetbrains.annotations.NotNull android.view.ViewGroup viewGroup) {
            android.widget.TextView textView = (android.widget.TextView) super.getDropDownView(i2, view, viewGroup);
            textView.setTextColor(org.achartengine.renderer.DefaultRenderer.BACKGROUND_COLOR);
            java.lang.String name = this.b.get(i2).getName();
            if (name != null && name.endsWith(".ovpn")) {
                name = name.replaceAll(".ovpn", "");
            }
            textView.setText(name);
            return textView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @org.jetbrains.annotations.NotNull
        public android.view.View getView(int i2, android.view.View view, @org.jetbrains.annotations.NotNull android.view.ViewGroup viewGroup) {
            android.widget.TextView textView = (android.widget.TextView) super.getView(i2, view, viewGroup);
            textView.setTextColor(org.achartengine.renderer.DefaultRenderer.BACKGROUND_COLOR);
            java.lang.String name = this.b.get(i2).getName();
            textView.setText((name == null || !name.endsWith(".ovpn")) ? this.b.get(i2).getName() : name.replaceAll(".ovpn", ""));
            return textView;
        }
    }

    public void P0(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        try {
            if (file.exists()) {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                java.lang.String str3 = "";
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str3 = (str3 + readLine) + "\n";
                }
                if (str3.contains("\n")) {
                    java.lang.String[] split = str3.split("\n");
                    if (split.length == 2) {
                        this.u = split[0];
                        this.v = split[1];
                        if (str2.equals("connect")) {
                            U0();
                        } else {
                            W0();
                        }
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.d("", "" + e2);
        }
    }

    public final void Q0() {
        android.content.Context context;
        android.content.res.Resources resources;
        int i2;
        java.lang.String str;
        java.lang.String str2;
        new f.j.a.l.c.a(this.r);
        this.u = this.et_username.getText().toString();
        this.v = this.et_password.getText().toString();
        this.F = "connect";
        if (this.A.equals("typeovpn")) {
            str2 = this.B;
        } else {
            if (!this.C.endsWith(".ovpn")) {
                java.lang.String str3 = this.u;
                if (str3 != null && str3.trim().isEmpty() && (str = this.v) != null && str.trim().isEmpty()) {
                    T0(this.F);
                    return;
                }
                java.lang.String str4 = this.u;
                if (str4 == null || !str4.trim().isEmpty()) {
                    java.lang.String str5 = this.v;
                    if (str5 != null && str5.trim().isEmpty()) {
                        context = this.r;
                        resources = getResources();
                        i2 = brstore.makro.app.R.string.please_enter_password;
                    }
                    U0();
                }
                context = this.r;
                resources = getResources();
                i2 = brstore.makro.app.R.string.please_enter_username;
                android.widget.Toast.makeText(context, resources.getString(i2), 0).show();
                return;
            }
            str2 = this.C;
        }
        this.y = str2;
        U0();
    }

    public java.lang.Boolean R0() {
        try {
            this.s = new java.util.ArrayList();
            new java.util.ArrayList();
            if (this.C == null || this.C.isEmpty()) {
                return java.lang.Boolean.FALSE;
            }
            java.io.File[] listFiles = new java.io.File(this.C).listFiles();
            if (this.A.equals("typeovpn")) {
                this.s.add(new java.io.File(this.C));
                return java.lang.Boolean.TRUE;
            }
            if (this.C.endsWith(".ovpn")) {
                this.s.add(new java.io.File(this.C));
                return java.lang.Boolean.TRUE;
            }
            if (listFiles == null || listFiles.length <= 0) {
                return java.lang.Boolean.FALSE;
            }
            for (java.io.File file : listFiles) {
                if (file.getName().endsWith(".ovpn")) {
                    this.s.add(file);
                }
            }
            return (this.s == null || this.s.size() <= 0) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    public void S0(java.io.Reader reader, java.lang.String str) {
        java.lang.String readLine;
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
        while (true) {
            try {
                try {
                    readLine = bufferedReader.readLine();
                } catch (java.io.IOException e2) {
                    e2.printStackTrace();
                }
                if (readLine == null) {
                    return;
                }
                if (readLine.startsWith("auth-user-pass") && readLine.contains(" ")) {
                    java.lang.String[] split = readLine.split(" ");
                    if (split.length == 2) {
                        java.lang.String str2 = split[0];
                        P0(this.x.replaceAll(this.y, split[1]), str);
                    }
                }
            } catch (java.lang.Exception unused) {
                return;
            }
        }
    }

    public final void T0(java.lang.String str) {
        if (this.s.size() != 0) {
            this.x = this.s.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
            this.y = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
            try {
                S0(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(this.x)))), str);
            } catch (java.io.FileNotFoundException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void U0() {
        if (this.s.size() != 0) {
            this.y = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
            this.z = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
            if (this.A.equals("typeovpn")) {
                java.lang.String name = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
                this.y = name;
                if (!name.startsWith("http://")) {
                    Y0();
                }
            } else {
                this.x = this.s.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
                this.y = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
                this.z = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
            }
            java.lang.String str = this.y;
            if (str != null && str.contains(".ovpn")) {
                this.y = this.y.replaceAll(".ovpn", "");
            }
            try {
                f.j.a.l.a.d dVar = new f.j.a.l.a.d(this, new java.io.FileInputStream(new java.io.File(this.x)), this.y, this.x, this.z, new boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.b());
                this.t = dVar;
                dVar.execute(new java.lang.Void[0]);
            } catch (java.io.FileNotFoundException e2) {
                android.widget.Toast.makeText(this.r, "" + e2, 0).show();
                e2.printStackTrace();
            } catch (java.lang.Exception e3) {
                android.widget.Toast.makeText(this.r, "" + e3, 0).show();
            }
        }
    }

    public final void V0() {
        android.content.Context context;
        android.content.res.Resources resources;
        int i2;
        java.lang.String str;
        new f.j.a.l.c.a(this.r);
        this.u = this.et_username.getText().toString();
        this.v = this.et_password.getText().toString();
        this.F = "save";
        java.util.List<java.io.File> list = this.s;
        if (list != null && list.size() > 0) {
            this.x = this.s.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
            this.y = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
            this.z = this.s.get(this.spinner_server.getSelectedItemPosition()).getName();
        }
        java.lang.String str2 = this.u;
        if (str2 != null && str2.trim().isEmpty() && (str = this.v) != null && str.trim().isEmpty()) {
            T0(this.F);
            return;
        }
        java.lang.String str3 = this.u;
        if (str3 == null || !str3.trim().isEmpty()) {
            java.lang.String str4 = this.v;
            if (str4 != null && str4.trim().isEmpty()) {
                context = this.r;
                resources = getResources();
                i2 = brstore.makro.app.R.string.please_enter_password;
            } else if (this.x != null) {
                W0();
                return;
            } else {
                context = this.r;
                resources = getResources();
                i2 = brstore.makro.app.R.string.please_add_server;
            }
        } else {
            context = this.r;
            resources = getResources();
            i2 = brstore.makro.app.R.string.please_enter_username;
        }
        android.widget.Toast.makeText(context, resources.getString(i2), 0).show();
    }

    public final void W0() {
        java.util.List<java.io.File> list = this.s;
        if (list == null || list.size() <= 0) {
            return;
        }
        f.j.a.l.e.b bVar = new f.j.a.l.e.b();
        bVar.f(this.x);
        java.lang.String str = this.y;
        if (str != null && str.endsWith(".ovpn")) {
            this.y = this.y.replaceAll(".ovpn", "");
        }
        bVar.d(this.y);
        bVar.e(this.z);
        bVar.l(this.u);
        bVar.h(this.v);
        bVar.k(-1);
        try {
            if (this.w == null || !this.w.equalsIgnoreCase("vpneditprofile")) {
                return;
            }
            bVar.g(this.D);
        } catch (java.lang.Exception e2) {
            android.widget.Toast.makeText(this.r, "" + e2, 0).show();
        }
    }

    public final void X0() {
        this.spinner_server.setAdapter((android.widget.SpinnerAdapter) new boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.d(this, this, brstore.makro.app.R.layout.spinner_list_item, this.s));
        java.lang.String str = this.w;
        if (str == null || !str.equalsIgnoreCase("vpneditprofile") || this.x == null) {
            return;
        }
        java.io.File file = new java.io.File(this.x);
        if (file.exists()) {
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                if (this.s.get(i2).getAbsolutePath().equals(file.getAbsolutePath())) {
                    this.spinner_server.setSelection(i2);
                    return;
                }
            }
        }
    }

    public void Y0() {
        try {
            Z0(g.a.a.c.u.g(this).j(this.y));
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public void Z0(g.a.a.a aVar) {
        f.j.a.h.i.a.H = this.v;
        f.j.a.h.i.a.G = this.u;
        f.j.a.h.i.a.E = this.D;
        java.lang.String str = this.y;
        if (str != null && str.contains(".ovpn")) {
            this.y = this.y.replaceAll(".ovpn", "");
        }
        f.j.a.h.i.a.F = this.y;
        f.j.a.h.i.a.I = this.x;
        f.j.a.h.i.a.E = this.D;
        android.content.Intent intent = new android.content.Intent(this.r, (java.lang.Class<?>) de.blinkt.openvpn.LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", aVar.F().toString());
        intent.setAction("android.intent.action.MAIN");
        startActivity(intent);
        finish();
    }

    public void a1() {
        new boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.c().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Boolean[0]);
    }

    @Override // d.k.a.e, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) boxbr.apksrebrand.smarters.vpn.activities.ProfileActivity.class);
        intent.putExtra("typeid", this.A);
        startActivity(intent);
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r8.exists() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0086, code lost:
    
        if (r8.exists() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0088, code lost:
    
        r8 = r8.getParent();
     */
    @Override // d.a.k.c, d.k.a.e, d.h.h.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: boxbr.apksrebrand.smarters.vpn.activities.VPNLoginActivity.onCreate(android.os.Bundle):void");
    }

    @butterknife.OnClick
    public void onclick(android.view.View view) {
        switch (view.getId()) {
            case brstore.makro.app.R.id.btn_back /* 2131362042 */:
                onBackPressed();
                return;
            case brstore.makro.app.R.id.btn_connect /* 2131362050 */:
                Q0();
                return;
            case brstore.makro.app.R.id.btn_save /* 2131362077 */:
                V0();
                return;
            case brstore.makro.app.R.id.ll_import_certificate /* 2131362710 */:
                android.content.Intent intent = new android.content.Intent(this.r, (java.lang.Class<?>) boxbr.apksrebrand.smarters.vpn.activities.ImportVPNActivity.class);
                this.E = intent;
                intent.putExtra("typeid", this.A);
                startActivity(this.E);
                finish();
                return;
            default:
                return;
        }
    }
}
