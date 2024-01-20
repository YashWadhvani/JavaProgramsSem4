/*
Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
    The pattern is as follows :
    1
    22
    333
    4444
*/
// Date : 28/12/2023, Author : Yash Wadhvani

import java.util.Scanner;

public class Program14_PatternA {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter No. of Rows for the Triangle :-");
            int n = sc.nextInt();
            System.out.print("\n");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
