package org.example.exercices.strategy_navVehicle;

public class RoadStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {
        System.out.println( "destination : "+ destination + " thank you for financing the highways\n");
        return false;
    }
}
