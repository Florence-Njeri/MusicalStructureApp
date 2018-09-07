package com.example.admin.musicalstructureapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class SongPlayingActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);
        TextView musician = findViewById(R.id.musicianTextView);
        TextView music = findViewById(R.id.musicTextView);
        //This bundle holds the data that was transferred from the main activity
        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra("musicTitle")) {
                String musicTitle = intentThatStartedThisActivity.getStringExtra("musicTitle");
                music.setText(musicTitle);
            }
            if (intentThatStartedThisActivity.hasExtra("musician")) {
                String musicTitle = intentThatStartedThisActivity.getStringExtra("musician");
                musician.setText(musicTitle);
            }

            final ImageView play=findViewById(R.id.play_icon);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 play.setImageResource(R.drawable.pause_icon);
                }
            });
        }

    }
}

