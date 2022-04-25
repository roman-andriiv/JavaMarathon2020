package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Create a file "people.txt" in the project folder, which stores the names and ages of people.
* Implement a List<String> static parseFileToStringList() method that reads the contents of this file and returns a
* list of each person's name and age values. Get this list in the main() method and print it to the console.
* If the file does not exist in the project folder, the program must throw an exception and output the message
* “File not found” to the console. In addition, if the age value is negative, it is necessary to throw an exception
* and print the message “Invalid input file” to the console.*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }
     public static List<String>parseFileToStringList(){
        File file =new File("src/main/java/day14/people.txt");
        List<String> listOfPeople = new ArrayList<>();
         try {
             Scanner scanner = new Scanner(file);

             while (scanner.hasNextLine()){
                 String line = scanner.nextLine();

                 String[] person = line.split(" ");

                 if(Integer.parseInt(person[2])<0){
                     throw new IllegalArgumentException();
                 }
                 listOfPeople.add(line);
             }
             return listOfPeople;
         } catch (FileNotFoundException e) {
             System.out.println("File not found");
         }catch (IllegalArgumentException e){
             System.out.println("Invalid input file");
         }
         return null;
    }
}
