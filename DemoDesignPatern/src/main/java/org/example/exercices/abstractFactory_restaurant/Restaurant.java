package org.example.exercices.abstractFactory_restaurant;

public class Restaurant {

    private Ingredient ingredient;
    private CookingUtensil cookingUtensil;
    private Dish dish;

    public Restaurant(CuisineFactory cuisine){
        ingredient = cuisine.createIngredient();
        cookingUtensil = cuisine.createUtensil();
        dish = cuisine.createDish();
    }

}
