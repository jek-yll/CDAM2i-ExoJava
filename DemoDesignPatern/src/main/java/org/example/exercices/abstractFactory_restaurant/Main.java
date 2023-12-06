package org.example.exercices.abstractFactory_restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restauItalien = new Restaurant(new ItalianCuisineFactory());
        Restaurant restauJapanese = new Restaurant(new JapaneseCuisineFactory());

    }

}
