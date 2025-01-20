import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentOracle extends Oracle {


    public void insertDummyData(String[][] students) {
        String insertQuery = "INSERT INTO STUDENTJDBC (name, age, email) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            for (String[] student : students) {
                preparedStatement.setString(1, student[0]);
                preparedStatement.setInt(2, Integer.parseInt(student[1]));
                preparedStatement.setString(3, student[2]);
                preparedStatement.addBatch();

            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }

}
