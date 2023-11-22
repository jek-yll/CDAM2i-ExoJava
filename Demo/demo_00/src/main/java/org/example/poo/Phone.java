package org.example.poo;

public class Phone extends Product {
    int price;
    public Phone() {
    }
    public Phone(int id, String name, int price) {
        super(id, name);
        this.price = price;
    }
}
