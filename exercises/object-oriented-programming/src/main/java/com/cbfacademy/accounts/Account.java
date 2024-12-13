package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double withdraw(double amount) {
        if (this.balance >= amount) {
            System.out.println("Withdraw;");
            this.balance -= amount;
            return amount;

        }
    }
}