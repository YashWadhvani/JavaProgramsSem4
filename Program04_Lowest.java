// Write a Java Program to find the Lowest Number of the 3 entered Numbers.
// Date : 20/12/2023, Author : Yash Wadhvani

import java.util.*;

public class Program04_Lowest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            System.out.println("Enter 1st No. :- ");
            a = sc.nextInt();
            System.out.println("Enter 2nd No. :- ");
            b = sc.nextInt();
            System.out.println("Enter 3rd No. :- ");
            c = sc.nextInt();

            if (a < b) {
                if (a < c) {
                    System.out.println("\n" + a + " Is Lowest.");
                } else {
                    System.out.println("\n" + c + " Is Lowest.");
                }
            } else {
                if (b < c) {
                    System.out.println("\n" + b + " Is Lowest.");
                } else {
                    System.out.println("\n" + c + " Is Lowest.");
                }
            }
        }
    }
}
