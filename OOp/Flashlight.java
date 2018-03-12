/**
 * Write a description of class Flashlight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flashlight
{
    private boolean isOn = false;

    private String lightColor = "white";

    private int intensity = 2;

    /***
     * Methods for you to implement
     * toggle: changes the state from on to off and vice versa
     * changeColor(String newColor): change the lightColor but only to one of the validColors 
     * incIntensity: increase the intensity by one up to a maximum of 5
     * decIntensity: decrease the intensity by one down to a minimum of 0
     * getIntensityDescription: retrieve a narrative description of the intensity level
     */
    /* Sample output 
    Test toggle
    ===========
    The flashlight is off.
    There is a medium white light emanating from the flashlight.
    The flashlight is off.
    Test changeColor
    ================
    There is a medium white light emanating from the flashlight.
    There is a medium red light emanating from the flashlight.
    There is a medium blue light emanating from the flashlight.
    There is a medium yellow light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    There is a medium white light emanating from the flashlight.
    Test getIntensity, decIntensity, incIntensity
    =============================================
    medium
    dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    extremly dim
    dim
    medium
    bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
    retina searingly bright
     */

    public String toString(){
        String out = "";
        if(isOn){
            out += "There is a ";
            out += new String[]{"extremely dim","dim", "medium", "bright", "retina searingly bright"}[intensity] + " ";
            out += lightColor + " light";
            out += " emanating from the flashlight.";
        }else{
            out = "The flashlight is off.";
        }
        return out;
    }       

    public static void main(String[] args){
        Flashlight fl = new Flashlight();
        System.out.println(fl);

        System.out.println("\nTest toggle\n===========");
        System.out.println(fl);
        fl.toggle();
        System.out.println(fl);
        fl.toggle();
        System.out.println(fl);
        fl.toggle();
        System.out.println("\nTest changeColor\n================");
        fl.changeColor("red");
        System.out.println(fl);
        fl.changeColor("blue");
        System.out.println(fl);
        fl.changeColor("yellow");
        System.out.println(fl);
        fl.changeColor("white");
        System.out.println(fl);
        fl.changeColor("green");
        System.out.println(fl);
        fl.changeColor("orange");
        System.out.println(fl);
        System.out.println("\nTest getIntensity, decIntensity, incIntensity\n=============================================");
        System.out.println(fl.getIntensityDescription());
        fl.decIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());

    }

    public int incIntensity() {
        if (this.intensity <= 3){
            return this.intensity += 1;}
        else {return 4;}
    }

    public int decIntensity() {
        if (this.intensity >= 1){
            return this.intensity -= 1;
        }
        else {return 0;}
    }

    public boolean toggle() {
        return this.isOn = !(this.isOn);
    }

    public String changeColor(String newColor) {
        return this.lightColor = newColor.equals("white") ? "white" : newColor.equals("blue") ? "blue" : newColor.equals("red") ? "red" : newColor.equals("yellow") ? "yellow" : this.lightColor;

    }

    public String getIntensityDescription(){

        String output = this.intensity == 0 ? "extremely dim" : this.intensity == 1 ? "dim" : this.intensity == 2 ? "medium" : this.intensity == 3 ? "bright" : this.intensity == 4 ? "retina searingly bright": this.getIntensityDescription();
        return output;

    }

}