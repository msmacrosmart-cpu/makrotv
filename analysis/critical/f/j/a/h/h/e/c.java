package f.j.a.h.h.e;

/* loaded from: classes.dex */
public class c extends d.k.a.d implements f.j.a.h.h.e.b.f {
    public f.j.a.h.h.b Z;
    public d.w.d.f a0;

    /* loaded from: classes.dex */
    public class a implements f.j.a.h.h.e.b.d {
        public a() {
        }

        @Override // f.j.a.h.h.e.b.d
        public void a(android.view.View view) {
            switch (view.getId()) {
                case brstore.makro.app.R.id.container /* 2131362164 */:
                    android.util.Log.d("QueueListViewFragment", "onItemViewClicked() container " + view.getTag(brstore.makro.app.R.string.queue_tag_item));
                    f.j.a.h.h.e.c.this.Y1(view);
                    return;
                case brstore.makro.app.R.id.play_pause /* 2131363064 */:
                    android.util.Log.d("QueueListViewFragment", "onItemViewClicked() play-pause " + view.getTag(brstore.makro.app.R.string.queue_tag_item));
                    f.j.a.h.h.e.c.this.Z1(view);
                    return;
                case brstore.makro.app.R.id.play_upcoming /* 2131363066 */:
                    f.j.a.h.h.e.c.this.Z.v(view, (f.f.a.d.d.o) view.getTag(brstore.makro.app.R.string.queue_tag_item));
                    return;
                case brstore.makro.app.R.id.stop_upcoming /* 2131363395 */:
                    f.j.a.h.h.e.c.this.Z.w(view, (f.f.a.d.d.o) view.getTag(brstore.makro.app.R.string.queue_tag_item));
                    return;
                default:
                    return;
            }
        }
    }

    @Override // d.k.a.d
    public android.view.View F0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(brstore.makro.app.R.layout.fragment_recycler_list_view, viewGroup, false);
    }

    public final f.f.a.d.d.u.t.i X1() {
        f.f.a.d.d.u.d d2 = f.f.a.d.d.u.b.f(C()).d().d();
        if (d2 == null || !d2.c()) {
            return null;
        }
        return d2.p();
    }

    public final void Y1(android.view.View view) {
        f.f.a.d.d.u.t.i X1 = X1();
        if (X1 == null) {
            return;
        }
        f.f.a.d.d.o oVar = (f.f.a.d.d.o) view.getTag(brstore.makro.app.R.string.queue_tag_item);
        if (this.Z.t()) {
            android.util.Log.d("QueueListViewFragment", "Is detached: itemId = " + oVar.B());
            X1.H(f.j.a.h.h.f.b.a(this.Z.p()), this.Z.q(oVar.B()), 0, null);
            return;
        }
        if (this.Z.m() != oVar.B()) {
            X1.F(oVar.B(), null);
        } else if (f.f.a.d.d.u.b.f(C().getApplicationContext()).d().d() != null) {
            P1(new android.content.Intent(r(), (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.ExpandedControlsActivity.class));
        }
    }

    @Override // d.k.a.d
    public void Z0(android.view.View view, android.os.Bundle bundle) {
        super.Z0(view, bundle);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) g0().findViewById(brstore.makro.app.R.id.recycler_view);
        this.Z = f.j.a.h.h.b.n(C());
        f.j.a.h.h.e.b bVar = new f.j.a.h.h.e.b(r(), this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(r()));
        d.w.d.f fVar = new d.w.d.f(new f.j.a.h.h.e.a(bVar));
        this.a0 = fVar;
        fVar.m(recyclerView);
        bVar.a0(new f.j.a.h.h.e.c.a());
    }

    public final void Z1(android.view.View view) {
        f.f.a.d.d.u.t.i X1 = X1();
        if (X1 != null) {
            X1.W();
        }
    }

    @Override // f.j.a.h.h.e.b.f
    public void i(androidx.recyclerview.widget.RecyclerView.d0 d0Var) {
        this.a0.H(d0Var);
    }

    @Override // d.k.a.d
    public void v0(android.os.Bundle bundle) {
        super.v0(bundle);
        M1(true);
    }
}
