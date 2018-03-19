
/**
 * Write a description of class ConstructionWorker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConstructionWorker extends Person
{
    private double strength;
    public ConstructionWorker(String name, double strongness){
        super(name);
        this.strength = strongness;
    }

    public boolean eat(String food) {
        boolean success = false;
        if (food.equals("lasagna")) {
            setEnergy(getEnergy() + 0.2);
            success = true;
        }
        else if (food.equals("gravy")) {
            setEnergy(getEnergy() -0.1);
        }
        else {
            setEnergy(getEnergy() + 0.1);
            success = true;
        }
        return (success);
    }
}
