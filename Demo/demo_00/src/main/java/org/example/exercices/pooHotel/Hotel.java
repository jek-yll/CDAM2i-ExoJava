package org.example.exercices.pooHotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;
    private List<Client> clients;

    public Hotel(String name, List<Room> rooms, List<Reservation> reservations, List<Client> clients) {
        this.name = name;
        this.rooms = rooms;
        this.reservations = reservations;
        this.clients = clients;
    }

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<Room>();
        this.clients = new ArrayList<Client>();
        this.reservations = new ArrayList<Reservation>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                ", reservations=" + reservations +
                ", clients=" + clients +
                '}';
    }

    public String toStringClient() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }


}
