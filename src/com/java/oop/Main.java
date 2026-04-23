package com.java.oop;

public class Main {
    static void main() {
        Product product1 = new Product();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Product 1 Details");
        System.out.println("---------------------------------------------------------------------------------");
        product1.id = 1111;
        product1.name = "dell inspiron 15 3530";
        product1.maxRetailPrice = 66000;
        product1.rating = 4.1F;
        product1.reviewsCount = 1093;
        product1.discountPercentage = 17;
        product1.isAvailable = true;
        product1.company = "Dell";
        product1.category = "Laptop";
        product1.displayProductDetails();

        Product product2 = new Product();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Product 2 Details");
        System.out.println("---------------------------------------------------------------------------------");
        product2.id = 2222;
        product2.name = "Google Pixel 9a";
        product2.maxRetailPrice = 49999;
        product2.rating = 4.4F;
        product2.reviewsCount = 248;
        product2.discountPercentage = 14;
        product2.isAvailable = true;
        product2.company = "Google";
        product2.category = "Mobile Phones";
        product2.displayProductDetails();

        Customer customer = new Customer();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Customer Details");
        System.out.println("----------------------------------------------------------------------------------");
        customer.id = 11111;
        customer.name = "Arun kumar";
        customer.email = "arunkumar@gmail.com";
        customer.phoneNumber = 9390590008L;
        customer.address = "Warasiguda";
        customer.city = "Secunderabad";
        customer.state = "Telangana";
        customer.pinCode = 506143;
        customer.isPrimeMember = true;
        customer.walletBalance = 7520.55D;
        customer.totalOrders = 6;
        System.out.println("Customer id:" + customer.id);
        System.out.println("Customer Name:" + customer.name);
        System.out.println("Customer Email:" + customer.email);
        System.out.println("Customer Mobile Number:" + customer.phoneNumber);
        System.out.println("Customer Address:" + customer.address);
        System.out.println("Customer city:" + customer.city);
        System.out.println("Customer state:" + customer.state);
        System.out.println("customer pincode:" + customer.pinCode);
        System.out.println("Is a Prime Member:" + customer.isPrimeMember);
        System.out.println("Wallet Balance:" + customer.walletBalance);
        System.out.println("Total orders:" + customer.totalOrders);


    }
}
