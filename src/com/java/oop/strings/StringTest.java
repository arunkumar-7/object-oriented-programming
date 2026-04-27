package com.java.oop.strings;

import com.java.oop.Product;

public class StringTest {
    StringTest() {
        System.out.println("My String Constructor");
    }

    static void main() {
        StringTest str = new StringTest();
        Product product = new Product();
        System.out.println(product);
        System.out.println(str);

        String str1 = new String();
        System.out.println("str1:" + str);
        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);
        System.out.println("str2:" + str2);
        String str3 = new String("abc");
        System.out.println("str3:" + str3);

        String str4 = str2;
        System.out.println("str4:" + str4);
        System.out.println(str2 == str4);
        System.out.println(str2 == str3);

        String str5 = "abc"; //string literal
        String str6 = "abc";
        System.out.println(str5 == str6);

        //String objects are immutable
        System.out.println(chars.length);
        System.out.println(str5.length());
        System.out.println(str5.charAt(1));
        System.out.println(str5.compareToIgnoreCase("aBc"));
        String name = "John";
        name = name.concat(", How are You?");
        System.out.println(name);
        String username = "arun";
        String password = "abc@123";
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Enter your credentials");
        }
        if (username.equalsIgnoreCase("Arun") && password.equals("abc@123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed! Invaalid credentials");
        }
        String usernamePattern = "^[a-zA-Z0-9_]{4,15}$";
        System.out.println(username.matches(usernamePattern));
        String customerData = "1,JohnDoe,johndoe@gmail.com,123-456-7890";

        String[] data = customerData.split(",");
        Customer customer = new Customer();
        //String -> Primitives
        customer.id = Integer.parseInt(data[0]);
        customer.name = data[1];
        customer.email = data[2];
        customer.phone = data[3];
        System.out.println("Customer Id : " + customer.id);
        System.out.println("Customer Name : " + customer.name);
        System.out.println("Customer Email : " + customer.email);
        System.out.println("Customer Phone : " + customer.phone);

        String password1 = "           Abcd @123           ";
        System.out.println(password1.length());
        //chained method invocation
        System.out.println(password1.trim().length());
        int phoneno = 324234;
        System.out.println(String.valueOf(phoneno));
    }
}

