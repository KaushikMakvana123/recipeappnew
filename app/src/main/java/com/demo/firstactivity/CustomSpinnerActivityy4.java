package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivityy4 extends AppCompatActivity {

    Spinner spinner;
    int flags[] = {R.drawable.carrot,R.drawable.tomato,R.drawable.potato,R.drawable.onion,R.drawable.cabbage,R.drawable.broccoli,R.drawable.pumpkin,R.drawable.brinjal,R.drawable.greenpeas,R.drawable.capsicum};
    String[] country={"Carrot","Tomato","Potato","Onion","Cabbage","Broccoli","Pumpkin","Brinjal","Greenpeas","Capsicum"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_activityy4);
        initview();

    }

    private void initview() {

        spinner=findViewById(R.id.spinner);
        Adapter adapter= new Adapter(this,country,flags);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), country[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(CustomSpinnerActivityy4.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
