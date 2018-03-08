
/**
 * Write a description of class MyPod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MyPod
{
    // instance variables - replace the example below with your own
    private String color = "black";
    private int memory = 4;
    private ArrayList<Song> songs = new ArrayList<Song>(4);
    

    /**
     * Constructor for objects of class MyPod
     */
    public MyPod()
    {
        
    }

    public MyPod(String color_, int memory_, ArrayList<Song> songs_){
        this.color = color_;
        this.memory = memory_;
        for (Song song : songs_) {
            this.songs.add(song);

        }

    }    
    public String toString() {
        String object = "iPod Color: " + color + 
            "\nMemory: " + memory + " GB" + "\nSong Library: " + "\n";
            for (Song song : songs) {
            object += song.toString() + "\n";
            }
      
        return object;
    }

}
