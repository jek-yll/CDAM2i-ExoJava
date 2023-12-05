package org.example.exercices.abstractFactory_restaurant;

public class ItalianCuisineFactory extends CuisineFactory{
    @Override
    Ingredient createIngredient() {
        return new ItalianIngredient() {
        };
    }

    @Override
    CookingUtensil createUtensil() {
        return new ItalianUtensil() {
        };
    }

    @Override
    Dish createDish() {
        return new ItaliantDish() {
        };
    }
}
