package com.company;

public class Fan {

    //state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed; // 0 to 5

    //creation


    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //isOn
    public void switchOn(){
        this.isOn = true;
    }
    public void switchOff(){
        this.isOn = false;
    }

    public void setSpeed(byte speed){
        if(speed < 0 || speed>5){
            System.out.println("Speed should be between 0-5");
        }
        else{
            this.speed = speed;
        }

    }

    //print the state

    public String toString(){
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",make,radius,color,isOn,speed);
    }
}
