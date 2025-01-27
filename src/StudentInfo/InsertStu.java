package StudentInfo;



import LibraryManagementSystem.PostgresConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStu {

    //private Connection getConnection() throws SQLException {
       // return PostgresConnection.getConnection();
   //}


    public void insertStudentInfo(String[][] students){

        String insertInfo = "INSERT INTO STUDENT (student_name,class,address) VALUES (?,?,?)";

        try(Connection connection = PostgresConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertInfo)) {
            for (String[] student :students){

                preparedStatement.setString(1,student[0].trim());

                preparedStatement.setInt(2, Integer.parseInt(student[1].trim()));

                preparedStatement.setString(3,student[2].trim());
                preparedStatement.addBatch();



            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void updateStudent(Students student){
        String updateInfo = "UPDATE STUDENT SET student_name = ?,class = ?,address = ? WHERE id =?";
        try(Connection connection = PostgresConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(updateInfo)) {
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getsClass());
            preparedStatement.setString(3,student.getAddress());
            preparedStatement.setInt(4,student.getId());

            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected>0){
                System.out.println("Student information updated successfully");
            }else {
                System.out.println("No student found with this id");
            }

        }catch (SQLException e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
