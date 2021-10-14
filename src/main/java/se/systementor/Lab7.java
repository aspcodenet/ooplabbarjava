package se.systementor;

public class Lab7 {
    public void run(){
        Time t = new Time(23,12,12);
        t.addHour(8);
        System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond() );
    }
}
