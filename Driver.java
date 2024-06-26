import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class Driver{
    public static void main(String [] args) throws IOException, InterruptedException {
        learnJava();
    }
    //learnJava
    public static void learnJava() throws IOException, InterruptedException {
        Module module1 = createModule(1);
        Module module2 = createModule(2);
        Module module3 = createModule(3);
        Module module4 = createModule(4);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the class! We will be learning Python today.");
        boolean active = true;
        while (active) {
            boolean validInput = false;
            String choice = "";
            //while loop
            while (!validInput) {
                keyboard = new Scanner(System.in);
                System.out.println("Enter (e) to exit the class tool.");
                System.out.println("Choose a module to start learning: ");
                System.out.println("(1) for Module 1");
                System.out.println("(2) for Module 2");
                System.out.println("(3) for Module 3");
                System.out.println("(4) for Module 4");
                System.out.println("(5) to review Flashcards! (quiz questions you got wrong)");
                // Get user choice for the module
                choice = keyboard.nextLine();
                try {
                    int newChoice = Integer.parseInt(choice);
                    if (newChoice == 1 || newChoice == 2 || newChoice == 3 || newChoice == 4 || newChoice == 5) {
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
            boolean cont = false;
            String moveOn = "";
            if (choice.equals("1")) {
                System.out.println("Module 1: Introduction");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(module1);
                System.out.println("--------------------------------------------------------------------------------");
                while (!cont) {
                    System.out.println("Ready to take the Quiz? Enter (y) to take the quiz or (n) to go back to the Learning Modules");
                    moveOn = keyboard.nextLine();
                    if (moveOn.equals("y") || moveOn.equals("Y")) {
                        System.out.println("Module 1 Quiz:");
                        module1.getQuiz().takeQuiz();
                        displayGraph(module1, module2, module3, module4);
                        cont = true;
                    } else if (moveOn.equals("n") || moveOn.equals("N")) {
                        cont = true;
                    } else {
                        System.out.println("Error: Enter (y) or (n)");
                        moveOn = keyboard.nextLine();
                    }
                }
            } else if (choice.equals("2")) {
                System.out.println("Module 2: Data Types and Variables");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(module2);
                System.out.println("--------------------------------------------------------------------------------");
                while (!cont) {
                    System.out.println("Ready to take the Quiz? Enter (y) to take the quiz or (n) to go back to the Learning Modules");
                    moveOn = keyboard.nextLine();
                    if (moveOn.equals("y") || moveOn.equals("Y")) {
                        System.out.println("Module 2 Quiz:");
                        module2.getQuiz().takeQuiz();
                        displayGraph(module1, module2, module3, module4);
                        cont = true;
                    } else if (moveOn.equals("n") || moveOn.equals("N")) {
                        cont = true;
                    } else {
                        System.out.println("Error: Enter (y) or (n)");
                        moveOn = keyboard.nextLine();
                    }
                }
            } else if (choice.equals("3")) {
                System.out.println("Module 3: Methods and Classes");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(module3);
                System.out.println("--------------------------------------------------------------------------------");
                while (!cont) {
                    System.out.println("Ready to take the Quiz? Enter (y) to take the quiz or (n) to go back to the Learning Modules");
                    moveOn = keyboard.nextLine();
                    if (moveOn.equals("y") || moveOn.equals("Y")) {
                        System.out.println("Module 3 Quiz:");
                        module3.getQuiz().takeQuiz();
                        displayGraph(module1, module2, module3, module4);
                        cont = true;
                    } else if (moveOn.equals("n") || moveOn.equals("N")) {
                        cont = true;
                    } else {
                        System.out.println("Error: Enter (y) or (n)");
                        moveOn = keyboard.nextLine();
                    }
                }
            } else if (choice.equals("4")) {
                System.out.println("Module 4: Loops and Conditionals");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(module4);
                System.out.println("--------------------------------------------------------------------------------");
                while (!cont) {
                    System.out.println("Ready to take the Quiz? Enter (y) to take the quiz or (n) to go back to the Learning Modules");
                    moveOn = keyboard.nextLine();
                    if (moveOn.equals("y") || moveOn.equals("Y")) {
                        System.out.println("Module 4 Quiz:");
                        module4.getQuiz().takeQuiz();
                        displayGraph(module1, module2, module3, module4);
                        cont = true;
                    } else if (moveOn.equals("n") || moveOn.equals("N")) {
                        cont = true;
                    } else {
                        System.out.println("Error: Enter (y) or (n)");
                        moveOn = keyboard.nextLine();
                    }
                }
            }
            else if (choice.equals("5")) {
                System.out.println("Flashcards: These are the questions you have gotten wrong on your quizzes");
                ArrayList<Flashcard> joined=new ArrayList<>();
                for(int i=0; i<module1.getQuiz().getWrongQuestions().size(); i++){
                    joined.add(module1.getQuiz().getWrongQuestions().get(i));
                }
                for(int i=0; i<module2.getQuiz().getWrongQuestions().size(); i++){
                    joined.add(module2.getQuiz().getWrongQuestions().get(i));
                }
                for(int i=0; i<module3.getQuiz().getWrongQuestions().size(); i++){
                    joined.add(module3.getQuiz().getWrongQuestions().get(i));
                }
                for(int i=0; i<module4.getQuiz().getWrongQuestions().size(); i++){
                    joined.add(module4.getQuiz().getWrongQuestions().get(i));
                }
                if (joined.size()==0){
                    System.out.println("No flashcards!");
                }
                else{
                    System.out.println("Hit enter for answer!");
                    keyboard = new Scanner(System.in);
                    for(Flashcard flash: joined){
                        System.out.println(flash.getFront());
                        String enter=keyboard.nextLine();
                        System.out.println(flash.getBack());
                    }
                }
            }
        }
    }
    public static Module createModule(int num){
        if (num==1){
            Chapter ch1=new Chapter("What is Java?",1,"https://www.w3schools.com/java/java_intro.asp",new String[]{"Java is a dynamic, easily accessible programming language","Java is free to download","Java is a compiled language"});
            Chapter ch2=new Chapter("Why Java?",2,"https://www.ibm.com/docs/en/aix/7.3?topic=monitoring-advantages-java",new String[]{"Java is well-suited for object-oriented programming","Java is unique in the sense that it has platform independence (write once, run anywhere)","Object-oriented programming helps provide a clear program structure"});
            Chapter ch3=new Chapter("IDE suggestions & Hello World",3,"https://www.geeksforgeeks.org/java-hello-world-program/", new String[]{"IDE SUGGESTIONS: jGrasp","IntelliJ","VSCode"});

            Quiz quiz=new Quiz();

            quiz.addQuestion(new Question("\nWhat advantage does object-oriented programming (OOP) provide in Java?","A: Faster execution","B: Clear program structure","C: Longer development time", "D: No code reusability",1));
            quiz.addQuestion(new Question("\nWhich other programming languages are Java closely related to?","A: Python and Ruby","B: C++ and C#","C: JavaScript and PHP", "D: Swift and Kotlin",1));
            quiz.addQuestion(new Question("\nWhat is a big advantage of coding in Java?","A: Java is easy to learn","B: Java is object-oriented","C: Java is platform independent", "D: All of the above",3));
            quiz.addQuestion(new Question("\nWhat is the purpose of the public static void main(String[] args) signature in Java?","A: To define a constructor","B: To create an object","C: To specify the program’s entry point", "D: To handle exceptions",2));
            quiz.addQuestion(new Question("\nWhat does the System.out.println(\"Hello, World\"); statement do in Java?","A: Prints \"Hello, World\" to the console","B: Declares a new class named \"Hello, World\"","C: Initializes a variable called \"Hello, World\"", "D: Throws an error",0));

            Module module1=new Module(ch1,ch2,ch3,quiz);
            return module1;
        }
        if(num==2){
            Chapter ch1=new Chapter("Primitive and non-primitive types",1,"https://www.w3schools.com/java/java_data_types.asp",new String[]{"Java has several primitive data types which include byte, short, int, long, float, double, boolean, char","Java has several non-primitive data types which include Arrays, Strings, Classes, Interfaces, etc.","Primitive types are already defined in Java, whereas non-primitive types are made by the programmer"});
            Chapter ch2=new Chapter("Variables, expressions",2,"https://www.geeksforgeeks.org/variables-in-java/",new String[]{"Variables are used to store data, which can then be used/manipulated in methods","An expression combines values, variables, operators, and methods to produce a single value","Types of expressions include arithmetic, relational, conditional, logical, and combinations of all four"});
            Chapter ch3=new Chapter("Sequences",3,"https://www.javatpoint.com/array-in-java", new String[]{"Common types of sequences in Java include arrays and ArrayLists","These two sequences contain homogeneous data types","Arrays have a set length, while ArrayLists have dynamic lengths"});
            Quiz quiz=new Quiz();

            quiz.addQuestion(new Question("\nWhat does the boolean data type represent in Java?","A: Whole numbers","B: Floating point numbers","C: True or false values", "D: Characters",2));
            quiz.addQuestion(new Question("\nWhich group of data types includes String, Arrays, and Classes?","A: Primitive data types","B: Non-primitive data types","C: Integer data types", "D: Relational numbers",1));
            quiz.addQuestion(new Question("\nWhat is the purpose of a variable in Java?","A: To define functions","B: To store data values during program execution","C: To create classes and objects", "D: To perform mathematical calculations",1));
            quiz.addQuestion(new Question("\nWhat is the purpose of a Java array?","A: To define functions","B: To store elements of different data types","C: To store elements of a similar data type", "D: To create classes and objects",2));
            quiz.addQuestion(new Question("\nHow do you declare an array of ints in Java?","A: int[] arr;","B: arr[] int;","C: int arr[];", "D: All of the above",0));

            Module module2=new Module(ch1,ch2,ch3,quiz);
            return module2;
        }
        if (num==3){
            Chapter ch1=new Chapter("Method definition",1,"https://www.w3schools.com/java/java_methods.asp",new String[]{"Methods can make writing code more efficient because once written, they can be called as many times as needed","Methods can take parameters and return values","Methods can be overridden, which means that a method has the same header and parameters as another method, or they can be overloaded, which means that they have the same header but different parameters"});
            Chapter ch2=new Chapter("Main method vs. classes",2,"https://www.w3schools.com/java/java_class_methods.asp",new String[]{"Methods can be written in the driver class, or they can be written in specific classes that contain other specialized methods for objects of the class type","Static methods can be called without creating any instances of their class","Objects of the class that contains a specific method can access that method"});
            Chapter ch3=new Chapter("Inheritance",3,"https://www.geeksforgeeks.org/inheritance-in-java/", new String[]{"Java inheritance allows subclasses to use the methods in their parent class","Subclasses can override methods in their parent class in order to specialize the implementation of the method for objects of the subclass","You can create multiple levels of inheritance by using subclasses as superclasses for other classes"});
            Quiz quiz=new Quiz();

            quiz.addQuestion(new Question("\nWhat does the void keyword indicate in a method declaration?","A: The method returns a value","B: The method has no parameters","C: The method does not return a value", "D: The method is private",2));
            quiz.addQuestion(new Question("\nWhat is the purpose of creating your own methods in Java?","A: To reuse code","B: To define variables","C: To create loops", "D: To handle exceptions",0));
            quiz.addQuestion(new Question("\nWhat is the key difference between static methods and public methods?","A: Static methods can be called without creating objects, while public methods require object creation","B: Static methods are private, while public methods are accessible globally","C: Static methods have parameters, while public methods do not", "D: Static methods are slower than public methods",0));
            quiz.addQuestion(new Question("\nWhat is the purpose of a Java class method?","A: To define functions","B: To store data","C: To perform certain actions related to the class", "D: To create objects",2));
            quiz.addQuestion(new Question("\nWhat is the purpose of inheritance in Java?","A: To define functions","B: To store data","C: To perform certain actions", "D: To allow one class to inherit features from another class",3));
            quiz.addQuestion(new Question("\nWhich keyword is used to indicate inheritance in Java?","A: extends","B: implements","C: inherits", "D: inheritsFrom",0));

            Module module3=new Module(ch1,ch2,ch3,quiz);
            return module3;
        }
        if(num==4){
            Chapter ch1=new Chapter("If/Else/Else-if statements",1,"https://www.w3schools.com/java/java_conditions.asp",new String[]{"If/Else statements enable the program to execute certain blocks of code based on a condition/conditions","The condition goes with the if/else if blocks, where else is meant to catch the remaining possibilities","The branches are checked in order, so as soon as the conditions for a branch are met, the body of the branch executes and then continues with the code following the conditional"});
            Chapter ch2=new Chapter("While loops ",2,"https://www.w3schools.com/java/java_for_loop.asp",new String[]{"For loops are useful when the programmer knows exactly how many times they want a certain block of code to execute","The format is: for (initial statement; condition to be met; increment or decrement the initial statement)","The incrementation or decrementation occurs after the execution of the body of the for loop and before the next execution"});
            Chapter ch3=new Chapter("For loops",3,"https://www.javatpoint.com/java-while-loop", new String[]{"While loops execute as long as the condition of the loop is true","The condition is evaluated each time before the execution of the loop","While loops are very useful for input validation"});
            Quiz quiz=new Quiz();

            quiz.addQuestion(new Question("\nWhat is the purpose of branching statements in Java?","A: To define functions","B: To store data","C: To perform certain actions", "D: To jump the flow of execution within a program",3));
            quiz.addQuestion(new Question("\nWhich branching statement is used to terminate a loop based on a certain condition?","A: continue","B: break","C: return", "D: switch",1));
            quiz.addQuestion(new Question("\nWhat is the advantage of a for loop in Java?","A: To execute a block of code a certain number of times","B: To execute a block of code while some condition is true","C: To define functions", "D: To create classes and objects",0));
            quiz.addQuestion(new Question("\nWhat is the condition in a while loop?","A: The code to be executed","B: The increment/decrement statement","C: The expression to be tested", "D: The initialization of loop variables",2));
            quiz.addQuestion(new Question("\nHow does the do-while loop differ from the while loop?","A: The do-while loop executes only if the condition is true","B: The do-while loop always executes at least once","C: The do-while loop is an entry control loop", "D: The do-while loop is used for infinite iterations",1));

            Module module4=new Module(ch1,ch2,ch3,quiz);
            return module4;
        }
        return null;
    }

    public static void displayGraph(Module module1, Module module2, Module module3, Module module4) throws IOException, InterruptedException{
        // Sample percentage errors
        // Sample percentage errors
        String mod1percentError = String.valueOf(module1.getQuiz().getPercentageCorrect());
        String mod2percentError = String.valueOf(module2.getQuiz().getPercentageCorrect());
        String mod3percentError = String.valueOf(module3.getQuiz().getPercentageCorrect());
        String mod4percentError = String.valueOf(module4.getQuiz().getPercentageCorrect());

        // Command to call R script with percentage errors as arguments
        String[] command = {"Rscript", "displayPercent.R", mod1percentError, mod2percentError, mod3percentError, mod4percentError};

        // Start the process
        ProcessBuilder pb = new ProcessBuilder(command);
        Process process = pb.start();

        // Wait for the process to finish
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            System.err.println("R script execution failed with exit code " + exitCode);
            return;
        }

        // Read the image after the process has finished
        File imageFile = new File("percent_graph.png");
        BufferedImage image = ImageIO.read(imageFile);

        // Create a JFrame to display the image
        JFrame frame = new JFrame("Image Display");


        // Create a JLabel to hold the image
        JLabel label = new JLabel(new ImageIcon(image));

        // Add the JLabel to the JFrame
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();

        // Make the JFrame visible
        frame.setVisible(true);

        // Calculate the scale factors
        double scaleX = (double)frame.getWidth() / image.getWidth();
        double scaleY = (double)frame.getHeight() / image.getHeight();
        double scale = Math.min(scaleX, scaleY);

        // Scale the image
        int scaledWidth = (int)(image.getWidth() * scale);
        int scaledHeight = (int)(image.getHeight() * scale);
        Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Set the scaled ImageIcon to the JLabel
        label.setIcon(scaledIcon);

    }

}