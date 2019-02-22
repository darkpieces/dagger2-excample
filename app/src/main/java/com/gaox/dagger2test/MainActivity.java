package com.gaox.dagger2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gaox.dagger2test.dependencies.RetrofitHelper;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAINACTIVITY";

    @Inject
    RetrofitHelper retrofitHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}
