
/**
 * Write a description of class SongDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SongDriver
     */
 
    
       private double length;
       private String name;
       private int chartNum;
       
  public Song() {
    length = 0.0;
    name = "";
    chartNum = 0;
    }
  public Song(String _name, double _length, int _chartNum){
    this.name = _name;
    if (this.length < 0) {
    length = 0.0;
    }
    else {
    this.length = _length;
    }
    this.chartNum = _chartNum;
    }
  
    public String toString(){
    String out = "";
    out += "name:" + name + "\n";
    out += "Length:" + length + "\n";
    out += "Chart Number:" + chartNum + "\n";
    return out;
    
    }
    
}
