package com.company;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private int quantityAvailable;
    private double price;
    private boolean isAvailable = false;
    static List<Product> products = new ArrayList<Product>();

    public Product(String name, int quantityAvailable, double price) {
        this.name = name;
        this.quantityAvailable = quantityAvailable;
        this.price = price;
    }

    public static void addProduct(Product product){
        if(product.isAvailable != false){
            System.out.println("Product is already registered in the system!");
        }
        else{
            products.add(product);
            product.isAvailable = true;
        }
    }

    public static void removeProduct(Product product){
        if(product.isAvailable != true){
            System.out.println("Product doesn't exist in the system!");
        }
        else{
            products.remove(product);
            product.isAvailable = false;
        }
    }
    public static void listProducts(){
        for(int i=0;i<products.size();i++){
            System.out.println((i+1) + " = "+ products.get(i).name +" , price = "+ products.get(i).price);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
