package week1_file_reading_writing;

import java.io.FileWriter;
import java.io.IOException;

public class SchrijfBestand {
    public void schrijfStedenNaarBestand(String tekstBestand) {
        try {
            String filePath = "C:\\Users\\Gebruiker\\IdeaProjects\\IOOA\\plaatsen.txt";
            FileWriter myWriter = new FileWriter(filePath, true);
            myWriter.write("\nAmsterdam 900000 \nBunnik 500");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
