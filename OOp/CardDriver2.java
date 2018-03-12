
/**
 * Write a description of class CardDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class CardDriver2
{
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

        getSum(dealer);
        getSum(hand1);
        getSum(hand2);
        getSum(hand3);
        getSum(hand4);
        getSum(hand5);

        System.out.println(toString2("Dealer", dealer));
        System.out.println(toString2("1", hand1));
        System.out.println(toString2("2", hand2));
        System.out.println(toString2("3", hand3));
        System.out.println(toString2("4", hand4));
        System.out.println(toString2("5", hand5));

    }

    public static int getSum(Card[] hand) {
        int c1 = 0;
        int c2 = 0;
        int less = 0;
        for (int i = 0; i < hand.length; i++) {
            int val = hand[i].getVal();

            if (i == 0) {
                c1 = val;
            }
            else {c2 = val;}

        }
        if (c1 < c2) {
            less = c1;
        }
        else if (c2 < c1) {
            less = c2;
        }
        else if (c2 == c1) {
            less = 12;
        }
        int theSum = c1+c2;
        if (theSum > 22) {
            return less;
        }
        else {return theSum;}

    }

    public static boolean isBeat(Card[] player1, Card[] dealer) {
        int v1 = getSum(player1);
        int v2 = getSum(dealer);
        if (v1 > v2){
            return true;
        } 
        else {return false;}

    }

    public static String toString2(String num, Card[] hand) {
        String finalObj = "";
        if (num.equals("Dealer") || num.equals("dealer")){
            finalObj += "The Dealer has ";
        }
        else {
            finalObj += "Player" + num + " has ";
        }

        finalObj += hand[0].toString();
        finalObj += " and" + "\n";
        finalObj += hand[1].toString() + ",";

        finalObj += " which equal " + getSum(hand) + "\n";
        return finalObj;
    }

    public void  winner() {
    
    
    }

}

