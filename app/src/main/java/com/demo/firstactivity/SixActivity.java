package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SixActivity extends AppCompatActivity {

    CardView cardSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        initview();
    }

    private void initview() {
        cardSign = findViewById(R.id.cardSign);

        cardSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SixActivity.this,SevenActivity.class);
                startActivity(i);
            }
        });
    }
}