package org.example.poo.generic;

import org.example.model.Maison;
import org.example.poo.Phone;
import org.example.poo.datastructure.ElectricCar;

public class Main {
    public static void main(String[] args) {

        Boite<String> boite = new Boite<String>("toto");

        System.out.println(boite.getContenu());

        Boite<Phone> boite1 = new Boite<Phone>(new Phone(1, "toto", 19));

        System.out.println(boite1.getContenu().getName());
    }
}
