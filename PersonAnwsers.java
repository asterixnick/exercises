/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personanwsers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class PersonAnwsers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name?");

        String name = sc.nextLine();
        System.out.println("My Name is :" + name);

        System.out.println("What is your Surname?");
        String surname = sc.nextLine();
        System.out.println("My Surname is :" + surname);

        System.out.println("What is your favorite color?");
        String color = sc.nextLine();
        System.out.println("My favorite color is :" + color);

        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("My age is :" + age);

        
        String text = name.concat(" " + surname).concat(" " + age).concat(" " + color);
        String path = "C:\\Users\\Nikos\\Documents\\examples\\myFile.txt";

        if (age>18) {
            if (age < 66) {
                writeToFile(path, text);
                System.out.println("A new file txt created");
            }
        } else if (color.startsWith("b")) {
            writeToFile(path, text);
            System.out.println("A new file txt created");
        } else {
        }

    }

    public static void writeToFile(String path, String text) throws IOException {

        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter output = new BufferedWriter(fileWriter);
        output.write(text);
        output.close();
        fileWriter.close();

    }
}
