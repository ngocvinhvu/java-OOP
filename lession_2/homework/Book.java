package homework;


public class Book {
    private int bookID;
    private String bookTitle;
    private int amount;
    private int available;

    public Book() {
        this.bookID = 1;
        this.bookTitle = "The God Father";
        this.amount = 20;
        this.available = 4;
    }

    public Book(int bookID, String bookTitle, int amount, int available) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.amount = amount;
        this.available = available;
    }

    public void showBookInfo() {
        System.out.println("ID: " + this.bookID);
        System.out.println("Title: " + this.bookTitle);
        System.out.println("amount: " + this.amount);
        System.out.println("available: " + this.available);

    }

    public int getbookID() {
        return bookID;
    }

    public void setbookID(int bookID) {
        if(bookID > 0) {
            this.bookID = bookID;
        }
    }

    public String getbookTitle() {
        return bookTitle;
    }

    public void setbookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }

    public int getavailable() {
        return available;
    }

    public void setavailable() {
        this.available = available;
    }
}