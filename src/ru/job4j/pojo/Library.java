package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Red hat", 230);
        Book book2 = new Book("The three little pigs", 320);
        Book book3 = new Book("Clean code", 450);
        Book book4 = new Book("Colobok", 200);
        Book[] books = new Book[]{book1, book2, book3, book4};
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            System.out.println("book " + books[i].getName() + " - " + books[i].getPages() + " pages");
        }
        System.out.println();

        books[0] = book4;
        books[3] = book1;

        for (int i = 0; i < books.length; i++) {
            System.out.println("book " + books[i].getName() + " - " + books[i].getPages() + " pages");
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("book " + books[i].getName() + " - " + books[i].getPages() + " pages");
            }
        }
    }
}
