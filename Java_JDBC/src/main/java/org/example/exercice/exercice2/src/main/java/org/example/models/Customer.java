package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNUmber;
    private List<BankAccount> compteBancaires;

}
