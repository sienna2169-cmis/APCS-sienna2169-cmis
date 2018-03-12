public class MyPod
{
    // instance variables - replace the example below with your own
    private String color;
    private int memory;
    private Song[] songLibrary = new Song[3];
    

    /**
     * Constructor for objects of class MyPod
     */
    public MyPod()
    {
        color = "black";
        memory = 4;
        
        songLibrary[0] = new Song();
        songLibrary[1] = new Song();
        songLibrary[2] = new Song();
        
        
       
    }
    
    public MyPod(String color_, int memory_, Song[] songs){
    this.color = color_;
    this.memory = memory_;
    for (int i = 0; i < songLibrary.length; i++) {
        this.songLibrary[i] = songs[i];
        
        }
    
    
    }    
    public String toString() {
    String object = "iPod Color: " + color + 
    "\nMemory: " + memory + " GB" + "\nSong Library: " + "\n" + 
    "\n" + songLibrary[0].toString() + "\n" + songLibrary[1].toString() + "\n" + songLibrary[2].toString() + "\n";
    
    return object;
}
   
}