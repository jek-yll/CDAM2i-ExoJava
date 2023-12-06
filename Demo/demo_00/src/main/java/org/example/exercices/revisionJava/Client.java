package org.example.exercices.revisionJava;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Client {
     private String firstname, lastname, mail;
     private ArrayList<Event> tickets;
     public Client(String firstname, String lastname, String mail) {
          this.firstname = firstname;
          this.lastname = lastname;
          this.mail = mail;
     }

     public void buyTcket(){

     }

}
