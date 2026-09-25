package f.j.a.f;

@android.annotation.SuppressLint({"SimpleDateFormat"})
/* loaded from: classes.dex */
public class a {
    public static f.j.a.f.c<java.lang.String> a;
    public static java.lang.String b = f.j.a.f.g.a.a;

    public static java.lang.String a(android.content.Context context, java.lang.String str, int i2, java.lang.String str2, java.util.List<f.j.a.f.e> list) {
        try {
            m.x xVar = new m.x();
            m.x.b s = xVar.s();
            s.c(30L, java.util.concurrent.TimeUnit.SECONDS);
            s.e(30L, java.util.concurrent.TimeUnit.SECONDS);
            s.f(true);
            s.a();
            m.a0 a0Var = null;
            if (str2.equals("")) {
                m.a0.a aVar = new m.a0.a();
                aVar.j(b + str);
                aVar.e("User-Agent", "IPTV Smarters Pro");
                a0Var = aVar.b();
            }
            if (str2.equalsIgnoreCase("GET")) {
                m.a0.a aVar2 = new m.a0.a();
                aVar2.j(b + str);
                aVar2.e("User-Agent", "IPTV Smarters Pro");
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        aVar2.a(list.get(i3).b(), list.get(i3).c());
                    }
                }
                aVar2.a(org.jsoup.helper.HttpConnection.CONTENT_TYPE, "application/json; charset=utf-8");
                a0Var = aVar2.b();
            }
            if (str2.equalsIgnoreCase("Form")) {
                m.q.a aVar3 = new m.q.a();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    aVar3.a(list.get(i4).b(), list.get(i4).c());
                }
                m.q c = aVar3.c();
                m.a0.a aVar4 = new m.a0.a();
                aVar4.j(b + str);
                aVar4.e("User-Agent", "IPTV Smarters Pro");
                aVar4.a(org.jsoup.helper.HttpConnection.CONTENT_TYPE, "application/json; charset=utf-8");
                aVar4.h(c);
                a0Var = aVar4.b();
            }
            if (str2.equalsIgnoreCase("FormAPI")) {
                m.q.a aVar5 = new m.q.a();
                for (int i5 = 0; i5 < list.size(); i5++) {
                    aVar5.a(list.get(i5).b(), list.get(i5).c());
                }
                m.q c2 = aVar5.c();
                m.a0.a aVar6 = new m.a0.a();
                aVar6.j(b + str);
                aVar6.e("User-Agent", "IPTV Smarters Pro");
                aVar6.a(org.jsoup.helper.HttpConnection.CONTENT_TYPE, "application/json; charset=utf-8");
                aVar6.h(c2);
                a0Var = aVar6.b();
            }
            if (str2.equalsIgnoreCase("DEL")) {
                m.a0.a aVar7 = new m.a0.a();
                aVar7.j(b + str);
                aVar7.e("User-Agent", "IPTV Smarters Pro");
                if (list != null) {
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        aVar7.a(list.get(i6).b(), list.get(i6).c());
                    }
                }
                aVar7.a(org.jsoup.helper.HttpConnection.CONTENT_TYPE, "application/json; charset=utf-8");
                aVar7.c();
                a0Var = aVar7.b();
            }
            if (str2.equalsIgnoreCase("Multipart")) {
                m.v c3 = m.v.c("image/png");
                m.v c4 = m.v.c("video/*");
                m.w.a aVar8 = new m.w.a();
                for (int i7 = 0; i7 < list.size(); i7++) {
                    if (list.get(i7).a() != null) {
                        if (list.get(i7).a().getAbsolutePath().endsWith(".png") || list.get(i7).a().getAbsolutePath().endsWith(".jpg") || list.get(i7).a().getAbsolutePath().endsWith(".jpeg")) {
                            aVar8.f(m.w.f11016f);
                            aVar8.b(list.get(i7).b(), list.get(i7).a().getName(), m.b0.c(c3, list.get(i7).a()));
                        }
                        if (list.get(i7).a().getAbsolutePath().endsWith(".mp4") || list.get(i7).a().getAbsolutePath().endsWith(".mpeg") || list.get(i7).a().getAbsolutePath().endsWith(".3gp") || list.get(i7).a().getAbsolutePath().endsWith(".avi")) {
                            aVar8.f(m.w.f11016f);
                            aVar8.b(list.get(i7).b(), list.get(i7).a().getName(), m.b0.c(c4, list.get(i7).a()));
                        }
                    } else {
                        aVar8.f(m.w.f11016f);
                        aVar8.a(list.get(i7).b(), list.get(i7).c());
                    }
                }
                m.w e2 = aVar8.e();
                m.a0.a aVar9 = new m.a0.a();
                aVar9.j(b + str);
                aVar9.e("User-Agent", "IPTV Smarters Pro");
                aVar9.h(e2);
                a0Var = aVar9.b();
            }
            return xVar.a(a0Var).execute().a().D();
        } catch (java.net.SocketTimeoutException e3) {
            e3.printStackTrace();
            a.p(i2);
            return "";
        } catch (java.io.IOException e4) {
            e4.printStackTrace();
            a.p(i2);
            return "";
        } catch (java.lang.Exception e5) {
            e5.printStackTrace();
            a.p(i2);
            return "";
        }
    }
}
