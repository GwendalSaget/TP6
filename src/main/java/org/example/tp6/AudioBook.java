package org.example.tp6;

public class AudioBook extends Book {
    public AudioBook(String title, double price) {
        super (title, price);
    }
    @Override
    public String getType() {
        return "AUDIOBOOK";
    }
}