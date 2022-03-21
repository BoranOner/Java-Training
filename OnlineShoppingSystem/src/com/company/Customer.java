package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private double cash;
    private boolean inSystem = false;
    public ShoppingCart shoppingCart = new ShoppingCart();


    static List<Customer> customers = new ArrayList<Customer>();


    public Customer(String name, String address, double cash) {
        this.name = name;
        this.address = address;
        this.cash = cash;
    }
    public static void addCustomer(Customer customer){
        if(customer.inSystem != false){
            System.out.println("User is already registered in the system!");
        }
        else{
            customers.add(customer);
            customer.inSystem = true;
            System.out.println("Customer " + customer.name + " is added from the system");
        }
    }

    public static void removeCustomer(Customer customer){
        if(customer.inSystem != true){
            System.out.println("User doesn't exist in the system!");
        }
        else{
            customers.remove(customer);
            customer.inSystem = false;
            System.out.println("Customer " + customer.name + " is deleted from the system");
        }
    }

    public static void listCustomers(){
        for(int i=0;i<customers.size();i++){
            System.out.println((i+1) + " -) "+ customers.get(i).name + " , address "+ customers.get(i).address);
        }
    }

    public void buyProducts(){
        int price = 0;
        for(int i=0;i<shoppingCart.getProducts().size();i++){
            price += shoppingCart.getProducts().get(i).getPrice();
        }
        if(price > getCash()){
            System.out.println("Customer "+getName()+" doesn't have enought cash to buy all the products");
        }
        else if(price <= getCash()){
            setCash(getCash()-price);
            System.out.println("Customer "+ getName()+" bought all the items!");
            System.out.println("Remaining Cash: "+ getCash());

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}