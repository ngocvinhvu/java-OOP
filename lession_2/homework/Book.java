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
        this.available = 20;
    }

    public Book(int bookID, String bookTitle, int amount) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.amount = amount;
        this.available = amount;
    }

    public void showBookInfo() {
        System.out.println("Book ID: " + this.bookID);
        System.out.println("Book Title: " + this.bookTitle);
        System.out.println("Total Amount: " + this.amount);
        System.out.println("Available: " + this.available);

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
        if(amount > 0) {
            this.amount = amount;
        }
    }

    public int getavailable() {
        return available;
    }

    public void setavailable() {
        if(available > 0) {
            this.available = available;
        }
    }
}