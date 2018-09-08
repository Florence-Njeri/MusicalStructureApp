package com.example.admin.musicalstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        final ArrayList <Songs> bongoArrayList = new ArrayList <>();
        bongoArrayList.add(new Songs("Kwa Ngwaru", "Diamond ft Harmonise"));
        bongoArrayList.add(new Songs("Mwana", "Alikiba"));
        bongoArrayList.add(new Songs("Salome", "Diamond ft Rayvanny"));
        bongoArrayList.add(new Songs("Natafuta Kiki", "Rayvanny"));
        bongoArrayList.add(new Songs("Ibaki Story", "Rich Mavoko "));
        bongoArrayList.add(new Songs("Dume Suruali", "Mwana Fa ft Vanessa Mdee "));
        bongoArrayList.add(new Songs("Zigo", "AY ft Diamond "));
        bongoArrayList.add(new Songs("Muziki", "Darassa ft Ben Pol  "));
        bongoArrayList.add(new Songs("Show Me", "Harmonize ft Rich Mavoko"));
        bongoArrayList.add(new Songs("Kisela", "Vanessa Mdee "));
        bongoArrayList.add(new Songs("Time to Party", "Flavour ft Diamond Platnumz"));

        //Initialize the ArrayAdapter to populate the list view with the views
        SongsAdapter bongoAdapter = new SongsAdapter(this, bongoArrayList);

        //Find the listView and populate it with the items from the arrayAdapter
        final ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(bongoAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                //Create an object of the class to get the musicians name and song title
                Songs bongo = bongoArrayList.get(position);
                Intent intent = new Intent(BongoActivity.this, SongPlayingActivity.class);
                intent.putExtra("musicTitle", bongo.getMusician());
                intent.putExtra("musician", bongo.getMusicTitle());

                startActivity(intent);
            }
        });
    }
}
