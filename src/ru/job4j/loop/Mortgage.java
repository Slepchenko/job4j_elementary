package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;

        while (true) {
            amount = (int) ((amount * (percent / 100)) + amount - salary);
            year++;
            System.out.println(amount);
            if (amount <= 0) {
                break;
            }
        }
        return year;
    }
}
