/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**********************************************
Workshop 7
Course:JAC44
Last Name:MANVANI
First Name:PRIYANKA
ID:141803197
Section:JAC444NBB
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:27-03-2022
**********************************************/ 
package Eventhandling;

/**
 *
 * @author dell
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Function {
    private static String line;
    private static Scanner scanner;
    private static int number;
    private static String regex;

    public static int findName(int year, char gender, String name) {
        openFile(year);

        if(gender == 'M') {
            regex = "[0-9]+\\s*" + name + "[^a-z].*";
        }
        else {
            regex = "^[0-9]+\\s*[A-Za-z]+.*" + name + "[^a-z].*";
        }

        number = 0;
        while (scanner.hasNextLine()) {
            number++;
            line = scanner.nextLine();
            if(line.matches(regex)) {
                System.out.println(line);
                return number;
            }
        }
        return 0;
    }

    public static void openFile(int year) {
        try {
        	System.out.print(" "+year );
            scanner = new Scanner(new File("./babynamesranking" + year + ".txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }
    
    }
}