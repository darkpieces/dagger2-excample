package com.gaox.dagger2test.mvp;

import android.util.Log;

/**
 * @author: gaox
 * @date: 2019/02/22 11:14
 */
public class MVPresenter {


    private  MVPContact.MvpView view;

    public MVPresenter(MVPContact.MvpView view) {
        this.view =view;
    }

    public void injectPSuccess(){
        Log.i("=====","p被成功注入");
        view.injectVSuccess();

    }
}
