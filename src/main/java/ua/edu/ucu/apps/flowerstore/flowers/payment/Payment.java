package ua.edu.ucu.apps.flowerstore.flowers.payment;

public interface Payment {
    void setPrice(double price);
    void pay(double price);
}