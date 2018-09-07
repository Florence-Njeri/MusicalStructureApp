package com.example.admin.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class RnBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rn_b);

        ArrayList <RnB> rnBArrayList = new ArrayList <>();

        rnBArrayList.add(new RnB("Made for Now", "Daddy Yankee & Janet"));
        rnBArrayList.add(new RnB("Summertime", "Childish Gambino"));
        rnBArrayList.add(new RnB("In my feelings", "Drake"));
        rnBArrayList.add(new RnB("No Brainer", "DJ Khaled Ft Justin Bieber, Chance The Rapper & Quavo"));
        rnBArrayList.add(new RnB("Boo'd Up", "Ella Mai"));
        rnBArrayList.add(new RnB("Freaky Friday", "Lil Dicky ft Chris Brown"));
        rnBArrayList.add(new RnB("Distance", "Omarion"));
        rnBArrayList.add(new RnB("Girls Like You", "Maroon 5 ft Cardi B"));
        rnBArrayList.add(new RnB("Heart Attack", "Trey Songz"));
        rnBArrayList.add(new RnB("Hope You Do", "Chris Brown "));
        rnBArrayList.add(new RnB("Like I Used To", "Tinashe"));

        RnBAdapter rnbAdapter = new RnBAdapter(this, rnBArrayList);

        //Find the listView and populate it with the items from the arrayAdapter

        ListView listView = findViewById(R.id.array_list_view);
        listView.setAdapter(rnbAdapter);
    }
}
