/**\
 * Airplane must be a subclass of Vehicle
 * Airplanes must have the following:
 * Instance Variables
 * ==================
 * #3 maxAltitude (this should be a decimal value)
 * #4 currentAltitude (this should be a decimal value)
 * 
 * Methods
 * =======
 * #5 getAltitude-return the instance's current altitude.
 * #6 setAltitude-An airplane crashes to the earth and breaks if 
 *    its altitude goes below 100.0 or over its maximum altitude or over 10000.0.
 * 
 * abstract methods
 * ================
 * #7 setCurrentSpeedRestricted - an airplane crashes to the earth and breaks if it goes slower than 50% of it's maximum speed.
 *    It cannot go faster than it's maximum speed.
 * 
 * Override
 * ========
 * #8 Override Vehicle's toString method to include an airplane's max and current altitude.
 *    it should return this:
 *    "Airplane Vehicle23\nCurrent Speed: 2056.4\nBroken: false\nMax Alt: 9560.0\nCurrent Alt: 5255.2\n"
 */
public class Airplane extends Vehicle
{
    private double maxAltitude;
    private double currentAltitude;
    
    public Airplane(int id, double maxSpeed, double maxAltitude) {
    super(id, maxSpeed);
    this.maxAltitude = maxAltitude;
    }
    
    public double getAltitude(){
    return currentAltitude;
    }
    public void setAltitude(double altitude) {
    if(altitude > 10000.0 || altitude < 100.0 || altitude > maxAltitude) {
    currentAltitude = 0;
    breakThisVehicle();
    } 
    else {currentAltitude = altitude;}
    }
    
public void setCurrentSpeedRestricted(double speed){
    if (speed < (this.getMaxSpeed() * 0.5) ) {
    setCurrentSpeed(0.0);
    setAltitude(0.0);
    breakThisVehicle();
    }
    else if (speed > this.getMaxSpeed()){
    setCurrentSpeed(this.getMaxSpeed());
    }
    else {
    setCurrentSpeed(speed);
    }
}

public String toString(){
    String output = super.toString();
return output  + " MaxAlt: " + maxAltitude + " Current Alt: " + currentAltitude + "\n";
}
}