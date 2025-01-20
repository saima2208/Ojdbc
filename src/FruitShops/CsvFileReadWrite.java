package FruitShops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CsvFileReadWrite extends Oracle{
    public static void main(String[] args) {
        String csvFilePath = "C:\\Git\\OJDBC_Learn\\Fruit.csv";

        int batchSize = 20;
        Connection connection = null;
        try { connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String insertQuery = "INSERT INTO FRUITSHOP(ID,NAME,BUYER,SELLER,PRICE,BUY_DATE,SELL_DATE)" +
                    " VALUES (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
            int count = 0;
            lineReader.readLine();
            while ((lineText=lineReader.readLine())!=null){
                String[] data = lineText.split(",");
                String ID = data[0];
                String NAME = data[1];
                String BUYER = data[2];
                String SELLER = data[3];
                String PRICE = data[4];
                String BUY_DATE = data[5];
                String SELL_DATE = data[6];

                preparedStatement.setInt(0, Integer.parseInt(ID));
                preparedStatement.setString(1, NAME);
                preparedStatement.setString(2, BUYER);
                preparedStatement.setString(3, SELLER);
                preparedStatement.setInt(4, Integer.parseInt(PRICE));
                preparedStatement.setDate(5, Date.valueOf(BUY_DATE));
                preparedStatement.setDate(6, Date.valueOf(SELL_DATE));
                preparedStatement.addBatch();

                if (count % batchSize==0){
                    preparedStatement.executeBatch();
                }




            }
            lineReader.close();
            preparedStatement.executeBatch();
            connection.commit();
            connection.close();
            System.out.println("Data has been successfully inserted");

        } catch (Exception e) {
            System.out.println("Something error" + e.getMessage());
        }
    }
}
