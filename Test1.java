/*
Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
    The pattern is as follows :
    1
    22
    333
    4444
*/
public class Test1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}