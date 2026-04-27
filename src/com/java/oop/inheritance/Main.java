package com.java.oop.inheritance;

public class Main {
    static void main() {
        Product product1 = new Product(101, "Dell Laptop", 50000, (byte) 10);
        product1.displayProductDetails();
        int finalPrice = product1.calculateFinalPrice();
        System.out.println(finalPrice);
        Customer regularCustomer1 = new RegularCustomer(201,"Arun","silver",50);



    }
}
