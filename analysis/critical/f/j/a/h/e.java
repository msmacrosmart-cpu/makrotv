package f.j.a.h;

/* loaded from: classes.dex */
public class e {
    public final mbanje.kurt.fabbutton.FabButton a;
    public boolean b;

    public e(mbanje.kurt.fabbutton.FabButton fabButton, android.app.Activity activity) {
        new android.os.Handler();
        this.b = false;
        this.a = fabButton;
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        this.a.d(true);
        this.b = true;
    }

    public void c() {
        this.a.d(false);
        this.b = false;
    }
}
