package com.xxl.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


/**
 * @author xuelian.xiong 2021/1/22
 * @Package com.xxl.myapplication
 * @Title: MainActivity
 * @Description: (用一句话描述该文件做什么)
 * Create DateTime: 2021/1/22
 */
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, BuildConfig.debug, Toast.LENGTH_LONG).show();
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!BuildConfig.DEBUG) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, com.xxl.business1.BusinessActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}