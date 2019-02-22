package com.gaox.dagger2test.simple;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author: gaox
 * @date: 2019/01/22 15:48
 */
@Module
public class MainModule {

    @Provides
    @SugarWithButter
    Sugar providesSugar(Butter butter) {
        return new Sugar("红色", true, butter);
    }

    @Provides
    @Singleton
    @SugarWithNone
    Sugar providesSugar2() {
        return new Sugar();
    }

    //    @Provides
    //    Butter providesButter() {
    //        return new Butter();
    //    }

}
