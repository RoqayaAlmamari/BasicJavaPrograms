package JavaFiling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadCSVIntoHashMapExample {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\ICT-Lap\\Downloads\\data.csv";
        HashMap<String, String[]> data = new HashMap<>();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                String key = values[0];
                String[] valueArray = new String[values.length - 1];
                System.arraycopy(values, 1, valueArray, 0, valueArray.length);
                data.put(key, valueArray);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Print the contents of the HashMap
        for (String key : data.keySet()) {
            System.out.print(key + ": ");
            String[] values = data.get(key);
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
