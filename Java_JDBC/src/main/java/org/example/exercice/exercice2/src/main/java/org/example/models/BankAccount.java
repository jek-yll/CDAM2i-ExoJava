package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class BankAccount {

    private int accountNumber;
    private int balance;
    private int customerId;
    private List<BankingTransaction> bankingTransactions;


}
