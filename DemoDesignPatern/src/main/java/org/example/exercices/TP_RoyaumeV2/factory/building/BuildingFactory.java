package org.example.exercices.TP_RoyaumeV2.factory.building;

import org.example.exercices.TP_RoyaumeV2.builder.building.BuildingBuilder;
import org.example.exercices.TP_RoyaumeV2.entity.building.Building;

public abstract class BuildingFactory {
    abstract Building createBuilding(BuildingBuilder builder);
}
