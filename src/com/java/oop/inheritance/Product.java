package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    byte discountPercentage;

    public Product(int id, String name, int maxRetailPrice, byte discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }
    void displayProductDetails(){
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("MRP:" + maxRetailPrice);
        System.out.println("Discount:" +discountPercentage);
    }
    int calculateFinalPrice() {
        int finalPrice = maxRetailPrice - (maxRetailPrice * discountPercentage / 100);
        return finalPrice;
    }

    int calculateFinalPrice2(int finalPrice){
        int finalPrice2 = finalPrice +50;
        return finalPrice2;
    }
}