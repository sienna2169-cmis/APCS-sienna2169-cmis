
/**
 * Write a description of class CardDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class CardDriver2
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Card dealer[] = new Card[2];
        Card hand1[] = new Card[2];
        Card hand2[] = new Card[2];
        Card hand3[] = new Card[2];
        Card hand4[] = new Card[2];
        Card hand5[] = new Card[2];

        CardDriver.cardGen(dealer);
        CardDriver.cardGen(hand1);
        CardDriver.cardGen(hand2);
        CardDriver.cardGen(hand3);
        CardDriver.cardGen(hand4);
        CardDriver.cardGen(hand5);

    }
    public static int getSum(Card[] hand) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < hand.length; i++) {
        int val = hand[i].getVal();
        if (i == 0) {
        c1 = val;
        }
        else {c2 = val;}
        

    }   
        if (c1 == 1 ) {
        String question = "";
        question += "Your cards are the "
        +  hand[0].toString() + " and the " + hand[1].toString() + "\n"
        + "Do you want your Ace to be 1 or 11?";
        
       String yesNo = JOptionPane.showInputDialog(question);
       if (yesNo.equals("1")) {
        c1 = 1;
        }
       else {c1 = 11;}
        }
       else if (c2 == 1) {
         String question = "";
        question += "Your cards are the "
        +  hand[0].toString() + " and the " + hand[1].toString() + "\n"
        + "Do you want your Ace to be 1 or 11?";
        
       String yesNo = JOptionPane.showInputDialog(question);
       if (yesNo.equals("1")) {
        c2 = 1;
        }
       else {c2 = 11;}
        
        }
        return c1 + c2;
    }
    public static boolean isBeat(Card[] player1, Card[] dealer) {
    int v1 = getSum(player1);
    int v2 = getSum(dealer);
    if (v1 > v2){
    return true;
    } 
    else {return false;}
    
    }
}
