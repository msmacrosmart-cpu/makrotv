package f.j.a.h.h.e;

/* loaded from: classes.dex */
public class a extends d.w.d.f.AbstractC0123f {

    /* renamed from: d, reason: collision with root package name */
    public final f.j.a.h.h.e.a.InterfaceC0271a f10086d;

    /* renamed from: f.j.a.h.h.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0271a {
        void d(int i2);

        boolean f(int i2, int i3);
    }

    public a(f.j.a.h.h.e.a.InterfaceC0271a interfaceC0271a) {
        this.f10086d = interfaceC0271a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.w.d.f.AbstractC0123f
    public void A(androidx.recyclerview.widget.RecyclerView.d0 d0Var, int i2) {
        if (i2 != 0 && (d0Var instanceof f.j.a.h.h.e.b.e)) {
            ((f.j.a.h.h.e.b.e) d0Var).c();
        }
        super.A(d0Var, i2);
    }

    @Override // d.w.d.f.AbstractC0123f
    public void B(androidx.recyclerview.widget.RecyclerView.d0 d0Var, int i2) {
        this.f10086d.d(d0Var.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.w.d.f.AbstractC0123f
    public void c(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.d0 d0Var) {
        super.c(recyclerView, d0Var);
        if (d0Var instanceof f.j.a.h.h.e.b.e) {
            ((f.j.a.h.h.e.b.e) d0Var).b();
        }
    }

    @Override // d.w.d.f.AbstractC0123f
    public int k(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.d0 d0Var) {
        return d.w.d.f.AbstractC0123f.t(3, 32);
    }

    @Override // d.w.d.f.AbstractC0123f
    public boolean q() {
        return true;
    }

    @Override // d.w.d.f.AbstractC0123f
    public boolean r() {
        return true;
    }

    @Override // d.w.d.f.AbstractC0123f
    public void u(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.d0 d0Var, float f2, float f3, int i2, boolean z) {
        if (i2 != 1) {
            super.u(canvas, recyclerView, d0Var, f2, f3, i2, z);
        } else if (d0Var instanceof f.j.a.h.h.e.b.g) {
            d.h.r.s.c0(((f.j.a.h.h.e.b.g) d0Var).A, f2);
        }
    }

    @Override // d.w.d.f.AbstractC0123f
    public boolean y(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.d0 d0Var, androidx.recyclerview.widget.RecyclerView.d0 d0Var2) {
        if (d0Var.o() != d0Var2.o()) {
            return false;
        }
        this.f10086d.f(d0Var.m(), d0Var2.m());
        return true;
    }
}
