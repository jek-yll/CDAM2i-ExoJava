package org.example.exercices.TP_RoyaumeV2.builder.building;

import org.example.exercices.TP_RoyaumeV2.builder.building.BuildingBuilder;
import org.example.exercices.TP_RoyaumeV2.entity.building.Building;
import org.example.exercices.TP_RoyaumeV2.entity.building.Castle;

public class CastleBuilder extends BuildingBuilder {
    private int size;
    private String style;
    private String name;

    @Override
    public BuildingBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BuildingBuilder style(String style) {
        this.style = style;
        return this;
    }

    @Override
    public BuildingBuilder size(int size) {
        this.size = size;
        return this;
    }

    @Override
    public Building build() {
        return new Castle(this);
    }

    public int getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }
}
