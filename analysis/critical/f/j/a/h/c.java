package f.j.a.h;

/* loaded from: classes.dex */
public class c {
    public java.lang.String a;
    public android.content.Context b;

    /* renamed from: f, reason: collision with root package name */
    public f.j.a.h.c.j f9993f;

    /* renamed from: g, reason: collision with root package name */
    public f.j.a.k.b.e f9994g;

    /* renamed from: h, reason: collision with root package name */
    public f.j.a.k.b.g f9995h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f9996i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f9997j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.Button f9998k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.Button f9999l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f10000m;

    /* renamed from: o, reason: collision with root package name */
    public boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight f10002o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f10003p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.AlertDialog.Builder f10004q;
    public android.app.AlertDialog r;
    public java.io.File s;
    public java.lang.String c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<java.lang.String> f9991d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List<java.lang.String> f9992e = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashMap<java.lang.String, java.lang.String> f10001n = new java.util.HashMap<>();
    public java.lang.String t = "";

    /* loaded from: classes.dex */
    public class a implements android.content.DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i2) {
            if (f.j.a.h.c.this.f9993f != null) {
                f.j.a.h.c.this.f9993f.a(f.j.a.h.c.this.t);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements android.widget.AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j2) {
            f.j.a.h.c.this.f9998k.setVisibility(0);
            f.j.a.h.c.this.f9997j.setVisibility(0);
            f.j.a.h.c.this.s = new java.io.File((java.lang.String) f.j.a.h.c.this.f9992e.get(i2));
            if (f.j.a.h.c.this.s == null || !f.j.a.h.c.this.s.isFile()) {
                f.j.a.h.c cVar = f.j.a.h.c.this;
                cVar.c = cVar.s.getName();
                f.j.a.h.c cVar2 = f.j.a.h.c.this;
                cVar2.t = cVar2.s.getPath();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.clear();
                if (f.j.a.h.c.this.c.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    f.j.a.h.c cVar3 = f.j.a.h.c.this;
                    cVar3.C(cVar3.s);
                    return;
                }
                arrayList.add(f.j.a.h.c.this.s.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                if (f.j.a.h.c.this.s.list() != null) {
                    int i3 = 0;
                    while (true) {
                        java.lang.String[] list = f.j.a.h.c.this.s.list();
                        list.getClass();
                        if (i3 >= list.length) {
                            break;
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(f.j.a.h.c.this.s.getPath());
                        sb.append("/");
                        java.lang.String[] list2 = f.j.a.h.c.this.s.list();
                        list2.getClass();
                        sb.append(list2[i3]);
                        if (new java.io.File(sb.toString()).isDirectory()) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(f.j.a.h.c.this.s.getPath());
                            sb2.append("/");
                            java.lang.String[] list3 = f.j.a.h.c.this.s.list();
                            list3.getClass();
                            sb2.append(list3[i3]);
                            arrayList.add(sb2.toString());
                        }
                        i3++;
                    }
                }
                f.j.a.h.c.this.f9992e.clear();
                f.j.a.h.c.this.f9992e.addAll(arrayList);
                f.j.a.h.c.this.f9995h.notifyDataSetChanged();
                f.j.a.h.c.this.f10002o.setSelection(0);
                if (f.j.a.h.c.this.f10002o != null) {
                    f.j.a.h.c.this.f10002o.requestFocus();
                }
            }
        }
    }

    /* renamed from: f.j.a.h.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnShowListenerC0258c implements android.content.DialogInterface.OnShowListener {

        /* renamed from: f.j.a.h.c$c$a */
        /* loaded from: classes.dex */
        public class a implements android.view.View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                f.j.a.h.c.this.r.dismiss();
            }
        }

        /* renamed from: f.j.a.h.c$c$b */
        /* loaded from: classes.dex */
        public class b implements android.view.View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (f.j.a.h.c.this.f9992e == null || f.j.a.h.c.this.f9992e.get(0) == null) {
                    return;
                }
                f.j.a.h.c.this.C(new java.io.File((java.lang.String) f.j.a.h.c.this.f9992e.get(0)));
            }
        }

        public DialogInterfaceOnShowListenerC0258c() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            f.j.a.h.c cVar = f.j.a.h.c.this;
            cVar.f9996i = cVar.r.getButton(-2);
            f.j.a.h.c cVar2 = f.j.a.h.c.this;
            cVar2.f9997j = cVar2.r.getButton(-1);
            f.j.a.h.c cVar3 = f.j.a.h.c.this;
            cVar3.f9998k = cVar3.r.getButton(-3);
            if (f.j.a.h.c.this.s == null || f.j.a.h.c.this.s.getParent() == null || f.j.a.h.c.this.s.getParent().equals("/storage/emulated/0")) {
                f.j.a.h.c.this.f9998k.setVisibility(4);
                f.j.a.h.c.this.f9997j.setVisibility(4);
            } else {
                f.j.a.h.c.this.f9998k.setVisibility(0);
                f.j.a.h.c.this.f9997j.setVisibility(0);
            }
            f.j.a.h.c.this.f9996i.setTag("1");
            f.j.a.h.c.this.f9997j.setTag("2");
            f.j.a.h.c.this.f9998k.setTag("3");
            android.widget.Button button = f.j.a.h.c.this.f9996i;
            f.j.a.h.c cVar4 = f.j.a.h.c.this;
            button.setOnFocusChangeListener(new f.j.a.h.c.k(cVar4.f9996i));
            f.j.a.h.c.this.f9996i.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9996i.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9997j.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9998k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.c.this.b).w();
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.c.this.f9996i.setTextSize(16.0f);
                f.j.a.h.c.this.f9996i.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.j.a.h.c.this.f9996i.setTextSize(14.0f);
                f.j.a.h.c.this.f9996i.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            f.j.a.h.c.this.f9996i.setOnClickListener(new f.j.a.h.c.DialogInterfaceOnShowListenerC0258c.a());
            f.j.a.h.c.this.f9998k.setOnClickListener(new f.j.a.h.c.DialogInterfaceOnShowListenerC0258c.b());
            android.widget.Button button2 = f.j.a.h.c.this.f9997j;
            f.j.a.h.c cVar5 = f.j.a.h.c.this;
            button2.setOnFocusChangeListener(new f.j.a.h.c.k(cVar5.f9997j));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.c.this.f9997j.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                f.j.a.h.c.this.f9997j.setTextSize(16.0f);
                f.j.a.h.c.this.f9997j.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.j.a.h.c.this.f9997j.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                f.j.a.h.c.this.f9997j.setTextSize(14.0f);
                f.j.a.h.c.this.f9997j.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            android.widget.Button button3 = f.j.a.h.c.this.f9998k;
            f.j.a.h.c cVar6 = f.j.a.h.c.this;
            button3.setOnFocusChangeListener(new f.j.a.h.c.k(cVar6.f9998k));
            f.j.a.h.c.this.f9998k.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.c.this.f9998k.setTextSize(16.0f);
                f.j.a.h.c.this.f9998k.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
                return;
            }
            f.j.a.h.c.this.f9998k.setTextSize(14.0f);
            f.j.a.h.c.this.f9998k.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
            marginLayoutParams3.width = 255;
            marginLayoutParams3.height = 135;
        }
    }

    /* loaded from: classes.dex */
    public class d implements android.content.DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i2) {
            if (f.j.a.h.c.this.f9993f != null) {
                f.j.a.h.c.this.f9993f.a(f.j.a.h.c.this.c);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements android.widget.AdapterView.OnItemClickListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j2) {
            f.j.a.h.c cVar;
            java.lang.StringBuilder sb;
            java.lang.String str;
            java.lang.String sb2;
            if (((java.lang.String) f.j.a.h.c.this.f9992e.get(i2)).equals("Internal Storage")) {
                cVar = f.j.a.h.c.this;
                sb2 = "/emulated/0";
            } else {
                if (f.j.a.h.c.this.f9992e.get(i2) != null && i2 == 0 && ((java.lang.String) f.j.a.h.c.this.f9992e.get(i2)).equals("..")) {
                    f.j.a.h.c.this.f9998k.performClick();
                    f.j.a.h.c.this.L();
                }
                if (f.j.a.h.c.this.f10001n == null) {
                    cVar = f.j.a.h.c.this;
                    sb = new java.lang.StringBuilder();
                } else if (f.j.a.h.c.this.f10001n.get(f.j.a.h.c.this.f9992e.get(i2)) == null || ((java.lang.String) f.j.a.h.c.this.f10001n.get(f.j.a.h.c.this.f9992e.get(i2))).equals("")) {
                    cVar = f.j.a.h.c.this;
                    sb = new java.lang.StringBuilder();
                } else {
                    cVar = f.j.a.h.c.this;
                    sb = new java.lang.StringBuilder();
                    sb.append("/");
                    sb.append((java.lang.String) f.j.a.h.c.this.f10001n.get(f.j.a.h.c.this.f9992e.get(i2)));
                    sb.append("/Android/data/");
                    str = "boxbr.apksrebrand.smarters";
                    sb.append(str);
                    sb2 = sb.toString();
                }
                sb.append("/");
                str = (java.lang.String) f.j.a.h.c.this.f9992e.get(i2);
                sb.append(str);
                sb2 = sb.toString();
            }
            f.j.a.h.c.y(cVar, sb2);
            f.j.a.h.c.this.L();
        }
    }

    /* loaded from: classes.dex */
    public class f implements android.content.DialogInterface.OnShowListener {

        /* loaded from: classes.dex */
        public class a implements android.view.View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                f.j.a.h.c cVar;
                java.io.File file;
                if (f.j.a.h.c.this.c.equals(f.j.a.h.c.this.a)) {
                    return;
                }
                if (!f.j.a.h.c.this.c.equals("/storage/emulated/0")) {
                    f.j.a.h.c.this.c = new java.io.File(f.j.a.h.c.this.c).getParent();
                    java.lang.String[] split = f.j.a.h.c.this.c.split("/");
                    if (split.length >= 3) {
                        if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (f.j.a.h.c.this.c.equals("/storage/" + split[2] + "/Android/data")) {
                                f.j.a.h.c.this.c = "/storage/" + split[2];
                                cVar = f.j.a.h.c.this;
                                file = new java.io.File(f.j.a.h.c.this.c);
                            }
                        }
                        if (new java.io.File(f.j.a.h.c.this.c).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            f.j.a.h.c.this.c = "/storage/" + split[2] + "/Android/data/boxbr.apksrebrand.smarters";
                        }
                    }
                    f.j.a.h.c.this.L();
                }
                f.j.a.h.c.this.c = "/storage/emulated";
                cVar = f.j.a.h.c.this;
                file = new java.io.File(f.j.a.h.c.this.c);
                cVar.c = file.getParent();
                f.j.a.h.c.this.L();
            }
        }

        public f() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            f.j.a.h.c cVar = f.j.a.h.c.this;
            cVar.f9996i = cVar.r.getButton(-2);
            f.j.a.h.c cVar2 = f.j.a.h.c.this;
            cVar2.f9997j = cVar2.r.getButton(-1);
            f.j.a.h.c cVar3 = f.j.a.h.c.this;
            cVar3.f9998k = cVar3.r.getButton(-3);
            if (f.j.a.h.c.this.c.equals(f.j.a.h.c.this.a)) {
                f.j.a.h.c.this.f9998k.setVisibility(4);
                f.j.a.h.c.this.f9997j.setVisibility(8);
            } else {
                f.j.a.h.c.this.f9998k.setVisibility(0);
                f.j.a.h.c.this.f9997j.setVisibility(0);
            }
            f.j.a.h.c.this.f9996i.setTag("1");
            f.j.a.h.c.this.f9997j.setTag("2");
            f.j.a.h.c.this.f9998k.setTag("3");
            android.widget.Button button = f.j.a.h.c.this.f9996i;
            f.j.a.h.c cVar4 = f.j.a.h.c.this;
            button.setOnFocusChangeListener(new f.j.a.h.c.k(cVar4.f9996i));
            f.j.a.h.c.this.f9996i.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9996i.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9997j.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9998k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.c.this.b).w();
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.c.this.f9996i.setTextSize(16.0f);
                f.j.a.h.c.this.f9996i.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.j.a.h.c.this.f9996i.setTextSize(14.0f);
                f.j.a.h.c.this.f9996i.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                marginLayoutParams.width = 250;
                marginLayoutParams.height = 110;
            }
            android.widget.Button button2 = f.j.a.h.c.this.f9997j;
            f.j.a.h.c cVar5 = f.j.a.h.c.this;
            button2.setOnFocusChangeListener(new f.j.a.h.c.k(cVar5.f9997j));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.c.this.f9997j.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                f.j.a.h.c.this.f9997j.setTextSize(16.0f);
                f.j.a.h.c.this.f9997j.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.j.a.h.c.this.f9997j.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                f.j.a.h.c.this.f9997j.setTextSize(14.0f);
                f.j.a.h.c.this.f9997j.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
            android.widget.Button button3 = f.j.a.h.c.this.f9998k;
            f.j.a.h.c cVar6 = f.j.a.h.c.this;
            button3.setOnFocusChangeListener(new f.j.a.h.c.k(cVar6.f9998k));
            f.j.a.h.c.this.f9998k.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.c.this.f9998k.setTextSize(16.0f);
                f.j.a.h.c.this.f9998k.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
            } else {
                f.j.a.h.c.this.f9998k.setTextSize(14.0f);
                f.j.a.h.c.this.f9998k.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
                marginLayoutParams3.width = 250;
                marginLayoutParams3.height = 110;
            }
            f.j.a.h.c.this.f9998k.setOnClickListener(new f.j.a.h.c.f.a());
        }
    }

    /* loaded from: classes.dex */
    public class g implements android.content.DialogInterface.OnKeyListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface dialogInterface, int i2, android.view.KeyEvent keyEvent) {
            f.j.a.h.c cVar;
            java.io.File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (f.j.a.h.c.this.c.equals(f.j.a.h.c.this.a)) {
                f.j.a.h.c.this.r.dismiss();
                return true;
            }
            if (!f.j.a.h.c.this.c.equals("/storage/emulated/0")) {
                f.j.a.h.c.this.c = new java.io.File(f.j.a.h.c.this.c).getParent();
                java.lang.String[] split = f.j.a.h.c.this.c.split("/");
                if (split.length >= 3) {
                    if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (f.j.a.h.c.this.c.equals("/storage/" + split[2] + "/Android/data")) {
                            f.j.a.h.c.this.c = "/storage/" + split[2];
                            cVar = f.j.a.h.c.this;
                            file = new java.io.File(f.j.a.h.c.this.c);
                        }
                    }
                    if (new java.io.File(f.j.a.h.c.this.c).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        f.j.a.h.c.this.c = "/storage/" + split[2] + "/Android/data/boxbr.apksrebrand.smarters";
                    }
                }
                f.j.a.h.c.this.L();
                return true;
            }
            f.j.a.h.c.this.c = "/storage/emulated";
            cVar = f.j.a.h.c.this;
            file = new java.io.File(f.j.a.h.c.this.c);
            cVar.c = file.getParent();
            f.j.a.h.c.this.L();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements java.util.Comparator<java.lang.String> {
        public h(f.j.a.h.c cVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes.dex */
    public class i implements android.view.View.OnClickListener {

        /* loaded from: classes.dex */
        public class a implements android.content.DialogInterface.OnClickListener {
            public final /* synthetic */ android.widget.EditText b;

            public a(android.widget.EditText editText) {
                this.b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i2) {
                android.content.Context context;
                java.lang.StringBuilder sb;
                f.j.a.h.c cVar;
                java.io.File file;
                java.lang.String obj = this.b.getText().toString();
                if (android.os.Build.VERSION.SDK_INT < 30) {
                    if (f.j.a.h.c.this.H(f.j.a.h.c.this.c + "/" + obj)) {
                        f.j.a.h.c.y(f.j.a.h.c.this, "/" + obj);
                        f.j.a.h.c.this.L();
                        return;
                    }
                    context = f.j.a.h.c.this.b;
                    sb = new java.lang.StringBuilder();
                    sb.append(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.failed_to_create));
                    sb.append("'");
                } else if (f.j.a.h.c.this.t.equals("") || f.j.a.h.c.this.t.equals("/storage/emulated/0/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    if (f.j.a.h.c.this.H(new java.io.File("/storage/emulated/0/" + obj).toString())) {
                        cVar = f.j.a.h.c.this;
                        file = new java.io.File("/storage/emulated/0/" + obj);
                        cVar.C(file);
                        return;
                    }
                    context = f.j.a.h.c.this.b;
                    sb = new java.lang.StringBuilder();
                    sb.append(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.failed_to_create));
                    sb.append(" '");
                } else if (f.j.a.h.c.this.t.contains("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    f.j.a.h.c cVar2 = f.j.a.h.c.this;
                    cVar2.t = cVar2.t.replace("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#", "");
                    if (f.j.a.h.c.this.H(f.j.a.h.c.this.t + "/" + obj)) {
                        cVar = f.j.a.h.c.this;
                        file = new java.io.File(f.j.a.h.c.this.t + "/" + obj);
                        cVar.C(file);
                        return;
                    }
                    context = f.j.a.h.c.this.b;
                    sb = new java.lang.StringBuilder();
                    sb.append(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.failed_to_create));
                    sb.append(" '");
                } else {
                    if (f.j.a.h.c.this.H(f.j.a.h.c.this.t + "/" + obj)) {
                        cVar = f.j.a.h.c.this;
                        file = new java.io.File(f.j.a.h.c.this.t + "/" + obj);
                        cVar.C(file);
                        return;
                    }
                    context = f.j.a.h.c.this.b;
                    sb = new java.lang.StringBuilder();
                    sb.append(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.failed_to_create));
                    sb.append(" '");
                }
                sb.append(obj);
                sb.append("' ");
                sb.append(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.folder));
                android.widget.Toast.makeText(context, sb.toString(), 0).show();
            }
        }

        /* loaded from: classes.dex */
        public class b implements android.content.DialogInterface.OnShowListener {
            public final /* synthetic */ android.app.AlertDialog a;

            public b(android.app.AlertDialog alertDialog) {
                this.a = alertDialog;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface dialogInterface) {
                f.j.a.h.c.this.f10000m = this.a.getButton(-3);
                f.j.a.h.c.this.f9999l = this.a.getButton(-1);
                f.j.a.h.c.this.f10000m.setTag("4");
                f.j.a.h.c.this.f9999l.setTag("5");
                android.widget.Button button = f.j.a.h.c.this.f10000m;
                f.j.a.h.c cVar = f.j.a.h.c.this;
                button.setOnFocusChangeListener(new f.j.a.h.c.k(cVar.f10000m));
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f10000m.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.c.this.f9999l.getLayoutParams();
                marginLayoutParams.setMargins(70, 0, 0, 0);
                marginLayoutParams2.setMargins(0, 0, 70, 0);
                java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.c.this.b).w();
                if (w.equals(f.j.a.h.i.a.i0)) {
                    f.j.a.h.c.this.f10000m.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                    f.j.a.h.c.this.f10000m.setTextSize(16.0f);
                    f.j.a.h.c.this.f10000m.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                    marginLayoutParams.width = 230;
                    marginLayoutParams.height = 70;
                } else {
                    f.j.a.h.c.this.f10000m.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                    f.j.a.h.c.this.f10000m.setTextSize(14.0f);
                    f.j.a.h.c.this.f10000m.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                    marginLayoutParams.width = 250;
                    marginLayoutParams.height = 110;
                }
                android.widget.Button button2 = f.j.a.h.c.this.f9999l;
                f.j.a.h.c cVar2 = f.j.a.h.c.this;
                button2.setOnFocusChangeListener(new f.j.a.h.c.k(cVar2.f9999l));
                f.j.a.h.c.this.f9999l.setTextColor(f.j.a.h.c.this.b.getResources().getColor(brstore.makro.app.R.color.white));
                if (w.equals(f.j.a.h.i.a.i0)) {
                    f.j.a.h.c.this.f9999l.setTextSize(16.0f);
                    f.j.a.h.c.this.f9999l.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                    marginLayoutParams2.width = 230;
                    marginLayoutParams2.height = 70;
                    return;
                }
                f.j.a.h.c.this.f9999l.setTextSize(14.0f);
                f.j.a.h.c.this.f9999l.setBackground(f.j.a.h.c.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
        }

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.widget.EditText editText = new android.widget.EditText(f.j.a.h.c.this.b);
            editText.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 100));
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(f.j.a.h.c.this.b, brstore.makro.app.R.style.AlertDialogCustom);
            builder.setTitle(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.new_folder_name)).setView(editText).setPositiveButton(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.set_ok), new f.j.a.h.c.i.a(editText)).setNeutralButton(f.j.a.h.c.this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            android.app.AlertDialog create = builder.create();
            create.setOnShowListener(new f.j.a.h.c.i.b(create));
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setLayout(750, 350);
                create.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(java.lang.String str);
    }

    /* loaded from: classes.dex */
    public class k implements android.view.View.OnFocusChangeListener {
        public final android.view.View b;

        public k(android.view.View view) {
            this.b = view;
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
            if (z) {
                android.view.View view2 = this.b;
                if (view2 == null || view2.getTag() == null || !this.b.getTag().equals("6")) {
                    r4 = z ? 1.12f : 1.0f;
                    a(r4);
                    b(r4);
                    android.view.View view3 = this.b;
                    if (view3 != null && view3.getTag() != null && this.b.getTag().equals("1") && f.j.a.h.c.this.f9996i != null) {
                        f.j.a.h.c.this.f9996i.setBackgroundResource(brstore.makro.app.R.drawable.back_btn_effect);
                    }
                    android.view.View view4 = this.b;
                    if (view4 != null && view4.getTag() != null && this.b.getTag().equals("2") && f.j.a.h.c.this.f9997j != null) {
                        f.j.a.h.c.this.f9997j.setBackgroundResource(brstore.makro.app.R.drawable.logout_btn_effect);
                    }
                    android.view.View view5 = this.b;
                    if (view5 != null && view5.getTag() != null && this.b.getTag().equals("3") && f.j.a.h.c.this.f9998k != null) {
                        f.j.a.h.c.this.f9998k.setBackgroundResource(brstore.makro.app.R.drawable.blue_btn_effect);
                    }
                    android.view.View view6 = this.b;
                    if (view6 != null && view6.getTag() != null && this.b.getTag().equals("4") && f.j.a.h.c.this.f10000m != null) {
                        f.j.a.h.c.this.f10000m.setBackgroundResource(brstore.makro.app.R.drawable.back_btn_effect);
                    }
                    android.view.View view7 = this.b;
                    if (view7 == null || view7.getTag() == null || !this.b.getTag().equals("5") || f.j.a.h.c.this.f9999l == null) {
                        return;
                    }
                    f.j.a.h.c.this.f9999l.setBackgroundResource(brstore.makro.app.R.drawable.logout_btn_effect);
                    return;
                }
                if (z) {
                    r4 = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                android.view.View view8 = this.b;
                if (view8 != null && view8.getTag() != null && this.b.getTag().equals("1") && f.j.a.h.c.this.f9996i != null) {
                    f.j.a.h.c.this.f9996i.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
                android.view.View view9 = this.b;
                if (view9 != null && view9.getTag() != null && this.b.getTag().equals("2") && f.j.a.h.c.this.f9997j != null) {
                    f.j.a.h.c.this.f9997j.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
                android.view.View view10 = this.b;
                if (view10 != null && view10.getTag() != null && this.b.getTag().equals("3") && f.j.a.h.c.this.f9998k != null) {
                    f.j.a.h.c.this.f9998k.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
                android.view.View view11 = this.b;
                if (view11 != null && view11.getTag() != null && this.b.getTag().equals("4") && f.j.a.h.c.this.f10000m != null) {
                    f.j.a.h.c.this.f10000m.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
                android.view.View view12 = this.b;
                if (view12 != null && view12.getTag() != null && this.b.getTag().equals("5") && f.j.a.h.c.this.f9999l != null) {
                    f.j.a.h.c.this.f9999l.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
            }
            a(r4);
            b(r4);
        }
    }

    public c(android.content.Context context, f.j.a.h.c.j jVar) {
        this.a = "";
        this.f9993f = null;
        this.b = context;
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.a = "/storage";
        this.f9993f = jVar;
        try {
            this.a = new java.io.File(this.a).getCanonicalPath();
        } catch (java.io.IOException unused) {
        }
    }

    public static int F(float f2, android.content.Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ java.lang.String y(f.j.a.h.c cVar, java.lang.Object obj) {
        java.lang.String str = cVar.c + obj;
        cVar.c = str;
        return str;
    }

    public final void C(java.io.File file) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                java.lang.String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f9998k.setVisibility(4);
                } else {
                    arrayList.add(new java.io.File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f9998k.setVisibility(0);
                }
                java.io.File file2 = new java.io.File(file.getParent());
                if (file2.list() != null) {
                    int i2 = 0;
                    while (true) {
                        java.lang.String[] list = file2.list();
                        list.getClass();
                        if (i2 >= list.length) {
                            break;
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(file.getParent());
                        sb.append("/");
                        java.lang.String[] list2 = file2.list();
                        list2.getClass();
                        sb.append(list2[i2]);
                        if (new java.io.File(sb.toString()).isDirectory()) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(file.getParent());
                            sb2.append("/");
                            java.lang.String[] list3 = file2.list();
                            list3.getClass();
                            sb2.append(list3[i2]);
                            arrayList.add(sb2.toString());
                        }
                        i2++;
                    }
                }
            }
            this.f9992e.clear();
            this.f9992e.addAll(arrayList);
            this.f9995h.notifyDataSetChanged();
            this.f10002o.setSelection(0);
            if (this.f10002o != null) {
                this.f10002o.requestFocus();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void D(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.a;
        }
        try {
            java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
            this.c = canonicalPath;
            this.f9991d = I(canonicalPath);
            this.f9992e = I("");
            J(this.f9991d);
            android.app.AlertDialog.Builder G = G(canonicalPath, this.f9992e);
            this.f10004q = G;
            G.setNegativeButton(this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            this.f10004q.setNeutralButton(this.b.getResources().getString(brstore.makro.app.R.string.set_back), (android.content.DialogInterface.OnClickListener) null);
            this.f10004q.setPositiveButton(this.b.getResources().getString(brstore.makro.app.R.string.set_ok), new f.j.a.h.c.d());
            f.j.a.k.b.e eVar = new f.j.a.k.b.e(this.b, this.f9992e);
            this.f9994g = eVar;
            boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight listViewMaxHeight = this.f10002o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((android.widget.ListAdapter) eVar);
                this.f10002o.setOnItemClickListener(new f.j.a.h.c.e());
            }
            android.app.AlertDialog create = this.f10004q.create();
            this.r = create;
            create.setOnShowListener(new f.j.a.h.c.f());
            this.r.setOnKeyListener(new f.j.a.h.c.g());
            this.r.show();
            if (this.r.getWindow() != null) {
                this.r.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
                this.r.getWindow().setLayout(F(650.0f, this.b), -2);
            }
        } catch (java.io.IOException unused) {
        }
    }

    public void E(java.lang.String str) {
        try {
            this.t = "";
            java.io.File absoluteFile = android.os.Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f9992e = arrayList;
            arrayList.clear();
            if (absoluteFile.list() != null) {
                int i2 = 0;
                while (true) {
                    java.lang.String[] list = absoluteFile.list();
                    list.getClass();
                    if (i2 >= list.length) {
                        break;
                    }
                    java.lang.String[] list2 = absoluteFile.list();
                    list2.getClass();
                    java.io.File file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(list2[i2]).toString());
                    if (file.isDirectory()) {
                        this.f9992e.add(file.getPath());
                    }
                    i2++;
                }
            }
            android.app.AlertDialog.Builder G = G("", this.f9992e);
            this.f10004q = G;
            G.setNegativeButton(this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            this.f10004q.setNeutralButton(this.b.getResources().getString(brstore.makro.app.R.string.set_back), (android.content.DialogInterface.OnClickListener) null);
            this.f10004q.setPositiveButton(this.b.getResources().getString(brstore.makro.app.R.string.set_ok), new f.j.a.h.c.a());
            f.j.a.k.b.g gVar = new f.j.a.k.b.g(this.b, this.f9992e, "recording");
            this.f9995h = gVar;
            if (this.f10002o != null) {
                this.f10002o.setAdapter((android.widget.ListAdapter) gVar);
                this.f10002o.setOnItemClickListener(new f.j.a.h.c.b());
            }
            android.app.AlertDialog create = this.f10004q.create();
            this.r = create;
            create.setOnShowListener(new f.j.a.h.c.DialogInterfaceOnShowListenerC0258c());
            this.r.show();
            if (this.r.getWindow() != null) {
                this.r.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
                this.r.getWindow().setLayout(F(650.0f, this.b), -2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final android.app.AlertDialog.Builder G(java.lang.String str, java.util.List<java.lang.String> list) {
        this.f10004q = new android.app.AlertDialog.Builder(this.b, brstore.makro.app.R.style.AlertDialogCustom);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.b);
        linearLayout.setOrientation(0);
        android.widget.TextView textView = new android.widget.TextView(this.b);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.b.getResources().getString(brstore.makro.app.R.string.choose_recording_directory));
        android.graphics.drawable.Drawable drawable = this.b.getResources().getDrawable(brstore.makro.app.R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.b.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        android.widget.ImageView imageView = new android.widget.ImageView(this.b);
        this.f10003p = imageView;
        imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f10003p.setPadding(20, 20, 0, 0);
        this.f10003p.setTag("6");
        this.f10003p.setId(brstore.makro.app.R.id.testing1);
        this.f10003p.setFocusable(true);
        android.widget.ImageView imageView2 = this.f10003p;
        imageView2.setOnFocusChangeListener(new f.j.a.h.c.k(imageView2));
        if (android.os.Build.VERSION.SDK_INT <= 21) {
            this.f10003p.setImageResource(brstore.makro.app.R.drawable.addfolder_icon);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.f10003p.setImageDrawable(this.b.getResources().getDrawable(brstore.makro.app.R.drawable.addfolder_icon, null));
        }
        ((android.widget.LinearLayout.LayoutParams) this.f10003p.getLayoutParams()).gravity = 8388613;
        this.f10003p.setOnClickListener(new f.j.a.h.c.i());
        linearLayout.addView(textView);
        linearLayout.addView(this.f10003p);
        this.f10004q.setCustomTitle(linearLayout);
        android.view.View inflate = ((android.view.LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(brstore.makro.app.R.layout.directory_listview, (android.view.ViewGroup) null);
        this.f10004q.setView(inflate);
        this.f10002o = (boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight) inflate.findViewById(brstore.makro.app.R.id.lv_ch);
        this.f10004q.setCancelable(false);
        return this.f10004q;
    }

    public final boolean H(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return false;
        }
        return file.mkdir();
    }

    public final java.util.List<java.lang.String> I(java.lang.String str) {
        java.io.File file;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            file = new java.io.File(str);
        } catch (java.lang.Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            for (java.io.File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
            java.util.Collections.sort(arrayList, new f.j.a.h.c.h(this));
            return arrayList;
        }
        return arrayList;
    }

    public final void J(java.util.List<java.lang.String> list) {
        this.f9992e.clear();
        boolean z = false;
        for (java.lang.String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f10001n.put("SD Card", str);
                    this.f9992e.add("SD Card");
                } else {
                    this.f9992e.add(str);
                }
            }
        }
        if (z) {
            this.f9992e.add(0, "Internal Storage");
        }
    }

    public void K(boolean z) {
    }

    public final void L() {
        android.widget.TextView textView;
        try {
            if (this.c.equals(this.a)) {
                J(I(this.c));
            } else {
                this.f9992e.clear();
                this.f9992e.add("..");
                this.f9992e.addAll(I(this.c));
            }
            if (this.r != null && (textView = (android.widget.TextView) this.r.findViewById(android.R.id.message)) != null) {
                textView.setText(this.c);
            }
            if (this.c.equals(this.a)) {
                this.f9998k.setVisibility(4);
                this.f9997j.setVisibility(8);
            } else {
                this.f9998k.setVisibility(0);
                this.f9997j.setVisibility(0);
            }
            this.f9994g.notifyDataSetChanged();
            this.f10002o.setSelection(0);
            if (this.f10002o != null) {
                this.f10002o.requestFocus();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
