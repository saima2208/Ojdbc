package FruitShops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public void   readCsvFile() {
        try {
            //File myObj = new File("C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv");
            File myObj = new File("C:\\Git\\OJDBC_Learn\\Fruit.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }

    }
}
