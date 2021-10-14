package se.systementor;

public class Circle {
    public float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){
        return Math.PI * 2*radius;
    }

}
