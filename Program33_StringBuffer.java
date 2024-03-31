// Write a java program that uses any 5 methods of "StringBuffer" class.
// Date : 31/03/2024, Author : Yash Wadhvani

import java.util.Scanner;

public class Program33_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuffer s1, s2, s3, s4, s5;

        System.out.println("Enter a String :");
        str = sc.next();
        sc.close();

        s1 = new StringBuffer(str);
        s1.append(" Butterfly!");
        // System.out.println(str);
        System.out.println("New String : " + s1 + "\n");
        // System.out.println(s1);

        s2 = new StringBuffer(str);
        s2.delete(2, 3);
        // System.out.println(str);
        System.out.println("New String : " + s2 + "\n");
        // System.out.println(s2);

        s3 = new StringBuffer(str);
        s3.insert(1, str);
        System.out.println("New String : " + s3 + "\n");
        // System.out.println(s3);

        s4 = new StringBuffer(str);
        s4.replace(2, 5, "yya!");
        System.out.println("New String : " + s4 + "\n");
        // System.out.println(s4);

        s5 = new StringBuffer(str);
        s5.reverse();
        System.out.println("New String : " + s5 + "\n");
        // System.out.println(s5);

    }
}
