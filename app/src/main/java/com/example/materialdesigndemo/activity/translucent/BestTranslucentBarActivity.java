package com.example.materialdesigndemo.activity.translucent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.materialdesigndemo.R;

public class BestTranslucentBarActivity extends TranslucentBarBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_best_translucent_bar;
    }
}
