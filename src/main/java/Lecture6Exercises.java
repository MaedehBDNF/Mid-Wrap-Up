import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long evenSum = 0;
        for (int i = 0 ; i <= arr.length -1 ; i++){
            if (i % 2 == 0) evenSum += arr[i];
        }
        return evenSum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] revArray = new int[arr.length];
        for (int i = 0 ; i <= arr.length -1 ; i++){
            revArray[i] = arr[arr.length - 1 - i];
        }
        return revArray;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][] productOfm1m2 = new double[m1.length][m2[1].length];

        for (int i = 0 ; i < m1.length ; i++){
            for (int j = 0 ; j < m2[i].length ; j++){
                for(int k = 0 ; k < m1[j].length ; k++){
                    productOfm1m2[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return productOfm1m2;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        return null;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        return null;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        return null;
    }
}
