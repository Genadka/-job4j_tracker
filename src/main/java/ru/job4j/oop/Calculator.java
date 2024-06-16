package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return Calculator.sum(d) + Calculator.minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);
        int resultMinus = Calculator.minus(5);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(9);
        System.out.println(resultMultiply);
        int resultDivide = calculator.divide(8);
        System.out.println(resultDivide);
        int resultSumAllOperation = calculator.sumAllOperation(7);
        System.out.println(resultSumAllOperation);
    }
}