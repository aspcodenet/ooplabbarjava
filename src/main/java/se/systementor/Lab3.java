package se.systementor;

public class Lab3 {
    public void run(){
        System.out.println("Ange radius:");
        float radius = Float.parseFloat(System.console().readLine());
        Circle circle = new Circle(radius);
        double omkrets = circle.calculateCircumference();
        double area = circle.calculateArea();
    }

    
}
