package com.youngport.quanzhuan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/1/16.
 */
public class WelcomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                startActivity(new Intent(WelcomeActivity.this,MainActivity2.class));
                startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                finish();
            }
        },3000);
    }

}
