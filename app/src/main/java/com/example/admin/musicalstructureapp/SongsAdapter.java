package com.example.admin.musicalstructureapp;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class SongsAdapter extends ArrayAdapter <Songs> {
    SongsAdapter(Activity context, ArrayList <Songs> songs) {
        super(context, 0, songs);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /*
         * ConvertView is used to recycle a view object no longer in view
         */

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }
        // Get the data object for this position in the List from <com.example.admin.musicalstructureapp.AfroPop.java>

        Songs currentSong = getItem(position);

        // Lookup view for data population
        TextView musicTitle =  convertView.findViewById(R.id.musicTitle);
        TextView musicianName =  convertView.findViewById(R.id.musician);

        // Populate the data into the template view using the data object

        musicTitle.setText(Objects.requireNonNull(currentSong).getMusicTitle());
        musicianName.setText(currentSong.getMusician());
        // Return the completed view to render on screen
        return convertView;
    }
}
