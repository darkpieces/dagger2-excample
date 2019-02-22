package com.gaox.dagger2test.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gaox.dagger2test.R;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MVPActivity extends AppCompatActivity implements MVPContact.MvpView {

    private static final String TAG = "MVPActivity";


    @Inject
    MVPresenter mvPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        ButterKnife.bind(this);

        DaggerMVPComponent.builder()
                .mVPModule(new MVPModule(this))
                .build()
                .inject(this);


        mvPresenter.injectPSuccess();

    }

    @Override
    public void injectVSuccess() {
        Log.i("=====","v被成功注入");
    }
}
