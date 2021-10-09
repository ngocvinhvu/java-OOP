package homework;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Library {
    private String libraryName;
    private Book[] bookList = new Book[100];
    private static int numberOfBooks;
    public static final int MAX_NUMBER_OF_BOOKS = 100;
    
    public Library(String name) {
        this.libraryName = name;
    }

    public void addNewBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("2. Add new book");
        System.out.println("-----------------------");
        if (numberOfBooks >= MAX_NUMBER_OF_BOOKS) {
            System.out.println("Library is fully");
        } else {
            System.out.println("Enter book's infomation: ");
            System.out.println("(1) Book ID: ");
            
            int id = input.nextInt();
            System.out.println("(2) Book Title: ");
            
            String title = input.nextLine();
            System.out.println("(3) Amount: ");
            
            int amount = input.nextInt();
            Book book = new Book(id, title, amount);

            boolean result = Arrays.stream(bookList).anyMatch(book::equals);
            if(result) {
                System.out.println("Book is already exits");
                System.exit(0);
            } else {
                for(int i = 0; i < 100; i++) {
                    if(bookList[i] == null) {
                        bookList[i] = book;
                        bookList[i].showBookInfo();
                        System.exit(0);
                    }
                }
            }
        }
    }

    public boolean findBook(int bookID) {
        System.out.println("3. Find book");
        System.out.println("-----------------------");
        System.out.println("Enter book's ID: " + bookID);
        for(int i = 0; i < MAX_NUMBER_OF_BOOKS; i++) {
            if(bookList[i].getbookID() == bookID) {
                bookList[i].showBookInfo();
                return true;
            }
            else {
                System.out.println("The book is not found");
                System.exit(0);
                return false;
            }
        }
        return false;
    }

    public void borrowBook(int bookID) {
        System.out.println("4. Borrow a book");
        System.out.println("-----------------------");
        System.out.println("Enter book's ID: " + bookID);
        for(int i = 0; i < MAX_NUMBER_OF_BOOKS; i++) {
            if(bookList[i].getbookID() == bookID && bookList[i].getamount() > 0) {
                bookList[i].showBookInfo();
                System.out.println("The book is borrowed successfully!");
                System.out.println("\n");
                bookList[i].setamount(bookList[i].getamount() - 1);
                bookList[i].showBookInfo();
            } else {
                System.out.println("The book is can not borrowed!");
            }
        }
    }

    public void returnBook(int bookID) {
        System.out.println("5. Return a book");
        System.out.println("-----------------------");
        System.out.println("Enter book's ID: " + bookID);
        for(int i = 0; i < MAX_NUMBER_OF_BOOKS; i++) {
            if(bookList[i].getbookID() == bookID) {
                System.out.println("The book is return successfully!");
                bookList[i].setamount(bookList[i].getamount() + 1);
                bookList[i].showBookInfo();
            } else {
                System.out.println("The book is can not returned!");
            }
        }
    }

    public void showLibraryInfo() {
        System.out.println("Name: " + libraryName);
        System.out.println("Number of books: " + numberOfBooks);
        for(int i = 0; i < MAX_NUMBER_OF_BOOKS; i++) {
            bookList[i].showBookInfo();
        }
    }

    public boolean findBook(String keyword) {
        System.out.println("3. Find book");
        System.out.println("-----------------------");
        System.out.println("Enter book's title: " + keyword);
        for(int i = 0; i < MAX_NUMBER_OF_BOOKS; i++) {
            if(bookList[i].getbookTitle() == keyword) {
                bookList[i].showBookInfo();
                return true;
            }
            else {
                System.out.println("The book is not found");
                System.exit(0);
                return false;
            }
        }
        return false;
    }

    public void getALuckyBook() {
        Random randomNumber = new Random();
        int rand = randomNumber.nextInt(100);
        for(int i = 0; i < MAX_NUMBER_OF_BOOKS; i++) {
            if(bookList[i].getbookID() == rand) {
                System.out.println("A lucky book is: ");
                bookList[i].showBookInfo();
            } else {
                System.out.println("This book is not found, please choose again");
            }
        }

    }
}