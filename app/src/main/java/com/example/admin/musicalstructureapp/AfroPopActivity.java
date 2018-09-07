package com.example.admin.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class AfroPopActivity extends AppCompatActivity {
    ListView listView = findViewById(R.id.array_list_view);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afro_pop);

//ArrayList of data
        ArrayList <AfroPop> afroPopArray = new ArrayList <AfroPop>();
        //Creating objects of AfroPopMusic defines in com.example.admin.musicalstructureapp.AfroPop class
        afroPopArray.add(new AfroPop("African Beauty", "Diamond Platnumz ft Omarion"));
        afroPopArray.add(new AfroPop("Your Love", "Kwahdo"));
        afroPopArray.add(new AfroPop("4 Dayz", "Kiss Daniel"));
        afroPopArray.add(new AfroPop("Oh My Gosh", "Yemi Alade"));
        afroPopArray.add(new AfroPop("Nwa Baby", "Davido"));
        afroPopArray.add(new AfroPop("Leave Am", "Kelly Hansome "));
        afroPopArray.add(new AfroPop("Soar like an Eagle", "Rhemy "));
        afroPopArray.add(new AfroPop("Enough", "Dice Ailes "));
        afroPopArray.add(new AfroPop("Choko", "Tekno  "));
        afroPopArray.add(new AfroPop("Jogodo", "Tekno"));
        afroPopArray.add(new AfroPop("OMW", "LAdy Leshurr "));
        afroPopArray.add(new AfroPop("Short and Sweet", "Sauti Sol ft Nyashinski"));

        //Initialize the ArrayAdapter to populate the list view with the views
        AfroPopAdapter bongoAdapter = new AfroPopAdapter(this, afroPopArray);

        //Find the listView and populate it with the items from the arrayAdapter
        final ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(bongoAdapter);


    }
}
