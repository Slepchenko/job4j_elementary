package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Еду");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Колличество пассажиров" + passenger);
    }

    @Override
    public double tuck(String fuel) {
        int value = 20;
        double petrolAI92 = 52.5;
        double petrolAI98 = 55.8;
        double dt = 57.4;
        if (fuel.endsWith("92")) {
            return petrolAI92 * value;
        } else if (fuel.equals("98")) {
            return petrolAI98 * value;
        }
        return dt * value;

    }
}
