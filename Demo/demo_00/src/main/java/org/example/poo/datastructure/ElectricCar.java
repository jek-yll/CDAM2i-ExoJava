package org.example.poo.datastructure;

public class ElectricCar extends Engine implements Vehicle {

    public ElectricCar() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }


    @Override
    public void drive() {
        System.out.println("Je suis un Electric car qui roule");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis un Electric car qui démarre");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "id=" + id +
                ", nbrRoue=" + nbrRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
