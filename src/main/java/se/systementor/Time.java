package se.systementor;

import java.time.LocalTime;

public class Time {

    private LocalTime localTime;

    public Time(int hour, int minute, int second) {
        super();
        this.localTime = LocalTime.of(hour, minute, second);
    }
    
    public void setHour(int hour){
        this.localTime = LocalTime.of(hour, localTime.getMinute(), localTime.getSecond());
    }
    public void setMinute(int minute){
        this.localTime = LocalTime.of(localTime.getHour(), 
            minute, localTime.getSecond());
    }
    public void setSecond(int second){
        this.localTime = LocalTime.of(localTime.getHour(), 
            localTime.getMinute(), second);
    }

    public int  getSecond(){
        return localTime.getSecond();
    }
    public int  getMinute(){
        return localTime.getMinute();
    }
    public int  getHour(){
        return localTime.getHour();
    }

    public void addHour(int n){
        localTime = localTime.plusHours(n);
    }
    public void addMinute(int n){
        localTime = localTime.plusMinutes(n);
    }
    public void addSeconds(int n){
        localTime = localTime.plusSeconds(n);
    }


}
