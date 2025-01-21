package FruitShops;


import java.sql.*;
import java.util.List;

public class InsertData extends Oracle {

   // String csvFile = "C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv";

    public  void insertDummyData( String[][] fruits){
        String insertQuery = "INSERT INTO FRUITSHOP(ID,NAME,BUYER,SELLER,PRICE,BUY_DATE,SELL_DATE)" +
                " VALUES (?,?,?,?,?,?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            for (String[] fruit: fruits) {
                preparedStatement.setInt(1, Integer.parseInt(fruit[0].trim()));
                preparedStatement.setString(2, fruit[1].trim());
                preparedStatement.setString(3, fruit[2].trim());
                preparedStatement.setString(4, fruit[3].trim());
                preparedStatement.setInt(5, Integer.parseInt(fruit[4].trim()));
                preparedStatement.setDate(6, Date.valueOf(fruit[5].trim()));
                preparedStatement.setDate(7, Date.valueOf(fruit[6].trim()));
                preparedStatement.addBatch();

            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
/*

    //chatgpt

    public void insertDummyData(List<String[]> fruits) {
        String insertQuery = "INSERT INTO FRUITSHOP(ID, NAME, BUYER, SELLER, PRICE, BUY_DATE, SELL_DATE) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            for (int i = 1; i < fruits.size(); i++) { // Skip header row
                String[] fruit = fruits.get(i);
                preparedStatement.setInt(1, Integer.parseInt(fruit[0]));
                preparedStatement.setString(2, fruit[1]);
                preparedStatement.setString(3, fruit[2]);
                preparedStatement.setString(4, fruit[3]);
                preparedStatement.setInt(5, Integer.parseInt(fruit[4]));
                preparedStatement.setDate(6, java.sql.Date.valueOf(fruit[5]));
                preparedStatement.setDate(7, java.sql.Date.valueOf(fruit[6]));
                preparedStatement.addBatch();
            }
            int[] rowsInserted = preparedStatement.executeBatch();
            System.out.println("Rows inserted: " + rowsInserted.length);

        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }

 */







}