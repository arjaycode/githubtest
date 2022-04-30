package com.arjaycode;
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    //Output Point
    public String toString(){
        return "("+hours+":"+minutes+":"+seconds+")";
    }
    //Add and Subtract
    public void addClock(Clock time){
        int added_seconds = ((time.hours * 60) * 60) + (time.minutes * 60) + time.seconds;
        for (int i = 1; i <= added_seconds; i++){
            seconds++;
            minutes = minutes + (seconds / 60);
            hours = hours + (minutes / 60);
            seconds = seconds % 60;
            minutes = minutes % 60;
        }
    }
    public void subtractClock(Clock time){
        int subtracted_seconds = ((time.hours * 60) * 60) + (time.minutes * 60) + (time.seconds);
        for (int i = subtracted_seconds; i > 0; i--){
            if ( seconds != 0){
                seconds--;
            }
            if ( seconds == 0 && minutes != 0){
                minutes--;
                seconds = 60;
            }
            if ( minutes == 0 && hours != 0){
                hours--;
                minutes = 60;
            }
        }
        if ( seconds == 60){
            minutes++;
            seconds = 0;
        }
        if ( minutes == 60){
            hours++;
            minutes = 0;
        }
    }
    //tick methods
    public void tickDown(){
        seconds--;
        if ( seconds < 0){
            minutes--;
            seconds = 0;
        }
        if ( minutes <= 0){
            hours--;
            minutes = 0;
        }
    }
    public void tick(){
        seconds++;
        minutes = minutes + seconds / 60;
        hours = hours + minutes / 60;
        seconds = seconds % 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }
    //get methods
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    //single set method
    public void setClock(int set_seconds){
        this.seconds += set_seconds;
    }
    //set methods
    public void setHours(int hours){
        this.hours = hours;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    //Constructors
    public Clock(){
        this(12, 0 ,0);
    }
    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Clock(int time_in_seconds){
        this.seconds += time_in_seconds;
        this.minutes += seconds / 60;
        this.hours += minutes / 60;
    }
}