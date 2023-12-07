package org.example.exercices.observable_suiviStock;

public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        Supplier supplier = new Supplier();
        StockManager stockManager = new StockManager();

        product.registerObserver(supplier);
        product.registerObserver(stockManager);

        product.newStock(41);
    }

}
