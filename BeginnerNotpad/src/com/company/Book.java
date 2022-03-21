package com.company;

public class Book {

    private int id;
    private String name;
    private String author;
    private Reviews review;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Reviews getReview() {
        return review;
    }

    public void addReview(Reviews review){
        this.review = review;
    }

    public String toString(){
        return ("id = "+id +" name = "+name+" author = "+author+" reviews = "+review);
    }

}
