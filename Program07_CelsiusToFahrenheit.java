// Write a Java Program to convert Temperature from Celsius to Fahrenheit or Vice Versa.
// Date : 20/12/2023, Author : Yash Wadhvani

import java.util.*;

public class Program07_CelsiusToFahrenheit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Do you want to Enter Temperature in? \n1.Celsius\n2.Fahrenheit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Temperature in Celsius :-");
                double c = sc.nextDouble();
                double f = 1.8 * c + 32;
                System.out.println(String.format("%.2f Celsius = %.2f Fahrenheit.", c, f));
            } else if (choice == 2) {
                System.out.println("Enter Temperature in Fahrenheit :-");
                double f = sc.nextDouble();
                double c = (f - 32) / 1.8;
                System.out.println(String.format("%.2f Fahrenheit = %.2f Celsius.", f, c));
            }
        }
    }
}
