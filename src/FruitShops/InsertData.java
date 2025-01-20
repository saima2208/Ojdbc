package FruitShops;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER = "orclpdbuser";
    private static final String PASSWORD = "isdb62";
    String csvFile = "C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv";


    String insertQuery = "INSERT INTO FRUITSHOP(ID,NAME,BUYER,SELLER,PRICE,BUY_DATE,SELL_DATE) VALUES (?,?,?,?,?,?,?)";





}