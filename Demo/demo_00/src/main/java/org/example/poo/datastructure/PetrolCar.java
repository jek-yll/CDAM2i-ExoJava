package org.example.poo.datastructure;

public class PetrolCar extends Engine implements Vehicle{

    public PetrolCar() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }

    @Override
    public void drive() {
        System.out.println("Je suis un pertrolCar qui roule");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis un pertrolCar qui démarre");
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "id=" + id +
                ", nbrRoue=" + nbrRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
