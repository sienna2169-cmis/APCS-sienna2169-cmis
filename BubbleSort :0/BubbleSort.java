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
            boolean higherYesNo = false;
            for (int i2 = i; i2 < array.length - i; i2++){
            if (array[i2] < array[i2+1]){
            complete[i2+1] = array[i2];
            }
            else if (array[i2] < array[i2+1] || i2 == array.length - i - 1) {
            continue;
            }
            }

        }
        //UGH outofbounds exception -_________-
        for (int i2 = 0; i2 < array.length; i2++) {
            complete[i2] = array[i2];
        }
    }
}