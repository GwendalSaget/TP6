package org.example.tp6;

public interface AdminActions {
    void reviewBook(Book book, String review);
    void addBookToStore(Book book);
    void removeBookFromStore(Book book);
}