package f.j.a.h.f;

/* loaded from: classes.dex */
public class d extends java.lang.Thread {
    public java.lang.String b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public double f10030d;

    /* renamed from: e, reason: collision with root package name */
    public double f10031e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10032f;

    public d(java.lang.String str, int i2) {
        new java.util.HashMap();
        this.b = "";
        this.f10030d = 0.0d;
        this.f10031e = 0.0d;
        this.f10032f = false;
        this.b = str;
        this.c = i2;
    }

    public double a() {
        return this.f10031e;
    }

    public double b() {
        return this.f10030d;
    }

    public boolean c() {
        return this.f10032f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            java.lang.ProcessBuilder processBuilder = new java.lang.ProcessBuilder("ping", "-c" + this.c, this.b);
            processBuilder.redirectErrorStream(true);
            java.lang.Process start = processBuilder.start();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(start.getInputStream()));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.contains("icmp_seq")) {
                    this.f10030d = java.lang.Double.parseDouble(readLine.split(" ")[readLine.split(" ").length - 2].replace("time=", ""));
                }
                if (readLine.startsWith("rtt ")) {
                    this.f10031e = java.lang.Double.parseDouble(readLine.split("/")[4]);
                    break;
                }
            }
            start.waitFor();
            bufferedReader.close();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        } catch (java.lang.InterruptedException e3) {
            e3.printStackTrace();
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
        }
        this.f10032f = true;
    }
}
