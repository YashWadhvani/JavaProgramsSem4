/*  Develop a Java application for a bookstore management system. The application needs to handle various operations such as adding new books and managing inventory and to ensure proper organization and modularity, utilize Java packages.
    Design a package structure for the bookstore management system. Additionally, create a sample class within each package to demonstrate its functionality.
    Suggested Package Structure:
    bookstore.book : 
        Sample Class: Book - Represents a book with attributes such as title, author, ISBN, and price.
    bookstore.inventory : 
        Sample Class: InventoryManager - Provides methods to add new books to inventory, update stock levels, and retrieve book details.
    (A Folder Named 'bookstore' which contains 2 files - 'book' & 'inventory'. 'book' contains definition of 'Book' Class. 'inventory' contains definition of 'InventoryManager' Class. ) */

// Date : 13/03/2024, Author : Yash Wadhvani

import bookstore.*;

public class Program22_Bookstore {
    static book TH = null;
    static inventory Manager = new inventory();

    public static void main(String[] args) {
        System.out.println(TH);
        TH = Manager.addBook();
        Manager.updateStock(TH);
        System.out.println(TH);
    }
}
