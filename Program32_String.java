// Write a java program that uses any 5 methods of "String" class.
// Date : 31/03/2024, Author : Yash Wadhvani
public class Program32_String {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        System.out.println("str1 : " + str1 + "\n" + "str2 : " + str2 + "\n");
        System.out.println("str1 Compared to str2 gives :\n" + str1.compareTo(str2) + "\n");
        System.out.println("str1 concatenated with str2 gives :\n" + str1.concat(str2) + "\n");
        System.out.println("Substring from Index 1 to Index 4 of str1 is :\n" + str1.substring(1, 4) + "\n");
        System.out.println("Character at Index 2 of str2 is :\n" + str2.charAt(2) + "\n");
        System.out.println("'llo' replaced by 'yya!' in str1 gives :\n" + str1.replace("llo", "yya!") + "\n");

    }
}
