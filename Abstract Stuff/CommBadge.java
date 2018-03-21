
/**
 * Write a description of class CommBadge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommBadge extends MyDevice
{
    // instance variables - replace the example below with your own
    private boolean chargerWorking;

    /**
     * Constructor for objects of class CommBadge
     */
    public CommBadge(String name)
    {
        super(name);
       chargerWorking = true;
    }
    public boolean charge(){
    boolean success = false;
    if (chargerWorking == true) {
    success = super.charge();
    }
    return success;
    
    }
    
}
