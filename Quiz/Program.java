import java.util.*;
public class Program
{
    public static void main(String[] args){
        System.out.println("Started");
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Airplane Planey = new Airplane(232, 2000.0, 3000);
        Planey.setAltitude(500.0);
        Planey.setCurrentSpeedRestricted(1000);
        System.out.println(Planey);
        Planey.setCurrentSpeedRestricted(200);
        System.out.println(Planey);
    }
}