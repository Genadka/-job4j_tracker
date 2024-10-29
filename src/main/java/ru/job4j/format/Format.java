package ru.job4j.format;
import java.util.Calendar;

public class Format {

    public static void getGreeting(String name, int age) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
        System.out.println(String.format("Задаем число 0.99 - %.3f", 0.99));
        System.out.println(String.format("%1$,+016.2f", 5000000.0000));
    }

    public static void main(String[] args) {
        getGreeting("Елана", 26);
    }

}