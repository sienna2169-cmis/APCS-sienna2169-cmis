/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int[] complete = new int[array.length];
        //ok yeah this does NOT work correctly
        //how about this: for loop in for loop. for loop is activated if its greater, only continues then
        for (int i = 0; i < array.length; i++) {
            
            if ( i != array.length - 1) {
            if (array[i] > array[i+1]){
            complete[i+1] = array[i];
            complete[i] = array[i+1];
            }
            else if (array[i] < array[i+1]) {
            complete[i] = array[i];
            complete[i+1] = array[i+1];
            }
        }
        
        else if (i == array.length - 1) {
            if (array[i] > array[i-1]) {
            complete[i] = array[i];}
            else if (array[i] < array[i-1] ) {
            complete[i] = array[i-1];
            complete[i-1] = array[i];
            }
            }

        }
        //UGH outofbounds exception -_________-
        for (int i2 = 0; i2 < array.length; i2++) {
            array[i2] = complete[i2];
        }
        //OK NO
        //THIS DOESNT WORK
        //HUI
        //HUI
        //gotta...cycle...through..
    }
}