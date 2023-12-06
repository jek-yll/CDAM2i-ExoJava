package org.example.exercices.abstractFactory_restaurant;

public class JapaneseCuisineFactory extends CuisineFactory{
    @Override
    Ingredient createIngredient() {
        return new JapaneseIngredients() {
        };
    }

    @Override
    CookingUtensil createUtensil() {
        return new JapaneseUtensil() {
        };
    }

    @Override
    Dish createDish() {
        return new JapaneseDish() {
        };
    }
}
