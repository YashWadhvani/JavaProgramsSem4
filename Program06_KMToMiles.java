// Write a Java Program to convert Distance from KM to Miles or Vice Versa.
// Date : 20/12/2023, Author : Yash Wadhvani

import java.util.Scanner;

public class Program06_KMToMiles {
    public static void main(String[] args) {
        double conv_fac = 0.621371;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Do you want to Enter Distance in? \n1.KM\n2.Miles");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Distance in KM :-");
                double k = sc.nextDouble();
                double m = k * conv_fac;
                System.out.println(String.format("%.2f KM = %.2f Miles.", k, m));
            } else if (choice == 2) {
                System.out.println("Enter Distance in Miles :-");
                double m = sc.nextDouble();
                double k = m / conv_fac;
                System.out.println(String.format("%.2f Miles = %.2f KM.", m, k));
            }
        }
    }
}
