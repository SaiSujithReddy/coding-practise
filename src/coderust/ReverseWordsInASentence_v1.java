package coderust;

/**
 * Created by sai on 12/1/16.
 */

//ReverseWordsInASentence

public class ReverseWordsInASentence_v1 {


    void reverseAWord( String i) {
        for(int k=i.length()-1;k>-1;k--) {
            System.out.print(i.charAt(k));
        }
    }


    public static  void main (String[] args) {

        String sentence = "Sujith how are you";

        ReverseWordsInASentence_v1 obj = new ReverseWordsInASentence_v1();

        String [] strinArray = sentence.split(" ");
        for(String string : strinArray) {
            obj.reverseAWord(string);
            System.out.print(" ");
        }
    }
}






// time complexity - O(2*n)
// space complexity - O(n)