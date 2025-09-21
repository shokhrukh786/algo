package org.example;

import org.example.task1.Book;
import org.example.task1.Library;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book k1 = new Book("Taxtlar o‘yini", "Jorj Martin", 1996);
        Book k2 = new Book("Shohlar jangi", "Jorj Martin", 1998);
        Book k3 = new Book("Muz va olov qo‘shig‘i", "Jorj Martin", 2000);

        library.addBook(k1,"polka #1");
        library.addBook(k2, "polka #2");
        library.addBook(k3, "polka #5");

        library.printAllBooks();

    }
}