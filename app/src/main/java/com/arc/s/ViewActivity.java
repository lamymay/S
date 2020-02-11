package com.arc.s;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ViewActivity extends Activity implements View.OnClickListener {
    //    private ProgressBar processBar;
    private EditText testEditText;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定视图
        setContentView(R.layout.activity_view);
        // 在Activity中通过findViewById来查找这个控件
        findViewById(R.id.testBtn).setOnClickListener(this);
        testEditText = (EditText) findViewById(R.id.testEditText);
        //          processBar = findViewById(R.id.process1);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.testBtn) {
            String text = testEditText.getText().toString();//获取输入框的值
            String msg = "点我了，获取输入框的值=" + text;
            Toast.makeText(this, "=-=  \n" + msg, Toast.LENGTH_SHORT).show();
            //            int progress = processBar.getProgress();
            //            progress += 10;
            //            if (progress > 100) {
            //                progress = 0;
            //            }
        }
    }

    //    @Override
    //    public void onBackPressed() {
    ////        super.onBackPressed();
    //        //返回时拦截
    //        AlertDialog.Builder builder = new AlertDialog.Builder(this);
    //        builder.setTitle("确认退出吗");
    //        builder.setMessage("退出");
    //        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
    //            @Override
    //            public void onClick(DialogInterface dialog, int which) {
    //                //点击后的操作
    //
    //            }
    //
    //        });
    //        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
    //            @Override
    //            public void onClick(DialogInterface dialog, int which) {
    //                //取消
    //                dialog.dismiss();
    //            }
    //        });
    //        builder.show();
    //    }
}
