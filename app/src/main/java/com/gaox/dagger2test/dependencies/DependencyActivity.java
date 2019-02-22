package com.gaox.dagger2test.dependencies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.gaox.dagger2test.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DependencyActivity extends AppCompatActivity {

    private static final String TAG = "DependencyActivity";


    @BindView(R.id.tv_denpendency)
    TextView mTextView;

    @Inject
    RetrofitHelper retrofitHelper;

    @Inject
    ApiService apiService;

    @Inject
    App appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denpendency);

        ButterKnife.bind(this);

        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule())
                .build().inject(this);

        Log.i(TAG,"============"+retrofitHelper.toString());
        Log.i(TAG,"============"+apiService.toString());
        Log.i(TAG,"============"+appContext.toString());
    }
}
