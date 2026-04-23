package com.java.oop;

public class Product {
    int id;
    String name;
    long maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;
    void displayProductDetails(){
        System.out.println("id:" + id);
        System.out.println("Name:" + name);
        System.out.println("MRP:" + maxRetailPrice);
        System.out.println("Rating:" + rating);
        System.out.println("reviews:" + reviewsCount);
        System.out.println("Discount:" + discountPercentage + "%");
        System.out.println("is Stock Available:" + isAvailable);
        System.out.println("Company:" + company);
        System.out.println("Category:" + category);
    }
}

