package com.company;

public class Main {

    public static void main(String[] args){

        calcFeetAndInchesToCentimeters(6,13);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet<0 || inches < 0 || inches > 12)return -1;

        double centimeters = (((feet * 12) + inches)*2.54);
        System.out.println(feet + " feet " +  inches + " inches = " + centimeters + " cm");
        return centimeters;

        //1 inch = 2.54 cm and 1 foot = 12 inches
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0)return -1;
        double feet = (int)inches/12;
        inches = (int) inches %12;
        return calcFeetAndInchesToCentimeters(feet,inches);
    }

}
