package com.homework.homework08_;

public class Homework08 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(100, 0.05);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(2);

        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(5);
        System.out.println(savingsAccount.getBalance());
//        savingsAccount.withdraw(10);
//        System.out.println(savingsAccount.getBalance());
    }
}


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initBalance) {
        super(initBalance);
    }

    public void deposit(double amount) {

        super.deposit(amount - 1);
    }

    public void withdraw(double amount) {
        super.deposit(amount + 1);
    }
}

class SavingsAccount extends BankAccount {
    private int count;
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {


        if (count < 3) {
            super.deposit(amount);
            count += 1;
        } else {
            super.deposit(amount - 1);
        }

    }

    public void withdraw(double amount) {

        if (count < 3) {
            super.withdraw(amount);
            count += 1;
        } else {
            super.withdraw(amount + 1);
        }
    }

    public void earnMonthlyInterest() {
        super.deposit(this.getBalance() * this.interestRate);
        this.count = 0;
    }
}
