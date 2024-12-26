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
            int matches = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.println(player + " введите число от 1 до 3:");
                if (input.hasNextInt()) {
                    matches = input.nextInt();
                    if (matches > 0 && matches < 4) {
                        validInput = true;
                        if (count < matches) {
                            System.out.println("введите меньшее число, чем осталось спичек: " + count);
                            validInput = false;
                        }
                    } else {
                        System.out.println("введите число от 1 до 3");
                    }
                } else {
                    System.out.println("введите целое число");
                    input.next();
                }
            }
            count -= matches;
            turn = !turn;
        }
        input.close();
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
