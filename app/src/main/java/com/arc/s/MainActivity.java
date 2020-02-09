package com.arc.s;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

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


        //A to B  ,B is this
        int v1 = getIntent().getIntExtra("key1", 0);//接收int类型的数字，如果为null需要给默认值，基本数据类型注意给出默认值
        String v2 = getIntent().getStringExtra("key2");//接收String数据
        Toast.makeText(this, "接收到的参数" + v1 + v2, Toast.LENGTH_SHORT).show();//Toast 用于弹出提示
        //        Intent intent = new Intent( );
        //        intent.putExtra("int", 123456);
        //        intent.putExtra("s2", "String 啦啦啦");
        //        setResult(Activity.RESULT_OK,intent);
        //结束当前页面
        //        finish();
    }
}
