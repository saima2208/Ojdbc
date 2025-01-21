import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        // Ask for user input for student details
        System.out.println("Enter student ID:");
        int id = scanner.nextInt();  // Read student ID
        scanner.nextLine();  // Consume the newline character left by nextInt()






        Student student = new Student(2,"jhfg",30,"jhg@gmail.com");
        student.setId(id);
        StudentsUpdate studentsUpdate = new StudentsUpdate();
        studentsUpdate.updateStudents(student);




/*
        String[][] students = {
                {"John Doe", "20", "john.doe@example.com"},
                {"Jane Smith", "22", "jane.doe@example.com"},
                {"Alice Johnson", "23", "alice.johnson@example.com"},
                {"Bob Brown", "24", "bob.brown@example.com"}
        };

       // InsertStudentOracle oracle = new InsertStudentOracle();
        //oracle.insertDummyData(students);

        InsertStudentPostgrace postgrace = new InsertStudentPostgrace();
        postgrace.insertDummyData(students);


    }


        String[][] books = {
                {"MacBeth", "Shakespeare",  "500", "DRAMA","2000-06-6"},
                {"Merchant of Vanice", "Shakespeare", "400","DRAMA", "1999-06-6"},
                {"King Lear", "Shakespeare","300","DRAMA", "2001-06-6"},
                {"Doctor Faustus", "Christofer Marlow", "700","DRAMA", "2002-06-6"}

        };



        String[][] books = {
                {"All's Well That Ends Well",""}

        };
        BookShop bookShop = new BookShop();
        bookShop.insertDummyData(books);

 */
       // SelectStudentOracle selectStudent = new SelectStudentOracle();
        //selectStudent.selectAllStudents();



    }
}