
/**
 * Write a description of class ClockStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockStore
{
   private Clock[] clocksInStock = new Clock[3];
   
   public static void main(String[] args) {
    ClockStore store1 = new ClockStore();
    store1.clocksInStock[0] = new Clock(11, 34, 05);
    store1.clocksInStock[1] = new Clock(02, 44, 17);
    store1.clocksInStock[2] = new Clock(13,05, 51);
    
    System.out.println(store1.toString());
    }
    int mostSeconds(){
     int highestNum = 0;
     int highestIndex = 0;
     for (int i = 0; i < clocksInStock.length; i++) {
        if (this.clocksInStock[i].totalSeconds() > highestNum) {
        highestIndex = i;
        highestNum = this.clocksInStock[i].totalSeconds();
        }
        
        }
    return highestIndex;
    }
    
    public String toString() {
    String object = "";
    for (Clock c : this.clocksInStock) {
    object += "Clock Option:\n" + c.toString();
    }
    
    return object;
    }
    }

