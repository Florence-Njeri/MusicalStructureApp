package com.example.admin.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        final ArrayList <AfroPop> afroPopArrayList = new ArrayList <>();

        afroPopArrayList.add(new AfroPop("Hammer", "Bisa Kdei"));
        afroPopArrayList.add(new AfroPop("Guilty Beatz", "Akwabaa ft Mr. Eazi Papa Kojoo and Patapaa"));
        afroPopArrayList.add(new AfroPop("Hye Me Bo", "Akwaboah"));
        afroPopArrayList.add(new AfroPop("Dirty Enemies", "StoneBwoy"));
        afroPopArrayList.add(new AfroPop("Ye", "Burna Boy"));
        afroPopArrayList.add(new AfroPop("Reach It", "Zonke"));
        afroPopArrayList.add(new AfroPop("No Crime", "Nonso Amadi"));
        afroPopArrayList.add(new AfroPop("Energy", "RunTown"));
        afroPopArrayList.add(new AfroPop("Picture Perfect", "Wizkid"));
        afroPopArrayList.add(new AfroPop("Yes/No", "Banky W"));
        afroPopArrayList.add(new AfroPop("Johny", "Yemi Alade"));

        //Initialize the AfroPop custom ArrayAdapter
        AfroPopAdapter afroPopAdapter = new AfroPopAdapter(this, afroPopArrayList);
        ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(afroPopAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                //Create an AfroPop object from which to get the Music title and musicians name

                AfroPop pop = afroPopArrayList.get(position);
                Intent intent = new Intent(AfroPopActivity.this, SongPlayingActivity.class);
                intent.putExtra("musicTitle", pop.getMusician());
                intent.putExtra("musician", pop.getMusicTitle());

                startActivity(intent);
            }
        });

    }
}
