package week1_file_reading_writing;

import java.util.Scanner;

public class LeesBestandsNamenApp {
    public static void main(String[] args) {
        LeesBestandsNamen leesBestandsNamen = new LeesBestandsNamen();

        Scanner input = new Scanner(System.in);
        System.out.println("Welke map wil je scannen op bestanden?");

        //Input
        String folder = input.nextLine();

        leesBestandsNamen.printBestandsNamen(folder);
    }
}
