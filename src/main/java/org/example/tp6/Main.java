package org.example.tp6;

public class Main {
    public static void main(String[] args) {
        Book book1 = new BookPhy("The Java Handbook", 29.99);
        Book book2 = new EBook("Clean Code", 19.99);
        Book book3 = new AudioBook("Effective Java", 39.99);

        BookAdd bookAdd = new BookAdd();
        bookAdd.addBook(book1);
        bookAdd.addBook(book2);
        bookAdd.addBook(book3);

        BookOrder bookOrder = new BookOrder();
        bookOrder.processOrder(book1, "user@example.com");
        bookOrder.processOrder(book2, "customer@gmail.com");


        Customer customer = new Customer();
        customer.borrowBook(book1);
        customer.returnBook(book1);
        customer.reviewBook(book1, "Great book for beginners!");


        Admin admin = new Admin();
        admin.addBookToStore(book1);
        admin.addBookToStore(book2);
        admin.reviewBook(book3, "Excellent depth!");
        admin.removeBookFromStore(book2);
    }
}
