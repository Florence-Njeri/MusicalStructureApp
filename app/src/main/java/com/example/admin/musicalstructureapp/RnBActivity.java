package com.example.admin.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class RnBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rn_b);

        final ArrayList <Songs> rnBArrayList = new ArrayList <>();

        rnBArrayList.add(new Songs("Made for Now", "Daddy Yankee & Janet"));
        rnBArrayList.add(new Songs("Summertime", "Childish Gambino"));
        rnBArrayList.add(new Songs("In my feelings", "Drake"));
        rnBArrayList.add(new Songs("No Brainer", "DJ Khaled Ft Justin Bieber, Chance The Rapper & Quavo"));
        rnBArrayList.add(new Songs("Boo'd Up", "Ella Mai"));
        rnBArrayList.add(new Songs("Freaky Friday", "Lil Dicky ft Chris Brown"));
        rnBArrayList.add(new Songs("Distance", "Omarion"));
        rnBArrayList.add(new Songs("Girls Like You", "Maroon 5 ft Cardi B"));
        rnBArrayList.add(new Songs("Heart Attack", "Trey Songz"));
        rnBArrayList.add(new Songs("Hope You Do", "Chris Brown "));
        rnBArrayList.add(new Songs("Like I Used To", "Tinashe"));

        SongsAdapter rnbAdapter = new SongsAdapter(this, rnBArrayList);

        //Find the listView and populate it with the items from the arrayAdapter

        ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(rnbAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                //Create an object of the class to get the musicians name and song title
                Songs rnB = rnBArrayList.get(position);
                Intent intent = new Intent(RnBActivity.this, SongPlayingActivity.class);
                intent.putExtra("musicTitle", rnB.getMusician());
                intent.putExtra("musician", rnB.getMusicTitle());

                startActivity(intent);
            }
        });
    }
}
