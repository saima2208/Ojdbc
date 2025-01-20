package FruitShops;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {


    public void writeCsvFile(String filePath, List<String[]> data) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String[] row : data) {
                writer.write(String.join(",", row) + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + filePath);
        }
    }
}