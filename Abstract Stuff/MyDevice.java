
/**
 * Abstract class MyDevice - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class MyDevice
{
    // instance variables - replace the example below with your own
    private String modelName;
    private double charge;
    private boolean isOn;
    
    public MyDevice(String name) {
    this.modelName = name;
    }
    public void setName(String newName) {
    this.modelName = newName;
    }
    public boolean charge(){
    if(charge < 1) {
    this.charge = 1.0;
    return true;
    }
    else {return false;}
    }
    
}
