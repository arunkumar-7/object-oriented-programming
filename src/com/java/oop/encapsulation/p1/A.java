package com.java.oop.encapsulation.p1;

public class A {
    public int value = 100;

    public A() {
        System.out.println("A() constructor called");
    }

    public void m1() {
        System.out.println("m1() method called");
    }


    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.value);

        a.m1();
    }
}
