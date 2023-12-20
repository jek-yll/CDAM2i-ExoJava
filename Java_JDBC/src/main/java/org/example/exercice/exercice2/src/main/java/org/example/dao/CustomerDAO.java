package org.example.dao;

import org.example.models.BankAccount;
import org.example.models.BankingTransaction;
import org.example.models.Customer;

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
        request = "INSERT INTO customer (firstname, lastname, phone_number) VALUES (?,?,?);";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getPhoneNUmber());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();

        if (resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Customer element) throws SQLException {
        request = "UPDATE customer SET firstname = ?, lastname = ?, phone_number = ? WHERE id = ?;";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getPhoneNUmber());
        statement.setInt(4, element.getId());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();

        if (resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean delete(Customer element) throws SQLException {
        request = "DELETE FROM customer WHERE id = ?;";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Customer get(int customerId) throws SQLException {
        Customer customer = null;
        request = "SELECT * FROM customer WHERE customer_id = ?;";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, customerId);
        resultSet = statement.executeQuery();

        if (resultSet.next()){
            customer = new Customer();
            customer.setFirstName(resultSet.getString("firstname"));
            customer.setLastName(resultSet.getString("lastname"));
            customer.setPhoneNUmber(resultSet.getString("phone_number"));
            customer.setCompteBancaires(getAllAccount(customerId));
        }
        return customer;
    }

    public List<BankAccount> getAllAccount(int idCustomer) throws SQLException {
        List<BankAccount> result = new ArrayList<>();
        request = "SELECT account_number, balance, ba.customer_id FROM bank_account ba " +
                "INNER JOIN customer cu ON cu.customer_id = ba.customer_id WHERE ba.customer_id = ?; ";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, idCustomer);

        resultSet = statement.executeQuery();
        while (resultSet.next()){
            BankAccount account = new BankAccount();
            account.setAccountNumber(resultSet.getInt("account_number"));
            account.setBalance(resultSet.getInt("balance"));
            account.setCustomerId(resultSet.getInt("customer_id"));
            result.add(account);
        }
        return result;
    }

    @Override
    public List<Customer> get() throws SQLException {
        return null;
    }
}
