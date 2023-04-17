public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long a_i = 1;
        long a_I = 1; // By I we mean i + 1
        long a_n = 0;

        if (n == 1 || n == 2){
            return 1;
        } else {
            for (int i = 1 ; i <= n - 2 ; i++){
                a_n = a_i + a_I;
                a_i = a_I;
                a_I = a_n;
            }
            return a_n;
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String revWord = "";

        int i = 0;
        int lastIndex = word.length() - 1;
        while (i <= lastIndex){
            revWord += word.charAt(lastIndex - i);
            i++;
        }
        return revWord;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String lineIgnoreSpace = "";
        for (int i = 0; i <= line.length() -1; i++){
            if (line.charAt(i) != ' '){
                lineIgnoreSpace += line.charAt(i);
            }
        }
        String lineIgnoreSpaceAndCase = lineIgnoreSpace.toLowerCase();
        int lastIndex = lineIgnoreSpace.length() - 1;
        int meanChar = (int) Math.floor(lastIndex / 2);  // optimizing program by checking the first char till mean char.

        for(int i = 0; i <= meanChar; i++){
            if (lineIgnoreSpaceAndCase.charAt(i) != lineIgnoreSpaceAndCase.charAt(lastIndex - i)){
                return false;
            }
        }
        return true;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        return null;
    }
}
