
/**
 * Write a description of class CardDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class CardDriver
{
    public static void main(String[] args) {
        Card myHand[] = new Card[3];
        cardGen(myHand);
        
        

    }
    public static Card[] cardGen(Card hand[]){
        for (int i = 0; i < hand.length; i++) {
            Random randNum = new Random();
            int n = randNum.nextInt(13) + 1;
            Random randSuit = new Random();
            int s = randSuit.nextInt(4) + 1;

            String suit_ = "";
            String val = "";
            int actual = 0;
            if (n > 10 || n == 1) {
                if (n == 11) {
                    val = "J";
                    actual = 10;
                }
                else if (n == 12) {
                    val = "Q";
                    actual = 10;
                }
                else if (n == 13) {
                    val = "K";
                    actual = 10;
                }
                else if (n == 1) {
                    val = "A";
                    actual = 11;
                }

            }
            else if (n > 1 && n < 11) {
                val = Integer.toString(n);
                actual = n;
            }

            if (s == 1) {suit_ = "Hearts";}
            if (s == 2) {suit_ = "Diamonds";}
            if (s == 3) {suit_ = "Clubs";}
            if (s == 4) {suit_ = "Spades";}

            Card card = new Card(suit_, val, actual);
            hand[i] = card;
            //System.out.println(card.toString());
            
        }
        return hand;
    }
}

