
/**
 * Write a description of class Planet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Planet
{
    private String name;
    private double diameter;
    private int moons;
    private boolean hasRings;

    public Planet() {
        double rando = Math.random();
        name = "Planet " + Double.toString(rando);
        diameter = 5.0 + Math.random() * (100.0 - 5.0);
        moons = 0 + (int)(Math.random() * ((10 - 0) + 1));
        double rando2 = Math.random();
        if (rando2 >= 0.75 ) {
            hasRings = true;
        }
    }

    public Planet(String name_, double diameter_, int moons_, boolean hasRings_) {
        if (name_.equals("Alderaan") || name_.equals("alderaan")) {
            this.name = "The shattered remains of Alderaan";
        }
        else {this.name = name_;}
        if (diameter_ >= 5.0 && diameter_ <= 100.0) {
            this.diameter = diameter_;}
        else {this.diameter = 5.0;}
        if (moons_ >= 0 && moons_ <= 10) {
            this.moons = moons_;
        } 
        else {
            this.moons = 0;
        }
        if (hasRings_ == true && this.moons > 0){
            hasRings = false;
        }
        else {this.hasRings = hasRings_;}

    }

    public String toString() {
        String object = "";
        object += "Name: " + name + "\n";
        object += "Diameter: " + diameter + "\n";
        object += "Number of moons: " + moons + "\n";
        if (hasRings == true) {
            object += "Has rings." ;
        }
        else {object += "Doesn't have rings." ;}
        return object;
    }

    public static void main(String[] args){
        Planet p1 = new Planet();
        System.out.println(p1);
        System.out.println();

        Planet p2 = new Planet();
        System.out.println(p2);
        System.out.println();

        Planet p3 = new Planet("Tatooine", -100.0, 35, true);
        System.out.println(p3);
        System.out.println();

        Planet p4 = new Planet("Alderaan", 35.234234, 2, false);
        System.out.println(p4);
        System.out.println();

        Planet p5 = new Planet("Endor", 12.234234, 2, true);
        System.out.println(p5);
        System.out.println();

        Planet p6 = new Planet("Dagoba", 85.4, 0, true);
        System.out.println(p6);
        System.out.println();

    }}
