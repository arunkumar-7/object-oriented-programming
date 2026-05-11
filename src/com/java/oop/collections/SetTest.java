package com.java.oop.collections;

import java.util.HashSet;

public class SetTest {
    static void main() {
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product(1,"Dell Laptop",50000,10f,true));
        productSet.add(new Product(2,"Google Pixel9a",38000,8f,true));
        productSet.add(new Product(3,"Casio A158",1700,5f,true));
        productSet.add(new Product(4,"Google Pixel9a",38000,8f,true));
        System.out.println(productSet);
    }
}
