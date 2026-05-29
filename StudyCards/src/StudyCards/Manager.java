package StudyCards;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Flashcard> cards = new ArrayList<>();
    public void create(String ques, String ans) {

    int cardno = cards.size() + 1;
    Flashcard card = new Flashcard(cardno, ques, ans);
    cards.add(card);
    }

    public void view() {
        if (cards.isEmpty()) {
            System.out.println("No cards found.");
            return;
        }

        for (Flashcard card : cards) {
            System.out.println("--------------------");
            System.out.println("Card #" + card.cardno);
            System.out.println("Question: " + card.ques);
            System.out.println("Answer: " + card.ans);
        }
    }

    public void study(Scanner input) {
        if (cards.isEmpty()) {
            System.out.println("No cards found.");
            return;
        }

        int score = 0;
        for (Flashcard card : cards) {
            System.out.println("\nCard #" + card.cardno);
            System.out.println(card.ques);

            String guess = input.nextLine();

         if (guess.equalsIgnoreCase(card.ans)) {
            System.out.println("Correct");
            score++;
            } 
         else {
            System.out.println("Wrong");
            System.out.println("Correct answer: " + card.ans);
            }
        }
        System.out.println("\nQuiz Finished");
        System.out.println("Score: " + score + "/" + cards.size());
    }

    public void save() {
        LogFile.saveCards(cards);
    }
}
