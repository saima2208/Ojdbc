package FruitShops;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //String  csvFilePath ="C:\\Git\\OJDBC_Learn\\Fruit.csv";




        //String   csvFilePath = "C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv";//tsp
        //String[][]   csvFilePath = {{"C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv"}};
        String[][]   csvFilePath = {{"C:\\Git\\OJDBC_Learn\\Fruit.csv"}};



        ReadFile readFile = new ReadFile();
       readFile.readCsvFile();
           System.out.println("---------------------------------------------");




       InsertData insertData = new InsertData();
        insertData.insertDummyData(csvFilePath);

            System.out.println("---------------------------------------------");




        ReadDatabase readDatabase = new ReadDatabase();
        readDatabase.selectAllData();
           System.out.println("---------------------------------------------");
           ModifyData modifyData = new ModifyData();


    /*

        //chatgpt
        String csvFilePath = "C:\\Git\\OJDBC_Learn\\Fruit.csv";
        String newCsvFilePath = "C:\\Git\\OJDBC_Learn";

        // Step 1: Read data from the file
        ReadFile readFile = new ReadFile();
        List<String[]> fruitData = readFile.readCsvFile(csvFilePath);

        // Step 2: Insert data into the database
        InsertData insertData = new InsertData();
        insertData.insertDummyData(fruitData);

        // Step 3: Read data back from the database
        ReadDatabase readDatabase = new ReadDatabase();
        List<String[]> databaseData = readDatabase.selectAllData();

        // Step 4: Modify the name field
        ModifyData modifyData = new ModifyData();
        List<String[]> modifiedData = modifyData.modifyNames(databaseData, "UpdatedName");

        // Step 5: Save the modified data to a new file
        WriteFile writeFile = new WriteFile();
        writeFile.writeCsvFile(newCsvFilePath, modifiedData);

        System.out.println("Data processing complete!");

     */
    }

}
