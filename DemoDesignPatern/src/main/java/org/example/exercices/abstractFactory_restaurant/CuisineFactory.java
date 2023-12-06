package org.example.exercices.abstractFactory_restaurant;

public abstract class CuisineFactory {

    abstract Ingredient createIngredient();
    abstract CookingUtensil createUtensil();
    abstract Dish createDish();

}
