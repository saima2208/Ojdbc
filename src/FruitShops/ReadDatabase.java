package FruitShops;

import java.sql.*;
import java.time.LocalDate;

import static oracle.sql.DATE.toLocalDate;

public class ReadDatabase extends Oracle {

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

}
