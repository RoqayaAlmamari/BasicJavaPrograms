package JavaFiling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVParser {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\ICT-Lap\\Downloads\\data2.csv"; // replace with actual file path
        String line = "";
        String csvSplitBy = ","; // use "," as the delimiter for CSV files
        HashMap<String, String[]> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // read the header line and ignore it
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(csvSplitBy);
                String key = fields[0];
                String[] values = new String[fields.length - 1];
                for (int i = 1; i < fields.length; i++) {
                    values[i - 1] = fields[i];
                }
                map.put(key, values);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // do something with the map
        // ...

    }
}
