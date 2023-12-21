package org.example.service;

import org.example.dao.CustomerDAO;
import org.example.model.Customer;
import org.example.model.Ticket;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BilletterieService {

    private Connection connection;
    private CustomerDAO customerDAO;

    public BilletterieService(){
        connection = DatabaseManager.getConnection();
        customerDAO = new CustomerDAO(connection);
    }

    public boolean createCustomer(String firstname, String lastname, String email){
        Customer customer = new Customer(firstname, lastname, email);
        try {
            return customerDAO.save(customer);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Customer getCustomer(int idCustomer){
        try {
            return customerDAO.get(idCustomer);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean updateCustomer(Customer customer){
        try {
            return customerDAO.update(customer);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean deleteCustomer(int idCustomer){
        Customer customer = null;
        try {
            customer = customerDAO.get(idCustomer);
            if (customer != null){
                return customerDAO.delete(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Ticket> getTicketsByCustomer (int idCustomer){
        try {
            return customerDAO.getAllTickets(idCustomer);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
