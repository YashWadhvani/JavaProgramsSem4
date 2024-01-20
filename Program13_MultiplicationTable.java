// Write a Java program to display the multiplication table of a given integer.
// Date : 28/12/2023, Author : Yash Wadhvani

import java.util.Scanner;

public class Program13_MultiplicationTable {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number to Print it's Multiplication Table :-");
            num = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", num, i, num * i));
        }
    }
}
