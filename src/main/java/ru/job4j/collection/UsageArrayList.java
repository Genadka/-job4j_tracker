package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add("Petr");
        listNames.add("Ivan");
        listNames.add("Stepan");
        for (String list : listNames) {
            System.out.println(list);
        }
    }
}
