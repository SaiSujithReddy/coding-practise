/*Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated
string.*/
package ctci;

public class CTCI1dot2v1ReverseNullTerminatedString {


//  TODO reverse method

static void reverse(String word)
{

//  TODO string.reverse()

StringBuilder stringBuilder = new StringBuilder(word);
Character temp;

for(int i=0;i<stringBuilder.length()/2;i++)
{
	temp = stringBuilder.charAt(i);
	stringBuilder.setCharAt(i,word.charAt(word.length()-i-1-1));
	stringBuilder.setCharAt(word.length()-i-1-1, temp);
}


System.out.println(stringBuilder);
}
public static void main (String[] args)
{
	long startTime = System.nanoTime();
	String word = new String();
word = "Hello&>h ";
// call reverse method
reverse(word);


long endTime = System.nanoTime();
System.out.println("Took "+(endTime - startTime) + " ns"); 
}


}

