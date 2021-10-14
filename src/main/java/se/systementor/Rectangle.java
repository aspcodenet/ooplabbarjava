package se.systementor;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle( int height, int width) {
        super();
        this.width = width;
        this.height = height;
    }

    public int calculateArea(){
        return height * width;
    }

    // public int getHeight(){
    //     return height;
    // }




}
