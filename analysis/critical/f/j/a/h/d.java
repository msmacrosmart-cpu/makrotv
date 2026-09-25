package f.j.a.h;

/* loaded from: classes.dex */
public class d {
    public java.lang.String a;
    public android.content.Context b;

    /* renamed from: f, reason: collision with root package name */
    public f.j.a.h.d.g f10007f;

    /* renamed from: g, reason: collision with root package name */
    public f.j.a.k.b.e f10008g;

    /* renamed from: h, reason: collision with root package name */
    public f.j.a.k.b.g f10009h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f10010i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f10011j;

    /* renamed from: l, reason: collision with root package name */
    public boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight f10013l;

    /* renamed from: m, reason: collision with root package name */
    public android.app.AlertDialog.Builder f10014m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.AlertDialog f10015n;

    /* renamed from: o, reason: collision with root package name */
    public java.io.File f10016o;
    public java.lang.String c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<java.lang.String> f10005d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List<java.lang.String> f10006e = null;

    /* renamed from: k, reason: collision with root package name */
    public java.util.HashMap<java.lang.String, java.lang.String> f10012k = new java.util.HashMap<>();

    /* loaded from: classes.dex */
    public class a implements android.widget.AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j2) {
            f.j.a.h.d.this.f10011j.setVisibility(0);
            f.j.a.h.d.this.f10016o = new java.io.File((java.lang.String) f.j.a.h.d.this.f10006e.get(i2));
            if (f.j.a.h.d.this.f10016o != null && f.j.a.h.d.this.f10016o.isFile()) {
                f.j.a.h.d dVar = f.j.a.h.d.this;
                dVar.c = dVar.f10016o.getName();
                if (!f.j.a.h.d.this.c.endsWith(".m3u") && !f.j.a.h.d.this.c.endsWith(".m3u8")) {
                    android.widget.Toast.makeText(f.j.a.h.d.this.b, "Please select .m3u File", 0).show();
                    return;
                } else {
                    if (f.j.a.h.d.this.f10007f != null) {
                        f.j.a.h.d.this.f10007f.a(f.j.a.h.d.this.f10016o.getPath());
                        f.j.a.h.d.this.f10015n.dismiss();
                        return;
                    }
                    return;
                }
            }
            f.j.a.h.d dVar2 = f.j.a.h.d.this;
            dVar2.c = dVar2.f10016o.getName();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            if (f.j.a.h.d.this.c.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                f.j.a.h.d dVar3 = f.j.a.h.d.this;
                dVar3.t(dVar3.f10016o);
                return;
            }
            arrayList.add(f.j.a.h.d.this.f10016o.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (f.j.a.h.d.this.f10016o.list() != null) {
                int i3 = 0;
                while (true) {
                    java.lang.String[] list = f.j.a.h.d.this.f10016o.list();
                    list.getClass();
                    if (i3 >= list.length) {
                        break;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(f.j.a.h.d.this.f10016o.getPath());
                    sb.append("/");
                    java.lang.String[] list2 = f.j.a.h.d.this.f10016o.list();
                    list2.getClass();
                    sb.append(list2[i3]);
                    arrayList.add(sb.toString());
                    i3++;
                }
            }
            f.j.a.h.d.this.f10006e.clear();
            f.j.a.h.d.this.f10006e.addAll(arrayList);
            f.j.a.h.d.this.f10009h.notifyDataSetChanged();
            f.j.a.h.d.this.f10013l.setSelection(0);
            if (f.j.a.h.d.this.f10013l != null) {
                f.j.a.h.d.this.f10013l.requestFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements android.content.DialogInterface.OnShowListener {

        /* loaded from: classes.dex */
        public class a implements android.view.View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                f.j.a.h.d.this.f10015n.dismiss();
            }
        }

        /* renamed from: f.j.a.h.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ViewOnClickListenerC0259b implements android.view.View.OnClickListener {
            public ViewOnClickListenerC0259b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (f.j.a.h.d.this.f10006e == null || f.j.a.h.d.this.f10006e.get(0) == null) {
                    return;
                }
                f.j.a.h.d.this.t(new java.io.File((java.lang.String) f.j.a.h.d.this.f10006e.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            f.j.a.h.d dVar = f.j.a.h.d.this;
            dVar.f10010i = dVar.f10015n.getButton(-2);
            f.j.a.h.d dVar2 = f.j.a.h.d.this;
            dVar2.f10011j = dVar2.f10015n.getButton(-3);
            if (f.j.a.h.d.this.f10016o == null || f.j.a.h.d.this.f10016o.getParent() == null || f.j.a.h.d.this.f10016o.getParent().equals("/storage/emulated/0")) {
                f.j.a.h.d.this.f10011j.setVisibility(4);
            } else {
                f.j.a.h.d.this.f10011j.setVisibility(0);
            }
            f.j.a.h.d.this.f10010i.setTag("1");
            f.j.a.h.d.this.f10011j.setTag("3");
            android.widget.Button button = f.j.a.h.d.this.f10010i;
            f.j.a.h.d dVar3 = f.j.a.h.d.this;
            button.setOnFocusChangeListener(new f.j.a.h.d.h(dVar3.f10010i));
            f.j.a.h.d.this.f10010i.setTextColor(f.j.a.h.d.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.d.this.f10010i.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.d.this.f10011j.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.d.this.b).w();
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.d.this.f10010i.setTextSize(16.0f);
                f.j.a.h.d.this.f10010i.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.j.a.h.d.this.f10010i.setTextSize(14.0f);
                f.j.a.h.d.this.f10010i.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            f.j.a.h.d.this.f10010i.setOnClickListener(new f.j.a.h.d.b.a());
            f.j.a.h.d.this.f10011j.setOnClickListener(new f.j.a.h.d.b.ViewOnClickListenerC0259b());
            android.widget.Button button2 = f.j.a.h.d.this.f10011j;
            f.j.a.h.d dVar4 = f.j.a.h.d.this;
            button2.setOnFocusChangeListener(new f.j.a.h.d.h(dVar4.f10011j));
            f.j.a.h.d.this.f10011j.setTextColor(f.j.a.h.d.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.d.this.f10011j.setTextSize(16.0f);
                f.j.a.h.d.this.f10011j.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            f.j.a.h.d.this.f10011j.setTextSize(14.0f);
            f.j.a.h.d.this.f10011j.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* loaded from: classes.dex */
    public class c implements android.widget.AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j2) {
            f.j.a.h.d dVar;
            java.lang.StringBuilder sb;
            java.lang.String str;
            java.lang.String sb2;
            if (((java.lang.String) f.j.a.h.d.this.f10006e.get(i2)).equals("Internal Storage")) {
                dVar = f.j.a.h.d.this;
                sb2 = "/emulated/0";
            } else {
                if (f.j.a.h.d.this.f10006e.get(i2) != null && i2 == 0 && ((java.lang.String) f.j.a.h.d.this.f10006e.get(i2)).equals("..")) {
                    f.j.a.h.d.this.f10011j.performClick();
                    f.j.a.h.d.this.A();
                }
                if (f.j.a.h.d.this.f10012k == null) {
                    dVar = f.j.a.h.d.this;
                    sb = new java.lang.StringBuilder();
                } else if (f.j.a.h.d.this.f10012k.get(f.j.a.h.d.this.f10006e.get(i2)) == null || ((java.lang.String) f.j.a.h.d.this.f10012k.get(f.j.a.h.d.this.f10006e.get(i2))).equals("")) {
                    dVar = f.j.a.h.d.this;
                    sb = new java.lang.StringBuilder();
                } else {
                    dVar = f.j.a.h.d.this;
                    sb = new java.lang.StringBuilder();
                    sb.append("/");
                    sb.append((java.lang.String) f.j.a.h.d.this.f10012k.get(f.j.a.h.d.this.f10006e.get(i2)));
                    sb.append("/Android/data/");
                    str = "boxbr.apksrebrand.smarters";
                    sb.append(str);
                    sb2 = sb.toString();
                }
                sb.append("/");
                str = (java.lang.String) f.j.a.h.d.this.f10006e.get(i2);
                sb.append(str);
                sb2 = sb.toString();
            }
            f.j.a.h.d.m(dVar, sb2);
            f.j.a.h.d.this.A();
        }
    }

    /* renamed from: f.j.a.h.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnShowListenerC0260d implements android.content.DialogInterface.OnShowListener {

        /* renamed from: f.j.a.h.d$d$a */
        /* loaded from: classes.dex */
        public class a implements android.view.View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                f.j.a.h.d dVar;
                java.io.File file;
                if (f.j.a.h.d.this.c.equals(f.j.a.h.d.this.a)) {
                    return;
                }
                if (!f.j.a.h.d.this.c.equals("/storage/emulated/0")) {
                    f.j.a.h.d.this.c = new java.io.File(f.j.a.h.d.this.c).getParent();
                    java.lang.String[] split = f.j.a.h.d.this.c.split("/");
                    if (split.length >= 3) {
                        if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (f.j.a.h.d.this.c.equals("/storage/" + split[2] + "/Android/data")) {
                                f.j.a.h.d.this.c = "/storage/" + split[2];
                                dVar = f.j.a.h.d.this;
                                file = new java.io.File(f.j.a.h.d.this.c);
                            }
                        }
                        if (new java.io.File(f.j.a.h.d.this.c).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            f.j.a.h.d.this.c = "/storage/" + split[2] + "/Android/data/boxbr.apksrebrand.smarters";
                        }
                    }
                    f.j.a.h.d.this.A();
                }
                f.j.a.h.d.this.c = "/storage/emulated";
                dVar = f.j.a.h.d.this;
                file = new java.io.File(f.j.a.h.d.this.c);
                dVar.c = file.getParent();
                f.j.a.h.d.this.A();
            }
        }

        public DialogInterfaceOnShowListenerC0260d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            f.j.a.h.d dVar = f.j.a.h.d.this;
            dVar.f10010i = dVar.f10015n.getButton(-2);
            f.j.a.h.d dVar2 = f.j.a.h.d.this;
            dVar2.f10011j = dVar2.f10015n.getButton(-3);
            if (f.j.a.h.d.this.c.equals(f.j.a.h.d.this.a)) {
                f.j.a.h.d.this.f10011j.setVisibility(4);
            } else {
                f.j.a.h.d.this.f10011j.setVisibility(0);
            }
            f.j.a.h.d.this.f10010i.setTag("1");
            f.j.a.h.d.this.f10011j.setTag("3");
            android.widget.Button button = f.j.a.h.d.this.f10010i;
            f.j.a.h.d dVar3 = f.j.a.h.d.this;
            button.setOnFocusChangeListener(new f.j.a.h.d.h(dVar3.f10010i));
            f.j.a.h.d.this.f10010i.setTextColor(f.j.a.h.d.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.d.this.f10010i.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.d.this.f10011j.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.d.this.b).w();
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.d.this.f10010i.setTextSize(16.0f);
                f.j.a.h.d.this.f10010i.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.j.a.h.d.this.f10010i.setTextSize(14.0f);
                f.j.a.h.d.this.f10010i.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            android.widget.Button button2 = f.j.a.h.d.this.f10011j;
            f.j.a.h.d dVar4 = f.j.a.h.d.this;
            button2.setOnFocusChangeListener(new f.j.a.h.d.h(dVar4.f10011j));
            f.j.a.h.d.this.f10011j.setTextColor(f.j.a.h.d.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.d.this.f10011j.setTextSize(16.0f);
                f.j.a.h.d.this.f10011j.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.j.a.h.d.this.f10011j.setTextSize(14.0f);
                f.j.a.h.d.this.f10011j.setBackground(f.j.a.h.d.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            f.j.a.h.d.this.f10011j.setOnClickListener(new f.j.a.h.d.DialogInterfaceOnShowListenerC0260d.a());
        }
    }

    /* loaded from: classes.dex */
    public class e implements android.content.DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface dialogInterface, int i2, android.view.KeyEvent keyEvent) {
            f.j.a.h.d dVar;
            java.io.File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (f.j.a.h.d.this.c.equals(f.j.a.h.d.this.a)) {
                f.j.a.h.d.this.f10015n.dismiss();
                return true;
            }
            if (!f.j.a.h.d.this.c.equals("/storage/emulated/0")) {
                f.j.a.h.d.this.c = new java.io.File(f.j.a.h.d.this.c).getParent();
                java.lang.String[] split = f.j.a.h.d.this.c.split("/");
                if (split.length >= 3) {
                    if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (f.j.a.h.d.this.c.equals("/storage/" + split[2] + "/Android/data")) {
                            f.j.a.h.d.this.c = "/storage/" + split[2];
                            dVar = f.j.a.h.d.this;
                            file = new java.io.File(f.j.a.h.d.this.c);
                        }
                    }
                    if (new java.io.File(f.j.a.h.d.this.c).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        f.j.a.h.d.this.c = "/storage/" + split[2] + "/Android/data/boxbr.apksrebrand.smarters";
                    }
                }
                f.j.a.h.d.this.A();
                return true;
            }
            f.j.a.h.d.this.c = "/storage/emulated";
            dVar = f.j.a.h.d.this;
            file = new java.io.File(f.j.a.h.d.this.c);
            dVar.c = file.getParent();
            f.j.a.h.d.this.A();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class f implements java.util.Comparator<java.lang.String> {
        public f(f.j.a.h.d dVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(java.lang.String str);
    }

    /* loaded from: classes.dex */
    public class h implements android.view.View.OnFocusChangeListener {
        public final android.view.View b;

        public h(android.view.View view) {
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
                    r1 = z ? 1.12f : 1.0f;
                    a(r1);
                    b(r1);
                    android.view.View view3 = this.b;
                    if (view3 != null && view3.getTag() != null && this.b.getTag().equals("1") && f.j.a.h.d.this.f10010i != null) {
                        f.j.a.h.d.this.f10010i.setBackgroundResource(brstore.makro.app.R.drawable.back_btn_effect);
                    }
                    android.view.View view4 = this.b;
                    if (view4 == null || view4.getTag() == null || !this.b.getTag().equals("3") || f.j.a.h.d.this.f10011j == null) {
                        return;
                    }
                    f.j.a.h.d.this.f10011j.setBackgroundResource(brstore.makro.app.R.drawable.blue_btn_effect);
                    return;
                }
                if (z) {
                    r1 = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                android.view.View view5 = this.b;
                if (view5 != null && view5.getTag() != null && this.b.getTag().equals("1") && f.j.a.h.d.this.f10010i != null) {
                    f.j.a.h.d.this.f10010i.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
                android.view.View view6 = this.b;
                if (view6 != null && view6.getTag() != null && this.b.getTag().equals("3") && f.j.a.h.d.this.f10011j != null) {
                    f.j.a.h.d.this.f10011j.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
            }
            a(r1);
            b(r1);
        }
    }

    public d(android.content.Context context, f.j.a.h.d.g gVar) {
        this.a = "";
        this.f10007f = null;
        this.b = context;
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.a = "/storage";
        this.f10007f = gVar;
        try {
            this.a = new java.io.File(this.a).getCanonicalPath();
        } catch (java.io.IOException unused) {
        }
    }

    public static /* synthetic */ java.lang.String m(f.j.a.h.d dVar, java.lang.Object obj) {
        java.lang.String str = dVar.c + obj;
        dVar.c = str;
        return str;
    }

    public static int w(float f2, android.content.Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void A() {
        android.widget.TextView textView;
        try {
            if (!this.c.endsWith(".m3u") && !this.c.endsWith(".m3u8")) {
                if (this.c.equals(this.a)) {
                    z(y(this.c));
                } else {
                    this.f10006e.clear();
                    this.f10006e.add("..");
                    this.f10006e.addAll(y(this.c));
                }
                if (this.f10015n != null && (textView = (android.widget.TextView) this.f10015n.findViewById(android.R.id.message)) != null) {
                    textView.setText(this.c);
                }
                if (this.c.equals(this.a)) {
                    this.f10011j.setVisibility(4);
                } else {
                    this.f10011j.setVisibility(0);
                }
                this.f10008g.notifyDataSetChanged();
                this.f10013l.setSelection(0);
                if (this.f10013l != null) {
                    this.f10013l.requestFocus();
                    return;
                }
                return;
            }
            if (this.f10007f != null) {
                this.f10007f.a(this.c);
                this.f10015n.dismiss();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void t(java.io.File file) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                java.lang.String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f10011j.setVisibility(4);
                } else {
                    arrayList.add(new java.io.File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f10011j.setVisibility(0);
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
                        arrayList.add(sb.toString());
                        i2++;
                    }
                }
            }
            this.f10006e.clear();
            this.f10006e.addAll(arrayList);
            this.f10009h.notifyDataSetChanged();
            this.f10013l.setSelection(0);
            if (this.f10013l != null) {
                this.f10013l.requestFocus();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void u(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.a;
        }
        try {
            java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
            this.c = canonicalPath;
            this.f10005d = y(canonicalPath);
            this.f10006e = y("");
            z(this.f10005d);
            android.app.AlertDialog.Builder x = x(canonicalPath, this.f10006e);
            this.f10014m = x;
            x.setNegativeButton(this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            this.f10014m.setNeutralButton(this.b.getResources().getString(brstore.makro.app.R.string.set_back), (android.content.DialogInterface.OnClickListener) null);
            f.j.a.k.b.e eVar = new f.j.a.k.b.e(this.b, this.f10006e);
            this.f10008g = eVar;
            boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight listViewMaxHeight = this.f10013l;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((android.widget.ListAdapter) eVar);
                this.f10013l.setOnItemClickListener(new f.j.a.h.d.c());
            }
            android.app.AlertDialog create = this.f10014m.create();
            this.f10015n = create;
            create.setOnShowListener(new f.j.a.h.d.DialogInterfaceOnShowListenerC0260d());
            this.f10015n.setOnKeyListener(new f.j.a.h.d.e());
            this.f10015n.show();
            if (this.f10015n.getWindow() != null) {
                this.f10015n.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
                this.f10015n.getWindow().setLayout(w(650.0f, this.b), -2);
            }
        } catch (java.io.IOException unused) {
        }
    }

    public void v(java.lang.String str) {
        try {
            java.io.File absoluteFile = android.os.Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f10006e = arrayList;
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
                    this.f10006e.add(new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(list2[i2]).toString()).getPath());
                    i2++;
                }
            }
            android.app.AlertDialog.Builder x = x("", this.f10006e);
            this.f10014m = x;
            x.setNegativeButton(this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            this.f10014m.setNeutralButton(this.b.getResources().getString(brstore.makro.app.R.string.set_back), (android.content.DialogInterface.OnClickListener) null);
            f.j.a.k.b.g gVar = new f.j.a.k.b.g(this.b, this.f10006e, "m3u");
            this.f10009h = gVar;
            if (this.f10013l != null) {
                this.f10013l.setAdapter((android.widget.ListAdapter) gVar);
                this.f10013l.setOnItemClickListener(new f.j.a.h.d.a());
            }
            android.app.AlertDialog create = this.f10014m.create();
            this.f10015n = create;
            create.setOnShowListener(new f.j.a.h.d.b());
            this.f10015n.show();
            if (this.f10015n.getWindow() != null) {
                this.f10015n.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
                this.f10015n.getWindow().setLayout(w(650.0f, this.b), -2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final android.app.AlertDialog.Builder x(java.lang.String str, java.util.List<java.lang.String> list) {
        this.f10014m = new android.app.AlertDialog.Builder(this.b, brstore.makro.app.R.style.AlertDialogCustom);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.b);
        linearLayout.setOrientation(0);
        android.widget.TextView textView = new android.widget.TextView(this.b);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.b.getResources().getString(brstore.makro.app.R.string.choose_m3u_file));
        android.graphics.drawable.Drawable drawable = this.b.getResources().getDrawable(brstore.makro.app.R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.b.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f10014m.setCustomTitle(linearLayout);
        android.view.View inflate = ((android.view.LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(brstore.makro.app.R.layout.directory_listview, (android.view.ViewGroup) null);
        this.f10014m.setView(inflate);
        this.f10013l = (boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight) inflate.findViewById(brstore.makro.app.R.id.lv_ch);
        this.f10014m.setCancelable(true);
        return this.f10014m;
    }

    public final java.util.List<java.lang.String> y(java.lang.String str) {
        java.io.File file;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            file = new java.io.File(str);
        } catch (java.lang.Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            if (file.listFiles() != null) {
                for (java.io.File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2.getName());
                    }
                    if ((file2.isFile() && file2.getName().endsWith(".m3u")) || (file2.isFile() && file2.getName().endsWith(".m3u8"))) {
                        arrayList.add(file2.getName());
                    }
                }
            }
            java.util.Collections.sort(arrayList, new f.j.a.h.d.f(this));
            return arrayList;
        }
        return arrayList;
    }

    public final void z(java.util.List<java.lang.String> list) {
        this.f10006e.clear();
        boolean z = false;
        for (java.lang.String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f10012k.put("SD Card", str);
                    this.f10006e.add("SD Card");
                } else {
                    this.f10006e.add(str);
                }
            }
        }
        if (z) {
            this.f10006e.add(0, "Internal Storage");
        }
    }
}
