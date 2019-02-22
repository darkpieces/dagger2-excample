package com.gaox.dagger2test.dependencies;

import android.util.Log;

/**
 * @author: gaox
 * @date: 2019/02/20 15:19
 */
public class RetrofitHelper {

    public RetrofitHelper(App appContext) {
        Log.i("=======", "RetrofitHelper:" + appContext.toString());
    }
}
