
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
    add(4, 5);
    subtract(30, 5);
    multiply(8, 7);
    
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
     
     String longtext = "A long is a datatype used in a similar way to integer, byte, and short data.\n" 
     + "A long can be used to represent numbers and quantities.\n"
     + "Since a long has a wider range than int, it is often used in place of integers when a wider range is needed.\n"
     + "This means that long can be used in streams of data, lists, and other numerical data that usually would be represented by integers.\n";
     
     System.out.println(longtext);
     
     String floattext = "A float is a data type that is different from all the previous ones.\n"
     + "A float deals with numerical data including floating point numbers.\n" 
     + "However, a float is never used for precise values, i.e. currency. Therefore they are used for other sets of data that have decimal numbers.\n"
     + "Some examples of this are averages, converted fractions, and lists of decimal numbers.\n";
     
     System.out.println(floattext);
     
     String doubletext = "A double is a data type that is similar to a float.\n"
     + "Double is the default when it comes to decimal values. It is not used for precise values either, however.\n"
     + "Doubles can be used for any numerical data consisting of or including decimal numbers.\n"
     + "This includes lists of decimals, converted fractions, averages, etc.\n";
     
     System.out.println(doubletext);
     
     String booleantext = "A boolean data type represents one bit of information.\n"
     + "There are only two possible boolean values: true or false.\n"
     + "The boolean data type can be used for things that track true/false conditions.\n"
     + "As it binary, it can be related to raw data as well, and can be used to decide whether to execute certain code or not.\n";
     
     System.out.println(booleantext);
     
     String chartext = "A char data type is a single character, meaning that each unit of data equals exactly one character.\n"
     + "Char is used to store any character. This means it can be used in lists, to represent individual letters, abbreviations, etc.";
     
     System.out.println(chartext);
     //WOOOOOO I'M DONE!!!
    } 
    public static int add(int a, int b) {
    int intone = a;
    int inttwo = b;
    int sum = intone + inttwo;
    System.out.println(sum);
    return sum;
  
 }   
   public static int subtract(int a, int b) {
    int intone = a;
    int inttwo = b;
    int difference = intone - inttwo;
    System.out.println(difference);
    return difference;
 }  
    public static int multiply(int a, int b) {
    int intone = a;
    int inttwo = b;
    int product = intone * inttwo;
    System.out.println(product);
    return product;
 }  
    public static int divide(int a, int b) {
    int intone = a;
    int inttwo = b;
    int quotient = intone / inttwo;
    System.out.println(quotient);
    return quotient;
 }  
}