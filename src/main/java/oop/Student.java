package oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void drumm() {
        System.out.println("Boom Boom Boom");
    }

    public void sing() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student vasya = new Student();
        Student petya = new Student();
        vasya.drumm();
        vasya.drumm();
        petya.music();
        petya.music();
        petya.music();
        petya.sing();
        petya.sing();
        petya.sing();
    }
}
