package com.java.oop.inheritance;

public class PremiumCustomer extends Customer {
    int shippingCharges;
    String membership;

    public PremiumCustomer(int id, String name, int shippingCharges, String membership) {
        super(id, name);
        this.shippingCharges = shippingCharges;
        this.membership = membership;
    }


}
