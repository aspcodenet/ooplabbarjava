package se.systementor;

public class Song {
    private String title;
    private int lengthInSeconds;

    public Song(String title, int lengthInSeconds ) {
        super();
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
    }

    public int getLengthInSeconds(){
        return lengthInSeconds;
    }
}
