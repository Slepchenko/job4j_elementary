package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static int max(int left, int right, int bottom) {
        boolean condition = max(left, right) > bottom;
        return condition ? max(left, right) : bottom;
    }

    public static int max(int left, int right, int top, int bottom) {
        boolean condition = max(left, right, top) > bottom;
        return condition ? max(left, right, top) : bottom;
    }

    public static void main(String[] args) {
        int result = Max.max(9, 4);
        System.out.println(result);
    }
}
