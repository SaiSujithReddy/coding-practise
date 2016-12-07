package coderust;

/**
 * Created by sai on 12/1/16.
 */

//ReverseWordsInASentence

public class ReverseWordsInASentence_v3 {

    void swapChar(char[] sentence, int start,int end) {
            char temp = sentence[start];
            sentence[start] = sentence[end];
            sentence[end] = temp;
    }


    char[] reverseAWord( String sentence) {

        int i = sentence.length()-1;
        int j =0;

        char[] sentenceCharArray = sentence.toCharArray();
        while(i>=j) {
            swapChar(sentenceCharArray,i,j);
            i--;
            j++;
        }
        return sentenceCharArray;
    }


    public static  void main (String[] args) {

        ReverseWordsInASentence_v3 obj = new ReverseWordsInASentence_v3();

        String sentence = "Sujith how are you";

        char[] hi = obj.reverseAWord(sentence);

        System.out.println(hi);

    }
}




// .replace function iterates through the entire array