package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    ListView listview;
    int flags[] = {R.drawable.monank,R.drawable.vishwas,R.drawable.smit,R.drawable.vivek,R.drawable.prachi,R.drawable.palak,R.drawable.swarup,R.drawable.meet,R.drawable.vickyy,R.drawable.dharmesh,R.drawable.ketan,R.drawable.mohit,R.drawable.vishal,R.drawable.harshid,R.drawable.jenish,R.drawable.mehul,R.drawable.mihir,R.drawable.jatin,R.drawable.papa,R.drawable.chetna,R.drawable.sangita,R.drawable.dharmeshbhai};

    ArrayList<String> obj=new  ArrayList<>();
    ArrayList<String> Number =new  ArrayList<>();
    ArrayList<Integer> image =new  ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);
        initview();
    }

    private void initview() {
        listview=findViewById(R.id.listview);
        obj.add("Monank");
        obj.add("Vishwas");
        obj.add("Smit");
        obj.add("Vivek");
        obj.add("Prachi");
        obj.add("Palak");
        obj.add("Swarup");
        obj.add("Meet");
        obj.add("Vickyy");
        obj.add("Dharmesh");
        obj.add("Ketan");
        obj.add("Mohit");
        obj.add("Vishal");
        obj.add("Harshid");
        obj.add("Jenish");
        obj.add("Mehul");
        obj.add("Mihir");
        obj.add("Jatin");
        obj.add("Papa");
        obj.add("Chetna");
        obj.add("Sangita");
        obj.add("DharmeshBhai");


        obj.get(0);
        obj.get(1);
        obj.get(2);
        obj.get(3);
        obj.get(4);
        obj.get(5);
        obj.get(6);
        obj.get(7);
        obj.get(8);
        obj.get(9);
        obj.get(10);
        obj.get(11);
        obj.get(12);
        obj.get(13);
        obj.get(14);
        obj.get(15);
        obj.get(16);
        obj.get(17);
        obj.get(18);
        obj.get(19);
        obj.get(20);
        obj.get(21);

        Number.add("9510789849");
        Number.add("7069033821");
        Number.add("7096286480");
        Number.add("9054264609");
        Number.add("7069962540");
        Number.add("9725468586");
        Number.add("7359298919");
        Number.add("9624355462");
        Number.add("7859853103");
        Number.add("9427741387");
        Number.add("9624066810");
        Number.add("8530057108");
        Number.add("7698740807");
        Number.add("9924538740");
        Number.add("9054353475");
        Number.add("9510145374");
        Number.add("6354296986");
        Number.add("9586144070");
        Number.add("9574552110");
        Number.add("7041765985");
        Number.add("7041623844");
        Number.add("7990449819");





        Number.get(0);
        Number.get(1);
        Number.get(2);
        Number.get(3);
        Number.get(4);
        Number.get(5);
        Number.get(6);
        Number.get(7);
        Number.get(8);
        Number.get(9);
        Number.get(10);
        Number.get(11);
        Number.get(12);
        Number.get(13);
        Number.get(14);
        Number.get(15);
        Number.get(16);
        Number.get(17);
        Number.get(18);
        Number.get(19);
        Number.get(20);
        Number.get(21);



        image.add(R.drawable.monank);
        image.add(R.drawable.vishwas);
        image.add(R.drawable.smit);
        image.add(R.drawable.vivek);
        image.add(R.drawable.prachi);
        image.add(R.drawable.palak);
        image.add(R.drawable.swarup);
        image.add(R.drawable.meet);
        image.add(R.drawable.vickyy);
        image.add(R.drawable.dharmesh);
        image.add(R.drawable.ketan);
        image.add(R.drawable.mohit);
        image.add(R.drawable.vishal);
        image.add(R.drawable.harshid);
        image.add(R.drawable.jenish);
        image.add(R.drawable.mehul);
        image.add(R.drawable.mihir);
        image.add(R.drawable.jatin);
        image.add(R.drawable.papa);
        image.add(R.drawable.chetna);
        image.add(R.drawable.sangita);
        image.add(R.drawable.dharmeshbhai);




        image.get(0);
        image.get(1);
        image.get(2);
        image.get(3);
        image.get(4);
        image.get(5);
        image.get(6);
        image.get(7);
        image.get(8);
        image.get(9);
        image.get(10);
        image.get(11);
        image.get(12);
        image.get(13);
        image.get(14);
        image.get(15);
        image.get(16);
        image.get(17);
        image.get(18);
        image.get(19);
        image.get(20);
        image.get(21);




        ListviewArraylistAdapter adapterarray=new ListviewArraylistAdapter(ArrayListActivity.this,obj,Number,image);
        listview.setAdapter(adapterarray);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String phone = Number.get(position);
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+phone));
                startActivity(callIntent);

            }
        });




    }
}