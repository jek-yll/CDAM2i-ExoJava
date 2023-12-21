package org.example.model;

public class Ticket {

    private Customer customer;
    private Event event;
    public Ticket(Customer customer, Event event) {
        this.customer = customer;
        this.event = event;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "client : " + customer +
                "// Evenement : " + event +
                '}';
    }
}
