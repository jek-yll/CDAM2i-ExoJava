package org.example.exercices.TP_RoyaumeV2.factory.building;

import org.example.exercices.TP_RoyaumeV2.builder.building.BuildingBuilder;
import org.example.exercices.TP_RoyaumeV2.entity.building.Building;

public class ForgeFactory extends BuildingFactory{
    @Override
    Building createBuilding(BuildingBuilder builder) {
        return builder.build();
    }
}
