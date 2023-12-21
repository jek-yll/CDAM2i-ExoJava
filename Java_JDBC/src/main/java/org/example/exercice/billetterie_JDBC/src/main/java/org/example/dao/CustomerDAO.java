package org.example.dao;

import org.example.Exception.CustomFormatException;
import org.example.model.Customer;
import org.example.model.Event;
import org.example.model.EventLocation;
import org.example.model.Ticket;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends BaseDAO<Customer>{
    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Customer element) throws SQLException {
        request = "INSERT INTO customer (firstname, lastname, email) VALUES (?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setString(3, element.getEmail());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Customer element) throws SQLException {
        request = "UPDATE customer SET firstname = ?, lastname = ?, email = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setString(3, element.getEmail());
        statement.setInt(4,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Customer element) throws SQLException {
        request = "DELETE FROM customer WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Customer get(int id) throws SQLException {
        Customer person = null;
        request = "SELECT * FROM customer WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            person = new Customer(
                    resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"),
                    resultSet.getString("email")
                    );
        }
        return person;
    }

    public List<Ticket> getAllTickets(int idCustomer) throws SQLException {
        List <Ticket> tickets = new ArrayList<>();

        request = "SELECT c.id as id_customer, c.firstname, c.lastname, c.email,e.id as id_event, e.name as event_name, e.date_time, e.price,el.id as id_location, el.name as location_name, el.address " +
                "FROM customer AS c " +
                "INNER JOIN ticket AS T ON c.id = t.customer_id " +
                "INNER JOIN event AS e ON t.event_id = e.id " +
                "INNER JOIN event_location AS el ON e.event_location_id = el.id " +
                "WHERE c.id = ?;";


        statement = _connection.prepareStatement(request);
        statement.setInt(1,idCustomer);
        // int rows = statement.executeUpdate();
        resultSet = statement.executeQuery();

        while (resultSet.next()){
            Ticket ticket = new Ticket(
                   new Customer(
                           resultSet.getInt("id_customer"),
                           resultSet.getString("firstname"),
                           resultSet.getString("lastname"),
                           resultSet.getString("email")),
                    new Event(
                            resultSet.getInt("id_event"),
                            resultSet.getString("event_name"),
                            resultSet.getTimestamp("date_time").toLocalDateTime(),
                            resultSet.getDouble("price"),
                            new EventLocation(
                                    resultSet.getInt("id_location"),
                                    resultSet.getString("location_name"),
                                    resultSet.getString("address")
                            )
                    )
            );

            tickets.add(ticket);
        }

    return tickets;
    }
}
