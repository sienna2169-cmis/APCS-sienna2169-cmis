public class FundamentalsQuiz1
{
    public static void main(String[] args){
        int numberone = 3;
        int numbertwo = 4;
        int result1 = squaresum(numberone, numbertwo);
        System.out.println(result1);
        
        double one = 2.5;
        double two = 3.5;
        double three = 7.5;
        double result2 = average(one, two, three);
        System.out.println(result2);
    }
    public static int squaresum(int a, int b) {
    int squarea = a * a;
    int squareb = b * b;
    return squarea + squareb;
    
    }
    public static double average(double a, double b, double c) {
    double totalsum = a + b + c;
    double average = totalsum / 3;
    return average;
    
    }
    /*
     * #1 Write a method that returns the sum of the squares 
     * of 2 whole numbers given as arguments.
     * 
     * #2 Call the method from the main method. The call
     * should get its arguments from variables declared 
     * in the main method.
     */
    
    /*
     * #3 Write a method that returns the average of 3 decimals
     * given as arguments.
     * 
     * #4 Call the method from the main method. The call should get its 
     * arguments from variables declared in the main method.
     */

}