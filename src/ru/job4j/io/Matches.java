package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println("Спичек на столе - " + matches);
        String[] players = new String[2];
        System.out.print("Игрок 1, введите свое имя: ");
        players[0] = scanner.nextLine();
        System.out.print("Игрок 2, введите свое имя: ");
        players[1] = scanner.nextLine();
        boolean win = false;

        while (!win) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Игрок " + players[i] + " введите число от 1 до 3 ");
                answer = Integer.valueOf(scanner.nextLine());
                matches -= answer;
                if (matches > 0) {
                    System.out.println("Спичек на столе - " + matches);
                } else {
                    System.out.println("Победитель " + players[i]);
                    win = true;
                    break;
                }
            }
        }
    }
}
