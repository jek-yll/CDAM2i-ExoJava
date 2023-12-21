package org.example.model;


import org.example.Exception.CustomFormatException;

public class EventLocation {

    private int id;
    private String name;
    private String address;
    private int capacity;


    public EventLocation(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private EventLocation() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomFormatException {
        if(name.length() > 2) {
            this.name = name;
        }else {
            throw new CustomFormatException("name should be gt 2 char");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws CustomFormatException {
        if(address.length() > 2) {
            this.address = address;
        }
        else {
            throw new CustomFormatException("address should be gt 2 char");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws CustomFormatException {
        if(capacity > 0) {
            this.capacity = capacity;
        }
        else {
            throw new CustomFormatException("capacity should be positive");
        }
    }

    @Override
    public String toString() {
        return "EventLocation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String diplayCustomer(){
        return "- Lieu : " + name + " - Addresse : " + address;
    }
}
