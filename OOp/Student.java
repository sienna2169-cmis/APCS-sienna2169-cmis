
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
    private double[] grades = new double[5];
    public Student(){
        firstName = "";
        lastName = "";
        grade = 0;
        gpa = 0.0;
        for (int i = 0; i < 5; i++) {
            this.grades[i] = 0.0;
        }
    }

    public void getGPA2() {
        this.gpa = calcGPA();

    }

    public Student(String name1, String name2, int grade_, double gpa_, double english, double math, double science, double fineArts, double socialScience){
        this.firstName = name1;
        this.lastName = name2;
        this.grade = grade_;
        this.gpa = gpa_;

        this.grades[0] = english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience;

    }

    public void setGPA(double g1, double g2, double g3, double g4, double g5) {
        this.grades[0] = g1;
        this.grades[1] = g2;
        this.grades[2] = g3;
        this.grades[3] = g4;
        this.grades[4] = g5;

    }

    public double calcGPA(){
        double total = 0.0;
        for (int i = 0; i < 5; i++) {
            total += this.grades[i];

        }

        return total / 5;
    }

    public String toString(){
        String out = "";
        out += "Name:" + firstName + "\n";
        out += "Surname:" + lastName + "\n";
        out += "Grade:" + grade + "\n";
        out += "GPA:" + gpa + "\n";
        return out;

    }

    public String toString2(){
        String object = "";
        object = String.format("Student's First Name is: %s \nStudent's Last name is: %s \nStudent's Average GPA is: %s \n%s's Grade: %s \n", firstName, lastName, gpa, firstName, getGrade());

        return object;
    }

    public String getGrade() {
        if (this.gpa >= 4.00) {
            return "A";
        }
        else if (this.gpa < 4.00 && this.gpa >= 3.00) {
            return "B";

        }
        else if (this.gpa < 3.00 && this.gpa >= 2.00) {
            return "C";

        }
        else if (this.gpa < 2.00 && this.gpa >= 1.00) {
            return "D";
        }
        else {return "F";}

    }

}
