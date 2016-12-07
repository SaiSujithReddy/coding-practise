/**
 * Created by sai on 12/6/16.
 */
public class Palindrome_v1 {

    boolean findPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static void main (String[] args) {
        Palindrome_v1 obj = new Palindrome_v1();
        String string = "SasS";
        System.out.println(obj.findPalindrome(string));

    }

}



// **********************************************************************************************
// This is more INEFFICIENT than Palindrome.java

//http://componentsprogramming.com/palindromes/

// Time  - 2n+2⌊n/2⌋+16
// Space - 2n+16 elements