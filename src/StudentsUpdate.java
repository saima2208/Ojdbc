import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import static java.sql.DriverManager.getConnection;

public class StudentsUpdate extends Oracle{


    public void updateStudents(Student student) throws SQLException {
        String sql = "Update studentjdbc Set name =? where id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
          //  preparedStatement.setInt(1, student.getId());

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getId());


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student  Updated Successfully");

            } else {

                System.out.println("No student found with the name");
            }
        }
        catch (SQLException e){
            System.err.println("Error " + e.getMessage());
        }
    }


}
