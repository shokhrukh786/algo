package org.example.task1;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Book {
    private String title;
    private String author;
    private Integer year;

    public Book(String title, String author, Integer year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(year, book.year) &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        // Kitobni chiroyli formatda chiqarish
        return "\"" + title + "\" (" + year + "), " + author;
    }
}
