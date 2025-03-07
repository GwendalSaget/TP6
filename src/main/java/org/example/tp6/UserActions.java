package org.example.tp6;

public interface UserActions {
    void borrowBook(Book book);
    void returnBook(Book book);
    void reviewBook(Book book, String review);
}