package com.gaox.dagger2test.mvp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author: gaox
 * @date: 2019/02/21 13:05
 */
@Module
public class MVPModule {

    private MVPContact.MvpView view;

    public MVPModule(MVPContact.MvpView view) {
        this.view = view;
    }

    @Provides
    public MVPContact.MvpView providesMVPView() {
        return view;
    }

    @Singleton
    @Provides
    public MVPresenter providesMVPresenter(MVPContact.MvpView mvpView){
        return  new MVPresenter(mvpView);
    }

}
