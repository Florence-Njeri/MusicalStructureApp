package com.example.admin.musicalstructureapp;

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

public class AfroPopAdapter extends ArrayAdapter <AfroPop> {
    public AfroPopAdapter(AfroPopActivity afroPopActivity, ArrayList <AfroPop> afroPopArray) {
        super(afroPopActivity, 0, afroPopArray);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //  return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }


        // Get the data object for this position in the List from <com.example.admin.musicalstructureapp.AfroPop.java>

        AfroPop currentSong = getItem(position);

        // Lookup view for data population
        TextView miwokTextView = listItemView.findViewById(R.id.musicTitle);
        TextView defaultTextView = listItemView.findViewById(R.id.musician);

        // Populate the data into the template view using the data object

        defaultTextView.setText(Objects.requireNonNull(currentSong).getMusicTitle());
        miwokTextView.setText(currentSong.getMusician());
        // Return the completed view to render on screen
        return listItemView;
    }
}
