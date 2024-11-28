package ru.job4j.search;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Person(String name, String surname, String phone, String address) {
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.surname = surname;
    }
}
