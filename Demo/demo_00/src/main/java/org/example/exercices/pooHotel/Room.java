package org.example.exercices.pooHotel;

public class Room {
    private Integer number;
    private Statut statut;
    private Integer price, capacite;

    public Room(Integer number, Statut statut, Integer price, Integer capacite) {
        this.number = number;
        this.statut = statut;
        this.price = price;
        this.capacite = capacite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }
}
