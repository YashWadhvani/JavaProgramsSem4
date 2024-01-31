package bookstore;

import java.util.Scanner;

class inventory {
    Scanner scanner = new Scanner(System.in);

    book addBook() {
        String author, title;
        int ISBN, stock;
        double price;

        System.out.println("Enter Title of the Book :-");
        title = scanner.next();
        System.out.println("Enter Author of the Book :-");
        author = scanner.next();
        System.out.println("Enter ISBN of the Book :-");
        ISBN = scanner.nextInt();
        System.out.println("Enter Price of the Book :-");
        price = scanner.nextDouble();
        System.out.println("Enter Stock of the Book :-");
        stock = scanner.nextInt();

        book newBook = new book(title, author, ISBN, price, stock);
        return newBook;
    }

    void updateStock(book Book) {
        int choice, stock;
        stock = Book.getStock();
        System.out.println("Current Stock of " + Book.getTitle() + " = " + stock);

        while (true) {
            System.out.println("1. Add Book\n" + "2. Remove Book\n" + "3. Exit.");
            choice = scanner.nextInt();
            if (choice == 1) {
                stock += 1;
            } else if (choice == 2) {
                stock -= 1;
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Enter Valid Choice!");
            }
        }

        Book.setStock(stock);
    }

    // public static void main(String[] args) {
    // book newTL = addBook();
    // System.out.println(newTL);
    // }

}
