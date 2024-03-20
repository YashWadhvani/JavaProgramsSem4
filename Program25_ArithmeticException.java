// Write a java program using try-catch block to handle java.lang.ArithmeticException.
// Date : 20/03/2024, Author : Yash Wadhvani

public class Program25_ArithmeticException {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("The Code Generates the following error :");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
