package org.example.tp6;

public class EBook extends Book {
    public EBook(String title, double price) {

        super (title, price);
    }
    @Override
    public String getType() {
        return "EBOOK";
    }
}

