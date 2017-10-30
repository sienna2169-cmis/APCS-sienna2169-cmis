
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
        print2DArray(array2, true);
        //print2DArray(array2, false);

        //initializeArray(array2, 1);
        //print2DArray(array2, true);
        
        snakePrint(array2);

    }

    public static void print2DArray(int[][] array, boolean rowMajor) {
        if (rowMajor == true) {
            for (int i = 0; i < array.length; i++) {
                int i2 = 0;
                while (i2 < array[i].length) {
                    if (i2 != array[i].length -1) {System.out.format("%3d",array[i][i2]);}
                    else if (i2 == array[i].length -1) {
                        System.out.format("%3d",array[i][i2]);
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
                    if (i != array.length - 1) {System.out.format("%3d",array[i][i2]);}
                    if (i == array.length - 1) {
                        System.out.format("%3d", array[i][i2]);
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
}
