
/**
 * Write a description of class Roster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Roster
{
    private Student[] students = new Student[3];

    
    public Roster() {
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

    }

    public Student findStudentWithMaxGPA() {  
        double maxGPA = 0;
        Student topStudent = new Student();

        for (Student student : students) {
            if (student.calcGPA() > maxGPA) {
                maxGPA = student.calcGPA();
                topStudent = student;
            }}
        return topStudent;

    }

    public String toString() {
        return "Stats of the student with the highest GPA" + "\n" + findStudentWithMaxGPA().toString();
    }
}
