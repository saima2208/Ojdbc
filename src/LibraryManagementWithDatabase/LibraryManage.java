package LibraryManagementWithDatabase;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;



/*
public class LibraryManage {
   static void listOfBook(){

    }

    public void borrowedBook() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book that you want to borrow");
        String title = scanner.nextLine();


        try(Connection connection = PostgresConnection.getConnection()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the title of the book that you want to borrow");
            String title = scanner.nextLine();
            boolean found = false;
            for (BookFile.Book book : books) {
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
        }catch (SQLException e){
            System.out.println("Error " + e.getMessage());
        }

    }

    public void returnBook(){

    }
    public void mainMenu(){

    }


}

 */
