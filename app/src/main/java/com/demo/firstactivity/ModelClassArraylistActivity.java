package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ModelClassArraylistActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<ModelClass> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_class_arraylist);
        initview();
    }

    private void initview() {
        listView = findViewById(R.id.listview);
        ModelClass n1 = new ModelClass();
        n1.setName("Android");
        list.add(n1);

        ModelClass n2 = new ModelClass();
        n2.setName("IOS");
        list.add(n2);

        ModelClass n3 = new ModelClass();
        n3.setName("Flutter");
        list.add(n3);

        ModelClass n4 = new ModelClass();
        n4.setName("Game");
        list.add(n4);

        ModelClass n5 = new ModelClass();
        n5.setName("UI");
        list.add(n5);

        ModelClass n6 = new ModelClass();
        n6.setName("BackEnd");
        list.add(n6);

        ModelClass n7 = new ModelClass();
        n7.setName("FrontEnd");
        list.add(n7);
        ModelclassArraylistAdapter adapter = new ModelclassArraylistAdapter(ModelClassArraylistActivity.this,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = list.get(position).Name;
                Toast.makeText(ModelClassArraylistActivity.this, "course name ==> " + data,Toast.LENGTH_SHORT).show();
            }
        });

    }
}