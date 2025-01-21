
import java.awt.*;
import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;


public class BookDAO {

    private Connection getConnection() throws SQLException {
        return Oracle.getConnection();
    }

    //Create: add book in the table
    public void addBook(Book book){
        String sql = "INSERT INTO BOOKS (name,author,price,available) VALUES (?,?,?,?)";
        try ( Connection con = Oracle.getConnection();
              PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, book.getName());
            statement.setString(2, book.getAuthor());
            statement.setDouble(3,book.getPrice());
            statement.setBoolean(4, book.isAvailable());
            statement.executeUpdate();
            System.out.println("Added book successfully");

        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    //Read: get information by id

    public Book getElementById(int id){
        String sql = "SELECT * FROM BOOKS WHERE id = ?";
        try(Connection con = Oracle.getConnection();
        PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1,id);
            ResultSet resultSet =statement.executeQuery();
            if (resultSet.next()){
                return new Book(
                        resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("author"),
                resultSet.getDouble("price"),
                resultSet.getBoolean("available")
                );

            }
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
    //Read:get all books
    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM BOOKS";
        try(Connection con = Oracle.getConnection();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()){
                books.add(new Book(
                        resultSet.getInt("id");
                        resultSet.getString("name");
                        resultSet.getString("author");
                        resultSet.getDouble("price"),
                        resultSet.getBoolean("available"),
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return books;
    }

    //Update book's details
    public void updateBooks(Book book){
        String sql = "UPDATE BOOKS SET name = ?,author =?,price =?,available = ? WHERE id = ?";
        try(Connection con = Oracle.getConnection();
        PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1,book.getName());
            statement.setString(2, book.getAuthor());
            statement.setDouble(3,book.getPrice());
            statement.setBoolean(4,book.isBoolean());
            statement.setInt(5,book.getId());
            int rowAffected = statement.executeUpdate();
            if (rowAffected>0){
                System.out.println("Book update successfully");
            }else {
                System.out.println("No book available for this id");
            }

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());

        }

    }

    //Delete: delete a book by id

    public void deleteBook(int id){
        String sql = "DELETE FROM BOOKS WHERE id = ?";
        try (Connection con = Oracle.getConnection();
        PreparedStatement statement = con.prepareStatement(sql)){
            statement.setInt(1,id);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0){
                System.out.println("Book deleted successfully");
            }else {
                System.out.println("No book available for this id");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    }



