
/**
 * Abstract class Person - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

public abstract class Person
{
    private String name = "John Doe";
    private double energy;

    public abstract boolean eat(String food) ;

    public void setEnergy(double power) {
        this.energy = power;
    }

    public double getEnergy(){
        return energy;
    }

    public Person(String name) {
        this.name = name;
        this.energy = Math.random();
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String toString(){
        return "Person Profile\nName: " + this.name + "\n";
    }
}
