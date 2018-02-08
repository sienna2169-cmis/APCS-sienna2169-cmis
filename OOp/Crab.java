
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
   
   
    Crab(String _name, int _age, double _size, boolean gender){
    this.name = _name;
    if (this.size < 0) {
    _size = 0.0;
    }
    else {
    this.size = _size;
    }
    this.isMale = gender;
    this.age = _age;
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
    
    public double getChop() {
    return this.size /2;
    }
    
    public String getKnighted() {
    return "Sir " + this.name;
    }
    
    public int getYouth() {
    return this.age - (int)(Math.random() * this.age);
    }
    
    public boolean hormoneTreatment() {
    return !(this.isMale);
    }
    public String toString(){
    String out = "";
    out += "Name:" + name + "\n";
    out += "Age:" + age + "\n";
    out += "Size:" + size + "cm" + "\n";
    if (isMale == true) {
    out += "Gender: Male" + "\n";
    }
    else {
    out += "Gender: Female" + "\n";
    }
    return out;
    
    }
}
