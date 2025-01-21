package FruitShops;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static oracle.sql.DATE.toLocalDate;

public class ReadDatabase  {
/*
    public void selectAllData() {

        String selectQuery = "SELECT * FROM FRUITSHOP";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String buyer = resultSet.getString("BUYER");
                String seller = resultSet.getString("SELLER");
                int price = resultSet.getInt("PRICE");
                LocalDate buyDate = resultSet.getDate("BUY_DATE").toLocalDate();
                LocalDate sellDate = resultSet.getDate("SELL_DATE").toLocalDate();


                System.out.println("ID: " + id + ", Name: " + name + ", BUYER: " + buyer +
                        ", SELLER: " + seller + ",BUY_DATE " + buyDate + ", SELL_DATE: " + sellDate);
            }

        } catch (SQLException e) {
            System.err.println("Error selecting date: " + e.getMessage());
        }
    }

 */
}

         /*

        //chatgpt

        public List<String[]> selectAllData() {
            List<String[]> data = new ArrayList<>();
            String selectQuery = "SELECT * FROM FRUITSHOP";

            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                while (resultSet.next()) {
                    String[] row = {
                            String.valueOf(resultSet.getInt("ID")),
                            resultSet.getString("NAME"),
                            resultSet.getString("BUYER"),
                            resultSet.getString("SELLER"),
                            String.valueOf(resultSet.getInt("PRICE")),
                            resultSet.getDate("BUY_DATE").toString(),
                            resultSet.getDate("SELL_DATE").toString()
                    };
                    data.add(row);
                }
            } catch (SQLException e) {
                System.err.println("Error reading data: " + e.getMessage());
            }
            return data;
        }

}

          */
