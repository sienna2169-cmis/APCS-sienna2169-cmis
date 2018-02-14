
/**
 * Write a description of class StudentDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentDriver2
{
   public static void main(String[] args) {
    Student senior = new Student("Joe", "Senior", 12, 3.6, 4.0, 3.4, 3.8, 3.5, 3.5);
    System.out.println(senior.toString());
    senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
    senior.getGPA2();
    System.out.println(senior.toString());
    
    
    
    }
}
