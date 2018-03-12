
/**
 * Write a description of class MyPod2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MyPod2
{
    // instance variables - replace the example below with your own
    private String color;
    private int storage;
    private ArrayList<Song> songLibrary = new ArrayList<Song>(3);

    public MyPod2(){
    songLibrary.add(new Song());
    songLibrary.add(new Song());
    songLibrary.add(new Song());
    color = "White";
    storage = 4;
    }
    public String toString(){
    return "Color" + color + "Storage" + storage + "Songs:" + "\n" + songLibrary.get(0).toString();
    }
    public static void main(String[] args) {
    MyPod2 pod = new MyPod2();
    System.out.println(pod.songLibrary.size());
    System.out.println(pod.toString());
    
    }
    
    
}
