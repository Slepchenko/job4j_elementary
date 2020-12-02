package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        //6.0.1
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        //6.0.1.1
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}
