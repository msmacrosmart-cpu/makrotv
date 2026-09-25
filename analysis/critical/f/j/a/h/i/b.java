package f.j.a.h.i;

/* loaded from: classes.dex */
public class b extends android.os.AsyncTask<java.lang.Void, java.lang.String, java.lang.String> {
    public android.content.Context a;
    public java.lang.String b;

    public b(android.content.Context context) {
        this.b = "";
        this.a = context;
        try {
            this.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public java.lang.String a(java.lang.String str) {
        return str.replaceAll("[\\-\\+\\.\\^:,]", "");
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.String doInBackground(java.lang.Void... voidArr) {
        try {
            return org.jsoup.Jsoup.connect("https://play.google.com/store/apps/details?id=boxbr.apksrebrand.smarters&hl=en").timeout(3000).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get().select(" div.hAyfc:nth-child(4) > span:nth-child(2) >div:nth-child(1) > span:nth-child(1)").first().ownText();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        int i2;
        int i3;
        super.onPostExecute(str);
        if (str == null || str.isEmpty()) {
            f.j.a.i.p.l.Q(false, this.a);
            f.j.a.i.p.l.P(false, this.a);
            return;
        }
        f.j.a.i.p.l.P(true, this.a);
        if (str.matches("\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d\\.\\d")) {
            java.lang.String a = a(str);
            java.lang.String a2 = a(this.b);
            if (a.length() > a2.length()) {
                int length = a.length() - a2.length();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(a2);
                for (int i4 = 0; i4 < length; i4++) {
                    stringBuffer.append(0);
                }
                a2 = stringBuffer.toString();
            } else if (a.length() < a2.length()) {
                int length2 = a2.length() - a.length();
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(a);
                for (int i5 = 0; i5 < length2; i5++) {
                    stringBuffer2.append(0);
                }
                a = stringBuffer2.toString();
            }
            try {
                i2 = java.lang.Integer.parseInt(a);
                i3 = java.lang.Integer.parseInt(a2);
            } catch (java.lang.NumberFormatException unused) {
                i2 = 1;
                i3 = 1;
            }
            if (i2 > i3) {
                f.j.a.i.p.l.Q(true, this.a);
                return;
            }
        }
        f.j.a.i.p.l.Q(false, this.a);
    }
}
