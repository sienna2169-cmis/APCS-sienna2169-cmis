
/**
 * Write a description of class Roster2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Roster2
{
    private ArrayList<Student> myStudents = new ArrayList<Student>();
    
    public Roster2(){
    
    }
    public void addStudent(Student newStudent){
    this.myStudents.add(newStudent);
    
    }
    public void dropStudent( String lastName) {
    Student toDrop = new Student();
    for (Student person : myStudents){
    if (person.getLastName().equals(lastName)){
    toDrop = person;
   
    }
    }
    this.myStudents.remove(toDrop);
    }
    public String toString() {
    String object = "Class info:\n";
    for (Student person : myStudents){
    object += person.toString() + "\n";
    }
    return object;
    }
   
}
