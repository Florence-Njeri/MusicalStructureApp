package com.example.admin.musicalstructureapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BongoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bongo);

        //Create an array List to store the songs
        ArrayList <Bongo> bongoArrayList = new ArrayList <>();
        bongoArrayList.add(new Bongo("Kwa Ngwaru", "Diamond ft Harmonise"));
        bongoArrayList.add(new Bongo("Mwana", "Alikiba"));
        bongoArrayList.add(new Bongo("Salome", "Diamond ft Rayvanny"));
        bongoArrayList.add(new Bongo("Natafuta Kiki", "Rayvanny"));
        bongoArrayList.add(new Bongo("Ibaki Story", "Rich Mavoko "));
        bongoArrayList.add(new Bongo("Dume Suruali", "Mwana Fa ft Vanessa Mdee "));
        bongoArrayList.add(new Bongo("Zigo", "AY ft Diamond "));
        bongoArrayList.add(new Bongo("Muziki", "Darassa ft Ben Pol  "));
        bongoArrayList.add(new Bongo("Show Me", "Harmonize ft Rich Mavoko"));
        bongoArrayList.add(new Bongo("Kisela", "Vanessa Mdee "));
        bongoArrayList.add(new Bongo("Time to Party", "Flavour ft Diamond Platnumz"));

        //Initialize the ArrayAdapter to populate the list view with the views
        BongoAdapter bongoAdapter = new BongoAdapter(this, bongoArrayList);

        //Find the listView and populate it with the items from the arrayAdapter
        final ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(bongoAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                //Create an object of the class to get the musicians name and song title
                Bongo bongo = new Bongo("", "");
                Intent intent = new Intent(BongoActivity.this, SongPlayingActivity.class);
                intent.putExtra("musicTitle", listView.getItemAtPosition(position).toString());
                intent.putExtra("musician", listView.getItemAtPosition(position).toString());
                intent.putExtra("musician", bongo.getMusician());

                startActivity(intent);
            }
        });
    }
}
