
/**
 * Write a description of class RosterDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class RosterDriver2
{
    public static void main(String[] args) {
    Roster2 apComputerScience = new Roster2();
    apComputerScience.addStudent(new Student("Sannie", "Wel"));
    apComputerScience.addStudent(new Student("Michela", "Bleika"));
    apComputerScience.addStudent(new Student("Yung", "Kem"));
    
    System.out.println(apComputerScience.toString());
    apComputerScience.dropStudent("Kem");
    System.out.println(apComputerScience.toString());
    
    }
}
