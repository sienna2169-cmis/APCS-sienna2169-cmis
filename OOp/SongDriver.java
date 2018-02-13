
/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SongDriver
{
   public static void main(String[] args) {
    //Crab b = new Crab("joel");
    
    //System.out.println(b);
    
    Song song1 = new Song();
    //System.out.println(song1.toString());
    Song song2 = new Song("Pink", 3.0, 4, 1999);
   System.out.println(song2.toString());
    
   song2.getYearReleased();
   song2.setYearReleased(1995);
   System.out.println(song2.toString());
   
    }
}
