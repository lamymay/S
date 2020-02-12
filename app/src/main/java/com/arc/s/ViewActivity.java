package com.arc.s;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class ViewActivity extends Activity implements View.OnClickListener {
    private ProgressBar processBar2;
    private EditText testEditText;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定视图
        setContentView(R.layout.activity_view);
        // 在Activity中通过findViewById来查找这个控件
        findViewById(R.id.testBtn).setOnClickListener(this);
        testEditText = (EditText) findViewById(R.id.testEditText);
        processBar2 = findViewById(R.id.processBar1);
    }


    /**
     * 按钮点击事件
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.testBtn) {
//            String text = testEditText.getText().toString();//获取输入框的值
//            String msg = "点我了，获取输入框的值=" + text;
//            Toast.makeText(this, "=-=  \n" + msg, Toast.LENGTH_SHORT).show();

            //进度条 模拟， 每一次点击增加一点
            int progress = processBar2.getProgress();
            progress += 10;
            if (progress > 100) {
                progress = 0;
            }
            processBar2.setProgress(progress);
        }
    }


    /**
     * 测试进度条
     */
    @Override
    public void onBackPressed() {
        //        super.onBackPressed();
        //返回时拦截
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("确认退出吗");
        builder.setMessage("退出");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //点击后的操作
            }

        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //取消
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
