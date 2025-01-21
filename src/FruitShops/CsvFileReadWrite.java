/*
package FruitShops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class CsvFileReadWrite extends Oracle {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv";
        // String csvFilePath = "C:\\Git\\OJDBC_Learn\\Fruit.csv";

        int batchSize = 20;
        Connection connection = null;
        try {connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String insertQuery = "INSERT INTO FRUITSHOP(ID,NAME,BUYER,SELLER,PRICE, BUY_DATE,SELL_DATE) VALUES (?,?,?,?,?,TO_DATE(?, 'YYYY-MM-DD'),TO_DATE(?, 'YYYY-MM-DD'))";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
            int count = 0;
            lineReader.readLine();
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String ID = data[0].trim();
                String NAME = data[1].trim();
                String BUYER = data[2].trim();
                String SELLER = data[3].trim();
                String PRICE = data[4].trim();
                String BUY_DATE = data[5].trim();
                String SELL_DATE = data[6].trim();

                preparedStatement.setInt(1, Integer.parseInt(ID));
                preparedStatement.setString(2, NAME);
                preparedStatement.setString(3, BUYER);
                preparedStatement.setString(4, SELLER);
                preparedStatement.setInt(5, Integer.parseInt(PRICE));
                preparedStatement.setDate(6, Date.valueOf(BUY_DATE));
                preparedStatement.setDate(7, Date.valueOf(SELL_DATE));
                preparedStatement.addBatch();

                if (count % batchSize == 0) {
                    preparedStatement.executeBatch();
                }


            }
            lineReader.close();
            preparedStatement.executeBatch();
            connection.commit();
            connection.close();
            System.out.println("Data has been successfully inserted");

        } catch (SQLException e) {
            System.out.println("Something error ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

 */



package FruitShops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class CsvFileReadWrite extends Oracle {

    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv";
        int batchSize = 20;
        Connection connection = null;

        try (BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath))) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String insertQuery = "INSERT INTO FRUITSHOP(ID, NAME, BUYER, SELLER, PRICE, BUY_DATE, SELL_DATE) VALUES (?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), TO_DATE(?, 'YYYY-MM-DD'))";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            String lineText;
            int count = 0;
            lineReader.readLine(); // Skip header line

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String ID = data[0].trim();
                String NAME = data[1].trim();
                String BUYER = data[2].trim();
                String SELLER = data[3].trim();
                String PRICE = data[4].trim();
                String BUY_DATE = data[5].trim();
                String SELL_DATE = data[6].trim();

                preparedStatement.setInt(1, Integer.parseInt(ID));
                preparedStatement.setString(2, NAME);
                preparedStatement.setString(3, BUYER);
                preparedStatement.setString(4, SELLER);
                preparedStatement.setInt(5, Integer.parseInt(PRICE));
                preparedStatement.setDate(6, Date.valueOf(BUY_DATE));
                preparedStatement.setDate(7, Date.valueOf(SELL_DATE));
                preparedStatement.addBatch();

                if (++count % batchSize == 0) {
                    preparedStatement.executeBatch();
                }
            }

            preparedStatement.executeBatch(); // Execute remaining queries
            connection.commit();
            System.out.println("Data has been successfully inserted");

        } catch (SQLException | IOException e) {
            e.printStackTrace(); // Print stack trace for debugging
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle close connection exception
            }
        }
    }
}

