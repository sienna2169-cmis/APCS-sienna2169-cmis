
/**
 * Write a description of class SongDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Song
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SongDriver
     */

    private double length;
    private String name;
    private int chartNum;
    private int yearReleased;
    
    static final String username = "admin123";
    static final String password = "ChocoLate";
    
    public Song() {
        this("Name");
    }
    
    public Song(String name) {
    this(name, 2);
    }
    public Song(String name, int chartNum) {
    this(name, chartNum, 1977);
    }
    public Song(String name, int chartNum, int yearReleased){
    this(name, chartNum, yearReleased, 2.35);
    
    }
    public Song(String name, int chartNum, int yearReleased, double length) {
    this.name = name;
        if (this.length < 0) {
            length = 0.0;
        }
        else {
            this.length = length;
        }
        this.chartNum = chartNum;
        this.yearReleased = yearReleased;
    }

    public String toString(){
        String out = "";
        out += "Name: " + name + "\n";
        out += "Length: " + length + "\n";
        out += "Chart Number: " + chartNum + "\n";
        out += "Year Released: " + yearReleased + "\n";
        return out;

    }
    public  int getYearReleased(){
    return yearReleased;
    
    }
    public void setYearReleased(int yearReleased_){
    String input1 = JOptionPane.showInputDialog("Username:");
    String input2 = JOptionPane.showInputDialog("Password:");
    
    if (input1.equals(username) && input2.equals(password)) {
    this.yearReleased = yearReleased_;}
    else {
    System.out.println("Sorry, you are not authorized to make this change.");
    }
    }
    public String toMinSec(double length) {
    String output = "";
    int min = (int) length;
    int sec = (int) ((length - min) * 60);
    output += "The length of the song is: " + min + " minutes and " + sec + " seconds." + "\n"; 
    return output;
    }
}
