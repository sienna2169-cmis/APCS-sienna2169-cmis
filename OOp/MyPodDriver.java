
/**
 * Write a description of class MyPodDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPodDriver
{
    public static void main(String[] args) {
    String[] songs = new String[] {"Black", "Careless Whisper", "Piano Man"};
    MyPod carPod = new MyPod("White", 6, songs);
    
    String[] songs2 = new String[] {"Confusion", "Apple Tree", "Champion"};
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