package com.example.admin.musicalstructureapp;

public class Songs {
    private String musicTitle;
    private String musician;

    Songs(String musicTitle, String musician){
      this.musicTitle=musicTitle;
        this.musician=musician;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public String getMusician() {
        return musician;
    }
}
