package org.example.exercices.TP_RoyaumeV2.builder.building;

import org.example.exercices.TP_RoyaumeV2.entity.building.Building;
import org.example.exercices.TP_RoyaumeV2.entity.building.Forge;

public class ForgeBuilder extends BuildingBuilder{
    private int size;
    private String style;
    private String name;
    private boolean production;
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
        return new Forge(this);
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
    public boolean isProduction() {
        return production;
    }
}
