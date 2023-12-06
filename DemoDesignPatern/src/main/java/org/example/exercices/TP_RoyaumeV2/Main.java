package org.example.exercices.TP_RoyaumeV2;

import org.example.exercices.TP_RoyaumeV2.builder.building.CastleBuilder;
import org.example.exercices.TP_RoyaumeV2.entity.building.Building;
import org.example.exercices.TP_RoyaumeV2.factory.building.CastleFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        CastleFactory castleFactory = new CastleFactory();

        //Ajouter un castle
        buildings.add(castleFactory.createBuilding(new CastleBuilder()
                .name("castle 1")
                .size(10)
                .style("Big One")
        ));
    }
}
