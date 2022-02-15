package week1_file_reading_writing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeesSteden {
    public void printStedenUitBestand(String tekstBestand) {
        try {
            File myFile = new File("plaatsen.txt");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String tekst = myScanner.nextLine();
                System.out.println(tekst);
            }
            myScanner.close();
        } catch(IOException e) {
            System.out.println("Foutmelding");
            e.printStackTrace();
        }
    }
}
