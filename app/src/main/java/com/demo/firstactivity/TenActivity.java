package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class TenActivity extends AppCompatActivity {

    ImageView ImgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        initview();


    }

    private void initview() {
        ImgBack = findViewById(R.id.ImgBack);

        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TenActivity.this,NinthActivity.class);
                startActivity(i);
            }
        });

    }
}







