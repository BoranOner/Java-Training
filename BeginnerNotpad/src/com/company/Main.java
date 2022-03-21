package com.company;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
       BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);

        List<String> stringArray = new ArrayList<String>();


        stringArray.add("asdsda");
        int[] marks = {75,60,56};
        int sum = 0;

        for(int mark:marks){
            sum +=mark;
        }
        System.out.println(Arrays.toString(marks));

        int[] marks2 = {2,3,4,5,87,4,1};

        Student student = new Student("Henry",marks2);
        System.out.println( student.getMaximumMark());
        System.out.println(student.getMinimumMark());
        System.out.println(student.getAverageMarks());

        int j = 5 +5;
        int k = 5 +10;

        System.out.println(student.toString());

        Fan fan = new Fan("Manufacturer 1", 0.34567,"Green");
        fan.switchOn();
        fan.setSpeed((byte)3);
        System.out.println(fan);
        Rectange rectange = new Rectange(32,64);
        System.out.println(rectange);
        System.out.println(Byte.MAX_VALUE);

        Book book = new Book(123,"Object Oriented Programming with Java","Ranga");
        book.addReview(new Reviews(10,"Great Book",5));
       System.out.println(book);

       //178

    }


}
