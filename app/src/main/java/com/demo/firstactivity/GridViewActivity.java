package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {

    GridView gridview;
    int singer[] = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10,R.drawable.i11,};
    String[] name={"Nehakakar,ApDhilon,SidhuMoosewala,Badshah,King,YoyoHoneysingh,Arijitsingh,Armanmalik,Sonunigam,Sanam,DhvaniBhanushali"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        initview();
    }

    private void initview() {
        gridview = findViewById(R.id.gridview);
        GridAdapter gridAdapter=new GridAdapter(GridViewActivity.this,singer,name);
        gridview.setAdapter(gridAdapter);
    }
}