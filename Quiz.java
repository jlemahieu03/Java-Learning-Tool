import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quiz;
    private int maxScore;
    private int playerScore;

    public Quiz() {
        quiz = new ArrayList<>();
        maxScore = quiz.size();
        playerScore = 0;
    }

    public ArrayList<Question> getQuiz() {
        ArrayList<Question> quizCopy = new ArrayList<>();
        for (Question q : quiz) {
            quiz.add(q);
        }
        return quizCopy;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    private boolean isCorrectAnswer(char answer, Question ques) {
        if ((answer == 'A' || answer == 'a') && ques.getAnswerIndex() == 0) {
            return true;
        }
        if ((answer == 'B' || answer == 'b') && ques.getAnswerIndex() == 1) {
            return true;
        }
        if ((answer == 'C' || answer == 'c') && ques.getAnswerIndex() == 2) {
            return true;
        }
        if (((answer == 'D' || answer == 'd')) && ques.getAnswerIndex() == 3) {
            return true;
        }
        return false;
    }

    private String displayResults() {
        return String.format("You got %d/%d correct. Any questions you got incorrect will be availible for you to review" +
                "for review in main menu", playerScore, maxScore);

    }

    public void addQuestion(String question, String an1, String an2, String an3, String an4, int anIn) {
        Question newQuestion = new Question(question, an1, an2, an3, an4, anIn);
        quiz.add(newQuestion);
        maxScore = quiz.size();
    }

    public void takeQuiz() {
        Scanner keyboard = new Scanner(System.in);
        for (Question q:quiz){
            System.out.print(q + "\n");
            validateAnswer(keyboard)
        }
    }

    private char validateAnswer(Scanner keyboard){
        while(true){
            System.out.println("Enter your answer: ");

        }
    }
}
