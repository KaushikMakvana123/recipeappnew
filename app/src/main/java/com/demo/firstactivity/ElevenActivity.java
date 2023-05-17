package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ElevenActivity extends AppCompatActivity {
    ImageView imgBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        initview();
    }

    private void initview() {


            imgBtn =findViewById(R.id.imgBtn);

            imgBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ElevenActivity.this,NinthActivity.class);
                    startActivity(i);
                }
            });
    }
}