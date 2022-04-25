package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Given a file with information about the remaining shoes in the warehouse (src/main/resources/shoes.csv) . This is
an example of a real unloading of residues from 1C to a ".csv" file (file format with separators, the symbol “;” is
used as a separator). This file contains information about the name of the shoe model, its size and the quantity
remaining in stock.
    Before converting to csv it was a table with three columns.
It is necessary to generate a new file (src/main/resources/missing_shoes.txt) with information about models and sizes
of shoes that are not in stock (quantity = 0) . To do this, implement a program that takes a ".csv" file as input and
creates a new ".txt" file.
*/
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        Scanner scanner = new Scanner(file);

        File txtFile = new File("src/main/resources/missing_shoes.txt");
        PrintWriter writer = new PrintWriter(txtFile);

        int counter = 1;
        while (scanner.hasNextLine()) {
            String[] wordsArr = scanner.nextLine().split(";");
            if (Integer.parseInt(wordsArr[2]) == 0) {
                writer.println(counter+". "+ wordsArr[0] + "; " + wordsArr[1] + "; " + wordsArr[2]);
                counter++;
            }
        }
        writer.close();
        scanner.close();
        System.out.println("file is created");
    }
}
