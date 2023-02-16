package JavaFiling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class createFile {
    public static void main(String[]args){

        try {
            File file = new File("C:\\Users\\ICT-Lap\\Downloads\\data.csv"); // replace with your file name and path
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);


            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not created yet!!");

            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e){
            System.out.println("I don't know what happen!!");

        }
       // else{
            try{
                FileWriter filewriter=new FileWriter("C:\\Users\\ICT-Lap\\Desktop\\work\\programFiles\\data.csv");
                System.out.println("File created automatically for you!!" + "");


            }catch(IOException e){
                e.printStackTrace();
            }
        }
  //  }
    //public static final String filePath=
}
