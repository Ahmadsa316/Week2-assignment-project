package org.example.week2_assignment.model;

public class CartItem {

    private int itemNumber;
    private double price;
    private int quantity;

    public CartItem(int itemNumber, double price, int quantity) {
        this.itemNumber = itemNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }
}