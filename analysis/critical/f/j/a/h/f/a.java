package f.j.a.h.f;

/* loaded from: classes.dex */
public class a extends java.lang.Thread {
    public java.lang.String b;
    public long c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f10017d = 0;

    /* renamed from: e, reason: collision with root package name */
    public double f10018e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public int f10019f = 0;

    /* renamed from: g, reason: collision with root package name */
    public double f10020g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10021h = false;

    /* renamed from: i, reason: collision with root package name */
    public double f10022i = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public int f10023j = 15;

    /* renamed from: k, reason: collision with root package name */
    public java.net.HttpURLConnection f10024k = null;

    public a(java.lang.String str) {
        this.b = "";
        this.b = str;
    }

    public double a() {
        return d(this.f10020g, 2);
    }

    public double b() {
        return this.f10022i;
    }

    public boolean c() {
        return this.f10021h;
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

    public void e(int i2, double d2) {
        double d3;
        if (i2 >= 0) {
            double d4 = (i2 * 8) / 1000000;
            java.lang.Double.isNaN(d4);
            d3 = d(java.lang.Double.valueOf(d4 / d2).doubleValue(), 2);
        } else {
            d3 = 0.0d;
        }
        this.f10022i = d3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i2 = 0;
        this.f10019f = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.b + "random4000x4000.jpg");
        arrayList.add(this.b + "random3000x3000.jpg");
        this.c = java.lang.System.currentTimeMillis();
        java.util.Iterator it = arrayList.iterator();
        loop0: while (it.hasNext()) {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL((java.lang.String) it.next()).openConnection();
                this.f10024k = httpURLConnection;
                i2 = httpURLConnection.getResponseCode();
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            if (i2 == 200) {
                try {
                    byte[] bArr = new byte[10240];
                    java.io.InputStream inputStream = this.f10024k.getInputStream();
                    do {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            this.f10019f += read;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            this.f10017d = currentTimeMillis;
                            double d2 = currentTimeMillis - this.c;
                            java.lang.Double.isNaN(d2);
                            double d3 = d2 / 1000.0d;
                            this.f10018e = d3;
                            e(this.f10019f, d3);
                        } else {
                            inputStream.close();
                            this.f10024k.disconnect();
                        }
                    } while (this.f10018e < this.f10023j);
                } catch (java.lang.Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                java.lang.System.out.println("Link not found...");
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        this.f10017d = currentTimeMillis2;
        double d4 = currentTimeMillis2 - this.c;
        java.lang.Double.isNaN(d4);
        double d5 = d4 / 1000.0d;
        this.f10018e = d5;
        double d6 = this.f10019f * 8;
        java.lang.Double.isNaN(d6);
        this.f10020g = (d6 / 1000000.0d) / d5;
        this.f10021h = true;
    }
}
