package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Create a ".txt" file in the project folder.
Fill it in manually with ten arbitrary numbers. Implement a static method printSumDigits(File file) that calculates the
sum of all numbers.txt in this file and prints it to the screen. Call this method in the main() method.
If the file does not exist in the project folder, the program must throw an exception and output the message “File not
found” to the console. In addition, if the numbers.txt in the file are less than or greater than 10, it is necessary to
throw an exception and display the message “” in the console.
*/
public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/java/day14/numbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10) {
                throw new IllegalArgumentException();
            }

            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input file");
        }
    }

}
