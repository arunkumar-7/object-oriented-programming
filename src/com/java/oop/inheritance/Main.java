package com.java.oop.inheritance;

public class Main {
    static void main(String[] args) {
        Product product = new Product(1,"dell",100000,(byte)25,4.5F,"Dell","laptop",1000);
        RegularCustomer customer = new RegularCustomer(101,"Arun","arun@gmail.com",'M',(byte)25,9390591458L,50,"silver");
        PremiumCustomer customer1 = new PremiumCustomer(102,"Raj","raj@gmail.com",'F',(byte)24,9381760078L,0,"gold");
        System.out.println("=== Regular Customer === ");
        customer.display(product);
        System.out.println("=== Premium Customer ===");
        customer1.display(product);

    }
}