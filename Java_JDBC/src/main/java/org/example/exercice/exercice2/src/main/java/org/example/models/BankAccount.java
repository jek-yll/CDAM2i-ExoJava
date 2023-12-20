package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
public class BankAccount {

    private int accountNumber;
    private int balance;
    private int customerId;
    private List<BankingTransaction> bankingTransactions;

    @Override
    public String toString() {
        return "BankAccount : " +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerId=" + customerId;
    }
}
