package org.example.services;

import org.example.dao.BankAccountDAO;
import org.example.dao.BankingTransactionDAO;
import org.example.dao.CustomerDAO;
import org.example.models.BankAccount;
import org.example.models.Customer;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private CustomerDAO customerDAO;
    private BankingTransactionDAO bankingTransactionDAO;
    private BankAccountDAO bankAccountDAO;
    private Connection connection;

    public CustomerService(){
        try {
            connection = new DatabaseManager().getMySQLConnection();
            bankAccountDAO = new BankAccountDAO(connection);
            bankingTransactionDAO = new BankingTransactionDAO(connection);
            customerDAO = new CustomerDAO(connection);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean createCustomer(String firstname, String lastname, String phoneNumber) {
        Customer customer = new Customer();
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setPhoneNUmber(phoneNumber);

        try {
            if (customerDAO.save(customer)){
                int customerNumber = customer.getId();
                BankAccount firstAccount = new BankAccount();
                firstAccount.setCustomerId(customerNumber);
                 if (bankAccountDAO.save(firstAccount)){
                     return true;
                 }
            } else {
                System.out.println("erreur lors de la création du compte");
            };
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean update(int accountId, int amount){

        try {
            bankAccountDAO.update(bankAccountDAO.get(accountId));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    public List<BankAccount> getAllAccount(int customerId){
        try {
            return customerDAO.getAllAccount(customerId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
