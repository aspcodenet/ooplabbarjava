package se.systementor;

public class Lab6 {
    public void run(){
        Artist artist = new Artist("Michael Jackson");
        Album album = new Album("Thriller");

        album.addSong(new Song("Beat It",122));
        album.addSong(new Song("Billie Jean",231));
        album.addSong(new Song("Human Nature",123));

        int totalLength = album.getTotalLengthInSeconds();
    }
}
