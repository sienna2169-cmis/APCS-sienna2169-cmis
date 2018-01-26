
/**
 * Write a description of class Clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock
{
    // instance variables - replace the example below with your own
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        // initialise instance variables
        hours = 00;
        minutes = 00;
        seconds = 00;
    }
    public Clock(int _hours, int _minutes, int _seconds){
    this.hours = _hours;
    this.minutes = _minutes;
    this.seconds = _seconds;
    }
    public String toString(){
    String object = "The time is " + hours + ":" + minutes + ":" + seconds ;
    return object;
    }

}
