package f.j.a.h.h.f;

/* loaded from: classes.dex */
public class b {
    public static f.f.a.d.d.o[] a(java.util.List<f.f.a.d.d.o> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        f.f.a.d.d.o[] oVarArr = new f.f.a.d.d.o[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            oVarArr[i2] = b(list.get(i2));
        }
        return oVarArr;
    }

    public static f.f.a.d.d.o b(f.f.a.d.d.o oVar) {
        f.f.a.d.d.o.a aVar = new f.f.a.d.d.o.a(oVar);
        aVar.b();
        return aVar.a();
    }
}
