package org.example.poo.datastructure;

public class MotorCycle extends Engine implements Vehicle{
    public MotorCycle() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }
    @Override
    public void drive() {
        System.out.println("Je suis un Motor cycle qui roule");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis un Motor cycle qui démarre");
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "id=" + id +
                ", nbrRoue=" + nbrRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
