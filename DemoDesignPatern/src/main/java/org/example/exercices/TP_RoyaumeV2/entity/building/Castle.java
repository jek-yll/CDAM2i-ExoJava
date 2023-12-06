package org.example.exercices.TP_RoyaumeV2.entity.building;

import org.example.exercices.TP_RoyaumeV2.builder.building.CastleBuilder;

public class Castle extends Building {

    private int size;
    private String style;
    private String name;

    public Castle(CastleBuilder builder) {
        size = builder.getSize();
        style = builder.getStyle();
        name = builder.getName();
    }
}
