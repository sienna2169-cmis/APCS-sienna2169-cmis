public class SelectionSort
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
        int lowest;
        int indexLeast;
        for (int i = 0; i < array.length -1 ; i++) {
            lowest = array[i];
            indexLeast = i;
            for (int i2 = 0; i2 < array.length; i2++) {
                
                if (array[i2] < lowest ) {
                    lowest = array[i2];
                    //array[i2] = array[indexLeast];
                    
                    //indexLeast = i2;
                    
                    
                    
                    
                    
                }
                
            }
            array[indexLeast] = lowest;
            

        }
    }
}