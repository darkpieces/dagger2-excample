package com.gaox.dagger2test.mvp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author: gaox
 * @date: 2019/02/20 15:06
 */

@Singleton
@Component(modules = MVPModule.class)
public interface MVPComponent {

    void inject(MVPActivity mvpActivity);
}
