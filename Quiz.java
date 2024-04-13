import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quiz;
    private int maxScore;
    private int playerScore;
    private ArrayList<Flashcard> wrongQuestions;

    private double percentageCorrect;

    public Quiz() {
        quiz = new ArrayList<>();
        wrongQuestions = new ArrayList<>();
        maxScore = quiz.size();
        playerScore = 0;
        percentageCorrect = 0;
        wrongQuestions = new ArrayList<>();
    }

    public double getPercentageCorrect(){
        return percentageCorrect;
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

    public ArrayList<Flashcard> getWrongQuestions() {
        return wrongQuestions;
    }

    private boolean isCorrectAnswer(String answer, Question ques) {
        if ((answer.equals("A") || answer.equals("a")) && ques.getAnswerIndex() == 0) {
            return true;
        }
        if ((answer.equals("B") || answer.equals("b")) && ques.getAnswerIndex() == 1) {
            return true;
        }
        if ((answer.equals("C") || answer.equals("c")) && ques.getAnswerIndex() == 2) {
            return true;
        }
        if ((answer.equals("D") || answer.equals("d")) && ques.getAnswerIndex() == 3) {
            return true;
        }
        return false;
    }

    private String displayResults() {
        return String.format("You got %d/%d correct. Any questions you got incorrect will be availible for you to review in the Main Menu", playerScore, maxScore);

    }

    public void addQuestion(Question q) {
        quiz.add(q);
        maxScore = quiz.size();
    }

    public void takeQuiz() {
        Scanner keyboard = new Scanner(System.in);
        playerScore=0;
        for (Question q:quiz){
            System.out.print(q + "\n");
            String userAnswer = validateAnswer(keyboard);
            if(isCorrectAnswer(userAnswer, q)){
                playerScore++;
            } else {
                ArrayList<String> answersCopy = q.getAnswers();
                boolean alreadyexists=false;
                for (Flashcard flash:wrongQuestions){
                    if (flash.front.equals(q.getQuestion())){
                        alreadyexists=true;
                    }
                }
                if (!alreadyexists) {
                    wrongQuestions.add(new Flashcard(q.getQuestion(), answersCopy.get(q.getAnswerIndex())));
                }
            }
        }
        //keyboard.close();
        percentageCorrect = ((double) playerScore / (double) maxScore) * 100;
        System.out.println(displayResults());
    }

    private String validateAnswer(Scanner keyboard){
        String answer;
        while(true){
            System.out.println("Enter your answer: ");
            answer = keyboard.nextLine();
            if (answer.isEmpty()){
                System.out.println("Error: No input provided. Please enter in A, B, C, or D");
            } else if (answer.length() > 1){
                System.out.println("Error: Answer cannot be more than one character. Please enter in A, B, C, or D");
            } else {
                if (answer.equals("A") || answer.equals("a")){
                    break;
                }
                if (answer.equals("B") || answer.equals("b")){
                    break;
                }
                if (answer.equals("C") || answer.equals("c")){
                    break;
                }
                if (answer.equals("D") || answer.equals("d")){
                    break;
                }
                System.out.println("Letter inputted not A, B, C, or D.");
            }

        }
        return answer;
    }
}
