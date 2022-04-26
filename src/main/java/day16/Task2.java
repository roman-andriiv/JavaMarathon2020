package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*Implement a program that writes numbers of different types to 2 files. File 1 should be called “file1.txt” and File 2
should be called “file2.txt”. Both files must be in the root of the project. Files should not be created manually, but
when the program is started. File 1 must contain 1000 random numbers from 0 to 100. File 2 is based on File 1 but
contains numbers of the real data type.

The method for filling File 2 is as follows: for each group of 20 integers from File 1, their arithmetic mean is
calculated. Then, the resulting value is written to File 2. Thus, File 2 will contain 50 real numbers (1000/20 = 50).

After File 2 has been generated, the static method printResult(File file) must be implemented. This method should
calculate the sum of all real numbers from File 2 and print it to the console, discarding the real part.*/
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("src/main/java/day16/file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++) {
            pw1.println(new Random().nextInt(100));
        }
        pw1.close();

        Scanner scanner1 = new Scanner(file1);
        File file2 = new File("src/main/java/day16/file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;

        while (scanner1.hasNextLine()) {
            sum += Integer.parseInt(scanner1.nextLine());
            counter++;

            if (counter == 20) {

                pw2.println(sum / 20.0);
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        scanner1.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        double sum = 0;
        while (scanner2.hasNextLine()){
            sum += Double.parseDouble(scanner2.nextLine());
        }
        scanner2.close();
        System.out.println((int) sum);
    }
}
