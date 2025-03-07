package org.example.tp6;

public class BookOrder implements Notif{
    //@Override
    public void sendNotification(String email, String message){
        System.out.println("Sending email to " + email + " with message: " + message);
    }
    public void processOrder(Book book, String userEmail) {
        System.out.println("Processing order for " + book.title);
// Assume this logic processes an order and notifies the user
        sendNotification(userEmail, "Your order for " + book.title + " has been processed.");
    }
}