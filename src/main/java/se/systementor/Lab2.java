package se.systementor;

public class Lab2 {
    public void run(){
        System.out.println("Ange height:");
        int height = Integer.parseInt(System.console().readLine());
        System.out.println("Ange width:");
        int width = Integer.parseInt(System.console().readLine());
        
        Rectangle rect = new Rectangle(height, width);
        int area = rect.calculateArea();
    }


    
}
