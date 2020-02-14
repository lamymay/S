package com.arc.s;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * @author 叶超
 * @since 2020/2/9 12:22
 */
public class WelcomeActivity2 extends Activity  implements View.OnClickListener  {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        findViewById(R.id.testBtn1).setOnClickListener(this);
        imageView= findViewById(R.id.testImageView1);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.testBtn1) {
            int level = imageView.getDrawable().getLevel();
            level += 1000;
            if (level > 10000) {
                level = 1000;
            }
            imageView.getDrawable().setLevel(level);
        }
    }
}


