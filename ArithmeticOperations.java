import java.util.*;

public class ArithmeticOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st No. :-");
            int a = sc.nextInt();
            System.out.println("Enter 2nd No. :-");
            int b = sc.nextInt();
            int sum = a + b;
            int diff = a - b;
            int prod = a * b;
            int qoutient = a / b;
            System.out
                    .println(
                            "Sum = " + sum + "\nDifference = " + diff + "\nProduct = " + prod + "\nQoutient = " + qoutient);
        }

    }
}
