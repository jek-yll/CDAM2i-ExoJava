package org.example.exercices.builder_pizza;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .taille("grande")
                .pate("fine")
                .fromage("mozzarella")
                .fromage("cheddar")
                .garnitures("olive")
                .garnitures("oignons")
                .garnitures("poulet")
                .build();
        System.out.println(pizza);
    }
}
