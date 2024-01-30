// Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
// Date : 17/01/2024, Author : Yash Wadhvani

import java.util.Scanner;

class BankAccount {
    String AccHolderName;
    int accBalance, minBalance, withLimit;

    BankAccount(String AccHolderName, int minBalance, int accBalance) {
        this.AccHolderName = AccHolderName;
        this.minBalance = minBalance;
        this.accBalance = accBalance;
    }

    int deposit(int amount) {
        accBalance += amount;
        return accBalance;
    }

    int withdraw(int amount) {
        if (amount <= accBalance) {
            accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }

        return accBalance;
    }

    void getBal() {
        System.out.println("Account Balance : " + this.accBalance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String AccHolderName, int accBalance) {
        super(AccHolderName, 10000, accBalance);
        this.withLimit = 50000;
    }

    @Override
    int withdraw(int amount) {
        if (amount <= withLimit && ((accBalance - amount) >= minBalance)) {
            accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        return accBalance;
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String AccHolderName, int accBalance) {
        super(AccHolderName, 25000, accBalance);
        this.withLimit = 100000;
    }

    @Override
    int withdraw(int amount) {
        if (amount <= withLimit && ((accBalance - amount) >= minBalance)) {
            accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        return accBalance;
    }
}

public class Program21_BankAccounts {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, balance, amount;
        String name;
        BankAccount Account = null;

        while (true) {
            if (Account == null) {
                System.out.println("Bank Management System");
                System.out.println("1. Create Savings Account.\n" +
                        "2. Create Checking Account.\n" +
                        "3. Exit.");
                choice = sc.nextInt();
                System.out.println("Enter Account Holder Name:");
                name = sc.next();
                System.out.println("Enter Starting ount Balance:");
                balance = sc.nextInt();
                if (choice == 1)
                    Account = new SavingsAccount(name, balance);
                else if (choice == 2)
                    Account = new CheckingAccount(name, balance);
                else if (choice == 3)
                    break;
                else {
                    System.out.println("Enter proper choice!!");
                    continue;
                }
            }
            System.out.println("1. Deposit Amount.\n" +
                    "2. Withdraw Amount.\n" +
                    "3. Exit.");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter Amount to Deposit :-");
                amount = sc.nextInt();
                Account.deposit(amount);
                Account.getBal();
            } else if (choice == 2) {
                System.out.println("Enter Amount to Withdraw :-");
                amount = sc.nextInt();
                Account.withdraw(amount);
                Account.getBal();
            } else if (choice == 3)
                break;
            else
                System.out.println("Invalid Choice! Please Enter a Valid Choice.");
        }

    }
}