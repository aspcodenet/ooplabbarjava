package se.systementor;

public class Point {
    private int xPosition; 
    private int yPosition; 

    public Point(int x, int y) {
        super();
        xPosition = x;
        yPosition = y;
    }

    public int getX(){
        return xPosition;
    }
    
    public int getY(){
        return yPosition;
    }
}
