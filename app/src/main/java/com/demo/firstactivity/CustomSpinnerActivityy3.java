package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivityy3 extends AppCompatActivity {

    Spinner spinner;
    int flags[] = {R.drawable.lion,R.drawable.tiger,R.drawable.yak,R.drawable.leopard,R.drawable.buffalo,R.drawable.cow,R.drawable.monkey,R.drawable.donkey,R.drawable.fox,R.drawable.dog};
    String[] country={"Lion","Tiger","Yak","Leopard","Buffalo","Cow","Monkey","Donkey","Fox","Dog"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_activityy3);
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
                Toast.makeText(CustomSpinnerActivityy3.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
