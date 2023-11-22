package org.example;

import org.example.poo.Product;


public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        p.setId(10);
        p.setName("Iphone");
        System.out.println(p);

        Product p2 = new Product(11, "Table");
        System.out.println(p2);
    }
}