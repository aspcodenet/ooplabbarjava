package se.systementor;

import java.util.ArrayList;

public class Album {
    private String title;
    public ArrayList<Song> songs = new ArrayList<>();

    public Album(String title) {
        super();
        this.title = title;
    }

    public int getTotalLengthInSeconds(){
        int sum = 0;
        for(Song s : songs)
            sum += s.getLengthInSeconds();
        return sum;
    }

    public void addSong(Song song) {
        songs.add(song);
    } 
}
