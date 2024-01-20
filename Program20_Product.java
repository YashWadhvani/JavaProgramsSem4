// Develop a simple online shopping system. Create a base class Product with attributes productId, productName, and price. Derive classes Electronics, Clothing, and Books from Product. Add specific attributes for each product type. Create objects for each class and demonstrate polymorphism by displaying product details.
// Date : 11/01/2024, Author : Yash Wadhvani

class Product {
    int productID;
    String productName;
    double price;

    Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("\n");
        System.out.println("Product ID = " + productID);
        System.out.println("Product Name = " + productName);
        System.out.println(String.format("Product Price = %.2f", price));
    }
}

class Electronics extends Product {
    String brand;

    Electronics(int productID, String productName, double price, String brand) {
        super(productID, productName, price);
        this.brand = brand;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Product Brand = " + brand);
    }
}

class Clothing extends Product {
    String size;

    Clothing(int productID, String productName, double price, String size) {
        super(productID, productName, price);
        this.size = size;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Product Size = " + size);
    }
}

class Books extends Product {
    String author;

    Books(int productID, String productName, double price, String author) {
        super(productID, productName, price);
        this.author = author;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author = " + author);
    }

}

public class Program20_Product {
    public static void main(String[] args) {
        Clothing Tee = new Clothing(1, "T Shirt", 999, "S");
        Tee.displayInfo();

        Electronics Laptop = new Electronics(2, "Laptop", 89990, "HP");
        Laptop.displayInfo();

        Books TLove = new Books(3, "Twisted Love", 300, "Ana Huang");
        TLove.displayInfo();
    }
}
