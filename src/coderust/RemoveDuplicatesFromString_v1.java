package coderust;
import java.util.HashSet;

public class RemoveDuplicatesFromString_v1 {

    char[] removeDuplicate(String sentence) {

        char[] sentenceCharArray = sentence.toCharArray();

        HashSet hashSet = new HashSet<Character>();

        for(int i=0;i<sentenceCharArray.length; i++) {

            if(!hashSet.contains(sentenceCharArray[i])) {
                hashSet.add(sentenceCharArray[i]);
            }
            else {
                sentenceCharArray[i] = ' ';
            }
        }
        return sentenceCharArray;

    }

    public static void main (String[] args) {

        String sentence = "Sujith how are you";
        RemoveDuplicatesFromString_v1 obj = new RemoveDuplicatesFromString_v1();
        char[] newCharArray = obj.removeDuplicate(sentence);
        for(int i=0; i<newCharArray.length;i++) {
            if(i != ' ') {
                System.out.print(newCharArray[i]);
            }
        }
        System.out.println();
    }
}


