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
