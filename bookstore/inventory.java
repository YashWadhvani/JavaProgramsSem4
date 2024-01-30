package bookstore;

import java.util.Scanner;

class inventory {
    Scanner scanner = new Scanner(System.in);

    book addBook() {
        String author, title;
        int ISBN;
        double price;

        System.out.println("Enter Title of the Book :-");
        title = scanner.next();
        System.out.println("Enter Author of the Book :-");
        author = scanner.next();
        System.out.println("Enter ISBN of the Book :-");
        ISBN = scanner.nextInt();
        System.out.println("Enter Price of the Book :-");
        price = scanner.nextDouble();

        book newBook = new book(title, author, ISBN, price);
        return newBook;
    }

    // public static void main(String[] args) {
    // book newTL = addBook();
    // System.out.println(newTL);
    // }

}
