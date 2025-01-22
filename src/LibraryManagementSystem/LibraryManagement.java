package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryManagement {
    static Book[] books = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1000, 10.00, 1),
            new Book("1984", "George Orwell", 1949, 328, 15.00, 1),
            new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, 12.50, 0)
    };

    static void listOFBook() {
        System.out.println(Arrays.toString(books));

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
                    book.setBorrowed(false);
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


