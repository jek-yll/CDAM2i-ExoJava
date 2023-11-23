package org.example.poo.datastructure;

public class SuperCar implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Je suis un supercar qui roule");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis un supercar qui démarre");
    }
}
