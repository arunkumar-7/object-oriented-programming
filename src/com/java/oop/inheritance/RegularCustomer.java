package com.java.oop.inheritance;

public class RegularCustomer extends Customer{
    String membership;
    int shippingCharges;

    public RegularCustomer(int id, String name, String membership, int shippingCharges) {
        super(id, name);
        this.membership = membership;
        this.shippingCharges = shippingCharges;
    }
    void displayRegularCustomerDetails(){
        System.out.println("Id:" + id);
        System.out.println("Name:"+ name);
        System.out.println("ShippingCharges:" + shippingCharges);
        System.out.println("Membership:" + membership);
    }
}
