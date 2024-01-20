/*Write a Java program to create class Student. The class should have attributes student ID, student name, marks for 3 subjects and the member functions are setdata() and displaydata(). Calculate the average marks for student.*/
// Date : 03/01/2024, Author : Yash Wadhvani

import java.util.*;

public class Program17_StudentClass {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setData();
        stu1.displayData();
    }
}

class Student {
    int ID;
    String Name;
    double a, b, c, avg;

    Scanner sc = new Scanner(System.in);

    public void setData() {
        System.out.println("Enter Student ID :-");
        ID = sc.nextInt();
        System.out.println("Enter Student Name :-");
        Name = sc.next();
        System.out.println("Enter Marks of Subject 1:-");
        a = sc.nextDouble();
        System.out.println("Enter Marks of Subject 2:-");
        b = sc.nextDouble();
        System.out.println("Enter Marks of Subject 3:-");
        c = sc.nextDouble();
        avg = (a + b + c) / 3;
    }

    public void displayData() {
        System.out.println("Student ID = " + ID);
        System.out.println("Student Name = " + Name);
        System.out.println("Marks of Subject 1= " + a);
        System.out.println("Marks of Subject 2= " + b);
        System.out.println("Marks of Subject 3= " + c);
        System.out.println(String.format("Average Marks = %.2f", avg));
    }

}