package com.java.oop.collections;

import java.util.Objects;

public class Product {
    int id;
    String name;
    int price;
    float discount;
    boolean isAvailable;

    public Product(int id, String name, int price, float discount, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && Float.compare(discount, product.discount) == 0 && isAvailable == product.isAvailable && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, discount, isAvailable);
    }
}
