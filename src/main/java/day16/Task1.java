package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Implement a program that takes a txt file with integers as input (you can use the file from task 1 day 14) and
outputs the arithmetic mean of these numbers to the console as a response. The answer will be a real number. It is
necessary to output the full notation of a real number (with all decimal places) and the abbreviated notation
(with 3 decimal places) to the console.*/
public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/java/day14/numbers.txt");
        printResult(file);
    }

    public static void printResult(File file) {

        try {
           Scanner scanner = new Scanner(file);
            int sum = 0;
            int count = 0;
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum += x;
                count++;
            }
            double result = (double) sum/count;

            System.out.printf(result + " --> %.3f",result);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

    }
}

