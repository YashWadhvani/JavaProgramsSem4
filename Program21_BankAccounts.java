// Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.

import java.util.Scanner;

class BankAccount {
    String AccHolderName;
    int accBalance, minBalance, withLimit;

    BankAccount(String AccHolderName, int minBalance) {
        this.AccHolderName = AccHolderName;
        this.minBalance = minBalance;
        this.accBalance = minBalance;
    }

    int deposit(int amount, int accBalance) {
        accBalance += amount;
        return accBalance;
    }

    int withdraw(int amount, int accBalance) {
        if (amount <= accBalance) {
            accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        return accBalance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String AccHolderName) {
        super(AccHolderName, 10000);
        this.withLimit = 50000;
    }

    @Override
    int withdraw(int amount, int accBalance) {
        if (amount <= withLimit && ((accBalance - amount) >= minBalance)) {
            accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        return accBalance;
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String AccHolderName) {
        super(AccHolderName, 25000);
        this.withLimit = 100000;
    }

    @Override
    int withdraw(int amount, int accBalance) {
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
        int choice;
        String Name;

        while (true) {
            System.out.println("Bank Management System");
            System.out.println("Enter Account Holder Name:");
            Name = sc.next();
            System.out.println("1. Create Savings Account.\n2. Create Checking Account.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SavingsAccount(Name);
                    break;
                case 2:
                    CheckingAccount(Name);
                    break;
                default:
                    System.out.println("Invalid Choice! Please Enter a Valid Choice.");
                    break;
            }
        }
    }

    private static void SavingsAccount(String Name) {
        int amount;

        SavingsAccount SA = new SavingsAccount(Name);
        int ch;
        while (true) {
            System.out.println("1. Deposit.\n2. Withdraw.\n3. Exit.");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Amount to Deposit :-");
                    amount = sc.nextInt();
                    SA.deposit(amount, SA.accBalance);
                    continue;
                case 2:
                    System.out.println("Enter Amount to Withdraw :-");
                    amount = sc.nextInt();
                    SA.withdraw(amount, SA.accBalance);
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

    private static void CheckingAccount(String Name) {
        int amount;

        CheckingAccount CA = new CheckingAccount(Name);
        int ch;
        while (true) {
            System.out.println("1. Deposit.\n2. Withdraw.\n3. Exit.");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Amount to Deposit :-");
                    amount = sc.nextInt();
                    CA.deposit(amount, CA.accBalance);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw :-");
                    amount = sc.nextInt();
                    CA.withdraw(amount, CA.accBalance);
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