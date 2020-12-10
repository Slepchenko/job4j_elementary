package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < rsl.length; i++) {
                if (index1 < left.length && index2 < right.length) {
                    if (left[index1] < right[index2]) {
                        rsl[i] = left[index1];
                        index1++;
                    } else {
                        rsl[i] = right[index2];
                        index2++;
                    }
                } else if (index1 == left.length && index2 < right.length) {
                    rsl[i] = right[index2];
                    index2++;
                } else if (index1 < left.length && index2 == right.length) {
                    rsl[i] = left[index1];
                    index1++;
                } else if (index1 == left.length && index2 == right.length) {
                    break;
                }
        }

        return rsl;
    }
}
