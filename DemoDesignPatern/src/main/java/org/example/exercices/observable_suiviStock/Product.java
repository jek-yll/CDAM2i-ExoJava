package org.example.exercices.observable_suiviStock;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Product implements Subject{

    private Integer stockLevel;
    List<Observer> observers;

    public Product(){
        observers = new ArrayList<>();
        stockLevel = 50;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void newStock(Integer stock){
        setStockLevel(stock);
        alertObserver(this);
    }
    @Override
    public void alertObserver(Product product) {
        observers.forEach(o -> o.update(product));
    }
}
