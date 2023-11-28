package org.example.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate dateDuJour = LocalDate.now();
        System.out.println("Date du jour: " + dateDuJour);

        LocalDate dateChoisi = LocalDate.of(2023, 11, 30);
        System.out.println("Date choisi: " + dateChoisi);

        // Recuperation d'élément de ma date
        int anneeEnCours = dateDuJour.getYear();
        int moisEnCours = dateDuJour.getMonthValue();
        int jourEnCours = dateDuJour.getDayOfMonth();
        System.out.println("Nous sommes le "+jourEnCours+" ème jour du "+moisEnCours+" ème mois de l'année "+anneeEnCours);

        // Ajouter ou soustraire des jours
        LocalDate dateDansTroisJours = dateDuJour.plusDays(3);
        System.out.println(dateDansTroisJours);
        System.out.println(dateDuJour.isBefore(dateDansTroisJours));

        LocalDate dateMoinsTroisJours = dateDuJour.minusDays(3);
        System.out.println(dateMoinsTroisJours);

        // Formatage de la date
        String dateToFormat = "2023-01-25";
        LocalDate dateSaisie = LocalDate.parse(dateToFormat, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(dateSaisie);
        System.out.println(dateDuJour.isBefore(dateSaisie));
    }

}
