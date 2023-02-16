package JavaFiling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVExample {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\ICT-Lap\\Downloads\\data.csv";

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + ",");
                }
                System.out.println();
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
