package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class BankingTransaction {

    private int transactionNumber;
    private int amount;
    private Status status;

}
