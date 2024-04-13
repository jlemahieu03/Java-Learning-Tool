import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String [] args){

//        Module module2=createModule(2);
//        Module module3=createModule(3);
//        Module module4=createModule(4);
        learnPython();
    }
    public static void learnPython() {
        Module module1=createModule(1);
        Scanner keyboard;
        System.out.println("Welcome to the class! We will be learning Python today.");
        boolean active = true;
        while (active) {

            boolean validInput = false;
            String choice = "";
            while (!validInput) {
                keyboard = new Scanner(System.in);
                System.out.println("Enter (e) to exit the course.");
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
                    if (choice.equals("e")) {
                        validInput = true;
                        active = false;
                    }
//                    System.out.println("Enter 1, 2, 3, or 4 to choose a Module or enter (e) to exit: ");
//                    choice = keyboard.nextLine();
                }
            } // Out of while validating loop
            if (choice.equals("1")) {
                System.out.println("Module 1: Introduction");
                System.out.println(module1);
                System.out.println("Module 1 Quiz:");
                module1.getQuiz().takeQuiz();
            } else if (choice.equals("2")) {
                System.out.println("Module 2: Data Types and Variables");
            } else if (choice.equals("3")) {
                System.out.println("Module 3: Classes and Functions");
            } else if (choice.equals("4")) {
                System.out.println("Module 4: Loops and Conditionals");
            }
        }
    }
    public static Module createModule(int num){
        if (num==1){
            Chapter ch1=new Chapter(1,"https://www.w3schools.com/java/java_intro.asp",new String[3]);
            Chapter ch2=new Chapter(2,"https://www.ibm.com/docs/en/aix/7.3?topic=monitoring-advantages-java",new String[3]);
            Chapter ch3=new Chapter(3,"https://www.geeksforgeeks.org/java-hello-world-program/", new String[3]);

            Quiz quiz=new Quiz();

            quiz.addQuestion(new Question("What advantage does object-oriented programming (OOP) provide in Java?","A: Faster execution","B: Clear program structure","C: Longer development time", "D: No code reusability",1));
            quiz.addQuestion(new Question("Which other programming languages are Java closely related to?","A: Python and Ruby","B: C++ and C#","C: JavaScript and PHP", "D: Swift and Kotlin",1));
            quiz.addQuestion(new Question("What is a big advantage of coding in Java?","A: Java is easy to learn","B: Java is object-oriented","C: Java is platform independent", "D: All of the above",3));
            quiz.addQuestion(new Question("What is the purpose of the public static void main(String[] args) signature in Java?","A: To define a constructor","B: To create an object","C: To specify the program’s entry point", "D: To handle exceptions",2));
            quiz.addQuestion(new Question("What does the System.out.println(\"Hello, World\"); statement do in Java?","A: Prints “Hello, World” to the console","B: Declares a new class named “Hello, World”","C: Initializes a variable called “Hello, World”", "D: Throws an error",0));

            Module module1=new Module(ch1,ch2,ch3,quiz);
            return module1;
        }
        if(num==2){
            Chapter ch1=new Chapter(1,"https://www.w3schools.com/java/java_data_types.asp",new String[3]);
            Chapter ch2=new Chapter(2,"https://www.geeksforgeeks.org/variables-in-java/",new String[3]);
            Chapter ch3=new Chapter(3,"https://www.javatpoint.com/array-in-java", new String[3]);
            Quiz quiz=new Quiz();
            Module module2=new Module(ch1,ch2,ch3,quiz);
            return module2;
        }
        if (num==3){
            Chapter ch1=new Chapter(1,"https://www.w3schools.com/java/java_methods.asp",new String[3]);
            Chapter ch2=new Chapter(2,"https://www.w3schools.com/java/java_class_methods.asp",new String[3]);
            Chapter ch3=new Chapter(3,"https://www.geeksforgeeks.org/inheritance-in-java/", new String[3]);
            Quiz quiz=new Quiz();
            Module module3=new Module(ch1,ch2,ch3,quiz);
            return module3;
        }
        if(num==4){
            Chapter ch1=new Chapter(1,"https://www.javatpoint.com/branching-statements-in-java#:~:text=Java%20has%20mainly%20three%20branching,used%20with%20the%20control%20statements",new String[3]);
            Chapter ch2=new Chapter(2,"https://www.w3schools.com/java/java_for_loop.asp",new String[3]);
            Chapter ch3=new Chapter(3,"https://www.javatpoint.com/java-while-loop", new String[3]);
            Quiz quiz=new Quiz();
            Module module4=new Module(ch1,ch2,ch3,quiz);
            return module4;
        }
        return null;
    }

    public static void displayGraph(){

    }
}