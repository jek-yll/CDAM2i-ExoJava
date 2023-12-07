package org.example.exercices.strategy_navVehicle;

public class EconomicStrategy implements NavigationStrategy {
    @Override
    public boolean navigate(String destination) {
        System.out.println("destination : "+ destination + " you are making a gesture for the planet\n");
        return false;
    }
}
