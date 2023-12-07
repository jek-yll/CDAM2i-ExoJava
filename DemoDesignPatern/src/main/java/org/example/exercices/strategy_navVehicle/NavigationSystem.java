package org.example.exercices.strategy_navVehicle;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavigationSystem {

    private String destination;
    public void kitt(NavigationStrategy navigationStrategy){
        if (navigationStrategy.navigate(destination)){
            System.out.println("new destination : "+destination);
        } else {
            System.out.println("choose an other navigation");
        }
    }
}
