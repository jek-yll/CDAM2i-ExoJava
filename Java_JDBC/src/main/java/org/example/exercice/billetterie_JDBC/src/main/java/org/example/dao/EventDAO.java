package org.example.dao;

import org.example.model.Event;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EventDAO extends BaseDAO<Event>{
    protected EventDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Event element) throws SQLException {
        request = "INSERT INTO event (name, date_time, price, event_location) VALUES (?,?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getName());
        statement.setString(2, element.getDateTime().toString());
        statement.setDouble(3, element.getPrice());
        statement.setInt(4, element.getEventLocation().getId());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean delete(Event element) throws SQLException {
        request = "DELETE FROM Event WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean update(Event element) throws SQLException {
        request = "UPDATE Event SET name = ?, date_time = ?, price = ?, event_location_id = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getLastName());
        statement.setString(4, element.getLastName());
        statement.setString(5, element.getLastName());
        statement.setInt(3,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Event get(int id) throws SQLException {
        return null;
    }
}
