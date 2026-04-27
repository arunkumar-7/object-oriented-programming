package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void displayCustomerDetails(){
        System.out.println("Customer Id:" + id);
        System.out.println("Customer Name:" + name);
    }
}
