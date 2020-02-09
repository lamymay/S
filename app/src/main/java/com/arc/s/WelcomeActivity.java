package com.arc.s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * @author 叶超
 * @since 2020/2/9 12:22
 */
public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定视图
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        //用Intent 实现跳转 ，作用： 从一个（this）活动跳转到另一个活动，第一个参数是当前类.this,第二个参数是要跳转的那个类.class
                        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);

                        //从一个a activity 跳转 b activity 并携带参数
                        intent.putExtra("key1", 123456);
                        intent.putExtra("key2", "String type");
                        // startActivityForResult(intent, 0x10);  // 收到返回值
                        startActivity(intent);
                    }
                }, 2000);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        //注意是两个code 别判断错了
//        if (requestCode == 0x10) {
//            if (resultCode == Activity.RESULT_OK) {
//                // B  to A ,A is this
//                // 注意是 data 中get
//                int v1 = data.getIntExtra("int", 0);//基本数据类型注意给出默认值}
//                String v2 = data.getStringExtra("s2");
//                Toast.makeText(this, "接收到的参数" + v1 + v2, Toast.LENGTH_SHORT).show();
//            }
//        }
//
//    }
}
