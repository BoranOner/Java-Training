package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<Product>();

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public ShoppingCart() {
    }

    public void addToShoppingCart(Product product) {
        products.add(product);
        System.out.println("Product: " + product.getName() + " added to the cart:");
    }

    public void removeFromShoppingCart(Product product) {
        products.remove(product);
        System.out.println("Product: " + product.getName() + " removed from the cart:");
    }

    public void listShoppingCart() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + " -) " + products.get(i).getName() + " , price " + products.get(i).getPrice());
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
