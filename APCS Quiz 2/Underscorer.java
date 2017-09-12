
/**
 * Write a description of class Quiz2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Underscorer
{  
    public static void main(String[] args) {
    
    System.out.println(underScore(1));
    System.out.println(underScore(2));
    }
    public static String underScore(int a) {
    String finalString = "";
    if (a == 0){
        finalString = "0";
    
    }
    else if (a % 2 != 0) {
    while (a > 0) {
    finalString += Integer.toString(a) + "_";
    a= a-2;
    
    }
        
    }
    else if (a % 2 == 0) {
    while (a > 0) {
    finalString += Integer.toString(a) + "_";
    a = a-2;
    
    }
    finalString += "0";
    }
    return finalString;
    }
}
