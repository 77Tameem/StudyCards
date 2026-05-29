package StudyCards;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LogFile {

    public static void saveCards(ArrayList<Flashcard> cards) {

        try {
            FileWriter writer = new FileWriter("cards.txt");

        for(Flashcard card : cards) {
            writer.write(card.cardno + " -" + card.ques + "- " + card.ans + "\n");
            }

        writer.close();
        }
        catch(IOException e) { //Exception Handling.
        System.out.println("Error: Saving cards error.");
        }
    }
}
