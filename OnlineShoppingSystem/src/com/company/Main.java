package com.company;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Johhny","Istanbul",976.23);
        Customer customer2 = new Customer("Alex","Bodrum",76.23);
        Customer customer3 = new Customer("Caesar","Izmir",576.23);
        Customer customer4 = new Customer("Kaesar","Kayseri",126.23);

        Product product1 = new Product("Dumbell",83,10);
        Product product2 = new Product("Soap",745,1);

        Customer.addCustomer(customer1);
        Customer.addCustomer(customer2);
        Customer.addCustomer(customer3);
        Customer.listCustomers();
        Product.addProduct(product1);
        Product.addProduct(product2);
        Customer.addCustomer(customer1);
        Customer.removeCustomer(customer4);
        Product.listProducts();
        Product.removeProduct(product1);
        Product.listProducts();
        customer1.shoppingCart.addToShoppingCart(product1);
        customer1.shoppingCart.addToShoppingCart(product2);
        customer1.shoppingCart.listShoppingCart();
        System.out.println(customer1.getCash());
        customer1.buyProducts();
        customer2.shoppingCart.addToShoppingCart(product1);
        customer2.buyProducts();
    }
}
