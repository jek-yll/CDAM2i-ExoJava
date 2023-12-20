package org.example.dao;

import org.example.models.BankingTransaction;
import org.example.models.Status;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BankingTransactionDAO extends BaseDAO<BankingTransaction>{
    public BankingTransactionDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(BankingTransaction element) throws SQLException {
        request = "INSERT INTO banking_transaction (amount, status, account_id) VALUES (?,?,?);";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, element.getAmount());
        statement.setString(2, element.getStatus().toString());
        statement.setInt(3, element.getAccount_id());

        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();

        if (resultSet.next()){
            element.setTransactionNumber(resultSet.getInt(1));
        }

        return nbRows == 1;
    }

    @Override
    public BankingTransaction get(int transactionNumber) throws SQLException {
        BankingTransaction transaction = null;
        request = "SELECT * FROM person WHERE id = ?;";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, transactionNumber);
        resultSet = statement.executeQuery();

        if (resultSet.next()){
            transaction = new BankingTransaction();
        }
        return transaction;
    }

    public List<BankingTransaction> getAllTransaction(int accountNumber) throws SQLException {
        List<BankingTransaction> result = new ArrayList<>();
        request = "SELECT transaction_number, amount, status, account_id FROM banking_transaction bt " +
                "INNER JOIN bank_account ba ON ba.account_number = bt.account_id WHERE ba.account_number = ?; ";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, accountNumber);

        resultSet = statement.executeQuery();
        while (resultSet.next()){
            BankingTransaction transaction = new BankingTransaction();
            transaction.setTransactionNumber(resultSet.getInt("transaction_number"));
            transaction.setAmount(resultSet.getInt("amount"));
            transaction.setStatus(Status.valueOf(resultSet.getString("status")));
            transaction.setAccount_id(resultSet.getInt("account_id"));

            result.add(transaction);
        }
        return result;
    }

    @Override
    public boolean update(BankingTransaction element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(BankingTransaction element) throws SQLException {
        return false;
    }

    @Override
    public List<BankingTransaction> get() throws SQLException {
        return null;
    }
}
