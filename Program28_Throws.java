// Write a java program using throws keyword to handle custom exception.
// Date : 20/03/2024, Author : Yash Wadhvani

import java.util.Scanner;

public class Program28_Throws {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("You are not a Legal Adult, Access Denied");
        }
        System.out.println("You are a Legal Adult, Access Granted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age = sc.nextInt();
        sc.close();
        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("The Code Generates the following error :");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
