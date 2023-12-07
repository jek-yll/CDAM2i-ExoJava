package org.example.exercices.strategy_navVehicle;

public class OffroadStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {
        System.out.println("destination : "+ destination + "I hope you have a quality 4x4\n");
        return false;
    }
}
