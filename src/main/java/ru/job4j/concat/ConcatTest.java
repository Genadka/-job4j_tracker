package ru.job4j.concat;

import java.util.StringJoiner;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            builder.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        String string = String.join("||||", "abc", "def", "ghi");
        System.out.println(string);

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}