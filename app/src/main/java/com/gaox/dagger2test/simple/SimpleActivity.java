package com.gaox.dagger2test.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.gaox.dagger2test.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleActivity extends AppCompatActivity {

    private static final String TAG = "SimpleActivity";

    @Inject
    @SugarWithButter
    Sugar sugar;

    @Inject
    @SugarWithNone
    Sugar sugar2;

    @Inject
    @SugarWithNone
    Sugar sugar3;

    @BindView(R.id.tv_simple)
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        ButterKnife.bind(this);
        //simple

        DaggerMainComponent.create().inject(this);


        //                if (sugar != null && sugar.isSweet()) {
        //                    Log.i(TAG, sugar.getColor() + "的糖有点甜");
        //                }

        if (sugar != null) {
            Log.i(TAG, sugar.toString());
        }

        if (sugar2 != null) {
            Log.i(TAG, sugar2.toString());
        }

        if (sugar3 != null) {
            Log.i(TAG, sugar3.toString());
        }


    }
}
