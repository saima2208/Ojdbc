package FruitShops;

import java.util.List;

public class ModifyData {
    public List<String[]> modifyNames(List<String[]> data, String newName) {
        for (int i = 1; i < data.size(); i++) { // Skip header row
            data.get(i)[1] = newName; // Change the "name" field
        }
        return data;
    }
}
