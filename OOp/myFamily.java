
/**
 * Write a description of class myFamily here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class myFamily
{
    // instance variables - replace the example below with your own
    
   public static void main(String[] args){ 
       ArrayList<String> myFamily = new ArrayList<String>();
       myFamily.add("Patrick");
       myFamily.add("Sigrid");
       myFamily.add("Gina");
       myFamily.add("Sienna");
       
       System.out.println(myFamily.size());
       for (int i = 0; i < myFamily.size(); i++){
        System.out.println(myFamily.get(i));
        
        }
        System.out.println();
       for(String member : myFamily){
        System.out.println(member);
        }
    
    }
    
}
