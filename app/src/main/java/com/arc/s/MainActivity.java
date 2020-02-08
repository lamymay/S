package com.arc.s;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 要运行，需要有有一个 Activity
 * 1、成为Activity类则需要继承Activity
 * 2、新建一个布局 src/main/res/layout/activity_main.xml
 * 问题：
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
