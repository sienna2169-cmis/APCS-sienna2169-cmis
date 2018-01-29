
/**
 * Write a description of class Bread here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bread
{
    private String type;
    private int sliceNum;
    private double price;

    public Bread(){
        type = "";
        sliceNum = 0;
        price = 0.0;

    }
    public Bread(String type_, int slice, double price_) {
    this.type = type_;
    this.sliceNum = slice;
    this.price = price_;
    
    }
    public String toString(){
        String out = "";
        out += "Bread type: " + type + "\n";
        out += "# of slices: " + sliceNum + "\n";
        out += "Price: " + price + "$" + "\n";
        return out;

    }
}
