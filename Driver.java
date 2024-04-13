import java.util.Scanner;
import java.io.*;

public class Driver{
    public static void main(String [] args){
        learnPython();
    }
    public static void learnPython(){
        keyboard = new Scanner(System.in);
        System.out.println("Welcome to the class! We will be learning Python today");
        boolean exit = false;
        while(!exit) {
            System.out.println("Choose a module to start learning: ");
            System.out.println("(1) for Module 1");
            System.out.println("(2) for Module 2");
            System.out.println("(3) for Module 3");
            System.out.println("(4) for Module 4");

            // Get user choice for the module
            String choice = keyboard.nextLine();
        }
    }
}