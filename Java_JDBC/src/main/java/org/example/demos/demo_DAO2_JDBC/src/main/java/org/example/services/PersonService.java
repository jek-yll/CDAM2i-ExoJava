package org.example.services;

import org.example.dao.PersonDAO;
import org.example.models.Person;
import org.example.utils.DatabaseManager;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PersonService {
    private PersonDAO personDAO;
    private Connection connection;
    public PersonService(){
        connection = DatabaseManager.getMySQLConnection();
        personDAO = new PersonDAO(connection);
    }

    public boolean createPerson(String firstname, String lastname){
        Person person = new Person();
        person.setFirstName(firstname);
        person.setLastName(lastname);
        try {
            return personDAO.save(person);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean updatePerson(Person person){
        try {
            return personDAO.update(person);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Person getPerson(int id){
        try {
            return personDAO.get(id);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean deletePerson(int id){
        Person person = null;
        try {
            person = personDAO.get(id);
            if (person != null){
                return personDAO.delete(person);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Person> getAllPersons(){
        try {
            return personDAO.get();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void close(){
        DatabaseManager.closeConnection();
    }
}
