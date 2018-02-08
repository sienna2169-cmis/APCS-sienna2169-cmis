
/**
 * Write a description of class CrabDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CrabDriver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CrabDriver
     */
    
        public static void main(String[] args) {
        Crab c1 = new Crab("joel", 2, 4.0, true);
       
        System.out.println(c1.toString());
        System.out.println(c1.getKnighted());
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
   
}
