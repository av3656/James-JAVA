package com.vermatradingcompany.corejava.project.in.classes;

public class BankAccount_class {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(242323232);
//        bankAccount.deposited(2500);
        bankAccount.withdrawl(2500);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccountNumber());
    }
}
