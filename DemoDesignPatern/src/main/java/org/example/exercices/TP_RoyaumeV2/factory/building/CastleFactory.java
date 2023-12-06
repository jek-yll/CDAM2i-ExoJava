package org.example.exercices.TP_RoyaumeV2.factory.building;

import org.example.exercices.TP_RoyaumeV2.builder.building.BuildingBuilder;
import org.example.exercices.TP_RoyaumeV2.entity.building.Building;

public class CastleFactory extends BuildingFactory {
    public Building createBuilding(BuildingBuilder builder){
        return builder.build();
    }
}
