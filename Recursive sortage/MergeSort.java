
/**
 * Write a description of class MergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort
{
  public static void main(String[] args) {
    int[] numbers = {1, 5, 5, 7, 9, 3};
    print(mergeSort(numbers)); 
    
    
    }  
  public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }
  public static int[] split(int[] splitArr, boolean whichHalf) {
    int[] piece = new int[(splitArr.length/2)];
    
    if (whichHalf == true) {
    for (int i = 0; i < (splitArr.length/2); i++) {
    piece[i] = splitArr[i];
    }
    
    }
    else if (whichHalf == false) {
    int i2 = 0;
    for (int i = splitArr.length/2; i < splitArr.length; i++) {
    piece[i2] = splitArr[i];
    i2++;
    }
    }
    return piece;
    }
  public static int[] merge(int[] arr1, int[] arr2){
    int[] sorted = new int[arr1.length + arr2.length];
    int i2 = 0;
    int i3 = 0;
    print(arr1);
    print(arr2);
    for (int i = 0; i < sorted.length; i++) {
    System.out.println(i2);
    System.out.println(i3); 
   
    if (arr1[i2] <= arr2[i3]) {
    sorted[i] = arr1[i2];
    i2++;
    }
    else if (arr1[i2] > arr2[i3]) {
    sorted[i] = arr2[i3];
    i3++;
    }
    
    }
    return sorted;
    }
    
  public static int[] mergeSort (int[] inputArr) {
    if (inputArr.length == 1) {return inputArr;}
    int[] arr1 = split(inputArr, true);
    int[] arr2 = split(inputArr, false);
    int[] mergo = merge(arr1, arr2);
    mergeSort(mergo);
    return mergo;
    }
}

