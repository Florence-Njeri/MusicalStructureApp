package com.example.admin.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AfroPopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afro_pop);

        //Create an custom ArrayList from the  AfroPop class
        final ArrayList <Songs> afroPopArrayList = new ArrayList <>();

        afroPopArrayList.add(new Songs("Hammer", "Bisa Kdei"));
        afroPopArrayList.add(new Songs("Guilty Beatz", "Akwabaa ft Mr. Eazi Papa Kojoo and Patapaa"));
        afroPopArrayList.add(new Songs("Hye Me Bo", "Akwaboah"));
        afroPopArrayList.add(new Songs("Dirty Enemies", "StoneBwoy"));
        afroPopArrayList.add(new Songs("Ye", "Burna Boy"));
        afroPopArrayList.add(new Songs("Reach It", "Zonke"));
        afroPopArrayList.add(new Songs("No Crime", "Nonso Amadi"));
        afroPopArrayList.add(new Songs("Energy", "RunTown"));
        afroPopArrayList.add(new Songs("Picture Perfect", "Wizkid"));
        afroPopArrayList.add(new Songs("Yes/No", "Banky W"));
        afroPopArrayList.add(new Songs("Johny", "Yemi Alade"));

        //Initialize the AfroPop custom ArrayAdapter
        SongsAdapter afroPopAdapter = new SongsAdapter(this, afroPopArrayList);
        ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(afroPopAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                //Create an AfroPop object from which to get the Music title and musicians name

                Songs pop = afroPopArrayList.get(position);
                Intent intent = new Intent(AfroPopActivity.this, SongPlayingActivity.class);
                intent.putExtra("musicTitle", pop.getMusician());
                intent.putExtra("musician", pop.getMusicTitle());

                startActivity(intent);
            }
        });

    }
}
