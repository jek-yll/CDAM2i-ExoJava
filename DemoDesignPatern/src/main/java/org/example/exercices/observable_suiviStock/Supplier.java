package org.example.exercices.observable_suiviStock;

public class Supplier implements Observer{
    @Override
    public void update(Product product) {
        System.out.println("Alert Supplier -> Stock of : "+ product.getStockLevel() );
    }
}
