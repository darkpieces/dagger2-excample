package com.gaox.dagger2test.simple;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author: gaox
 * @date: 2019/01/22 15:53
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(SimpleActivity simpleActivity);
}
