package com.gaox.dagger2test.dependencies;

import android.app.Application;

/**
 * @author: gaox
 * @date: 2019/02/20 15:05
 */
public class App extends Application {

    private static App appContext;
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }

    public static AppComponent getAppComponent() {

        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(appContext))
                    .build();
        }
        return appComponent;
    }
}
