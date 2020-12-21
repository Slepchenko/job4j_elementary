package ru.job4j.poly;

public class NewBus implements Vehicle {
    @Override
    public void move() {
        System.out.print("Еду про трассе. ");
    }

    @Override
    public void passengers() {
        System.out.println("50 пассажиров");
    }
}
