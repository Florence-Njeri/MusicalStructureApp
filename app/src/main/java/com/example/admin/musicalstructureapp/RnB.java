package com.example.admin.musicalstructureapp;

public class RnB {
    private String musicTitle;
    private String musician;

    public RnB(String musicTitle, String musician){
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
