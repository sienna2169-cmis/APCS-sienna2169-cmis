public class ArrayMungerSol
{
    public static void main(String[] args){
        int[] a = {1, 1, 2, 2, 4, 5, 2};
        int[] b = {1, 1, 3, 9, 6, 2};
        int[] r = munge(a, b);
        for(int i: r){
            System.out.println(i);
        }
    }

    /**
     * Write a method that takes 2 integer arrays as arguments.
     * It should return the the array for which the sum of the first, last, and middle values is the greatest.
     * If the sum is equal, it should return an array that contains the sum of the first values, 
     * the sum of the middle values, and the sum of the last values.
     */
    public static int[] munge(int[] arr1, int[] arr2){
        int middle1 = 0; int middle2 = 0;

        int first1 = arr1[0];
        if (arr1.length % 2 == 0) {middle1 = arr1[(arr1.length/2) - 1];}
        else if (arr1.length % 2 != 0) {middle1 = arr1[(arr1.length-1)/2]; }
        int last1 = arr1[arr1.length - 1];

        
        int first2 = arr2[0];
        if (arr2.length % 2 == 0) {middle2 = arr2[(arr2.length/2) -1];}
        else if (arr2.length % 2 != 0) {middle2 = arr2[(arr2.length-1)/2]; }
        int last2 = arr2[arr2.length - 1];

        int sum1 = first1 + middle1 + last1;
        int sum2 = first2 + middle2 + last2;

        if (sum1 > sum2) {
            return arr1;
        }
        else if (sum2 > sum1) {
            return arr2;
        }
        else {
            int[] equalSums = new int[3];
            equalSums[0] = first1 + first2;
            equalSums[1] = middle1 + middle2;
            equalSums[2] = last1 + last2;

            return equalSums;
        } 

    }
}