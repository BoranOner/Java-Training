package com.company;

public class Main {

    public static void main(String[] args) {

        int ageOfClient = 12;
        boolean isEighteenOrOver = ageOfClient > 18;
        if(isEighteenOrOver) System.out.println("Client is over 18 years old! ");

        double x = 20.00d, y = 80.00d;
        double z = (x+y)*100d;
        double remainder = (z % 40.00d);
        boolean isEqual = remainder == 0;
        System.out.println(isEqual);
        if(!isEqual){
            System.out.println("Got some remainder");
        }


    }
}
