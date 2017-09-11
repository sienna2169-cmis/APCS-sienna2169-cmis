import java.util.*;
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
    System.out.println(middleItem(a));
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
   public static void printArray(boolean a[], boolean b) {
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
 
        //THIS DOESNT WORK WAIT
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
   public static boolean lastItem(boolean a[]) {
        int length = a.length;
        return a[length-1];
        
        }
public static int middleItem( int a[]) {
    int arrayLength = a.length;

    if (arrayLength % 2 == 0) {
    return a[(arrayLength /2) + 1];
    }
    else{ return a[(arrayLength -1)/2];}
}
public static double middleItem(double a[]) {
     int arrayLength = a.length;

    if (arrayLength % 2 == 0) {
    return a[(arrayLength /2) + 1];
    }
    else{ return a[(arrayLength - 1)/2];}}
public static String middleItem(String a[]) {
     int arrayLength = a.length;

    if (arrayLength % 2 == 0) {
    return a[(arrayLength /2) + 1];
    }
    else{ return a[(arrayLength - 1)/2];}}
public static boolean middleItem(boolean a[]) {
     int arrayLength = a.length;

    if (arrayLength % 2 == 0) {
    return a[(arrayLength /2) + 1];
    }
    else{ return a[(arrayLength - 1)/2];}}
 
public static /*int[]*/ void randomInts(int n, int min, int max) {
int[] randomArray = new int[n];
int randomNumber;
for (int i = 0; i < randomArray.length; i++) {
Random random = new Random();
randomNumber = random.nextInt(max-min + 1) + min;
randomArray[i] = randomNumber;
}
System.out.println(randomArray);
}         
//RANDOMINTS DOES N O T WORK IT JUST GIVES ME THIS BIG STRING OF GIBBERISH. HELP?
    }

