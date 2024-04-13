import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers;

    private int answerIndex;

    public Question(String ques, String an1, String an2, String an3, String an4, int anIn){
        question = ques;
        answers = new ArrayList<>();
        answers.add(an1);
        answers.add(an2);
        answers.add(an3);
        answers.add(an4);
        answerIndex = anIn;
    }

    public String getQuestion(){
        return question;
    }

    public ArrayList<String> getAnswers(){
        ArrayList<String> anCopy = new ArrayList<>();
        for (String a: answers){
            answers.add(a);
        }
        return anCopy;
    }

    public int getAnswerIndex(){
        return answerIndex;
    }

    @Override
    public String toString(){
        String s = "";
        s += question + "\n\n";
        for (String a:answers){
            s += a + '\n';
        }
        return s;
    }
}
