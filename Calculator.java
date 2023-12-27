import java.util.*;

public class Calculator {
    static float add(float a, float b) {
        return a + b;
    }

    static float subtract(float a, float b) {
        return a - b;
    }

    static float divide(float a, float b) {
        return a / b;
    }

    static float multiply(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        float a, b;
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st Number :-");
            a = sc.nextFloat();
            System.out.println("Enter 2nd Number :-");
            b = sc.nextFloat();

            System.out.println("Choose an Operation :\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            choice = sc.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("Sum = " + add(a, b));
                break;
            case 2:
                System.out.println("Difference = " + subtract(a, b));
                break;
            case 3:
                System.out.println("Product = " + multiply(a, b));
                break;
            case 4:
                System.out.println("Qoutient = " + divide(a, b));
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }
    }
}
