
/**
 * Write a description of class StudentDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentDriver2
{
   public static void main(String[] args) {
    //Student senior = new Student("Joe", "Senior", 12, 3.6, 4.0, 3.4, 3.8, 3.5, 3.5);
    //System.out.println(senior.toString());
    //senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
    //senior.getGPA2();
    //System.out.println(senior.toString());
    
    Student s1 = new Student("Bob", "Jones", 11, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0);
    s1.setGPA(4.0, 4.0, 3.6, 3.6, 4.0);
    
    System.out.println(s1.toString2());
    
    Student s2 = new Student("Millie", "Farmer", 10, 3.4, 4.0, 2.3, 3.6, 3.5, 3.6);
    s2.setGPA(3.5, 3.5, 3.5, 3.8, 3.5);
    System.out.println(s2.toString2());
    
    }
}
