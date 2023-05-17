package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivityy extends AppCompatActivity {

    Spinner spinner;
    int flags[] = {R.drawable.america,R.drawable.japan,R.drawable.unitedkingdom,R.drawable.africa,R.drawable.arabia,R.drawable.philipines,R.drawable.japan,R.drawable.pakistan,R.drawable.indonesia,R.drawable.pakistan};
    String[] country={"India","America","Africa","Unitedkingdom","Indonesia","China","Arabia","Japan","Philipines","Pakistan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_activityy);
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
                Toast.makeText(CustomSpinnerActivityy.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
