import java.sql.*;
import java.time.LocalDate;

public class BookShop {


    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62";
/*
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "isdb62";

 */

    public void insertDummtData(String[][] books) {
        String insertQuery = "INSERT INTO BOOKSHOP (NAME, AUTHOR_NAME, PRICE, GENRE,PUBLISHED_DATE) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for (String[] book : books) {
                preparedStatement.setString(1, book[0]);
                preparedStatement.setString(2, book[1]);
               preparedStatement.setInt(3, Integer.parseInt(book[2]));
                preparedStatement.setString(4,book[3]);
                preparedStatement.setDate(5, Date.valueOf(book[4]));

                preparedStatement.addBatch();

            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}
