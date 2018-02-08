
/**
 * Write a description of class Crab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Crab
{
   private String name;
   private int age;
   private double size;
   private boolean isMale;
   
   public Crab(String _name){
    this.name = _name;
    }
   public Crab(boolean gender) {
    this.isMale = gender;
    }
   public Crab(double _size) {
    if (this.size < 0) {
    _size = 0.0;
    }
    else {
    this.size = _size;
    }
    
    }
    public String getName() {
    return this.name;
    }
    public int getAge() {
    return this.age;
    }
    public double getSize() {
    return this.size;
    }
    public boolean maleOr() {
    return this.isMale;
    }
    public void setName(String _name) {
    this.name = _name;
    }
    public void setAge(int _age) {
    this.age = _age;
    }
    public void setSize(double _size) {
    this.size = _size;
    }
    public void setGender(boolean _isMale) {
    this.isMale = _isMale;   
    }
    
    public String toString(){
    String out = "";
    out += "name:" + name + "\n";
    out += "Age:" + age + "\n";
    out += "Height:" + size + "\n";
    return out;
    
    }
}
