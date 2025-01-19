public class Main {
    public static void main(String[] args) {
/*
        String[][] students = {
                {"John Doe", "20", "john.doe@example.com"},
                {"Jane Smith", "22", "jane.doe@example.com"},
                {"Alice Johnson", "23", "alice.johnson@example.com"},
                {"Bob Brown", "24", "bob.brown@example.com"}
        };
       // InsertStudentOracle oracle = new InsertStudentOracle();
        //oracle.insertDummtData(students);

        InsertStudentPostgrace postgrace = new InsertStudentPostgrace();
        postgrace.insertDummtData(students);


    }

 */
        String[][] books = {
                {"MacBeth", "Shakespeare",  "500", "DRAMA","2000-06-6"},
                {"Merchant of Vanice", "Shakespeare", "400","DRAMA", "1999-06-6"},
                {"King Lear", "Shakespeare","300","DRAMA", "2001-06-6"},
                {"Doctor Faustus", "Christofer Marlow", "700","DRAMA", "2002-06-6"}

        };
        BookShop bookShop = new BookShop();
        bookShop.insertDummtData(books);

    }
}