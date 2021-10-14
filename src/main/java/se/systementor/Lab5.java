package se.systementor;

import java.util.ArrayList;

public class Lab5 {
    public void run(){
        ArrayList<Matratt> matratter = new ArrayList<>();
        matratter.add(new Matratt("Pannkakor", 100,
                "Vegetarisk", 40));
        matratter.add(new Matratt("Köttbullar med potatismos", 98,
            "Kött", 120));
        matratter.add(new Matratt("Potatisbullar", 55,
            "Vegetarisk", 66));


        System.out.println("*** DAGENS MENY ***");    
        for(Matratt s : matratter){
            System.out.println(s.getNamn() + ", PRIS:" + s.getPrice() + " kr," + s.getType());
        }
    }
}
