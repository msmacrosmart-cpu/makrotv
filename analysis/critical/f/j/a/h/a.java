package f.j.a.h;

/* loaded from: classes.dex */
public class a {
    public static f.j.a.k.d.a.a r;
    public java.lang.String a;
    public android.content.Context b;

    /* renamed from: f, reason: collision with root package name */
    public f.j.a.h.a.g f9965f;

    /* renamed from: g, reason: collision with root package name */
    public f.j.a.k.b.f f9966g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f9967h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f9968i;

    /* renamed from: k, reason: collision with root package name */
    public boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight f9970k;

    /* renamed from: l, reason: collision with root package name */
    public android.app.AlertDialog.Builder f9971l;

    /* renamed from: m, reason: collision with root package name */
    public android.app.AlertDialog f9972m;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List<java.lang.String> f9974o;

    /* renamed from: p, reason: collision with root package name */
    public f.j.a.k.b.h f9975p;

    /* renamed from: q, reason: collision with root package name */
    public java.io.File f9976q;
    public java.lang.String c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<java.lang.String> f9963d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List<java.lang.String> f9964e = null;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashMap<java.lang.String, java.lang.String> f9969j = new java.util.HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f9973n = java.lang.Boolean.TRUE;

    /* renamed from: f.j.a.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0252a implements android.widget.AdapterView.OnItemClickListener {
        public C0252a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j2) {
            android.content.Intent intent;
            f.j.a.h.a.this.f9968i.setVisibility(0);
            f.j.a.h.a.this.f9976q = new java.io.File((java.lang.String) f.j.a.h.a.this.f9964e.get(i2));
            if (f.j.a.h.a.this.f9976q != null && f.j.a.h.a.this.f9976q.isFile()) {
                f.j.a.h.a aVar = f.j.a.h.a.this;
                aVar.c = aVar.f9976q.getName();
                if (f.j.a.h.a.this.f9965f != null) {
                    if (f.j.a.h.a.this.b != null) {
                        f.j.a.k.d.a.a unused = f.j.a.h.a.r = new f.j.a.k.d.a.a(f.j.a.h.a.this.b);
                        if (f.j.a.h.a.r.t() == 3) {
                            f.j.a.h.a.r.I(f.j.a.h.a.this.b.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                            intent = new android.content.Intent(f.j.a.h.a.this.b, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                        } else {
                            intent = new android.content.Intent(f.j.a.h.a.this.b, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                        }
                        intent.putExtra(tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE, "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", f.j.a.h.a.this.f9976q.getPath());
                        f.j.a.h.a.this.b.startActivity(intent);
                    }
                    f.j.a.h.a.this.f9972m.dismiss();
                    return;
                }
                return;
            }
            f.j.a.h.a aVar2 = f.j.a.h.a.this;
            aVar2.c = aVar2.f9976q.getName();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            if (f.j.a.h.a.this.c.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                f.j.a.h.a aVar3 = f.j.a.h.a.this;
                aVar3.v(aVar3.f9976q);
                return;
            }
            arrayList.add(f.j.a.h.a.this.f9976q.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (f.j.a.h.a.this.f9976q.list() != null) {
                int i3 = 0;
                while (true) {
                    java.lang.String[] list = f.j.a.h.a.this.f9976q.list();
                    list.getClass();
                    if (i3 >= list.length) {
                        break;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(f.j.a.h.a.this.f9976q.getPath());
                    sb.append("/");
                    java.lang.String[] list2 = f.j.a.h.a.this.f9976q.list();
                    list2.getClass();
                    sb.append(list2[i3]);
                    arrayList.add(sb.toString());
                    i3++;
                }
            }
            f.j.a.h.a.this.f9964e.clear();
            f.j.a.h.a.this.f9964e.addAll(arrayList);
            f.j.a.h.a.this.f9975p.notifyDataSetChanged();
            f.j.a.h.a.this.f9970k.setSelection(0);
            if (f.j.a.h.a.this.f9970k != null) {
                f.j.a.h.a.this.f9970k.requestFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements android.content.DialogInterface.OnShowListener {

        /* renamed from: f.j.a.h.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ViewOnClickListenerC0253a implements android.view.View.OnClickListener {
            public ViewOnClickListenerC0253a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                f.j.a.h.a.this.f9972m.dismiss();
            }
        }

        /* renamed from: f.j.a.h.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ViewOnClickListenerC0254b implements android.view.View.OnClickListener {
            public ViewOnClickListenerC0254b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (f.j.a.h.a.this.f9964e == null || f.j.a.h.a.this.f9964e.get(0) == null) {
                    return;
                }
                f.j.a.h.a.this.v(new java.io.File((java.lang.String) f.j.a.h.a.this.f9964e.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            f.j.a.h.a aVar = f.j.a.h.a.this;
            aVar.f9967h = aVar.f9972m.getButton(-2);
            f.j.a.h.a aVar2 = f.j.a.h.a.this;
            aVar2.f9968i = aVar2.f9972m.getButton(-3);
            if (f.j.a.h.a.this.f9976q == null || f.j.a.h.a.this.f9976q.getParent() == null || f.j.a.h.a.this.f9976q.getParent().equals("/storage/emulated/0")) {
                f.j.a.h.a.this.f9968i.setVisibility(4);
            } else {
                f.j.a.h.a.this.f9968i.setVisibility(0);
            }
            f.j.a.h.a.this.f9967h.setTag("1");
            f.j.a.h.a.this.f9968i.setTag("3");
            android.widget.Button button = f.j.a.h.a.this.f9967h;
            f.j.a.h.a aVar3 = f.j.a.h.a.this;
            button.setOnFocusChangeListener(new f.j.a.h.a.h(aVar3.f9967h));
            f.j.a.h.a.this.f9967h.setTextColor(f.j.a.h.a.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.a.this.f9967h.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.a.this.f9968i.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.a.this.b).w();
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.a.this.f9967h.setTextSize(16.0f);
                f.j.a.h.a.this.f9967h.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.j.a.h.a.this.f9967h.setTextSize(14.0f);
                f.j.a.h.a.this.f9967h.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            f.j.a.h.a.this.f9967h.setOnClickListener(new f.j.a.h.a.b.ViewOnClickListenerC0253a());
            f.j.a.h.a.this.f9968i.setOnClickListener(new f.j.a.h.a.b.ViewOnClickListenerC0254b());
            android.widget.Button button2 = f.j.a.h.a.this.f9968i;
            f.j.a.h.a aVar4 = f.j.a.h.a.this;
            button2.setOnFocusChangeListener(new f.j.a.h.a.h(aVar4.f9968i));
            f.j.a.h.a.this.f9968i.setTextColor(f.j.a.h.a.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.a.this.f9968i.setTextSize(16.0f);
                f.j.a.h.a.this.f9968i.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            f.j.a.h.a.this.f9968i.setTextSize(14.0f);
            f.j.a.h.a.this.f9968i.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
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
            f.j.a.h.a aVar;
            java.lang.StringBuilder sb;
            java.lang.String str;
            java.lang.String sb2;
            if (((java.lang.String) f.j.a.h.a.this.f9964e.get(i2)).equals("Internal Storage")) {
                aVar = f.j.a.h.a.this;
                sb2 = "/emulated/0";
            } else {
                if (f.j.a.h.a.this.f9964e.get(i2) != null && i2 == 0 && ((java.lang.String) f.j.a.h.a.this.f9964e.get(i2)).equals("..")) {
                    f.j.a.h.a.this.f9968i.performClick();
                    f.j.a.h.a.this.C();
                }
                if (f.j.a.h.a.this.f9969j == null) {
                    aVar = f.j.a.h.a.this;
                    sb = new java.lang.StringBuilder();
                } else if (f.j.a.h.a.this.f9969j.get(f.j.a.h.a.this.f9964e.get(i2)) == null || ((java.lang.String) f.j.a.h.a.this.f9969j.get(f.j.a.h.a.this.f9964e.get(i2))).equals("")) {
                    aVar = f.j.a.h.a.this;
                    sb = new java.lang.StringBuilder();
                } else {
                    aVar = f.j.a.h.a.this;
                    sb = new java.lang.StringBuilder();
                    sb.append("/");
                    sb.append((java.lang.String) f.j.a.h.a.this.f9969j.get(f.j.a.h.a.this.f9964e.get(i2)));
                    sb.append("/Android/data/");
                    str = "boxbr.apksrebrand.smarters";
                    sb.append(str);
                    sb2 = sb.toString();
                }
                sb.append("/");
                str = (java.lang.String) f.j.a.h.a.this.f9964e.get(i2);
                sb.append(str);
                sb2 = sb.toString();
            }
            f.j.a.h.a.n(aVar, sb2);
            f.j.a.h.a.this.C();
        }
    }

    /* loaded from: classes.dex */
    public class d implements android.content.DialogInterface.OnShowListener {

        /* renamed from: f.j.a.h.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ViewOnClickListenerC0255a implements android.view.View.OnClickListener {
            public ViewOnClickListenerC0255a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                f.j.a.h.a aVar;
                java.io.File file;
                if (f.j.a.h.a.this.c.equals(f.j.a.h.a.this.a)) {
                    f.j.a.h.a.this.f9967h.performClick();
                    return;
                }
                if (!f.j.a.h.a.this.c.equals("/storage/emulated/0")) {
                    f.j.a.h.a.this.c = new java.io.File(f.j.a.h.a.this.c).getParent();
                    java.lang.String[] split = f.j.a.h.a.this.c.split("/");
                    if (split.length >= 3) {
                        if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (f.j.a.h.a.this.c.equals("/storage/" + split[2] + "/Android/data")) {
                                f.j.a.h.a.this.c = "/storage/" + split[2];
                                aVar = f.j.a.h.a.this;
                                file = new java.io.File(f.j.a.h.a.this.c);
                            }
                        }
                        if (new java.io.File(f.j.a.h.a.this.c).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            f.j.a.h.a.this.c = "/storage/" + split[2] + "/Android/data/boxbr.apksrebrand.smarters";
                        }
                    }
                    f.j.a.h.a.this.C();
                }
                f.j.a.h.a.this.c = "/storage/emulated";
                aVar = f.j.a.h.a.this;
                file = new java.io.File(f.j.a.h.a.this.c);
                aVar.c = file.getParent();
                f.j.a.h.a.this.C();
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            f.j.a.h.a aVar = f.j.a.h.a.this;
            aVar.f9967h = aVar.f9972m.getButton(-2);
            f.j.a.h.a aVar2 = f.j.a.h.a.this;
            aVar2.f9968i = aVar2.f9972m.getButton(-3);
            if (f.j.a.h.a.this.c.equals(f.j.a.h.a.this.a)) {
                f.j.a.h.a.this.f9968i.setVisibility(4);
            } else {
                f.j.a.h.a.this.f9968i.setVisibility(0);
            }
            f.j.a.h.a.this.f9967h.setTag("1");
            f.j.a.h.a.this.f9968i.setTag("3");
            android.widget.Button button = f.j.a.h.a.this.f9967h;
            f.j.a.h.a aVar3 = f.j.a.h.a.this;
            button.setOnFocusChangeListener(new f.j.a.h.a.h(aVar3.f9967h));
            f.j.a.h.a.this.f9967h.setTextColor(f.j.a.h.a.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.a.this.f9967h.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) f.j.a.h.a.this.f9968i.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            java.lang.String w = new f.j.a.k.d.a.a(f.j.a.h.a.this.b).w();
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.a.this.f9967h.setTextSize(16.0f);
                f.j.a.h.a.this.f9967h.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.j.a.h.a.this.f9967h.setTextSize(14.0f);
                f.j.a.h.a.this.f9967h.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            android.widget.Button button2 = f.j.a.h.a.this.f9968i;
            f.j.a.h.a aVar4 = f.j.a.h.a.this;
            button2.setOnFocusChangeListener(new f.j.a.h.a.h(aVar4.f9968i));
            f.j.a.h.a.this.f9968i.setTextColor(f.j.a.h.a.this.b.getResources().getColor(brstore.makro.app.R.color.white));
            if (w.equals(f.j.a.h.i.a.i0)) {
                f.j.a.h.a.this.f9968i.setTextSize(16.0f);
                f.j.a.h.a.this.f9968i.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.j.a.h.a.this.f9968i.setTextSize(14.0f);
                f.j.a.h.a.this.f9968i.setBackground(f.j.a.h.a.this.b.getResources().getDrawable(brstore.makro.app.R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
            f.j.a.h.a.this.f9968i.setOnClickListener(new f.j.a.h.a.d.ViewOnClickListenerC0255a());
        }
    }

    /* loaded from: classes.dex */
    public class e implements android.content.DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface dialogInterface, int i2, android.view.KeyEvent keyEvent) {
            f.j.a.h.a aVar;
            java.io.File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (f.j.a.h.a.this.c.equals(f.j.a.h.a.this.a)) {
                f.j.a.h.a.this.f9972m.dismiss();
                return true;
            }
            if (!f.j.a.h.a.this.c.equals("/storage/emulated/0")) {
                f.j.a.h.a.this.c = new java.io.File(f.j.a.h.a.this.c).getParent();
                java.lang.String[] split = f.j.a.h.a.this.c.split("/");
                if (split.length >= 3) {
                    if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (f.j.a.h.a.this.c.equals("/storage/" + split[2] + "/Android/data")) {
                            f.j.a.h.a.this.c = "/storage/" + split[2];
                            aVar = f.j.a.h.a.this;
                            file = new java.io.File(f.j.a.h.a.this.c);
                        }
                    }
                    if (new java.io.File(f.j.a.h.a.this.c).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        f.j.a.h.a.this.c = "/storage/" + split[2] + "/Android/data/boxbr.apksrebrand.smarters";
                    }
                }
                f.j.a.h.a.this.C();
                return true;
            }
            f.j.a.h.a.this.c = "/storage/emulated";
            aVar = f.j.a.h.a.this;
            file = new java.io.File(f.j.a.h.a.this.c);
            aVar.c = file.getParent();
            f.j.a.h.a.this.C();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class f implements java.util.Comparator<java.lang.String> {
        public f(f.j.a.h.a aVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
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
                    if (view3 != null && view3.getTag() != null && this.b.getTag().equals("1") && f.j.a.h.a.this.f9967h != null) {
                        f.j.a.h.a.this.f9967h.setBackgroundResource(brstore.makro.app.R.drawable.back_btn_effect);
                    }
                    android.view.View view4 = this.b;
                    if (view4 == null || view4.getTag() == null || !this.b.getTag().equals("3") || f.j.a.h.a.this.f9968i == null) {
                        return;
                    }
                    f.j.a.h.a.this.f9968i.setBackgroundResource(brstore.makro.app.R.drawable.blue_btn_effect);
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
                if (view5 != null && view5.getTag() != null && this.b.getTag().equals("1") && f.j.a.h.a.this.f9967h != null) {
                    f.j.a.h.a.this.f9967h.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
                android.view.View view6 = this.b;
                if (view6 != null && view6.getTag() != null && this.b.getTag().equals("3") && f.j.a.h.a.this.f9968i != null) {
                    f.j.a.h.a.this.f9968i.setBackgroundResource(brstore.makro.app.R.drawable.black_button_dark);
                }
            }
            a(r1);
            b(r1);
        }
    }

    public a(android.content.Context context, f.j.a.h.a.g gVar) {
        this.a = "";
        this.f9965f = null;
        this.b = context;
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        new java.util.ArrayList();
        this.f9974o = new java.util.ArrayList();
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.a = "/storage";
        this.f9965f = gVar;
        try {
            this.a = new java.io.File(this.a).getCanonicalPath();
        } catch (java.io.IOException unused) {
        }
    }

    public static /* synthetic */ java.lang.String n(f.j.a.h.a aVar, java.lang.Object obj) {
        java.lang.String str = aVar.c + obj;
        aVar.c = str;
        return str;
    }

    public static int y(float f2, android.content.Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final java.util.List<java.lang.String> A(java.lang.String str) {
        java.io.File file;
        java.lang.String name;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            file = new java.io.File(str);
        } catch (java.lang.Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            for (java.io.File file2 : file.listFiles()) {
                try {
                    if (file2.isDirectory()) {
                        name = file2.getName();
                    } else {
                        f.f.b.c.a.a(file2.getName());
                        name = file2.getName();
                    }
                    arrayList.add(name);
                } catch (java.lang.Exception e2) {
                    e2.getMessage();
                }
            }
            java.util.Collections.sort(arrayList, new f.j.a.h.a.f(this));
            return arrayList;
        }
        return arrayList;
    }

    public final void B(java.util.List<java.lang.String> list) {
        this.f9964e.clear();
        boolean z = false;
        for (java.lang.String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (java.util.regex.Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f9969j.put("SD Card", str);
                    this.f9964e.add("SD Card");
                } else {
                    this.f9964e.add(str);
                }
            }
        }
        if (z) {
            this.f9964e.add(0, "Internal Storage");
        }
    }

    public final void C() {
        android.content.Intent intent;
        java.util.List<java.lang.String> list;
        java.lang.String str;
        try {
            if (!this.c.contains(".mp4") && !this.c.contains(".mp3") && !this.c.contains(".3gp") && !this.c.contains(".ts") && !this.c.contains(".webm") && !this.c.contains(".mkv") && !this.c.contains(".flv") && !this.c.contains(".wmv") && !this.c.contains(".MP3")) {
                if (this.c.equals(this.a)) {
                    B(A(this.c));
                } else {
                    if (!this.c.endsWith(".zip") && !this.c.endsWith(".apk") && !this.c.endsWith(".txt") && !this.c.endsWith(".pdf") && !this.c.endsWith(".m3u") && !this.c.endsWith(".xml")) {
                        if (this.c.indexOf(".") != this.c.lastIndexOf(".")) {
                            if (!this.c.endsWith(".zip") && !this.c.endsWith(".apk")) {
                                if (!this.c.endsWith(".mp4") || !this.c.endsWith(".ts") || !this.c.endsWith(".mp3") || !this.c.endsWith(".webm") || !this.c.endsWith(".3gp") || !this.c.endsWith(".mkv") || !this.c.endsWith(".flv") || !this.c.endsWith(".wmv")) {
                                    android.widget.Toast.makeText(this.b, "File Not Supported !!", 1).show();
                                    this.f9968i.performClick();
                                }
                                this.f9964e.clear();
                                this.f9964e.add("..");
                                list = this.f9964e;
                                str = this.c;
                            }
                            android.widget.Toast.makeText(this.b, "File Not Supported !!", 1).show();
                            this.f9968i.performClick();
                            this.f9964e.clear();
                            this.f9964e.add("..");
                            list = this.f9964e;
                            str = this.c;
                        } else {
                            this.f9964e.clear();
                            this.f9964e.add("..");
                            list = this.f9964e;
                            str = this.c;
                        }
                        list.addAll(A(str));
                    }
                    android.widget.Toast.makeText(this.b, "File Not Supported !!", 1).show();
                    this.f9968i.performClick();
                }
                if (this.f9972m != null) {
                    ((android.widget.TextView) this.f9972m.findViewById(android.R.id.message)).setText(this.c);
                }
                if (this.c.equals(this.a)) {
                    this.f9968i.setVisibility(4);
                } else {
                    this.f9968i.setVisibility(0);
                }
                this.f9966g.b.clear();
                this.f9966g.b.add(this.c);
                this.f9966g.f10289n++;
                this.f9966g.notifyDataSetChanged();
                this.f9970k.setSelection(0);
                if (this.f9970k != null) {
                    this.f9970k.requestFocus();
                    return;
                }
                return;
            }
            if (this.f9965f != null) {
                if (this.b != null && this.f9973n.booleanValue()) {
                    f.j.a.k.d.a.a aVar = new f.j.a.k.d.a.a(this.b);
                    r = aVar;
                    if (aVar.t() == 3) {
                        r.I(this.b.getResources().getString(brstore.makro.app.R.string.hardware_decoder));
                        intent = new android.content.Intent(this.b, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                    } else {
                        intent = new android.content.Intent(this.b, (java.lang.Class<?>) boxbr.apksrebrand.smarters.view.activity.HoneyPlayer.class);
                    }
                    intent.putExtra(tv.danmaku.ijk.media.player.IjkMediaMeta.IJKM_KEY_TYPE, "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.c);
                    this.b.startActivity(intent);
                }
                this.f9968i.performClick();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void v(java.io.File file) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                java.lang.String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f9968i.setVisibility(4);
                } else {
                    arrayList.add(new java.io.File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f9968i.setVisibility(0);
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
            this.f9964e.clear();
            this.f9964e.addAll(arrayList);
            this.f9975p.notifyDataSetChanged();
            this.f9970k.setSelection(0);
            if (this.f9970k != null) {
                this.f9970k.requestFocus();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void w(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.a;
        }
        try {
            java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
            this.f9974o.clear();
            this.c = canonicalPath;
            this.f9963d = A(canonicalPath);
            this.f9964e = A("");
            B(this.f9963d);
            android.app.AlertDialog.Builder z = z(canonicalPath, this.f9964e);
            this.f9971l = z;
            z.setNegativeButton(this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            this.f9971l.setNeutralButton(this.b.getResources().getString(brstore.makro.app.R.string.set_back), (android.content.DialogInterface.OnClickListener) null);
            f.j.a.k.b.f fVar = new f.j.a.k.b.f(this.b, this.f9964e);
            this.f9966g = fVar;
            boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight listViewMaxHeight = this.f9970k;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((android.widget.ListAdapter) fVar);
                this.f9970k.setOnItemClickListener(new f.j.a.h.a.c());
            }
            android.app.AlertDialog create = this.f9971l.create();
            this.f9972m = create;
            create.setOnShowListener(new f.j.a.h.a.d());
            this.f9972m.setOnKeyListener(new f.j.a.h.a.e());
            this.f9972m.show();
            if (this.f9972m.getWindow() != null) {
                this.f9972m.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
                this.f9972m.getWindow().setLayout(y(650.0f, this.b), -2);
            }
        } catch (java.io.IOException unused) {
        }
    }

    public void x(java.lang.String str) {
        try {
            java.io.File absoluteFile = android.os.Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f9964e = arrayList;
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
                    this.f9964e.add(new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(list2[i2]).toString()).getPath());
                    i2++;
                }
            }
            android.app.AlertDialog.Builder z = z("", this.f9964e);
            this.f9971l = z;
            z.setNegativeButton(this.b.getResources().getString(brstore.makro.app.R.string.set_cancel), (android.content.DialogInterface.OnClickListener) null);
            this.f9971l.setNeutralButton(this.b.getResources().getString(brstore.makro.app.R.string.set_back), (android.content.DialogInterface.OnClickListener) null);
            f.j.a.k.b.h hVar = new f.j.a.k.b.h(this.b, this.f9964e);
            this.f9975p = hVar;
            if (this.f9970k != null) {
                this.f9970k.setAdapter((android.widget.ListAdapter) hVar);
                this.f9970k.setOnItemClickListener(new f.j.a.h.a.C0252a());
            }
            android.app.AlertDialog create = this.f9971l.create();
            this.f9972m = create;
            create.setOnShowListener(new f.j.a.h.a.b());
            this.f9972m.show();
            if (this.f9972m.getWindow() != null) {
                this.f9972m.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(-1));
                this.f9972m.getWindow().setLayout(y(650.0f, this.b), -2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final android.app.AlertDialog.Builder z(java.lang.String str, java.util.List<java.lang.String> list) {
        this.f9971l = new android.app.AlertDialog.Builder(this.b, brstore.makro.app.R.style.AlertDialogCustom);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.b);
        linearLayout.setOrientation(0);
        android.widget.TextView textView = new android.widget.TextView(this.b);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.b.getResources().getString(brstore.makro.app.R.string.choose_data));
        android.graphics.drawable.Drawable drawable = this.b.getResources().getDrawable(brstore.makro.app.R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.b.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f9971l.setCustomTitle(linearLayout);
        android.view.View inflate = ((android.view.LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(brstore.makro.app.R.layout.directory_listview, (android.view.ViewGroup) null);
        this.f9971l.setView(inflate);
        this.f9970k = (boxbr.apksrebrand.smarters.view.utility.ListViewMaxHeight) inflate.findViewById(brstore.makro.app.R.id.lv_ch);
        this.f9971l.setCancelable(false);
        return this.f9971l;
    }
}
