package org.example.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Library {
    private static final Logger logger = Logger.getLogger(Library.class.getName());
    private Map<Book, String> books = new HashMap<>();

    public void addBook(Book book, String location){
        books.put(book, location);
        logger.info(book + " qo'shildi -> " + location);
    }

    public void removeBook(String title, String author, int year){
        Book book = new Book(title, author, year);
        if (books.remove(book) != null) {
            logger.info(book + " o'chirildi.");
        }else {
            logger.warning(book + " topilmadi.");
        }
    }

    public void findBook(String title, String author, int year){
        Book book = new Book(title, author, year);
        String location = books.get(book);
        if (location != null){
            logger.info(book + " -> joylashuvi: " + location);
        }else {
            logger.warning(book + " topilmadi.");
        }
    }

    public void printAllBooks(){
        if (books.isEmpty()){
            logger.info("Kutubxona bo'sh");
            return;
        }
        for (Map.Entry<Book, String> book : books.entrySet()){
            logger.info(book.getKey() + " -> " + book.getValue());
        }
    }
}
