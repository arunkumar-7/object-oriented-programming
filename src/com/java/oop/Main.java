package com.java.oop;

public class Main {
    static void main() {
        Product product1 = new Product();
        product1.id = 1111;
        product1.name = "dell inspiron 15 3530";
        product1.maxRetailPrice = 66000;
        product1.rating = 4.1F;
        product1.reviewsCount = 1093;
        product1.discountPercentage = 17;
        product1.isAvailable = true;
        product1.company = "Dell";
        product1.category = "Laptop";
        System.out.println("id:" + product1.id);
        System.out.println("Name:" + product1.name);
        System.out.println("MRP:" + product1.maxRetailPrice);
        System.out.println("Rating:" + product1.rating);
        System.out.println("reviews:" + product1.reviewsCount);
        System.out.println("Discount:" + product1.discountPercentage + "%");
        System.out.println("is Stock Available:" + product1.isAvailable);
        System.out.println("Company:" + product1.company);
        System.out.println("Category:" + product1.category);

        Product product2 = new Product();
        product2.id = 2222;
        product2.name = "Google Pixel 9a";
        product2.maxRetailPrice = 49999;
        product2.rating = 4.4F;
        product2.reviewsCount = 248;
        product2.discountPercentage = 14;
        product2.isAvailable = true;
        product2.company = "Google";
        product2.category = "Mobile Phones";
        System.out.println("id:" + product2.id);
        System.out.println("Name:" + product2.name);
        System.out.println("MRP:" + product2.maxRetailPrice);
        System.out.println("Rating:" + product2.rating);
        System.out.println("reviews:" + product2.reviewsCount);
        System.out.println("Discount:" + product2.discountPercentage + "%");
        System.out.println("is Stock Available:" + product2.isAvailable);
        System.out.println("Company:" + product2.company);
        System.out.println("Category:" + product2.category);


    }
}
