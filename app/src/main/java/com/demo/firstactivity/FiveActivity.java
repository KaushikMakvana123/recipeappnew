package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiveActivity extends AppCompatActivity {

    CardView cardsign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        initview();
    }

    private void initview() {
        cardsign = findViewById(R.id.cardsign);

        cardsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FiveActivity.this,SixActivity.class);
                startActivity(i);
            }
        });
    }
}