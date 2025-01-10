package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("post@post", "Почтовв Почтальон");
        hashMap.put("post@post", "Почтовв Почтов");
        hashMap.put("post@post1", "Почтовв Почтальон1");
        for (String key: hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
