package ru.job4j.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам.");
    }

    @Override
    public void fuel() {
        System.out.println(getClass().getSimpleName() + " использует уголь");
    }
}
