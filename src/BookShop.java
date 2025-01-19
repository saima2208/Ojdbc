import java.sql.*;
import java.time.LocalDate;

public class BookShop {


    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "isdb62";

    public void insertDummtData(String[][] books) {
        String insertQuery = "INSERT INTO BOOKSHOP (name, author,price,publishDate) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for (String[] book : books) {
                preparedStatement.setString(1, book[0]);
                preparedStatement.setString(2, book[1]);
               // preparedStatement.setString(3, book[2]);
                preparedStatement.setDouble(3,Double.parseDouble(book[2]));
                preparedStatement.setDate(4, Date.valueOf(book[3]));

                preparedStatement.addBatch();

            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}
