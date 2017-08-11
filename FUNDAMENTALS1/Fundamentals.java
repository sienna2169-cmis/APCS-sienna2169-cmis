
/**
 * Write a description of class DataTypes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundamentals
{
  public static void main(String[] args) {
    dataTypes();
    }
  public static void dataTypes() {
     byte a = 20;
     System.out.println(a); 
  
     short b = 25000; 
     System.out.println(b); 
     
     int c = 500;
     System.out.println(c);
     
     long d = 5000000L;
     System.out.println(d);
     
     float e = 345.87f;
     System.out.println(e);
     
     double f = 56.7;
     System.out.println(f);
     
     char g = 'S';
     System.out.println(g);
     
     boolean h = true;
     System.out.println(h);
     
     String bytetext = "A byte is a data type, usually used in place of integers, that is used to save space in large arrays.\n"
     + "It can be used to represent numbers, such as prices and quantities. Bytes are often used when working with a stream of data (like from a file).\n" 
     + "They can be used in large amounts of data because they use up less storage than integer data.\n" 
     + "I imagine they could also be used for binary data, or for long lists in limited storage.\n" ; 
     
 
     System.out.println(bytetext);
     
     String shorttext = "A short is a 16-bit data type. \n" 
     + "Just like a byte, a short can be used to save memory, and is also used in place of integers.\n" 
     + "Shorts can be used in lists or streams of data in order to conserve memory, instead of bytes.\n";
     
     System.out.println(shorttext);
     
     String inttext = "An integer is a very common data type used if you have storage to spare. \n"
     + "An integer is usually used as the default data type, in fact. \n"
     + "Integers can be used to show quantities, used in lists, and any numerical data where memory is not a concern.\n" ;
     
     System.out.println(inttext);
     
     String longtext = "";
     
    } 
    

      
 }   

