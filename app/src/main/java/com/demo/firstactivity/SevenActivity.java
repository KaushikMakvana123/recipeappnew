package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SevenActivity extends AppCompatActivity {

    CardView Cardcnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        initview();
    }

    private void initview() {
        Cardcnt = findViewById(R.id.Cardcnt);

        Cardcnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SevenActivity.this,EightActivity.class);
                startActivity(i);
            }
        });
    }
}