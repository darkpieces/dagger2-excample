package com.gaox.dagger2test.dependencies;

import dagger.Module;
import dagger.Provides;

/**
 * @author: gaox
 * @date: 2019/02/20 15:05
 */
@Module
public class ActivityModule {

    @Provides
    public RetrofitHelper providesRetrofitHeloper(App appContext) {
        return new RetrofitHelper(appContext);
    }

}
