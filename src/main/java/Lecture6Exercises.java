import java.util.ArrayList;
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
        List<List<String>> finalList = new ArrayList<>();

        for (int i = 0; i < names.length; i++){
            ArrayList<String> row_i = new ArrayList<String>();
            for (int j = 0; j < names[i].length; j++) {
                row_i.add(names[i][j]);
            }
            finalList.add(row_i);
        }
        return finalList;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        ArrayList<Integer> primes = primesLessThanNumber(n);

        for (int divisor : primes){
            if (n % divisor == 0){
                if (!factors.contains(divisor)){
                    factors.add(divisor);
                    n /= divisor;
                }
            }
        }
        return factors;
    }

    public static ArrayList<Integer> primesLessThanNumber(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0)
                    counter = counter + 1;
            }
            if (counter == 2)
                primes.add(i);
        }
        return primes;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words = new ArrayList<String>();
        String[] splitString = line.split("[^\\w]+");

        for (String word : splitString){
            words.add(word);
        }
        return words;
    }
}
