package org.example.exercices.pooHouse;

public class House {

    private int surface;
    private Door door;

    public House(int surface, Door door) {
        this.surface = surface;
        this.door = door;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void display(){
        System.out.printf("J'ai une maison, d'une surface est de /d m² \n",getSurface());
    }
}
