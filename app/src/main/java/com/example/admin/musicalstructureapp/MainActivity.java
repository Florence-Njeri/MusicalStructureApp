package com.example.admin.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the views by id
        TextView bongo=findViewById(R.id.bongo);
        TextView afroPop=findViewById(R.id.afro_pop);
        TextView rnB=findViewById(R.id.rnb);

        //Set onClickListeners for the textViews and on click open a new activity
        bongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bongoIntent=new Intent(MainActivity.this, BongoActivity.class);
                startActivity(bongoIntent);
            }
        });

        afroPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent afroPopIntent=new Intent(MainActivity.this, AfroPopActivity.class);
                startActivity(afroPopIntent);
            }
        });

        rnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rnbIntent=new Intent(MainActivity.this, RnBActivity.class);
                startActivity(rnbIntent);
            }
        });

    }
}
