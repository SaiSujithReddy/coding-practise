package hackerrank;
import java.util.Scanner;
/**
 * Created by sai on 11/25/16.
 */
public class ScannerTest {
    public static void main (String [] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int arrayOfStringsLength = 4;
        String[] arrayOfStrings = new String[arrayOfStringsLength];
        arrayOfStrings[0] = input.next();
        System.out.println(arrayOfStrings[0]);
    }
}
