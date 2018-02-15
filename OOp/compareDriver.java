
/**
 * Write a description of class Comparing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class compareDriver
{
  
   public static void main (String[] args) {
   String school1 = new String ("Rhin");
   String school2 = new String ("She");
   String school3 = new String ("W");
   String school4 = new String ("H");
   
   
    System.out.println(school1.compareTo(school3));
    System.out.println(school2.compareTo(school3));
    System.out.println(school1.compareTo(school2));
    System.out.println(school3.compareTo(school4));
    
    }
}
/**
 * A) What is the output of the compareTo() method telling us?
 * It tells us how far forward or back in the alphabet 
 * one needs to go from the first letter in the two compared words that 
 * is NOT the same. So if they start with different letters, it shows
 * the distance one has to go from the first letter of the word being compared
 * to in order to reach the first letter of the first word being compared.
 * 
 * B) Compare to schools that have the same first letter. 
 * What does compareTo() do in this case?
 * In this case, compareTo() shows how many spaces forward or back one 
 * has to go in order to reach from the second letter in the second word 
 * to get to the second letter of the first word.
 */