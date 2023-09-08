package com.cbfacademy.accounts;

public class SavingsAccount {
    private int accountNumber;
    private double balance;

}

public class SavingsAccount extends Account {
    public SavingsAcoount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}