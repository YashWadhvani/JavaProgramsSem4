// Write a Java Program that requires the user to enter a single character from the Alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a String of Length > 1, print an error message.
// Date : 27/12/2023, Author : Yash Wadhvani

import java.util.Scanner;

public class Program10_CharTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any String:-");
            String str = sc.nextLine();
            if (str.length() != 1) {
                System.err.println("You entered a String of length more than 1. Expected a single Character.");
            } else {
                char c = str.charAt(0);
                if (Character.isDigit(c)) {
                    System.out.println("You entered a Number. Enter a character to check Vowel or Consonant.");
                } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                        || c == 'O' || c == 'U') {
                    System.out.println("The Character you entered is Vowel.");
                } else {
                    System.out.println("The Character you entered is Consonant.");
                }
            }
        }
    }
}