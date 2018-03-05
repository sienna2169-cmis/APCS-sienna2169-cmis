
/**
 * Write a description of class MyPodDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MyPodDriver
{
    public static void main(String[] args) {
        ArrayList<Song> songs1 = new ArrayList<Song>(3);
        songs1.add(new Song("pink", 2));
        songs1.add(new Song("apple tree", 20));
        songs1.add(new Song("back in black", 3));

        MyPod carPod = new MyPod("White", 6, songs1);
        
        ArrayList<Song> songs2 = new ArrayList<Song>();
        
        MyPod myPod = new MyPod("Pink", 4, songs2);
        
        MyPod[] pods = new MyPod[2];
        pods[0] = carPod;
        pods[1] = myPod;

        for (MyPod pod : pods) {
            System.out.println(pod.toString());
            System.out.println();
        }

    }
}