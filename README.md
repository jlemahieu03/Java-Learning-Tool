## Java Learning Tool
### Summary of Program
This project was created for the University of Vermont's 2024 Hackathon, and won 1st place for the prompt. The team members we Zoe Bell, James LeMahieu, Lily Bonds, Darby Lane. We were prompted to create a programming language learning tool, with creative liberty on the method, UI, and feedback methods in which we taught the language. Playing to our strengths we chose to code the majority of this project in Java, relying heavily on OOP principles, and ultimately decided to also teach about java. This program is meant to provide base knowledge of basic java concepts in order to supplement a professor's lecture content and be built upon through subsequent coding activities given by the professor. The program opens up and allows the user to choose the module they work on with their input being validated whenever user input is taken in. Each module is split up into chapters where each chapter provides a link to a website that the student would then read through and notetake on. At the end of each module the user is then asked whether or not they are ready for a module quiz and the student can then take it, again with thier input being validated. After taking the quiz the user, the user is then told how many they got correct and a graph is displayed showing thier percentage for all modules. As the user take more quizzes the bars will populate and a user will have a more comprehensive understanding of what module they need to work on. This bar graph is called through the command line from java and passes the command line prompt and runs an Rscript to graph the plot in ggplot and then saves the picture to the working directory of the program. Then Java code rdisplays the saved image for the user. If a student gets a quiz question wrong that question is subsequently turned into a flashcard and up for review by the student from the main menu. This option allows the student to view these questions in a flashcard experience with the question on the front and the answer on the back allowing for even more reinforcment for the content the student does not know 100%.

### Known Bugs
There are no known bugs at the time.

### Future Work
Ways this project could be expanded upon and made more comprehensive is:
  
  1. Adding multiple languages to choose from. The team originally considered adding more than one language but was constricted by the time frame of the Hackathon.
  2. Adding a more comprehensive UI experience. The current program runs through the console/terminal of the user's device. If prompted would could create graphics that go along with tis program or a website that allows for a better user experince than the console.
  3. Expanding upon current learning content. Java is a comprehensive language and out lessons only scrape the surface of what cna be taught about the language. Adding more lessons and modules is definitely a possibility and something that would be easily implemented due to the OOP we implemented in this project.

### Credits
Zoe Bell: [Linkedin](https://www.linkedin.com/in/zoe-bell-6a11aa258/), [GitHub](https://github.com/zeb25)  
James LeMahieu: [Linkedin](https://www.linkedin.com/in/james-lemahieu/), [GitHub](https://github.com/jlemahieu03)  
Lily Bonds: [Linkedin](https://www.linkedin.com/in/lily-bonds-539a6926a/), [GitHub](https://github.com/lilybonds)  
Darby Lane: [Linkedin](https://www.linkedin.com/in/darby-lane-3b97202b9/), [GitHub](https://github.com/dlane13)
  
### Code Citations
All code was authored by the team memebrs, but inspiration and examples that proved helpful for the team are linked below.
https://stackoverflow.com/questions/14353302/displaying-image-in-java
https://stackoverflow.com/questions/8496494/running-command-line-in-java

### Lesson Plan Citations
Modules:
- Introduction
  - What is Java?
    - https://www.w3schools.com/java/java_intro.asp
  - Why Java?
    - https://www.ibm.com/docs/en/aix/7.3?topic=monitoring-advantages-java
  - IDE suggestions & Hello World
    - IDE Suggestions: jGrasp, IntelliJ, VSCode
    - Printing Hello World: https://www.geeksforgeeks.org/java-hello-world-program/
- Data Types and Variables
  - Default Types, Strings, explain literals
    - https://www.w3schools.com/java/java_data_types.asp
  - Variables and expressions
    - Variables: https://www.geeksforgeeks.org/variables-in-java/
  - Sequences (lists, tuples, mutability/immutability)
    - https://www.javatpoint.com/array-in-java
- Methods and Classes
  - Method definition: https://www.w3schools.com/java/java_methods.asp
  - Main Function versus classes: https://www.w3schools.com/java/java_class_methods.asp
  - Inheritance: https://www.geeksforgeeks.org/inheritance-in-java/
- Loops and Conditionals
  - If/Else/Else If Statements: https://www.w3schools.com/java/java_conditions.asp //this is the link that i changed!
  - For Loops: https://www.w3schools.com/java/java_for_loop.asp
  - While Loops: https://www.javatpoint.com/java-while-loop
- Other Citations:
  - https://codegym.cc/groups/posts/java-expressions-an-introduction-with-examples
  - Gaddis, Tony. _Starting Out With Java: Control Structures Through Objects_. New York City, Pearson, 2021.
