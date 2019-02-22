package com.gaox.dagger2test.dependencies;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author: gaox
 * @date: 2019/02/20 15:06
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    App getAppContext();
}
