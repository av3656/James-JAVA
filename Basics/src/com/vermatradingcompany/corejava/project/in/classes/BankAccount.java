//This project is an example of Encapsulation.


package com.vermatradingcompany.corejava.project.in.classes;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposited(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + "Total Balance: " +balance);
        } else {
            System.out.println("Invalid Deposit");
        }
    }

    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " Remaining Balance: " +balance);
        } else {
            System.out.println("Invalid amount , Insufficient Balance");
        }
    }
}
