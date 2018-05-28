
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Driver
{
   public static void main(){
    //MyDevice one = new CommBadge("BY-812", 3.2);
    //System.out.println(one);
    ArrayList<Television> TVS = new ArrayList<>();
    TVS.add(new Television("HD Sparkle", 49.99));
    TVS.add(new DLP("DLP Supernova", 69.99));
    TVS.add(new LCD("LCD Slipstream", 199.99));
    TVS.add(new LED("LED Mercury", 249.99));
    TVS.add(new Plasma("Plasma Nebula", 399.99));
    
    for (Television TV : TVS){
    System.out.println(TV);
    }
    
    
    
    }
}
