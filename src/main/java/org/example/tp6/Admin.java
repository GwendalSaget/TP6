package org.example.tp6;

public class Admin implements AdminActions {

    @Override
    public void reviewBook(Book book, String review) {
        System.out.println("Admin reviews a book: " + book.title + " with review: " + review);
    }
    // AdminSpecificActions implementations
    @Override
    public void addBookToStore(Book book) {
        System.out.println("Adding book to store: " + book.title + ", Type: " + book.getType() + ", Price: " + book.price);
        // Logic for adding a book to the inventory
    }
    @Override
    public void removeBookFromStore(Book book) {
        System.out.println("Removing book from store: " + book.title);
// Logic for removing a book from the inventory
    }
}