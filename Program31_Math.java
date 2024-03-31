// Write a java program that uses any 5 methods of "Math" class.
// Date : 31/03/2024, Author : Yash Wadhvani

import java.util.Scanner;

public class Program31_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter 1st Number :-");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number :-");
        b = sc.nextInt();
        sc.close();

        System.out.println("(a,b) = (" + a + "," + b + ")");

        System.out.println("Maximum of (a,b) = " + Math.max(a, b));
        System.out.println("Square Root of a = " + Math.sqrt(a));
        System.out.println("Sine of a =" + Math.sin(a));
        System.out.println("Cos of b = " + Math.cos(b));
        System.out.println(a + " raised to power " + b + " = " + Math.pow(a, b));
    }
}
