package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivityy5 extends AppCompatActivity {

    Spinner spinner;
    int flags[] = {R.drawable.eagle,R.drawable.peacock,R.drawable.duck,R.drawable.parrot,R.drawable.sparrow,R.drawable.pigeon,R.drawable.ostrich,R.drawable.ibis,R.drawable.kingfisher,R.drawable.owl};
    String[] country={"Eagle","Peacock","Duck","Parrot","Sparrow","Pigeon","Ostrich","Ibis","Kingfisher","Owl"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_activityy5);
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
                Toast.makeText(CustomSpinnerActivityy5.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
