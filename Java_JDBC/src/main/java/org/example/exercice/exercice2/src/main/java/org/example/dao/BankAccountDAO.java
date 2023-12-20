package org.example.dao;

import org.example.models.BankAccount;
import org.example.models.Status;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class BankAccountDAO extends BaseDAO<BankAccount>{

    public BankAccountDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(BankAccount element) throws SQLException {
        request = "INSERT INTO bank_account (balance, customer_id) VALUES (?,?);";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, element.getBalance());
        statement.setInt(2, element.getCustomerId());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();

        if (resultSet.next()){
            element.setAccountNumber(resultSet.getInt(1));
        }

        return nbRows == 1;
    }


    public boolean updateBalance(BankAccount element, int amount, Status status) throws SQLException {
        request = "UPDATE bank_account SET balance = ? WHERE account_number = ?;";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);

        int newBalance = element.getBalance();

        // TODO verification découvert
        if (status == Status.DEPOSIT){
            newBalance = newBalance + amount;
        } else if(status == Status.WITHDRAWAL) {
            newBalance = newBalance - amount;
        }

        statement.setInt(1, newBalance);
        statement.setInt(2, element.getAccountNumber());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();

        if (resultSet.next()){
            element.setAccountNumber(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public BankAccount get(int accountNumber) throws SQLException {
        BankAccount account = null;
        request = "SELECT * FROM bank_account WHERE account_number = ?;";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, accountNumber);
        resultSet = statement.executeQuery();

        if (resultSet.next()){
            account = new BankAccount();
            account.setAccountNumber(resultSet.getInt("account_number"));
            account.setBalance(resultSet.getInt("balance"));
            account.setBankingTransactions(
                    new BankingTransactionDAO(_connection).getAllTransaction(accountNumber)
            );
        }
        return account;
    }

    @Override
    public boolean delete(BankAccount element) throws SQLException {
        return false;
    }

    @Override
    public List<BankAccount> get() throws SQLException {
        return null;
    }

    @Override
    public boolean update(BankAccount element) throws SQLException {
        return false;
    }
}
