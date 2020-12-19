package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println("Спичек на столе - " + matches);
        while (matches > 0) {
            System.out.print("Введите число от 1 до 3 ");
            answer = Integer.valueOf(scanner.nextLine());
            matches -= answer;
            System.out.println("Спичек на столе - " + matches);
        }
    }
}
