package f.j.a.h;

/* loaded from: classes.dex */
public class g {
    public final java.util.concurrent.locks.Lock a;
    public java.util.concurrent.locks.Condition b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10033d;

    public g() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.c = false;
        this.f10033d = false;
    }

    public void a() {
        this.a.lock();
        try {
            android.util.Log.v("ThreadControl", "Cancelling");
            if (this.f10033d) {
                return;
            }
            this.f10033d = true;
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public boolean b() {
        return this.f10033d;
    }

    public void c() {
        this.a.lock();
        android.util.Log.v("ThreadControl", "Pausing");
        this.c = true;
        this.a.unlock();
    }

    public void d() {
        this.a.lock();
        try {
            android.util.Log.v("ThreadControl", "Resuming");
            if (this.c) {
                this.c = false;
                this.b.signalAll();
            }
        } finally {
            this.a.unlock();
        }
    }

    public void e() {
        this.a.lock();
        while (this.c && !this.f10033d) {
            try {
                android.util.Log.v("ThreadControl", "Going to wait");
                this.b.await();
                android.util.Log.v("ThreadControl", "Done waiting");
            } finally {
                this.a.unlock();
            }
        }
    }
}
