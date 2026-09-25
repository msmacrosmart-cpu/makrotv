package f.j.a.f;

/* loaded from: classes.dex */
public class f {
    public static android.content.SharedPreferences a = null;
    public static android.content.SharedPreferences.Editor b = null;
    public static java.lang.String c = "";

    public static java.lang.String a(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        java.lang.String string = defaultSharedPreferences.getString(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
        c = string;
        return string.toLowerCase();
    }

    public static java.lang.String b(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        java.lang.String string = defaultSharedPreferences.getString("notificationkey", "");
        c = string;
        return string;
    }

    public static java.lang.String c(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        java.lang.String string = defaultSharedPreferences.getString("key", "");
        c = string;
        return string;
    }

    public static java.lang.String d(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        java.lang.String string = defaultSharedPreferences.getString("salt", "");
        c = string;
        return string;
    }

    public static void e(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        b = edit;
        edit.putString(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
        b.commit();
    }

    public static void f(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        b = edit;
        edit.putString("notificationkey", str);
        b.commit();
    }

    public static void g(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        b = edit;
        edit.putString("key", str);
        b.commit();
    }

    public static void h(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        a = defaultSharedPreferences;
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        b = edit;
        edit.putString("salt", str);
        b.commit();
    }
}
