package com.demo.firstactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewArraylistAdapter  extends BaseAdapter {

    Context arrayListActivity;

    ArrayList<String> obj=new ArrayList<>();
    ArrayList<String> Number =new ArrayList<>();
    ArrayList<Integer> image=new ArrayList<>();

    public ListviewArraylistAdapter(ArrayListActivity arrayListActivity, ArrayList<String> obj,ArrayList<String> Number, ArrayList<Integer> image) {
        this.arrayListActivity=arrayListActivity;
        this.obj=obj;
        this.Number=Number;
        this.image=image;
    }

    @Override
    public int getCount() {
        return obj.size();
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
    public View getView(int i, View view, ViewGroup parent) {
        view = LayoutInflater.from(arrayListActivity).inflate(R.layout.listview_arrylist_item_file,null);
        TextView txtName= view.findViewById(R.id.txtName);
        TextView txtPhoneNumber= view.findViewById(R.id.txtPhoneNumber);
        ImageView imgContect = view.findViewById(R.id.imgContect);

        txtName.setText(obj.get(i));
        txtPhoneNumber.setText(Number.get(i));
        imgContect.setImageResource(image.get(i));

        return view;
    }
}
