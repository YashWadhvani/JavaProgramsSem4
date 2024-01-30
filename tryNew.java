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
        this.accBalance += amount;
        return this.accBalance;
    }

    int withdraw(int amount) {
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
    int withdraw(int amount) {
        if (amount <= withLimit && ((accBalance - amount) >= minBalance)) {
            this.accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        return this.accBalance;
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
            this.accBalance -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
        return this.accBalance;
    }
}

public class tryNew {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, Balance;
        String Name;
        System.out.println("Bank Management System");
        do {
            System.out.println("Enter Account Holder Name:");
            Name = sc.next();

            System.out.println("1. Create Savings Account.\n2. Create Checking Account.");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Starting Account Balance:");
                Balance = sc.nextInt();
                SavingsAccount(Name, Balance);
            } else if (choice == 2) {
                System.out.println("Enter Starting Account Balance:");
                Balance = sc.nextInt();
                CheckingAccount(Name, Balance);
            } else {
                System.out.println("Invalid Choice! Please Enter a Valid Choice.");
            }

            System.out.println("Press 1 to Continue Again!");
            choice = sc.nextInt();

        } while (choice == 1);
    }

    private static void SavingsAccount(String Name, int Balance) {
        int amount;

        SavingsAccount SA = new SavingsAccount(Name, Balance);
        int ch;
        while (true) {
            System.out.println("1. Deposit.\n2. Withdraw.\n3. Exit.");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter Amount to Deposit :-");
                amount = sc.nextInt();
                SA.deposit(amount);
                SA.getBal();
            } else if (ch == 2) {
                System.out.println("Enter Amount to Withdraw :-");
                amount = sc.nextInt();
                SA.withdraw(amount);
                SA.getBal();
            } else if (ch == 3) {
                System.out.println("Thank You for Using Bank Management System.");
                break;
            } else {
                System.out.println("Invalid Choice! Please Enter a Valid Choice.");
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
            if (ch == 1) {
                System.out.println("Enter Amount to Deposit :-");
                amount = sc.nextInt();
                CA.deposit(amount);
                CA.getBal();
            } else if (ch == 2) {
                System.out.println("Enter Amount to Withdraw :-");
                amount = sc.nextInt();
                CA.withdraw(amount);
                CA.getBal();
            } else if (ch == 3) {
                System.out.println("Thank You for Using Bank Management System.");
                break;
            } else {
                System.out.println("Invalid Choice! Please Enter a Valid Choice.");
            }
        }
    }
}