package bookstore;

public class book {
    String author, title;
    double price;
    int stock, ISBN;

    public book(String title, String author, int ISBN, double price, int stock) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Title : " + getTitle() + "\nAuthor : " + getAuthor() + "\nISBN : " + getISBN() + "\nPrice : Rs."
                + getPrice() + "Stock : " + getStock();
    }
}