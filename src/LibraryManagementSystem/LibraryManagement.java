package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryManagement {
    static Book[] books = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1000, 10.00, true),
            new Book("1984", "George Orwell", 1949, 328, 15.00, true),
            new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, 12.50, false)
    };

    static void listOFBook() {
        //System.out.println(Arrays.toString(books));

        for (Book book: books) {
            System.out.print(book.toString());
        }


    }

     void borrowedBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book that you want to borrow");
        String title = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Yoy have successfully borrowed the book " + title);
                } else {
                    System.out.println("Sorry, " + title + "is mot available");
                }
            }
            break;
        }
        if (!found) {
            System.out.println("The book is not found in the library");
        }


    }

     void returnBook() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book that want to return");
        String title = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;


                if (book.isBorrowed()) {
                    book.setBorrowed(true);
                    System.out.println("You have successfully returned the book " + title);
                } else {
                    System.out.println("This book was not returned ");

                }
            }
            break;
        }
        if (!found) {
            System.out.println("The book is not found in the library");
        }

    }

    public void mainMethod() {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System - Main Menu");
            System.out.println("1. List of books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Terminate the program");
            System.out.print("Please choose an option from menu ");


            int choice = scanner.nextInt();


            switch (choice) {


                case 1:
                    listOFBook();
                    break;
                case 2:
                    borrowedBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    System.out.println("Terminating the program. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid option! Please try again.");


            }
        }


    }
}


