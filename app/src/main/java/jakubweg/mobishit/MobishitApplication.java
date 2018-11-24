package jakubweg.mobishit;

import android.app.Application;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.squareup.leakcanary.LeakCanary;

import jakubweg.mobishit.helper.CrashHandler;

public class MobishitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
        FirebaseApp.initializeApp(this);

        if (!BuildConfig.DEBUG)
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @SuppressWarnings("ResultOfMethodCallIgnored")
                @Override
                public void uncaughtException(Thread thread, Throwable exception) {
                    try {
                        Log.e("FATAL EXCEPTION", "Uncaught exception crashed Mobishit", exception);
                        CrashHandler.INSTANCE.onNewCrash(getApplicationContext(), thread, exception);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }
}