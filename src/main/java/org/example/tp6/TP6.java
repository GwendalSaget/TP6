package org.example.tp6;

public class BookStore {
    public void addBook(String title, String type, double price) {
        if ("PHYSICAL".equals(type)) {
            System.out.println("Adding a physical book: " + title);
// Assume this logic adds a physical book to the database
        }
// No implementation for e-books or audiobooks, violating OCP
    }
    public void processOrder(String bookTitle, String userEmail) {
        System.out.println("Processing order for " + bookTitle);
// Assume this logic processes an order and notifies the user
        sendNotification(userEmail, "Your order for " + bookTitle + " has been processed.");
    }
    private void sendNotification(String email, String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
// Assume this logic sends an email, creating a direct dependency, violating DIP
    }
}
public interface UserActions {
    void borrowBook(String bookTitle);
    void returnBook(String bookTitle);
    void reviewBook(String bookTitle, String review);
    void addBookToStore(String title, String type, double price);
    void removeBookFromStore(String title);
}
public class Admin implements UserActions {
    @Override
    public void borrowBook(String bookTitle) {
// Not applicable for Admin, violates ISP
    }
    @Override
    public void returnBook(String bookTitle) {
// Not applicable for Admin, violates ISP
    }
    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Admin reviews a book: " + bookTitle + " with review: " + review);
    }
    // AdminSpecificActions implementations
    @Override
    public void addBookToStore(String title, String type, double price) {
        System.out.println("Adding book to store: " + title + ", Type: " + type + ", Price: " + price);
        // Logic for adding a book to the inventory
    }
    @Override
    public void removeBookFromStore(String title) {
        System.out.println("Removing book from store: " + title);
// Logic for removing a book from the inventory
    }
}
public class Customer implements UserActions {
    @Override
    public void borrowBook(String bookTitle) {
        System.out.println("Customer borrows a book: " + bookTitle);
// Logic for a customer to borrow a book
    }
    @Override
    public void returnBook(String bookTitle) {
        System.out.println("Customer returns a book: " + bookTitle);
// Logic for a customer to return a book
    }
    @Override
    public void reviewBook(String bookTitle, String review) {
        System.out.println("Customer reviews a book: " + bookTitle + " with review: " + review);
// Logic for a customer to review a book
    }
    // AdminSpecificActions implementations
    @Override
    public void addBookToStore(String title, String type, double price) {
// Not applicable for Customer, violates ISP
    }
    @Override
    public void removeBookFromStore(String title) {
        System.out.println("Removing book from store: " + title);
// Not applicable for Customer, violates ISP
    }
}
public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        bookstore.addBook("The Java Handbook", "PHYSICAL", 29.99);
        bookstore.processOrder("The Java Handbook", "user@example.com");
        Customer customer = new Customer();
        customer.borrowBook("The Java Handbook");
        customer.returnBook("The Java Handbook");
        customer.reviewBook("The Java Handbook", "Great book for beginners!");
        Admin admin = new Admin();
        admin.reviewBook("Advanced Java Topics", "Excellent depth!");
    }
}