package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = 0;
            if (input.hasNextInt()) {
                matches = input.nextInt();
                if (matches > 0 && matches < 4) {
                    if (count >= matches) {
                        count -= matches;
                        turn = !turn;
                    } else {
                        System.out.println("введите меньшее число, чем осталось спичек: " + count);
                    }
                } else {
                    System.out.println("введите число от 1 до 3");
                }
            } else {
                System.out.println("введите целое число");
                input.next();
            }
        }
        input.close();
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
