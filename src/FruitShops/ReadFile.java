package FruitShops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public void readCsvFile() throws FileNotFoundException {
        try {
            //File myObj = new File("C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\Xml\\Fruit.csv");//tsp
            File myObj = new File("C:\\Git\\OJDBC_Learn\\Fruit.csv");//home
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

      /*
//chatgpt
    public List<String[]> readCsvFile(String filePath) {
        List<String[]> data = new ArrayList<>();
        try {
            File file = new File("C:\\Git\\OJDBC_Learn\\Fruit.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] row = line.split(","); // Split by comma
                data.add(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
        return data;
    }
}

     */
