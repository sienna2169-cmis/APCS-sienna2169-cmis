/**
 * it merges, and sorts. voila. its also recursive wow. 
 * basically it splits until you can't split anymore (recursion!), then merges
 * Sienna :D
 * version uhm. 1
 */
public class MergeSort
{
    public static void main(String[] args) {
        int[] numbers = {1, 7, 5, 7, 9, 3,4};
        print(mergeSort(numbers)); 
    }  

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static int[] split(int[] splitArr, boolean whichHalf) {
        int[] piece;
        if (splitArr.length % 2 != 0 && whichHalf == false) { piece = new int[(splitArr.length/2) + 1];}
        else {piece = new int[(splitArr.length/2)];}
        if (whichHalf == true) {
            for (int i = 0; i < (splitArr.length/2); i++) {
                piece[i] = splitArr[i];
            }
        }
        else if (whichHalf == false) {
            int i2 = splitArr.length/2;
            if (splitArr.length % 2 != 0) {
                for (int i = 0; i < (splitArr.length/2) + 1; i++) {
                    piece[i] = splitArr[i2];
                    i2++;
                }}
            else {
                for (int i = 0; i < splitArr.length/2; i++) {
                    piece[i] = splitArr[i2];
                    i2++;
                }
            }
        }
        print(piece);
        return piece;
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] sorted = new int[arr1.length + arr2.length];
        int i2 = 0;
        int i3 = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (!(i2 == arr1.length  && i3 == arr2.length )) {
                if (i2 == arr1.length) {
                    sorted[i] = arr2[i3];
                    i3++;
                }
                else if (i3 == arr2.length) {
                    sorted[i] = arr1[i2];
                    i2++;
                }
                else{ 
                    if (arr1[i2] <= arr2[i3]) {
                        sorted[i] = arr1[i2];
                        i2++;

                    }
                    else  {
                        sorted[i] = arr2[i3];
                        i3++;

                    }
                }
            }
        }
        return sorted;
    }

    public static int[] mergeSort (int[] inputArr) {
        if (inputArr.length == 1) {return inputArr;}
        else if (inputArr.length > 1){
            int[] arr1 = split(inputArr, true);
            int[] arr2 = split(inputArr, false);

            return merge(mergeSort(arr1), mergeSort(arr2));
        }
        else {return inputArr;}
    }

    //Sienna is DONE. take THAT confusing recursion. Hah.
}
