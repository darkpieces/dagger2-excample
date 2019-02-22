package com.gaox.dagger2test.dependencies;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author: gaox
 * @date: 2019/02/20 15:05
 */
@Module
public class AppModule {

    private App appContext;

    public AppModule(App appContext) {
        this.appContext = appContext;
    }

    @Provides
    @Singleton
    public App providesAppContext() {
        return appContext;
    }
}
