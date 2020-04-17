package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class PlayList {
    ArrayList<Album> albums=new  ArrayList<Album>();
    LinkedList<Song> play=new LinkedList<Song>();

    public void addSong(Album all, Song name)
    {
        //we will check first whether the song exists in the album or not
        boolean allfound=findAlbum(all);
        boolean songfound=all.findSong(name);
        if(allfound && songfound)//both album and songs exits
        {

        }

    }


    private boolean findAlbum(Album name)
    {
        for(int i=0;i<albums.size();i++)
        {
            Album a=albums.get(i);
            if(name.getName().equals(a.getName()))
                return true;
        }
        return false;
    }
}
