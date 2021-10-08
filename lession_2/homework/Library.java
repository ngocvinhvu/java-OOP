package homework;


import java.util.Arrays;
import java.util.Scanner;


public class Library {
    private String libraryName;
    private Book[] bookList;
    private static int numberOfBooks;
    public static final int MAX_NUMBER_OF_BOOKS = 100;
    
    public Library(String name) {
        this.libraryName = name;
    }

    public void addNewBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("2. Add new book");
        System.out.println("--------------------");
        System.out.println("Enter book's infomation: ");
        System.out.println("(1) Book ID: ");
        int id = input.nextInt();
        System.out.println("(2) Book Title: ");
        String title = input.nextLine();
        System.out.println("(3) Amount: ");
        int amount = input.nextInt();
        Book book = new Book(id, title, amount);
        int len = this.bookList.length;
        for(int i = 0; i < len; i++) {
            if(this.bookList[i].getbookID() == id) {
                System.out.println("Book id is exits");
                break;
            }
        }
        if(len <= 100) {
            Book[] listBook = Arrays.copyOf(this.bookList, len + 1);
            listBook[listBook.length - 1] = book;
            this.bookList = listBook;
        }
    }

    public boolean findBook(int bookID) {

    }

    public void borrowBook(int bookID) {

    }

    public void returnBook(int bookID) {

    }

    public void showLibraryInfo() {

    }
}