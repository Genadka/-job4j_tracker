package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jora Krijovnikov");
        student.setGroup("1G");
        student.setReceipt(new Date());

        System.out.println("Имя стодента: " + student.getName()
                + ", Группа студента: " + student.getGroup()
                + ", дата поступления: " + student.getReceipt());
    }
}
