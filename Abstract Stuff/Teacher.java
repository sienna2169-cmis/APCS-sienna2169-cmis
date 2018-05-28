
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    private double teachingAbility;
    public Teacher(String name, double smarts) {
        super(name);
        this.teachingAbility = smarts;
    }

    public boolean instructWorkout(ConstructionWorker worker){
        boolean success = false;
        if (Math.random() > teachingAbility) {
            success = worker.workOut();
        }
        return success;
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

    public boolean move(int dx, int dy) {
        if (dx < 4 || dy <4) {
            super.move(dx,dy);
            return true;
        }
        else {return false;}

    }
}
