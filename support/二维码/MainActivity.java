package com.arc.empty;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


/**
 * 如果要成为一个活动那么必须继承Activity类，复写onCreate（）
 * A login screen that offers login via email/password.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过R.layout.文件名称来关联这个

        //点击事件
        Button qr_btn_create_img = (Button) findViewById(R.id.qr_btn_create_img);
        qr_btn_create_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //输出图片
                ImageView imageView = findViewById(R.id.outputImage);
                //输入框
                EditText sms = (EditText) findViewById(R.id.qr_input_sms_1);

                new CreateCode().attemptLogin(sms, imageView, getApplicationContext());
            }
        });

    }

}
