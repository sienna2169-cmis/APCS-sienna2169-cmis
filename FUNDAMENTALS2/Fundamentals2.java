
public class Fundamentals2
{
    
   public static void main(String [] args) {
    int a[] = new int[5];
    a[0] = 1;
    a[1] = 4;
    a[2] = 8;
    a[3] = 2;
    a[4] = 0;
    
    double b[] = new double[5];
    b[0] = 19.4;
    b[1] = 0.2;
    b[2] = 81.6;
    b[3] = 2.88;
    b[4] = 9.999;
    
    String c[] = new String[5];
    c[0] = "Hi";
    c[1] = "this";
    c[2] = "is";
    c[3] = "an";
    c[4] = "array!";
    
    System.out.println(a[0]);
    System.out.println(b[2]);
    System.out.println(c[4]);
    
    printArray(b, true);
    printArray(c, false);
    
    }
   public static void printArray(int a[], boolean b) {
       if (b = true) {
        for (int i = 1; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       else {
         for (int i = 1; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        }
    }
   public static void printArray(double a[], boolean b) {
       if (b = true) {
        for (int i = 1; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       else {
         for (int i = 1; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        }
                }
   
   public static void printArray( String a[], boolean b) {
        if (b = true) {
        for (int i = 1; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       else {
         for (int i = 1; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        }
    }
}
