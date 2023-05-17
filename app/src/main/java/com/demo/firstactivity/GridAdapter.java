package com.demo.firstactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context GridViewActivity;
    int[] singer;
    String[] name;

    public GridAdapter(GridViewActivity gridViewActivity, int[] singer, String[] name) {
        this.GridViewActivity = gridViewActivity;
        this.singer = singer;
       this.name = name;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(GridViewActivity).inflate(R.layout.gridview_item_file, null);
        ImageView img = convertView.findViewById(R.id.img);
        TextView text1 = convertView.findViewById(R.id.text1);
        img.setImageResource(singer[i]);
        text1.setText(name[i]);
        return convertView;
    }
}
