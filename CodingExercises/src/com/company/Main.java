package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(23,15,42));
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 )return -1;
        else {
            long milesPerHour = Math.round(kilometersPerHour / (double) 1.609);
            return milesPerHour;
        }
    }


    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) System.out.println("Invalid Value");
        else {
            long milesPerHour = Math.round(kilometersPerHour / (double) 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb = kiloBytes / 1024;
        int kb = kiloBytes - mb * 1024 ;
        if(kiloBytes<0) System.out.println("Invalid Value");
        else System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
    }

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23)return false;
        else if(barking == true && (hourOfDay<8 || hourOfDay > 22))return true;
        else return false;
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999)return false;
        else{
            if(year % 4 == 0 && year % 100 !=0)return true;
            else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        System.out.println(Math.round(number1*1000) + "    " + Math.round(number2*1000));
        if(Math.round((int)(number1*1000)) == Math.round((int)(number2*1000))){
            return true;
        }
        else return false;
    }

    public static boolean hasEqualSum(int x,int y, int j){

        if((x+y) == j)return true;
        else return false;

    }

    public static boolean hasTeen(int teen1,int teen2,int teen3){

        if((teen1 >=13 && teen1 <= 19)||(teen2 >=13 && teen2 <= 19)||(teen3 >=13 && teen3 <= 19))return true;
        else return false;
    }

    public static boolean isTeen(int teen){
        if(teen >=13 && teen <=19)return true;
        else return false;
    }
}
