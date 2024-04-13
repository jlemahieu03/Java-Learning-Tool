public class Module{
    //instance variables
    private Chapter chapter1;
    private Chapter chapter2;
    private Chapter chapter3;
    private Quiz quiz;

    //constructor
    public Module(Chapter ch1, Chapter c2, Chapter c3, Quiz quiz){
        chapter1=ch1;
        chapter2=ch2;
        chapter3=ch3;
        this.quiz=quiz;
    }
    //getters
    public Chapter getChapter1(){
        return chapter1;
    }
    public Chapter getChapter2(){
        return chapter2;
    }
    public Chapter getChapter3(){
        return chapter3;
    }
    public Quiz getQuiz(){
        return quiz;
    }
    //toString
    @Override
    public String toString(){
        return String.format("%s\n%s\n%s",chapter1,chapter2,chapter3);
    }
}