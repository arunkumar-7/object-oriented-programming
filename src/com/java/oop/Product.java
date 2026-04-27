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

    public Product(){

    }

    public Product(int id, String name, long maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }


    void displayProductDetails() {
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

