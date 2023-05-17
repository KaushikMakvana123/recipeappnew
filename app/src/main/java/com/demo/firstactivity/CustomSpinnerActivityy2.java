package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomSpinnerActivityy2 extends AppCompatActivity {

    Spinner spinner;
    int flags[] = {R.drawable.c,R.drawable.cplusplus,R.drawable.java,R.drawable.javascript,R.drawable.android,R.drawable.css,R.drawable.html,R.drawable.python,R.drawable.frontend,R.drawable.backend};
    String[] country={"C","C++","Java","Javascript","Android","Css","HTML","Python","Frontend","Backend"};


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
                Toast.makeText(CustomSpinnerActivityy2.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
