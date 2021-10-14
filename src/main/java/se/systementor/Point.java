package se.systementor;

public class Point {
    private int xPosition; 
    private int yPosition; 

    public Point(int x, int y) {
        super();
        this.xPosition = x;
        this.yPosition = y;
    }

    public int getX(){
        return this.xPosition;
    }

    public int getY(){
        return this.yPosition;
    }
}
