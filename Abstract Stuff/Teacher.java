
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    public Teacher(String name) {
        super(name);
    }

    public boolean eat(String food) {
        boolean success = false;
        if (food.equals("samosas")) {

            setEnergy(getEnergy() + 0.2);
            success = true;
        }
        else if (food.equals("beans")) {
            setEnergy(getEnergy() -0.1);
        }
        else {
            setEnergy(getEnergy() + 0.1);
            success = true;
        }
        return (success);
    }
}
