package com.example.goracing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public ImageView Car1;
    public ImageView Car2;
    public float i = 0;
    public boolean Down;
    public TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Car2 = (ImageView) findViewById(R.id.imageView3);
        text1 = (TextView) findViewById(R.id.textView1);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnLongClickListener(new View.OnLongClickListener() {

            public boolean onLongClick(View v) {
                Car2 = (ImageView) findViewById(R.id.imageView3);
                TranslateAnimation animation2 = new TranslateAnimation(0, 2100, 0, 0);
                animation2.setDuration(1500);
                animation2.setFillAfter(true);
                Car2.startAnimation(animation2);
                text1.setText("Game Over");
                return true;
            }

        });
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Car1 = (ImageView) findViewById(R.id.imageView4);
                TranslateAnimation animation = new TranslateAnimation(0, 2100, 0, 0);
                animation.setDuration(5000);
                animation.setFillAfter(true);
                Car1.startAnimation(animation);
            }
        });
    }
    }