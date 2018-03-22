
/**
 * Write a description of class CommBadge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommBadge extends MyDevice
{
    // instance variables - replace the example below with your own
    private double broadcastFrequency;

    /**
     * Constructor for objects of class CommBadge
     */
    public CommBadge(String name)
    {
        super(name);
       
    }
    public CommBadge(String name, double frequency) {
    super(name);
    this.broadcastFrequency = frequency;
    }
    
    public double getFrequency(){
    return this.broadcastFrequency;
    }
    public void setFrequency(double newFrequency) {
    this.broadcastFrequency = newFrequency;
    }
    
    public boolean charge(){
    boolean success = false;
    if (this.getChargerWorking() == true) {
    success = super.charge();
    }
    return success;
    
    }
    
    public String toString(){
    
    String output = super.toString();
    output += "Commbadge Model: " + getName() + "\n" + "Broadcast Frequency: " + broadcastFrequency + "\n";
    return output;
    }
    
}
