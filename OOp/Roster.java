
/**
 * Write a description of class Roster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Roster
{
    private Student[] students = new Student[3];
   
    Roster roster1 = new Roster();
    public Roster() {
    for (Student student : students) {
    student = new Student();
    }
    
    }
    
   // public Student findStudentWithMaxGPA() {  
    //    double maxGPA = 0;
    //for (Student student : students) {
    //if (student.calcGPA() > maxGPA) {
    //
   // }
    //} 
    //}
   // public String toString() {
    //return "";
    //}
}
