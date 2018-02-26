
/**
 * Write a description of class MyPod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPod
{
    // instance variables - replace the example below with your own
    private String color;
    private int memory;
    private String[] songLibrary = new String[] {"","",""};
    

    /**
     * Constructor for objects of class MyPod
     */
    public MyPod()
    {
        color = "black";
        memory = 4;
        
        for (String song : songLibrary) {
        song = "white noise";
        
        }
       
    }
    
    public MyPod(String color_, int memory_, String[] songs){
    this.color = color_;
    this.memory = memory_;
    for (int i = 0; i < songLibrary.length; i++) {
        this.songLibrary[i] = songs[i];
        
        }
    
    
    }    
    public String toString() {
    String object = "iPod Color: " + color + 
    "\nMemory: " + memory + " GB" + "\nSong Library: " + "\n" + 
    songLibrary[0] + "\n" + songLibrary[1] + "\n" + songLibrary[2] + "\n";
    
    return object;
}
   
}
