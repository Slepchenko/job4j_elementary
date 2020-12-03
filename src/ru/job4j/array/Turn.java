package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int i = 1; i < array.length / 2 + 1; i++) {
            temp = array[i - 1];
            array[i - 1] = array[array.length - i];
            array[array.length - i] = temp;
        }
        return array;
    }
}
