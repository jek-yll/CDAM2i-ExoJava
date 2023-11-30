package org.example.exceptions;

import java.util.ArrayList;

public class Cards {

    private ArrayList<String> cards = new ArrayList<>();

    public ArrayList<String> drawCards(int nbCards) throws MyExceptions{
        if (nbCards > 4 ){
            throw new MyExceptions("tricheur !!!");
        }
        return new ArrayList<String>();
    }

    public String trade(int nbCards){
        if (nbCards > 2){
            throw new MeSecondExceptions("Moins de 2 cartes !!!");
        }
        return "Voila vos cartes";
    }
}
