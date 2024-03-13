import java.util.Scanner;

public class Program23_Factorial {
    static int fact(int i) {
        if (i == 1 || i == 0) {
            return 1;
        }
        return i * fact(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find it's Factorial :");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + num + " = " + fact(num));
    }
}
