
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
        //System.out.println(grid(3, 3, "$"));
        //System.out.println(mul(3, 3));
        System.out.println(binToDec("1101"));

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
        if (h >= w) {
            if (h > 0) {
                if (w > 0) {
                    return symbol  +  grid(w, h - 1, symbol + "\n" + grid(w-1, h, symbol )  );

                }

            }}

        return "wah";
    }

    public static int mul(int x, int y){
        if (y != 0) {
            return x += mul(x, y-1);
        }
        else {
            return 0;
        }

    }

    public static int binToDec(String b){
        int count = b.length();
        int length = b.length() -1;

        if (count != 0) {
            String base = (b.substring(count));
            int base2 = Integer.parseInt(base);
           
            base2 = Pow(base2 * 2, length);
            return base2+ binToDec(b.substring(0, b.length() -1));
                
            
           

        }

        else {return 0;}
        
        //suddenly broke it wtf
        

    
    
        //else {return 0;}
    }

} 
    

