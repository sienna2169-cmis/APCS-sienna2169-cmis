
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
    private int x;
    private int y;
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
        return "Person Profile\nName: " + name + "\n" + 
        "Location: " + x + "," + y + "\n";
    }
    public boolean move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
    return true;
    }
    
}
