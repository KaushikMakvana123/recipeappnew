package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView list;

    String[]name ={"Maa","Papa","Bhai","Sistu","Dada","Dadi","Kaka","Kaki","Mama","Mami","Masa","Masi","Fui","Fua","Nana","Nani","MotaPapa","MotaMaa","Vishvas","Vicky"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initview();
    }

    private void initview() {
        list=findViewById(R.id.list) ;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,R.layout.listview_item_file,R.id.txtname,name);
        list.setAdapter(adapter);
    }
}