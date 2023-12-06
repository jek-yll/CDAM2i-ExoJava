package org.example.exercices.revisionJava;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

@Data
public class Event {
    private String nom;
    private String date;
    private String heure;
    private Lieu lieu;
    private double prix;
    private int nbBilletsVendus;

    public Event(String name, LocalDate date, LocalTime time, Lieu lieu, double prix) {

    }

    public Event(String concert, String date, String time, Lieu lieu, double prix) {
    }


    public boolean verifEvent(){
        return false;
    }

    public boolean cancelTcket(){
        return false;
    }
}
