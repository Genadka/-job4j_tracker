package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать, говори скорее, а то я очень занят? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("да");
        }
        if (answer == 1) {
            System.out.println("нет");
        }
        if (answer == 2) {
            System.out.println("не знаю я что Оракул по твоему?");
        }
    }
}
