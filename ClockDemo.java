package com.arjaycode;
import java.util.Scanner;
public class ClockDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds, minutes, hours;

        //FIRST CLOCK
        Clock firstClock = new Clock();
        System.out.println("First Clock");
        System.out.print("Enter time in seconds: ");
        seconds = input.nextInt();
        firstClock.setClock(seconds);
        for ( int i = 1; i <= 10; i++){
            firstClock.tick();
            System.out.println(firstClock);
        }

        //SECOND CLOCK
        Clock secondClock = new Clock();
        System.out.println("Second Clock");
        System.out.print("Enter time in seconds: ");
        seconds = input.nextInt();
        secondClock.setSeconds(seconds);
        System.out.print("Enter time in minutes: ");
        minutes = input.nextInt();
        secondClock.setMinutes(minutes);
        System.out.print("Enter time in hours: ");
        hours = input.nextInt();
        secondClock.setHours(hours);
        for (int i = 1; i <= 10; i++){
            secondClock.tick();
            System.out.println(secondClock);
        }
        seconds = firstClock.getSeconds();
        minutes = firstClock.getMinutes();
        hours = firstClock.getHours();
        System.out.println("First Clock Time: "+ firstClock);
        System.out.println("Second Clock Time: "+ secondClock);
        firstClock.addClock(secondClock);
        System.out.println("First Clock plus Second Clock: " + firstClock);

        //THIRD CLOCK
        Clock thirdclock = new Clock();
        thirdclock.setHours(hours);
        thirdclock.setMinutes(minutes);
        thirdclock.setSeconds(seconds);
        thirdclock.subtractClock(secondClock);
        System.out.println("Third Clock: " + thirdclock);
    }
}
