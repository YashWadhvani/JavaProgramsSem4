/*
Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
    The pattern like :
    1
    2 3
    4 5 6
    7 8 9 10 
*/
// Date : 28/12/2023, Author : Yash Wadhvani

import java.util.Scanner;

public class Program15_PatternB {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter No. of Rows for Triangle :-");
            int n = sc.nextInt();
            int sum = 1;
            System.out.print("\n");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(sum + " ");
                    sum++;
                }
                System.out.print("\n");
            }
        }
    }
}
