package bookstore;

class book {
    String author, title;
    int ISBN;
    double price;

    book(String title, String author, int ISBN, double price) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
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

    public String toString() {
        return "Title : " + getTitle() + "\nAuthor : " + getAuthor() + "\nISBN : " + getISBN() + "\nPrice : Rs."
                + getPrice();
    }
}