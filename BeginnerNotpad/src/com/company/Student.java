package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;

        for(int mark:marks){
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks(){
        return marks.size();

    }

    public int getTotalSumOfMarks(){
        int total=0;
        for(int mark:marks){
            total+=mark;
        }
        return total;
    }
    public int getMaximumMark(){
        return Collections.max(marks);
    }
    public int getMinimumMark(){
        return Collections.min(marks);
    }
    BigDecimal getAverageMarks(){
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

    }

    public String toString(){
        return name + marks;
    }
}
