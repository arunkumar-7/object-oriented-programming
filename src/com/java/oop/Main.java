package com.java.oop;

public class Main {
    static void main() {
        Product product = new Product();
        product.id = 11;
        product.name = "dell inspiron 15 3530";
        product.maxRetailPrice = 66000;
        product.rating = 4.1F;
        product.reviewsCount = 1093;
        product.discountPercentage = 17;
        product.isAvailable = true;
        product.company = "Dell";
        product.category = "Laptop";


        System.out.println("id:" + product.id);
        System.out.println("Name:" + product.name);
        System.out.println("MRP:" + product.maxRetailPrice);
        System.out.println("Rating:" + product.rating);
        System.out.println("reviews:" + product.reviewsCount);
        System.out.println("Discount:" + product.discountPercentage + "%");
        System.out.println("is Stock Available:" + product.isAvailable);
        System.out.println("Company:" + product.company);
        System.out.println("Category:" + product.category);


    }
}
