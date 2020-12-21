package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.print("Лечу по воздуху. ");
    }

    @Override
    public void passengers() {
        System.out.println("160 пассажиров");
    }
}
