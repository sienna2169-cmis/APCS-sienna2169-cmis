
/**
 * Write a description of class MyPodDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPodDriver
{
    public static void main(String[] args) {
    Song[] songs = new Song[3];
    songs[0] = new Song();
    songs[1] = new Song();
    songs[2] = new Song();
    
    MyPod carPod = new MyPod("White", 6, songs);
    
    Song[] songs2 = new Song[3];
    songs2[0] = new Song();
    songs2[1] = new Song();
    songs2[2] = new Song();
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