package f.j.a.h.h;

/* loaded from: classes.dex */
public class c {
    public final android.content.Context a;

    public c(android.content.Context context) {
        this.a = context;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent(this.a, (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.castserver.CastServerService.class);
        intent.putExtra("127.0.0.1", str);
        intent.putExtra(".", str2);
        this.a.startService(intent);
    }

    public void b() {
        this.a.stopService(new android.content.Intent(this.a, (java.lang.Class<?>) boxbr.apksrebrand.smarters.miscelleneious.chromecastfeature.castserver.CastServerService.class));
    }
}
