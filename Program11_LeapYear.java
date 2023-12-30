// Write a Java program that takes a year from the user and prints whether it is a leap year or not.
// Date : 27/12/2023, Author : Yash Wadhvani

import java.util.Scanner;

public class Program11_LeapYear {
    public static void main(String[] args) {
        int year;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Year :-");
            year = sc.nextInt();
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Is a Leap Year.");
                } else {
                    System.out.println(year + " Is a Not Leap Year.");
                }
            } else {
                System.out.println(year + " Is a Leap Year.");
            }
        } else {
            System.out.println(year + " Is a Not Leap Year.");
        }
    }
}