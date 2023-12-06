package org.example.exercices.pooHotel;

public class Chambre {

    private int number;
    private Statut statut;
    private Long price;
    private Integer capacity;

    public Chambre(int number, Statut statut, Long price, Integer capacity) {
        this.number = number;
        this.statut = statut;
        this.price = price;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
