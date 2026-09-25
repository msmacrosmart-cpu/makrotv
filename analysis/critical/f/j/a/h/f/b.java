package f.j.a.h.f;

/* loaded from: classes.dex */
public class b extends java.lang.Thread {
    public java.net.URL b;

    public b(java.net.URL url) {
        this.b = url;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        java.net.HttpURLConnection httpURLConnection;
        java.io.DataOutputStream dataOutputStream;
        double currentTimeMillis;
        byte[] bArr = new byte[153600];
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        while (true) {
            try {
                httpURLConnection = (java.net.HttpURLConnection) this.b.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bArr, 0, 153600);
                dataOutputStream.flush();
                httpURLConnection.getResponseCode();
                double d2 = f.j.a.h.f.c.f10025h;
                double d3 = 153600;
                java.lang.Double.isNaN(d3);
                java.lang.Double.isNaN(d2);
                f.j.a.h.f.c.f10025h = (int) (d2 + (d3 / 1024.0d));
                currentTimeMillis = java.lang.System.currentTimeMillis() - currentTimeMillis2;
                java.lang.Double.isNaN(currentTimeMillis);
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            if (currentTimeMillis / 1000.0d >= 10) {
                return;
            }
            dataOutputStream.close();
            httpURLConnection.disconnect();
        }
    }
}
