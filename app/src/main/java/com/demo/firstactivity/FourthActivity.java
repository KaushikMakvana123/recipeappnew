package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    ImageView imgnxt;

    TextView TextSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        initview();
    }

    private void initview() {
        imgnxt = findViewById(R.id.imgnxt);
        TextSkip = findViewById(R.id.TextSkip);

        imgnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthActivity.this,FiveActivity.class);
                startActivity(i);
            }
        });


        TextSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthActivity.this,FiveActivity.class);
                startActivity(i);

            }
        });

    }
}