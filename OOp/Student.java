
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int grade;
    private double gpa;
    public Student(){
        firstName = "";
        lastName = "";
        grade = 0;
        gpa = 0.0;
    }

    public Student(String name1, String name2, int grade_, double gpa_){
        this.firstName = name1;
        this.lastName = name2;
        this.grade = grade_;
        this.gpa = gpa_;

    }

    public String toString(){
        String out = "";
        out += "Name:" + firstName + "\n";
        out += "Surname:" + lastName + "\n";
        out += "Grade:" + grade + "\n";
        out += "GPA:" + gpa + "\n";
        return out;

    }

}
