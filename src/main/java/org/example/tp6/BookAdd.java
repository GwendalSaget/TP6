package org.example.tp6;

import java.util.Objects;

public class BookAdd {
    public void addBook(Book book) {
        if (Objects.equals(book.getType(), "PHYSICAL")) {
            System.out.println("Adding a physical book: " + book.title);
// Assume this logic adds a physical book to the database
        }
        else if (Objects.equals(book.getType(), "EBOOK")) {
            System.out.println("Adding an ebook: " + book.title);
// Assume this logic adds a physical book to the database
        }
        if (Objects.equals(book.getType(), "AUDIOBOOK")) {
            System.out.println("Adding an audiobook: " + book.title);
// Assume this logic adds a physical book to the database
        }
// No implementation for e-books or audiobooks, violating OCP
    }
}