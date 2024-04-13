import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String [] args){
        Module module1=createModule(1);
//        Module module2=createModule(2);
//        Module module3=createModule(3);
//        Module module4=createModule(4);
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
    public static Module createModule(int num){
        if (num==1){
            Chapter ch1=new Chapter(1,"https://www.coursera.org/articles/what-is-python-used-for-a-beginners-guide-to-using-python",new String[3]);
            Chapter ch2=new Chapter(2,"https://www.geeksforgeeks.org/python-language-advantages-applications/",new String[3]);
            Chapter ch3=new Chapter(3,"https://www.geeksforgeeks.org/python-program-to-print-hello-world/", new String[3]);
            Quiz quiz=new Quiz();
            quiz.addQuestion(new Question("What can Python be used for?","A: Data Science","B: Software and Web Development","C: Automation", "D: All of the above",3));
            Module module1=new Module(ch1,ch2,ch3,quiz);
            return module1;
        }
//        if(num==2){
//
//        }
//        if (num==3){
//
//        }
//        if(num==4){
//
//        }
    }
}