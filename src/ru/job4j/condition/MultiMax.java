package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            result = first;
            if (first < third) {
                result = third;
            }
        } else {
            result = second;
            if (result > third) {
                return result;
            } else {
                result = third;
            }
        }
        return result;
    }
}
