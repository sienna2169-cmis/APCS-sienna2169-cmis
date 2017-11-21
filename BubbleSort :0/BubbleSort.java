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
        boolean higherYes = true;
        int current;
        //ok yeah this does NOT work correctly
        //how about this: for loop in for loop. for loop is activated if its greater, only continues then
        for (int i = array.length -1; i > 0 ; i--) {

            for (int i2 = 0; i2< i; i2++){
                if (array[i2] < array[i2 + 1] ) {
                    current = array[i2];
                    array[i2] = array[i2 + 1];
                    array[i2 + 1] = current;

                }
            }
            //for (int i2 = 0; i2 < array.length; i2++) {
            //     array[i2] = complete[i2];
            // }
        }}}
