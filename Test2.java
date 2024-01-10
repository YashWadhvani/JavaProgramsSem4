//Write a Java program to create class Student. The class should have attributes student ID, student name, marks for 3 subjects and the member functions are setdata() and displaydata(). Calculate the average marks for student.

import java.util.Scanner;

class Student {
    int StudentID;
    String Name;
    float m1, m2, m3, avg;
    Scanner sc = new Scanner(System.in);

    void setData() {
        System.out.println("Enter Student ID :-");
        StudentID = sc.nextInt();
        System.out.println("Enter Student Name:-");
        Name = sc.next();
        System.out.println("Enter Marks of Subject 1 :-");
        m1 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 2 :-");
        m2 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 3 :-");
        m3 = sc.nextFloat();

        avg = (m1 + m2 + m3) / 3;
    }

    void displayData() {
        System.out.println("Student ID = " + StudentID);
        System.out.println("Student Name = " + Name);
        System.out.println("Marks of Subject 1 = " + m1);
        System.out.println("Marks of Subject 2 = " + m2);
        System.out.println("Marks of Subject 3 = " + m3);
        System.out.println("Average Marks = " + avg);

    }
}

public class Test2 {

    public static void main(String[] args) {
        Student Yash = new Student();
        Yash.setData();
        Yash.displayData();
    }
}