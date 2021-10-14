package se.systementor;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums = new ArrayList<>();

    public Artist(String name) {
        super();
        this.name = name;
    }
}
