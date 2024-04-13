import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String [] args){
        learnPython();
    }
    public static void learnPython() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the class! We will be learning Python today.");
        boolean active = true;
        while (active) {
            boolean validInput = false;
            String choice = "";
            while (!validInput) {
                System.out.println("Enter (e) at any point to exit.");
                System.out.println("Choose a module to start learning: ");
                System.out.println("(1) for Module 1");
                System.out.println("(2) for Module 2");
                System.out.println("(3) for Module 3");
                System.out.println("(4) for Module 4");
                // Get user choice for the module
                choice = keyboard.nextLine();
                try {
                    int newChoice = Integer.parseInt(choice);
                    if (newChoice == 1 || newChoice == 2 || newChoice == 3 || newChoice == 4) {

                        validInput = true;
                    } else {
                        System.out.println("Invalid");
                    }
                } catch (NumberFormatException e) {
                    if (choice == "e") {
                        active = false;
                        validInput = true;
                    }
                    System.out.println("Enter 1, 2, 3, or 4 to choose a Module or enter (e) to exit: ");
                    choice = keyboard.nextLine();
                }
            } // Out of while validating loop
            if (choice.equals("1")) {
                System.out.println("Module 1: ");
            } else if (choice.equals("2")) {
                System.out.println("Module 2: ");
            } else if (choice.equals("3")) {
                System.out.println("Module 3: ");
            } else if (choice.equals("4")) {
                System.out.println("Module 4: ");
            }
        }
    }
}