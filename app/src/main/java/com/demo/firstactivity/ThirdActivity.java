package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    ImageView imgNxt;
    TextView TextSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initview();
    }

    private void initview() {
        imgNxt = findViewById(R.id.imgNxt);
        TextSkip = findViewById(R.id.TextSkip);

        imgNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(i);

            }
        });


        TextSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(i);

            }
        });
    }
}