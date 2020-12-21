package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print("Еду по рельсам. ");
    }

    @Override
    public void passengers() {
        System.out.println("300 пассажиров");
    }
}
