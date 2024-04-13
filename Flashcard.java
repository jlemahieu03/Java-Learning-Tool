// Flashcard class
public class Flashcard {
    //instance variables
    String front;
    String back;

    // constructor
    public Flashcard(String front, String back) {
        this.front = front;
        this.back = back;
    }
    public String getFront() {
        return front;
    }
    public String getBack() {
        return back;
    }
}