import java.util.*;

public class Program06_OddOrEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number :-");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " is Even.");
            } else {
                System.out.println(a + " is Odd.");
            }
        }
    }
}
