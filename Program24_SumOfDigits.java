// Write a java program to find sum of digits in a given number.
// Date : 13/03/2024, Author : Yash Wadhvani

import java.util.Scanner;

public class Program24_SumOfDigits {
    public static void main(String[] args) {
        int ogNum, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        num = sc.nextInt();
        ogNum = num;
        sc.close();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of Digits of " + ogNum + " = " + sum);
    }
}
