package StudyCards;

public class Flashcard {
    int cardno;
    String ques;
    String ans;

    public Flashcard(int cardno, String ques, String ans) { //Template for flashcard, including number, question and answer.
        this.cardno = cardno;
        this.ques = ques;
        this.ans = ans;
    }
}
