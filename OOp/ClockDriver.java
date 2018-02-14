
/**
 * Write a description of class ClockDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class ClockDriver
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
    Clock kitchenClock = new Clock();
    System.out.println(kitchenClock.toString());
    kitchenClock.setTime(11, 34, 30);
    System.out.println(kitchenClock.toString());
    
    String t1;
    t1 = JOptionPane.showInputDialog("What is the hour?");
    String t2 = JOptionPane.showInputDialog("What is the minutes?");
    String t3 = JOptionPane.showInputDialog("What is the seconds?");
    
    Clock bedroomClock = new Clock (Integer.parseInt(t1), Integer.parseInt(t2), Integer.parseInt(t3));
    System.out.println(bedroomClock.toString());
    }
}
