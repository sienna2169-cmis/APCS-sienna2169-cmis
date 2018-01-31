
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private String suit;
    private String num;
    private int actual;

    public Card() {
        suit = "Joker";
        num = "Joker";
        actual = 0;
    }

    public Card(String suit_, String num_, int actual_)  {
        this.suit = suit_;
        this.num = num_;
        this.actual = actual_;
    }

    public String getNum() {

        return num;
    }

    public String getSuit() {
        return suit;
    }

    public int getVal() {
        return actual;
    }

    public String toString(){
        String out = "";
        out += "The " + num + " of " + suit + "\n";
        return out;
    }
}
