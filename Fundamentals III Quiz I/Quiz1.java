
/**
 * Write a description of class Quiz1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quiz1
{

    public static void main(String[] args){
        int[][] scores1 = new int[10][10];
        for(int y = 0; y < scores1.length; y++){
            for(int x = 0; x < scores1[0].length; x++){
                if(Math.random() > 0.95){
                    scores1[y][x] = 1;
                }else{
                    scores1[y][x] = 0;
                }
            }
        }
        int[][] scores2 = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
            };

        System.out.println("Test 1\n======");
        printArray(scores1);
        crossOut(scores1);
        printArray(scores1);

        System.out.println("Test 2\n======");
        printArray(scores2);
        crossOut(scores2);
        printArray(scores2);
    }

    public static void printArray(int[][] array){
        System.out.print("{");
        for(int r = 0; r < array.length; r++){
            int[] row = array[r];
            System.out.print("{");
            for(int c = 0; c < row.length;c++){
                System.out.print(row[c] + (c < row.length-1 ? ", " : ""));
            }
            System.out.print("}"+(r < array.length-1 ? ",\n" : ""));
        }

        System.out.println("}\n");            
    }

    /**
     * For each column that contains a 1, replace every value in that column with 1.
     * For each row that contains a 1, replace every value in that row with 1.
     * 
     * Sample out put from call to main(); Note: Array from Test 1 contains random values.
    Test 1
    ======
    Before
    ------
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}
    After
    -----
    {{0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0}}
    Test 2
    ======
    Before
    ------
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}
    After
    -----
    {{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}}
     */
    public static void crossOut(int[][] array){
        int count = 0;
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
                if (array[y][x] == 1) {
                    count +=1;

                }
            }
        }

        int[] hrLocations = new int [count];
        int[] vrLocations = new int [count];
        int onesCounted = 0;
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
                if (array[y][x] == 1) {
                    vrLocations[onesCounted] = x;
                    hrLocations[onesCounted] = y;
                    onesCounted +=1;

                }
            }
        }
        int numbersUsed = 0;
        int numbersUsed2= 0;
        for(int y = 0; y < array.length; y++){
           if (y == hrLocations[numbersUsed] && numbersUsed != hrLocations.length - 1){
                for (int x = 0; x < array[y].length; x++) {
                array[y][x] = 1;
                
                }
                numbersUsed += 1;
            }
           if (hrLocations[numbersUsed] < y && numbersUsed != hrLocations.length -1) {
            numbersUsed += 1;
            }
            else if (y == hrLocations[numbersUsed] && numbersUsed == hrLocations.length){
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = 1;
                
                }
            }
        }

        for (int x = 0; x < array[0].length; x++) {
            if (x == vrLocations[numbersUsed2] && numbersUsed2 != vrLocations.length - 1){
                for (int y = 0; y < array.length; y++) {
                array[x][y] = 1;
                
                }
                numbersUsed2 += 1;
            }
            else if (x == vrLocations[numbersUsed2] && numbersUsed2 == vrLocations.length){
            for (int y = 0; y < array.length; y++) {
                array[x][y] = 1;
                
                }
            }
        }
    }
}

