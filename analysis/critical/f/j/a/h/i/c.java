package f.j.a.h.i;

/* loaded from: classes.dex */
public class c extends java.lang.Thread {
    public java.util.HashMap<java.lang.Integer, java.lang.String> b = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.Integer, java.util.List<java.lang.String>> c = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public double f10108d = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    public double f10109e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10110f = false;

    public java.util.HashMap<java.lang.Integer, java.lang.String> a() {
        return this.b;
    }

    public double b() {
        return this.f10108d;
    }

    public double c() {
        return this.f10109e;
    }

    public java.util.HashMap<java.lang.Integer, java.util.List<java.lang.String>> d() {
        return this.c;
    }

    public boolean e() {
        return this.f10110f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://www.speedtest.net/speedtest-config.php").openConnection();
            httpURLConnection.getContentLength();
            char c = 0;
            char c2 = 1;
            if (httpURLConnection.getResponseCode() == 200) {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.contains("isp=")) {
                            this.f10108d = java.lang.Double.parseDouble(readLine.split("lat=\"")[1].split(" ")[0].replace("\"", ""));
                            this.f10109e = java.lang.Double.parseDouble(readLine.split("lon=\"")[1].split(" ")[0].replace("\"", ""));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
            }
            try {
                java.net.HttpURLConnection httpURLConnection2 = (java.net.HttpURLConnection) new java.net.URL("https://www.speedtest.net/speedtest-servers-static.php").openConnection();
                if (httpURLConnection2.getResponseCode() == 200) {
                    java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection2.getInputStream()));
                    int i2 = 0;
                    while (true) {
                        java.lang.String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        if (readLine2.contains("<server url")) {
                            java.lang.String str = readLine2.split("server url=\"")[c2].split("\"")[c];
                            java.lang.String str2 = readLine2.split("lat=\"")[c2].split("\"")[c];
                            java.lang.String str3 = readLine2.split("lon=\"")[c2].split("\"")[c];
                            java.lang.String str4 = readLine2.split("name=\"")[c2].split("\"")[c];
                            java.lang.String str5 = readLine2.split("country=\"")[c2].split("\"")[c];
                            java.lang.String str6 = readLine2.split("cc=\"")[c2].split("\"")[c];
                            java.lang.String str7 = readLine2.split("sponsor=\"")[c2].split("\"")[c];
                            c = 0;
                            java.util.List<java.lang.String> asList = java.util.Arrays.asList(str2, str3, str4, str5, str6, str7, readLine2.split("host=\"")[c2].split("\"")[0]);
                            this.b.put(java.lang.Integer.valueOf(i2), str);
                            this.c.put(java.lang.Integer.valueOf(i2), asList);
                            i2++;
                            c2 = 1;
                        }
                    }
                    bufferedReader2.close();
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            this.f10110f = true;
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
    }
}
