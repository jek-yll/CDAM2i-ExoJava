package org.example.exercices.TP_RoyaumeV2.builder.building;

import org.example.exercices.TP_RoyaumeV2.entity.building.Building;

public abstract class BuildingBuilder {
    public abstract BuildingBuilder name(String name);
    public abstract BuildingBuilder style(String style);
    public abstract BuildingBuilder size(int size);

    public abstract Building build();
}
