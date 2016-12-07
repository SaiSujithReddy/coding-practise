package GeeksForGeeks;

/**
 * Created by sai on 12/6/16.
 */

//Check if a given string is a rotation of a palindrome
//http://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
/*
    Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1 using only one call to strstr routine?
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
     */

public class StringRotation_v1 {

    boolean findRotatedPalidrome(String string) {
        String reverse = "";
        char [] charStringArray = string.toCharArray();
        for(int i=charStringArray.length-1;i>-1;i--){
            reverse = reverse + charStringArray[i];
        }

        String completeString = string+reverse;
        int j =completeString.length()-1;
        int i =0;
        while(i<=j) {
            if(completeString.charAt(i) == completeString.charAt(j)) {
                i++;j--;
            } else {
                return false;

            }
        }

    return true;
    }

    public static void main(String[] args) {
        StringRotation_v1 obj = new StringRotation_v1();
        String string = "hiiiiii";
        String string2 = "ihiiiii";
        System.out.println(obj.findRotatedPalidrome(string));
    }

}

// major mistake
// if you initialize reverse with null it will printed as hinullih
// initialize reverse to "" rather than null



/*

The above solution is wrong, since it prints true for even "abcdefghij"
Solution:-
http://www.geeksforgeeks.org/check-given-string-rotation-palindrome/


 */