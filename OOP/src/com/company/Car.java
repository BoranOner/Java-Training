package com.company;

public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }

}
