
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
    private boolean chargerWorking;
    
    public String toString(){
    String output = "";
    if (isOn == true) {
    output += "The device is on.\n";
    }
    else {
    output += "The device is off. \n";
    }
    output += "The device is " + (charge * 100) + " percent charged.\n";
    if (chargerWorking == true) {
    output += "The device's charger is working.\n";
    }
    else {
    output += "The device's charger is broken.\n"; 
    }
    
    return output;
    }
    
    public boolean getChargerWorking() {
    return this.chargerWorking;
    }
    
    public MyDevice(String name) {
    this.modelName = name;
    }
    
    public String getName(){
    return this.modelName;
    }
    
    public void setName(String newName){
    this.modelName = newName;
    }
    
   
    public double getCharge(){
    
    return this.charge;
    }
  
    public boolean charge(){
    if(charge < 1) {
    this.charge = 1.0;
    return true;
    }
    else {return false;}
    }
    
    
}
