package com.company;

public class Rectange {

    //state
    private int length;
    private int width;

    //creation
    public Rectange(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //operations
    public int calculateArea(){
        return length*width;
    }
    public int perimeter(){
        return 2* (length+width);
    }
    public String toString(){
        return String.format("length - %d width - %d area - %d perimetre - %d",length,width,calculateArea(),perimeter());
    }

}
