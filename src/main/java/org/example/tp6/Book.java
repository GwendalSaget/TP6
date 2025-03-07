package org.example.tp6;


public abstract class Book {
    String title;
    double price;
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public abstract String getType();
}