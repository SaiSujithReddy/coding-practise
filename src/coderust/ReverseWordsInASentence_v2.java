package coderust;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

/**
 * Created by sai on 12/1/16.
 */

//ReverseWordsInASentence

public class ReverseWordsInASentence_v2 {


    void reverseAWord( String i) {

        String delimit = " ";
        List words  = Arrays.asList(i.split(delimit));
        Collections.reverse(words);
        System.out.println(String.join(delimit,words));
    }


    public static  void main (String[] args) {

        String sentence = "Sujith how are you";

        ReverseWordsInASentence_v2 obj = new ReverseWordsInASentence_v2();

        obj.reverseAWord(sentence);
    }
}




//http://codereview.stackexchange.com/questions/37364/reversing-words-in-a-string

// remember there is a extra space after uoy in the output.

// time complexity - O(2*n)
// space complexity - O(n)