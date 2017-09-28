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
        
         int a2[] = new int[5];
        a2[0] = 6;
        a2[1] = 2;
        a2[2] = 7;
        a2[3] = 0;
        a2[4] = 4;

        int another[] = new int[8];
        another[0] = 2;
        another[1] = 6;
        another[2] = 9;
        another[3] = 3;
        another[4] = 7;
        another[5] = 17;
        another[6] = 12;
        another[7] = 0;

        double b[] = new double[5];
        b[0] = 19.4;
        b[1] = 0.2;
        b[2] = 81.6;
        b[3] = 2.88;
        b[4] = 9.999;
        
        double b2[] = new double[5];
        b2[0] = 19;
        b2[1] = 0.8;
        b2[2] = 81;
        b2[3] = 3.0;
        b2[4] = 9.999;

        String c[] = new String[5];
        c[0] = "Hi";
        c[1] = "this";
        c[2] = "is";
        c[3] = "an";
        c[4] = "array!";

        //System.out.println(a[0]);
        //System.out.println(b[2]);
        //System.out.println(c[4]);

        //printArray(b, true);
        //printArray(c, false);
        //System.out.println(lastItem(a));
        //System.out.println(middleItem(a));
        //printArray(randomInts(5, 1, 3), true);
        //printArray(randomDoubles(6, 2.5, 3.6), true);
        //printArray(copy(a), true);

        //printArray(pairs(9), true);
        //printArray(concat(a, a), true);
        //printArray(merge(a, another), true);
        //reverse(a);
        //printArray(subArray(a, 1, 3), true);
        //printArray(compareArrays(a, a2), true);
        //printArray(minimize(a, 2), true);
        //maximize(a, 2);
        printArray(maxMerge(b, b2), true);

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

    public static int[] randomInts(int n, int min, int max) {
        int[] randomArray = new int[n];
        int randomNumber;
        for (int i = 0; i < randomArray.length; i++) {
            Random random = new Random();
            randomNumber = random.nextInt(max-min + 1) + min;
            randomArray[i] = randomNumber;
        }
        return randomArray;
    }         

    public static double[] randomDoubles(int n, double rangeMin, double rangeMax) {
        double[] randomArray = new double[n];
        int randomNumber;
        for (int i = 0; i < randomArray.length; i++) {
            Random r = new Random();
            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            randomArray[i] = randomValue;
        }
        return randomArray;

    }

    public static int[] copy(int[] a) {
        int[] copyArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int replacement = a[i];
            copyArray[i] = replacement;
        }
        return copyArray;
    }

    public static int[] pairs(int n) {
        int[] pairArray = new int[n * 2];
        int addedNum = pairArray.length / n;
        for (int i = 0; i < pairArray.length; i++) {
            if ( i % 2 == 0) {
                pairArray[i] = addedNum;
            } 

            if ( i % 2 != 0) {
                pairArray[i] = pairArray[i-1];
            }

            addedNum += 1;
        }
        return pairArray;
    }

    public static int[] concat(int[] a, int[] b) {
        int [] concatArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            concatArray[i] = a[i];
        }
        for (int i2 = 0; i2 < b.length; i2++) {
            concatArray[i2 + a.length] = b[i2];
        }
        return concatArray;

    }

    public static int[] merge(int[] a, int[] b) {

        int lesserArray = 0;
        int largerArray = 0;
        boolean aIsLonger = true;
        if (a.length > b.length) {
            lesserArray = b.length;
            largerArray = a.length;
            aIsLonger = true;
        }
        if (b.length > a.length) {
            lesserArray = a.length;
            largerArray = b.length;
            aIsLonger = false;
        }
        int[] mergeArray = new int[lesserArray*2];

        int[] arrayOne = new int[lesserArray];
        int[] arrayTwo = new int[lesserArray];

        for (int i = 0; i < lesserArray; i++) {
            arrayOne[i] = a[i];
            arrayTwo[i] = b[i];

        } 
        int i2 = 0;

        for (int i3 = 0; i3 < lesserArray; i3++) {
            if(i2 % 2 == 0 && i2 != mergeArray.length - 1) {
                mergeArray[i2] = arrayOne[i3];
                mergeArray[i2+1] = arrayTwo[i3]; }
            if (i2 % 2 != 0 && i2 != mergeArray.length - 1) {
                mergeArray[i2] = arrayTwo[i3];
                mergeArray[i2+1] = arrayOne[i3];
            } 
            else if(i2 == mergeArray.length - 1) {
                mergeArray[i2] = arrayOne[i3];
            }
            i2+=2;
        }

        int difference[] = new int[largerArray - lesserArray];
        if (aIsLonger == true) {     
            for (int last = 0; last < difference.length; last++) {
                difference[last] = a[lesserArray + last];
            }

        }
        else { 
            for (int last = 0; last < difference.length; last++) {
                difference[last] = b[lesserArray + last];
            }

        }

    
        return concat(mergeArray, difference);

    }
    public static void reverse(int[] array) {
    int i2 = 0;
    int copy[] = new int[array.length];
    for (int ic = 0; ic < array.length; ic++) {
    copy[ic] = array[ic];
    }
    for (int i = array.length - 1; i >= 0; i--) {
    array[i] = copy[i2];
    i2++;
    }
    
    printArray(array, true);
    }
    public static int[] subArray(int[] array, int start, int stop) {
    int length = stop - start;
    int subArray[] = new int[length];
    int count = 0;
    for (int i = start; i < stop; i++) {
    subArray[count] = array[i];
    count++;
    }
    return subArray;
    }
    public static int[] compareArrays(int[] a, int[] b) {
    int aCount = 0;
    int bCount = 0;
    int empty[] = new int[0];
    for (int i = 0; i < a.length; i++) {
    if (a[i] > b[i]) {
    aCount += 1;
    }
    if (b[i] > a[i]) {
    bCount += 1;
    }
    else { continue; }
    
    }
    
    if (aCount > bCount) {
    return a;
    }
    if (bCount > aCount) {
    return b;
    }
    else {return empty; }
    
    }
    public static int[] minimize(int[] array, int threshold) {
    int minimized[] = new int[array.length];
    for (int i = 0; i < array.length; i++) {
    minimized[i] = array[i];
    if (minimized[i] > threshold) {
    minimized[i] = threshold;
    } else {continue;}
    }
    return minimized;
    
    }
    public static void maximize(int[] array, int threshold) {
    int copy[] = new int[array.length];
    for (int ic = 0; ic < array.length; ic++) {
    copy[ic] = array[ic];
    }
    for (int i = 0; i < array.length; i++) {
    array[i] = copy[i];
    if (array[i] < threshold) {
    array[i] = threshold;
    } else {continue;}
    }
    
    printArray(array, true);
    }
    public static double[] maxMerge(double[] a, double[] b) {
    double output[] = new double[a.length];
    for (int i = 0; i < a.length; i++) {
    if (a[i] >= b[i]) {
    output[i] = a[i];
    }
    if (b[i] > a[i]) {
    output[i] = b[i];
    }
    }
    return output;
    
    }
}

//NOT DONE YET WOWOOW
