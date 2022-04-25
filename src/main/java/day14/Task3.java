package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Create a class “Person” with fields “name”, "surname" and “age”. Implement a static List<Person> parseFileToObjList() method that
reads the contents of the same "people.txt" file, creates instances of the Person class, and returns a list of objects.
Get this list in the main() method and print it to the console.

If the file does not exist in the project folder, the program must throw an exception and output the message
“File not found” to the console. In addition, if the age value is negative, it is necessary to throw an exception and
print the message “Invalid input file” to the console.*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person>parseFileToObjList(){
        File file = new File("src/main/java/day14/people.txt");
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String personLine = scanner.nextLine();
                String[] personArr = personLine.split(" ");
                if (Integer.parseInt(personArr[2])<0){
                    throw new IllegalArgumentException();
                }
                Person personObj =  new Person();
                personObj.setName(personArr[0]);
                personObj.setSurname(personArr[1]);
                personObj.setAge(Integer.parseInt(personArr[2]));

                personList.add(personObj);
            }
            return personList;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IllegalArgumentException e){
            System.out.println("Invalid input file");
        }
        return null;
    }
}
