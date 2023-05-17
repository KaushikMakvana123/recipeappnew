package com.demo.firstactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelclassArraylistAdapter extends BaseAdapter {

    Context modelclassArraylistActivity;
    ArrayList<ModelClass> list;
    private int Name;

    public  ModelclassArraylistAdapter(ModelClassArraylistActivity modelclassListviewActivity, ArrayList<ModelClass> list) {
      this.list=list;
      this.modelclassArraylistActivity=modelclassListviewActivity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view = LayoutInflater.from(modelclassArraylistActivity).inflate(R.layout.modelclass_arraylist_item_file,null);
        TextView txtName = view.findViewById(R.id.txtName);
        txtName.setText(list.get(i).Name);

        return view;
    }
}