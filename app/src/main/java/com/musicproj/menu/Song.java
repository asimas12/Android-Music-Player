package com.musicproj.menu;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getsongTitle(){return title;}
    public String getArtist(){return artist;}

}

