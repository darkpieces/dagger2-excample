package com.gaox.dagger2test.dependencies;

import dagger.Component;

/**
 * @author: gaox
 * @date: 2019/02/20 15:06
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(DependencyActivity dependencyActivity);
}
