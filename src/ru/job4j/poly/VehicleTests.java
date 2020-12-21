package ru.job4j.poly;

public class VehicleTests {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle plane = new Plane();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle newBus = new NewBus();
        Vehicle newBus1 = new NewBus();
        Vehicle newBus2 = new NewBus();

        Vehicle[] transports = new Vehicle[]{train, train1, train2, plane, plane1, plane2, newBus, newBus1, newBus2};

        for (Vehicle v : transports) {
            System.out.print("Транспортное средство: ");
            v.move();
            v.passengers();
        }
    }
}
