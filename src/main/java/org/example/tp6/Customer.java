package org.example.tp6;

public class Customer implements UserActions {
    @Override
    public void borrowBook(Book book) {
        System.out.println("Customer borrows a book: " + book.title);
// Logic for a customer to borrow a book
    }
    @Override
    public void returnBook(Book book) {
        System.out.println("Customer returns a book: " + book.title);
// Logic for a customer to return a book
    }
    @Override
    public void reviewBook(Book book, String review) {
        System.out.println("Customer reviews a book: " + book.title + " with review: " + review);
// Logic for a customer to review a book
    }
}
