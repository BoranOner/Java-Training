package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 36));
    }


    public static String getDurationString(int minutes,int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 60)return "Invalid value";
        int hours = minutes / 60;
        minutes = minutes % 60;
        return (hours + "h " +minutes + "m " + seconds+ "s ");
    }

    public static String getDurationString(int seconds){
        if(seconds < 0)return "Invalid value";
        int minutes = seconds/60;
        seconds = seconds%60;
        return getDurationString(minutes,seconds);
    }

    public static double area(double radius){
        if(radius < 0)return -1;
        return radius * radius * Math.PI;

    }

    public static double area(double x, double y){
        if(x < 0 || y < 0)return -1;
        return x*y;

    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println("Invalid Value");
        else {
            int years = (int) minutes / 525600;
            int days = (int) (minutes - (years * 525600)) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void printEqual(int a,int b,int c){
        if(a < 0 || b < 0 || c <0) System.out.println("Invalid Value");

        else if(a ==b && b ==c) System.out.println("All numbers are equal");

        else if(a != b && b!=c && c!=a) System.out.println("All numbers are different");

        else System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer)
            if(temperature <= 45)
                if(temperature >=25)return true;
        if(temperature <= 35)
            if(temperature >=25)return true;

        return false;
    }

}
