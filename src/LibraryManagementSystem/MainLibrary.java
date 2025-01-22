package LibraryManagementSystem;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();
       // libraryManagement.mainMethod();
       // libraryManagement.toString();
        libraryManagement.borrowedBook();
        libraryManagement.returnBook();

        Book book = new Book();



        while (true) {
            System.out.println("\nLibrary Management System - Main Menu");
            System.out.println("1. List of books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Terminate the program");
            System.out.print("Please choose an option: ");
        }


    }
}

