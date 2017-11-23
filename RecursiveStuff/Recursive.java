
/**
 * Write a description of class Recursive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursive
{
    public static void main(String[] args) {
        System.out.println(Pow(2, 2));
    
    }
    /**
     * Constructor for objects of class Recursive
     */
    public static int Pow(int num, int exp) 
    {
        
        if (exp == 0) {
             return 1;

        }
        else if (exp > 0) {
        
      
        
        return num * Pow(num, exp - 1);
        }
        else {
        return 0;
        }
       
    }

}
