
/**
 * Write a description of class Recursive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursive
{
    public static void main(String[] args) {
        //System.out.println(Pow(2, 2));
        System.out.println(grid(3, 5, "$"));

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

    public static String grid(int w, int h, String symbol) {
        if (w == 0 || h == 0) {
            return "";
        }
        if (h > w) {
            if (h > 0) {
                if (w > 0) {
                    return symbol  +  grid(w, h - 1, symbol + "\n" + grid(w-1, h, symbol )  );

                }

            }}
        else if (w > h) {
            if (w > 0) {
                if (h > 0) {
                    return symbol  +  grid(w -1, h, symbol + "\n" + grid(w, h -1, symbol )  );

                }

            }
        }

        return "wah";
    }

}
