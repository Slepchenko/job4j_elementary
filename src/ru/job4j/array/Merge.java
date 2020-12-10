package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        for (int i = 0; i < rsl.length; i++) {
            if (left.length > 0 && right.length == 0) {
                rsl[i] = left[i];
            } else if (left.length == 0 && right.length > 0) {
                rsl[i] = right[i];
            } else {
                if (i < left.length) {
                    rsl[i] = left[i];
                } else if (right[i - left.length] >= rsl[i - 1]) {
                    rsl[i] = right[i - left.length];
                } else {
                    rsl[i] = rsl[i - 1];
                    rsl[i - 1] = right[i - left.length];
                }
            }
        }
        return rsl;
    }
}
