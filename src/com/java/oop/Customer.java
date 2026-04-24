package com.java.oop;

public class Customer {
    int id;
    String name;
    String email;
    long phoneNumber;
    String address;
    String city;
    String state;
    int pinCode;
    boolean isPrimeMember;
    double walletBalance;
    int totalOrders;

    public Customer(int id, String name, String email, long phoneNumber, String address, String city, String state, int pinCode, boolean isPrimeMember, double walletBalance, int totalOrders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.isPrimeMember = isPrimeMember;
        this.walletBalance = walletBalance;
        this.totalOrders = totalOrders;
    }

    void displayCustomerDetails() {
        System.out.println("id" + id);
        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Address:" + address);
        System.out.println("City:" + city);
        System.out.println("State:" + state);
        System.out.println("PIN Code:" + pinCode);
        System.out.println("IS a Prime member:" + isPrimeMember);
        System.out.println("Wallet Balance:" + walletBalance);
        System.out.println("Total Orders:" + totalOrders);

    }
}
