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

    int deposit(int amount, int accBalance) {
        this.accBalance += amount;
        // System.out.println(accBalance);
        return this.accBalance;
    }

    int withdraw(int amount, int accBalance) {
        if (amount <= accBalance) {
            this.accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }

        return this.accBalance;
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
    int withdraw(int amount, int accBalance) {
        // System.out.println(accBalance);
        if (amount <= withLimit && ((accBalance - amount) >= minBalance)) {
            this.accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        // System.out.println(accBalance);
        return this.accBalance;
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String AccHolderName, int accBalance) {
        super(AccHolderName, 25000, accBalance);
        this.withLimit = 100000;
    }

    @Override
    int withdraw(int amount, int accBalance) {
        if (amount <= withLimit && ((accBalance - amount) >= minBalance)) {
            this.accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        // System.out.println(accBalance);
        return this.accBalance;
    }
}

public class Program21_BankAccounts {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, Balance;
        String Name;

        while (true) {
            System.out.println("Bank Management System");
            System.out.println("Enter Account Holder Name:");
            Name = sc.next();
            System.out.println("Enter Starting Account Balance:");
            Balance = sc.nextInt();
            System.out.println("1. Create Savings Account.\n2. Create Checking Account.\n3. Exit.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SavingsAccount(Name, Balance);
                    break;
                case 2:
                    CheckingAccount(Name, Balance);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice! Please Enter a Valid Choice.");
                    break;
            }
        }
    }

    private static void SavingsAccount(String Name, int Balance) {
        int amount;

        SavingsAccount SA = new SavingsAccount(Name, Balance);
        int ch;
        while (true) {
            System.out.println("1. Deposit.\n2. Withdraw.\n3. Exit.");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Amount to Deposit :-");
                    amount = sc.nextInt();
                    SA.deposit(amount, SA.accBalance);
                    SA.getBal();
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw :-");
                    amount = sc.nextInt();
                    SA.withdraw(amount, SA.accBalance);
                    SA.getBal();
                    break;
                case 3:
                    System.out.println("Thank You for Using Bank Management System.");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Enter a Valid Choice.");
                    break;
            }
        }
    }

    private static void CheckingAccount(String Name, int Balance) {
        int amount;

        CheckingAccount CA = new CheckingAccount(Name, Balance);
        int ch;
        while (true) {
            System.out.println("1. Deposit.\n2. Withdraw.\n3. Exit.");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Amount to Deposit :-");
                    amount = sc.nextInt();
                    CA.deposit(amount, CA.accBalance);
                    CA.getBal();
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw :-");
                    amount = sc.nextInt();
                    CA.withdraw(amount, CA.accBalance);
                    CA.getBal();
                    continue;
                case 3:
                    System.out.println("Thank You for Using Bank Management System.");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Enter a Valid Choice.");
                    break;
            }
        }
    }
}