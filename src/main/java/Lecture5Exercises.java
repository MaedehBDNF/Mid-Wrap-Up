public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String password = "";
        for (int i = 1 ; i <= length; i++) {
            int ascii_code = (int) Math.floor((Math.random() * 26) + 97);
            char c = (char) ascii_code;   // a = 97 ... z = 122
            password += c;
        }
        return password;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        if (length < 3){
            throw new Exception("The length must be at least 3!");
        } else {
            String password = "";
            int i = 0;
            while (i < length) {
                int asciiCode = (int) Math.floor((Math.random() * 26) + 97);
                char c = (char) asciiCode;   // a = 97 ... z = 122
                password += c;
                i++;
                if (i == length) break;

                int num = (int) Math.floor(Math.random() * 10);
                password += num;
                i++;
                if (i == length) break;

                int asciiSpecialChar = (int) Math.floor((Math.random() * 15) + 33);
                char ch = (char) asciiSpecialChar;   // ! = 33 ... / = 47
                password += ch;
                i++;
                if (i == length) break;
            }
            return password;
        }
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        return false;
    }
}
