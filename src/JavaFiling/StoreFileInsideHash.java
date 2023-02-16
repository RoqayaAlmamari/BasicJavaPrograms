package JavaFiling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StoreFileInsideHash {
    public static void main(String[] args) {
        // Create a HashMap to store the data from the file

        HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
        try {
            File file = new File("C:\\Users\\ICT-Lap\\Downloads\\data.csv"); // replace with your file name and path
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println(line);

                String[] parts = line.split(",");
               // hashMap.put(parts[0], Arrays.copyOfRange(parts, 1, parts.length));
                String key = parts[0];
                String[] values = parts[1].split(",");
                hashMap.put(key, values);
            }

            //print hash
            System.out.println(hashMap.get(101));

            scanner.close();
        } catch (FileNotFoundException e) {
           // System.out.println("File not created yet!!");
           // e.printStackTrace();
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e){
            System.out.println("I don't know what happen!!");

        }
    }
}
