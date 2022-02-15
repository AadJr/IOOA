package week1_file_reading_writing;

import java.io.File;

public class LeesBestandsNamen {
    public void printBestandsNamen(String folder) {
        File dirPath = new File(folder);
        String[] inhoud = dirPath.list();
        if (inhoud == null) {
            System.out.println("Geen bestanden in de folder gevonden");
        } else {
            for (String s : inhoud) {
                System.out.println(s);
            }
        }
    }
}