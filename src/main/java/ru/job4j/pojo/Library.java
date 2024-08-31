package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 400);
        Book book2 = new Book("Harry potter", 500);
        Book book3 = new Book("Lord of The rings", 1000);
        Book book4 = new Book("Война и мир", 5000);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("название книги: " + book.getName() + " - " + ", количество страниц в книге: "
                    + book.getPageCount());
        }

        System.out.println("замена");

            Book temp = books[0];
            books[0] = books[3];
            books[3] = temp;

            for (int i = 0; i < books.length; i++) {
                Book book = books[i];
                System.out.println("название книги: " + book.getName() + " - " + ", количество страниц в книге: "
                        + book.getPageCount());
        }

        System.out.println("покажи книгу с названием: Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("название книги: " + book.getName() + " - " + ", количество страниц в книге: "
                        + book.getPageCount());
            }
        }
    }
}
