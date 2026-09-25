package f.j.a.h.f;

/* loaded from: classes.dex */
public class c extends java.lang.Thread {

    /* renamed from: h, reason: collision with root package name */
    public static int f10025h;
    public java.lang.String b;
    public double c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10026d = false;

    /* renamed from: e, reason: collision with root package name */
    public double f10027e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f10028f = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    public long f10029g;

    public c(java.lang.String str) {
        this.b = "";
        this.b = str;
    }

    public double a() {
        return d(this.f10028f, 2);
    }

    public double b() {
        try {
            new java.math.BigDecimal(f10025h);
            if (f10025h < 0) {
                return 0.0d;
            }
            double currentTimeMillis = java.lang.System.currentTimeMillis() - this.f10029g;
            java.lang.Double.isNaN(currentTimeMillis);
            double d2 = currentTimeMillis / 1000.0d;
            this.f10027e = d2;
            double d3 = f10025h;
            java.lang.Double.isNaN(d3);
            return d(java.lang.Double.valueOf(((d3 / 1000.0d) * 8.0d) / d2).doubleValue(), 2);
        } catch (java.lang.Exception unused) {
            return 0.0d;
        }
    }

    public boolean c() {
        return this.f10026d;
    }

    public final double d(double d2, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        try {
            return new java.math.BigDecimal(d2).setScale(i2, java.math.RoundingMode.HALF_UP).doubleValue();
        } catch (java.lang.Exception unused) {
            return 0.0d;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            java.net.URL url = new java.net.URL(this.b);
            f10025h = 0;
            this.f10029g = java.lang.System.currentTimeMillis();
            java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(4);
            for (int i2 = 0; i2 < 4; i2++) {
                newFixedThreadPool.execute(new f.j.a.h.f.b(url));
            }
            newFixedThreadPool.shutdown();
            while (!newFixedThreadPool.isTerminated()) {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            double currentTimeMillis = java.lang.System.currentTimeMillis() - this.f10029g;
            java.lang.Double.isNaN(currentTimeMillis);
            double d2 = currentTimeMillis / 1000.0d;
            this.c = d2;
            double d3 = f10025h;
            java.lang.Double.isNaN(d3);
            this.f10028f = java.lang.Double.valueOf(((d3 / 1000.0d) * 8.0d) / d2).doubleValue();
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        this.f10026d = true;
    }
}
