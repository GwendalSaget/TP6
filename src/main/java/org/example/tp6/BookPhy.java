package org.example.tp6;

public class BookPhy extends Book {
    public BookPhy(String title, double price) {
        super (title, price);
    }

    @Override
    public String getType() {
        return "PHYSICAL";
    }
}