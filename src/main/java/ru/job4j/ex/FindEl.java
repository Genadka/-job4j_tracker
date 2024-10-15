package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element not found: " + key);
    }

    public static void main(String[] args) {
        String[] client = {"Алекс", "Мария", "Дмитрий", "Анна", "Сергей", "Елена", "Игорь", "Наталья", "Михаил", "Ольга"};
        String keyClient = "Дмитрий";

        try {
            int index = FindEl.indexOf(client, keyClient);
            System.out.println("Ключивой клиент номер: " + index);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}