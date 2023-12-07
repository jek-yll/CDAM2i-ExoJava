package org.example.exercices.observable_suiviStock;

public class StockManager implements Observer{
    @Override
    public void update(Product product) {
        System.out.println("Alert StockManager -> Stock of : "+ product.getStockLevel() );
    }
}
