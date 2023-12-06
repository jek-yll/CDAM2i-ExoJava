package org.example.exercices.TP_RoyaumeV2.entity.building;

import org.example.exercices.TP_RoyaumeV2.builder.building.ForgeBuilder;

public class Forge extends Building{
    private int size;
    private String style;
    private String name;
    private boolean production;

    public Forge(ForgeBuilder builder){
        size = builder.getSize();
        style = builder.getStyle();
        name = builder.getName();
        production = builder.isProduction();

    }
}
