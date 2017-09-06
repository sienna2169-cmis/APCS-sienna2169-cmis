
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
    
    //System.out.println(a[0]);
    //System.out.println(b[2]);
    //System.out.println(c[4]);
    
    printArray(b, true);
    printArray(c, false);
    System.out.println(lastItem(a));
    }
   public static void printArray(int a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if (b == false) {
       for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        } }
   public static void printArray(double a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if(b == false) {
       for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        }}
   public static void printArray(String a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if(b == false) {
         for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        }}
   public static void printArray(char a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if(b == false) {
         for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        }}
   public static void printArray(byte a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if(b == false) {
         for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        }}
   public static void printArray(short a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if (b == false) {
         for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        }}
   public static void printArray(long a[], boolean b) {
       if (b == true) {
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
        } 
       if (b== false) {
         for (int i = 0; i < a.length ; i++) {
        if(i % 2 == 0) {
        System.out.println(a[i]);
        }
        if(i%2 != 0) {continue;}
       }
        }}
        
   public static int lastItem(int a[]) {
        int length = a.length;
        return a[length-1];
        
        }
   public static double lastItem(double a[]) {
        int length = a.length;
        return a[length-1];
        
        }
   public static String lastItem(String a[]) {
        int length = a.length;
        return a[length-1];
        
        }     
   public static char lastItem(char a[]) {
        int length = a.length;
        return a[length-1];
        
        }
   public static short lastItem(short a[]) {
        int length = a.length;
        return a[length-1];
        
        }
   public static long lastItem(long a[]) {
        int length = a.length;
        return a[length-1];
        
        }
   public static byte lastItem(byte a[]) {
        int length = a.length;
        return a[length-1];
        
        }     
 
    }

