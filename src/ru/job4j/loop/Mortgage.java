package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double result =  (amount * (percent / 100)) + amount - salary;
        while (result >= 0) {
            year++;
            result = (result * (percent / 100)) + result - salary;
        }
        return year;
    }
}
