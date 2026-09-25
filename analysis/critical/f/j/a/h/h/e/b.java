package f.j.a.h.h.e;

/* loaded from: classes.dex */
public class b extends androidx.recyclerview.widget.RecyclerView.g<f.j.a.h.h.e.b.g> implements f.j.a.h.h.e.a.InterfaceC0271a {

    /* renamed from: d, reason: collision with root package name */
    public final f.j.a.h.h.b f10087d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f10088e;

    /* renamed from: f, reason: collision with root package name */
    public final f.j.a.h.h.e.b.f f10089f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f10090g;

    /* renamed from: h, reason: collision with root package name */
    public f.j.a.h.h.e.b.d f10091h;

    /* renamed from: i, reason: collision with root package name */
    public f.b.b.w.h f10092i;

    /* loaded from: classes.dex */
    public class a implements f.j.a.h.h.b.d {
        public a() {
        }

        @Override // f.j.a.h.h.b.d
        public void a() {
            f.j.a.h.h.e.b.this.t();
        }
    }

    /* renamed from: f.j.a.h.h.e.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0272b implements android.view.View.OnClickListener {
        public ViewOnClickListenerC0272b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view.getTag(brstore.makro.app.R.string.queue_tag_item) != null) {
                android.util.Log.d("QueueListAdapter", java.lang.String.valueOf(((f.f.a.d.d.o) view.getTag(brstore.makro.app.R.string.queue_tag_item)).B()));
            }
            f.j.a.h.h.e.b.this.Z(view);
        }
    }

    /* loaded from: classes.dex */
    public class c implements android.view.View.OnTouchListener {
        public final /* synthetic */ f.j.a.h.h.e.b.g b;

        public c(f.j.a.h.h.e.b.g gVar) {
            this.b = gVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            if (d.h.r.i.a(motionEvent) != 0) {
                return false;
            }
            f.j.a.h.h.e.b.this.f10089f.i(this.b);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(android.view.View view);
    }

    /* loaded from: classes.dex */
    public interface e {
        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public interface f {
        void i(androidx.recyclerview.widget.RecyclerView.d0 d0Var);
    }

    /* loaded from: classes.dex */
    public static class g extends androidx.recyclerview.widget.RecyclerView.d0 implements f.j.a.h.h.e.b.e {
        public android.view.ViewGroup A;
        public android.widget.ImageView B;
        public android.widget.TextView C;
        public android.widget.TextView D;
        public android.content.Context t;
        public final android.widget.ImageButton u;
        public android.view.View v;
        public android.view.View w;
        public android.widget.ImageButton x;
        public android.widget.ImageButton y;
        public com.android.volley.toolbox.NetworkImageView z;

        public g(android.view.View view) {
            super(view);
            this.t = view.getContext();
            this.A = (android.view.ViewGroup) view.findViewById(brstore.makro.app.R.id.container);
            this.B = (android.widget.ImageView) view.findViewById(brstore.makro.app.R.id.drag_handle);
            this.C = (android.widget.TextView) view.findViewById(brstore.makro.app.R.id.textView1);
            this.D = (android.widget.TextView) view.findViewById(brstore.makro.app.R.id.textView2);
            this.z = (com.android.volley.toolbox.NetworkImageView) view.findViewById(brstore.makro.app.R.id.imageView1);
            this.u = (android.widget.ImageButton) view.findViewById(brstore.makro.app.R.id.play_pause);
            this.v = view.findViewById(brstore.makro.app.R.id.controls);
            this.w = view.findViewById(brstore.makro.app.R.id.controls_upcoming);
            this.x = (android.widget.ImageButton) view.findViewById(brstore.makro.app.R.id.play_upcoming);
            this.y = (android.widget.ImageButton) view.findViewById(brstore.makro.app.R.id.stop_upcoming);
        }

        public final void S(int i2) {
            this.C.setTextAppearance(this.t, 2131951662);
            this.D.setTextAppearance(this.t, 2131951643);
            int i3 = brstore.makro.app.R.drawable.bg_item_normal_state;
            if (i2 == 0) {
                this.v.setVisibility(0);
                this.u.setVisibility(0);
            } else {
                if (i2 == 1) {
                    this.v.setVisibility(0);
                    this.u.setVisibility(8);
                    this.w.setVisibility(0);
                    this.B.setImageResource(brstore.makro.app.R.drawable.ic_drag_updown_white_24dp);
                    i3 = brstore.makro.app.R.drawable.bg_item_upcoming_state;
                    this.C.setTextAppearance(this.t, 2131952029);
                    android.widget.TextView textView = this.C;
                    textView.setTextAppearance(textView.getContext(), 2131951663);
                    this.D.setTextAppearance(this.t, 2131951643);
                    this.A.setBackgroundResource(i3);
                }
                this.v.setVisibility(8);
                this.u.setVisibility(8);
            }
            this.w.setVisibility(8);
            this.B.setImageResource(brstore.makro.app.R.drawable.ic_drag_updown_grey_24dp);
            this.A.setBackgroundResource(i3);
        }

        @Override // f.j.a.h.h.e.b.e
        public void b() {
            this.a.setBackgroundColor(0);
        }

        @Override // f.j.a.h.h.e.b.e
        public void c() {
        }
    }

    public b(android.content.Context context, f.j.a.h.h.e.b.f fVar) {
        this.f10088e = context.getApplicationContext();
        this.f10089f = fVar;
        f.j.a.h.h.b n2 = f.j.a.h.h.b.n(context);
        this.f10087d = n2;
        n2.z(new f.j.a.h.h.e.b.a());
        this.f10090g = new f.j.a.h.h.e.b.ViewOnClickListenerC0272b();
        Q(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void D(f.j.a.h.h.e.b.g gVar, int i2) {
        try {
            android.util.Log.d("QueueListAdapter", "[upcoming] onBindViewHolder() for position: " + i2);
            f.f.a.d.d.o o2 = this.f10087d.o(i2);
            gVar.A.setTag(brstore.makro.app.R.string.queue_tag_item, o2);
            gVar.u.setTag(brstore.makro.app.R.string.queue_tag_item, o2);
            gVar.x.setTag(brstore.makro.app.R.string.queue_tag_item, o2);
            gVar.y.setTag(brstore.makro.app.R.string.queue_tag_item, o2);
            gVar.A.setOnClickListener(this.f10090g);
            gVar.u.setOnClickListener(this.f10090g);
            gVar.x.setOnClickListener(this.f10090g);
            gVar.y.setOnClickListener(this.f10090g);
            f.f.a.d.d.l E = o2.C().E();
            gVar.C.setText(E.C("com.google.android.gms.cast.metadata.TITLE"));
            gVar.D.setText(E.C("com.google.android.gms.cast.metadata.SUBTITLE"));
            if (!E.A().isEmpty()) {
                java.lang.String uri = E.A().get(0).x().toString();
                f.b.b.w.h a2 = f.j.a.h.h.f.a.b(this.f10088e).a();
                this.f10092i = a2;
                a2.e(uri, f.b.b.w.h.i(gVar.z, 0, 0));
                gVar.z.e(uri, this.f10092i);
            }
            gVar.B.setOnTouchListener(new f.j.a.h.h.e.b.c(gVar));
            if (o2 == this.f10087d.l()) {
                gVar.S(0);
                d0(gVar.u);
            } else if (o2 == this.f10087d.s()) {
                gVar.S(1);
            } else {
                gVar.S(2);
                gVar.u.setVisibility(8);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public f.j.a.h.h.e.b.g F(android.view.ViewGroup viewGroup, int i2) {
        return new f.j.a.h.h.e.b.g(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(brstore.makro.app.R.layout.queue_row, viewGroup, false));
    }

    public final void Z(android.view.View view) {
        f.j.a.h.h.e.b.d dVar = this.f10091h;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    public void a0(f.j.a.h.h.e.b.d dVar) {
        this.f10091h = dVar;
    }

    @Override // f.j.a.h.h.e.a.InterfaceC0271a
    public void d(int i2) {
        this.f10087d.y(i2);
    }

    public final void d0(android.widget.ImageButton imageButton) {
        int i2;
        f.f.a.d.d.u.d d2 = f.f.a.d.d.u.b.f(this.f10088e).d().d();
        f.f.a.d.d.u.t.i p2 = d2 == null ? null : d2.p();
        if (p2 == null) {
            imageButton.setVisibility(8);
            return;
        }
        int n2 = p2.n();
        if (n2 == 2) {
            i2 = brstore.makro.app.R.drawable.hplib_ic_pause;
        } else {
            if (n2 != 3) {
                imageButton.setVisibility(8);
                return;
            }
            i2 = brstore.makro.app.R.drawable.hp_play;
        }
        imageButton.setImageResource(i2);
    }

    @Override // f.j.a.h.h.e.a.InterfaceC0271a
    public boolean f(int i2, int i3) {
        if (i2 == i3) {
            return false;
        }
        this.f10087d.u(i2, i3);
        w(i2, i3);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int k() {
        return f.j.a.h.h.b.n(this.f10088e).k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long m(int i2) {
        return this.f10087d.o(i2).B();
    }
}
