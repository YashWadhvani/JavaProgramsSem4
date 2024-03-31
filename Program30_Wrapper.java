// Write a java program to perform autoboxing and unboxing using wrapper class.
// Date : 31/03/2024, Author : Yash Wadhvani
public class Program30_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a = " + a);

        Integer i = Integer.valueOf(a);
        System.out.println("Object Value after autoboxing = " + i);

        // Float f = Float.valueOf(a);
        // System.out.println(f);
        // String str = String.valueOf(a);
        // System.out.println(str);

        int b = i.intValue();
        System.out.println("Primitive Value after unboxing = " + b);
    }
}
