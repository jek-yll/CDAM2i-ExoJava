package org.example.model;

import org.example.Exception.CustomFormatException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Customer {
    private int id;
    private String firstname;

    private String lastname;

    private String email;

    private List<Ticket> eventsTicket;


    public  Customer(String firstname, String lastname, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.eventsTicket = new ArrayList<>();
    }
   public Customer(int id, String firstname, String lastname, String email){
        this(firstname,lastname,email);
        this.id = id;
       this.eventsTicket = new ArrayList<>();
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws CustomFormatException {
        String pattern = "^([a-zA-Z0-9_.-]+)@([a-z0-9-]+\\.?[a-z0-9-]+)\\.([a-z]{2,6})$";
        if(!Pattern.matches(pattern, email)) {
            throw new CustomFormatException("Not correct email");
        }
        this.email = email;
    }

    public List<Ticket> getEventsTicket() {
        return eventsTicket;
    }

    public void setEventsTicket(List<Ticket> eventsTicket) {
        this.eventsTicket = eventsTicket;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", eventsTicket=" + eventsTicket +
                '}';
    }

    public String customerDisplay(){
        return "Client : " + firstname + " " + lastname + " - mail : " + email;
    }
}
