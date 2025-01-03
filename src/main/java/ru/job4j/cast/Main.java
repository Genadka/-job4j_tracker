package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle boing = new Airbus();
        Vehicle airbus = new Airbus();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus1, bus2, boing, airbus, train1, train2};
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
            vehicle.fuel();
        }
    }
}
