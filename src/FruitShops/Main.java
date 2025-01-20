package FruitShops;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String   csvFilePath = "C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv";
        ReadFile readFile = new ReadFile();
        //readFile.readCsvFile();



       // InsertData insertData = new InsertData();
        //insertData.insertDummyData(csvFilePath);

        InsertData insertData = new InsertData();
        insertData.insertDummyData();

        ReadDatabase readDatabase = new ReadDatabase();
        readDatabase.selectAllData();
    }
}
