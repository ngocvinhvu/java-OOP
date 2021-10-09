package homework;

import java.util.Scanner;


public class Program {
    static Library library = new Library("Thu vien to dan pho 7, phuong Bach Khoa");
    public static void main(String args[]) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("-----------Main menu---------");
        System.out.println("1. Show library information");
        System.out.println("2. Add new book");
        System.out.println("3. Find book");
        System.out.println("4. Borrow book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.println("-----------------------------");
        System.out.print("Enter menu ID (1-6): ");
        askOption();
    }

    public static void askOption() {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        switch(option) {
        case 1:
            library.showLibraryInfo();
            break;
        case 2:
            library.addNewBook();
            break;
        case 3:
            System.out.println("Fill in id of book which you want to find: ");
            int id1 = input.nextInt();
            library.findBook(id1);
            break;
        case 4:
            System.out.println("Fill in id of book which you want to borrow: ");
            int id2 = input.nextInt();
            library.borrowBook(id2);
            break;
        case 5:
            System.out.println("Fill in id of book which you want to return: ");
            int id3 = input.nextInt();
            library.returnBook(id3);
            break;
        case 6:
            System.out.println("Goodbye!");
            System.exit(0);
            break;
        }
        
    }
}