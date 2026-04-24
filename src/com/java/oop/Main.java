package com.java.oop;

public class Main {
    static void main() {

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Product 1 Details");
        System.out.println("---------------------------------------------------------------------------------");
        Product product1 = new Product(1111, "REDMI A7", 11499, 4.1F, 2308, (byte) 13, true, "Apple", "Mobile Phones");
        product1.displayProductDetails();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Product 2 Details");
        System.out.println("---------------------------------------------------------------------------------");
        Product product2 = new Product(2222,"Vivo T4x",18849,4.5F,2300,(byte)13,true,"Vivo","Mobile Phones");
        product2.displayProductDetails();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Product 3 Details");
        System.out.println("---------------------------------------------------------------------------------");
        Product product3 = new Product(3333,"iPhone 16 Plus",89900,4.6F,797,(byte)10,true,"Apple","Mobile Phones");
        product3.displayProductDetails();


        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Customer 1 Details");
        System.out.println("----------------------------------------------------------------------------------");
        Customer customer1 = new Customer(11,"Arun Kumar","arunkumarbathini4@gmail.com",9390591458L,"Warasiguda","Secunderabad","Telangana",500061,true,9900000.0,10);
        customer1.displayCustomerDetails();

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Customer 2 Details");
        System.out.println("----------------------------------------------------------------------------------");
        Customer customer2 = new Customer(22,"Raj Kumar","rajkumar7@gmail.com",9387160078L,"Ghanpur","Warangal","Telangana",506143,true,80000.2,8);
        customer2.displayCustomerDetails();


    }
}
