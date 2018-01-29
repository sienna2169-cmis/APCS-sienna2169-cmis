
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

    public Card() {
        suit = "Joker";
        num = "Joker";
    }

    public Card(String suit_, String num_)  {
        this.suit = suit_;
        this.num = num_;

    }
    public String toString(){
        String out = "";
        out += "The " + num + " of " + suit + "\n";
        return out;
    }
}
