package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class BankingTransaction {

    private int transactionNumber;
    private int amount;
    private Status status;
    private int account_id;

    @Override
    public String toString() {
        return "BankingTransaction : " +
                "transactionNumber=" + transactionNumber +
                ", amount=" + amount +
                ", status=" + status +
                ", account_id=" + account_id;
    }
}
