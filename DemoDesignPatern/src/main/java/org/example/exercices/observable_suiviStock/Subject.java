package org.example.exercices.observable_suiviStock;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void alertObserver(Product product);
}
