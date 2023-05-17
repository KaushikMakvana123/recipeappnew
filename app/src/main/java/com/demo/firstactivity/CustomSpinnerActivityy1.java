package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivityy1 extends AppCompatActivity {

    Spinner spinner;
    int flags[] = {R.drawable.mango,R.drawable.banana,R.drawable.pineapple,R.drawable.apple,R.drawable.watermelon,R.drawable.grape,R.drawable.orange,R.drawable.strawberry,R.drawable.cherries,R.drawable.pomegranate};
    String[] country={"Mango","Banana","Pineapple","Apple","Watermelon","Grape","Orange","Strawberry","Cherries","Pome"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_activityy1);
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
                Toast.makeText(CustomSpinnerActivityy1.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
