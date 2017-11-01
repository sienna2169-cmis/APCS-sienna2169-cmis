import java.util.*;
import java.util.Random;
/**
 * Write a description of class Fundamentals3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundamentals3 {
    public static void main(String[] args) {
        int[][] array1 = new int[5][];

        int[][] array2 =  {  
                {0, 2, 6, 1, 1},
                {3, 7, 8, 4, 7},
                {1, 1, 9, 0, 2},
                {2, 4, 2, 7, 2},
                {7, 5, 9, 4, 3}};      
        String[][] checkerboardArray = {
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"}  };

        print2DArray(checkerboardArray, false);

        //initializeArray(array2, 1);
        //print2DArray(array2, true);

        //snakePrint(array2);
        locate(checkerboardArray);
        print2DArray(checkerboardArray, false);

    }

    public static void print2DArray(int[][] array, boolean rowMajor) {
        if (rowMajor == true) {
            for (int i = 0; i < array.length; i++) {
                int i2 = 0;
                while (i2 < array[i].length) {
                    if (i2 != array[i].length -1) {System.out.format(array[i][i2] + " ");}
                    else if (i2 == array[i].length -1) {
                        System.out.format(array[i][i2] + " ");
                        System.out.println();
                    }
                    i2++;

                }

            } 
        }
        else if (rowMajor == false) {
            int rowLength = array[0].length;
            for (int i2 = 0; i2 < rowLength; i2++){
                int i = 0;
                while (i < array.length) {
                    if (i != array.length - 1) {System.out.format(array[i][i2] + " ");}
                    if (i == array.length - 1) {
                        System.out.format(array[i][i2] + " ");
                        System.out.println();
                    }
                    i++;
                }

            }

        }
    }

    public static void print2DArray(String[][] array, boolean rowMajor) {
        if (rowMajor == true) {
            for (int i = 0; i < array.length; i++) {
                int i2 = 0;
                while (i2 < array[i].length) {
                    if (i2 != array[i].length -1) {System.out.print(array[i][i2] + " ");}
                    else if (i2 == array[i].length -1) {
                        System.out.print(array[i][i2] + " ");
                        System.out.println();
                    }
                    i2++;

                }

            } 
        }
        else if (rowMajor == false) {
            int rowLength = array[0].length;
            for (int i2 = 0; i2 < rowLength; i2++){
                int i = 0;
                while (i < array.length) {
                    if (i != array.length - 1) {System.out.print(array[i][i2] + " ");}
                    if (i == array.length - 1) {
                        System.out.print(array[i][i2] + " ");
                        System.out.println();
                    }
                    i++;
                }

            }

        }
    }

    public static void setValue(int[][] arr, int r, int c, int v) {
        arr[r][c] = v;

    }

    public static void setValue(String[][] arr, int r, int c, String v) {
        arr[r][c] = v;

    }

    public static void setValue(double[][] arr, int r, int c, double v) {
        arr[r][c] = v;

    }

    public static void initializeArray(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            int i2 = 0;
            while (i2 < array[i].length) {
                array[i][i2] = value;
                i2++;
            }
        }
    }

    public static void initializeArray(double[][] array, double value) {
        for (int i = 0; i < array.length; i++) {
            int i2 = 0;
            while (i2 < array[i].length) {
                array[i][i2] = value;
                i2++;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value) {
        for (int i = 0; i < array.length; i++) {
            int i2 = 0;
            while (i2 < array[i].length) {
                array[i][i2] = value;
                i2++;
            }
        }
    }

    public static void initializeArray(String[][] array, String value) {
        for (int i = 0; i < array.length; i++) {
            int i2 = 0;
            while (i2 < array[i].length) {
                array[i][i2] = value;
                i2++;
            }
        }
    }

    public static void snakePrint(int[][] arr) {
        int rownum = arr.length;
        int numnum = arr[0].length;
        for (int i = 0; i < rownum; i++) {
            if (i % 2 == 0) {
                for (int i2 = 0; i2 < numnum; i2++) {
                    System.out.print(arr[i][i2] + " ");
                }
            }
            if (i % 2 != 0) {
                for (int i2 = numnum - 1; i2 >= 0; i2--) {
                    System.out.print(arr[i][i2] + " ");
                }
            }

        }

    }

    public static String[][] locate(String[][] arr) {
        int totalbits = arr.length * arr[0].length;
        int hashnum = 0;
        if (totalbits % 2 != 0 ) {hashnum = (totalbits/2) + 1;}
        else if (totalbits % 2 == 0) {hashnum = totalbits/2;}
        int min = 0;
        int max = hashnum;
        int thing = hashnum;

        Random random = new Random();

        double rand = Math.random() * 10.0;
        int modified = (int) rand;
        boolean hasBeenReplaced = false;

        Random rande = new Random();

        boolean val = true; // this here is whats wonkey
        int randomNumber = random.nextInt(thing) + min;

        for (int i = 0; i < arr.length; i++) {
            int i2 = 0;
            if (i != 0) {thing = thing - (hashnum/arr.length);}

            while (i2 < arr[i].length) {
                if (thing != 0) {randomNumber = random.nextInt(thing) + min;}
                else if (thing == 0) {randomNumber = 0;}

                if (randomNumber != 0) { val = false;}
                else {val = true;}
                if (arr[i][i2].equals("#") && hasBeenReplaced == false){
                    if (val == true) {
                        arr[i][i2] = Integer.toString(modified);
                        hasBeenReplaced = true;
                    }

                }

                i2++;
            }
            
            
//styll tryna make this work. hm
        }
        System.out.println(val);
        System.out.println(randomNumber);
        System.out.println(thing);
        return arr; 
    } 

}

