package com.company;

import java.util.ArrayList;

public class Album {
    //contains a list of songs
    private String name;
    ArrayList<Song> listOfSongs= new ArrayList<Song>();

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean findSong(Song song)
    {
        for (int i=0;i<listOfSongs.size();i++)
        {
            Song obj=listOfSongs.get(i);
            if(obj.getTitle().equals(song.getTitle())) {
                return true;
            }

        }
        return false;
    }

}
