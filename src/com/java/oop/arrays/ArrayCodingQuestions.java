package com.java.oop.arrays;

public class ArrayCodingQuestions {
    public static int findHighestPrice(int[] productPrices) {
        int max = productPrices[0];

        for (int i = 1; i < productPrices.length; i++) {
            if (productPrices[i] > max) {
                max = productPrices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] productPrices = {1000, 20, 300, 50, 50};
        System.out.println(findHighestPrice(productPrices));
    }
}
