
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
        System.out.println(binToDec("11"));

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
        int count = b.length() - 1;
        int base2 = 1;
        if (count >= 0) {

            if (b.charAt(0) == '1') {
                 base2 = Pow( 2, count);
                return base2+ binToDec(b.substring(1, b.length() ));}

            else if (b.charAt(0) == '0'){

                return 0 + binToDec(b.substring(1, b.length() ));
            }
            else if (count == 0) {
                return 1 + binToDec(b.substring(1, b.length()));
            }
            else {return binToDec(b.substring(1, b.length() )); }

        }
        else {
            return 0;}
        
    }
    public static String reverse(String s) {
    String returnString;
    int left = s.length() ;
    if (left != 0) {
    returnString = s.substring(left -1);
    System.out.print(returnString);
    return returnString + reverse(s.substring(0, left - 1));
    
    }
    
    else {return "";}
    
    }
    
    public static String remove(String s, String t) {
    String returnString;
    int left = s.length();
    
    if (left != 0) {
    returnString = s.substring(left-1);
    if (returnString.equals(t)) {
    return remove(s.substring(0, left -1), t);
    
    }
    else if (returnString.equals(t) == false) {
    return remove(s.substring(0, left -1), t) + returnString;}
    
    else {return s;}
    
    
    }

    else {return s;}
    
    
    }
    
    public static String replace(String s, String t, String r) {
    
    String returnString;
    int left = s.length();
    
    if (left != 0) {
    returnString = s.substring(left-1);
    if (returnString.equals(t)) {
    return replace(s.substring(0, left-1), t, r) + r;
    }
    else if (returnString.equals(t) == false) {
    return replace(s.substring(0, left -1), t, r) + returnString;}
    
    else {return s;}
    
    }
    
    else {return s;}
    }
} 

