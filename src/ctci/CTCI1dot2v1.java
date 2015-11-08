/*Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated
string.*/
package ctci;

public class CTCI1dot2v1 {


//  TODO reverse method

static void reverse(String word)
{

//  TODO string.reverse()

StringBuilder stringBuilder = new StringBuilder(word);
Character temp;

for(int i=0;i<stringBuilder.length()/2;i++)
{
	temp = stringBuilder.charAt(i);
	//stringBuilder.setCharAt(index, ch);
	stringBuilder.setCharAt(i,word.charAt(word.length()-i-1));
	
	stringBuilder.setCharAt(word.length()-i-1, temp);
}


System.out.println(stringBuilder);
}
public static void main (String[] args)
{

	String word = new String();
word = "Hello&>h "+null;
// call reverse method
reverse(word);

}

}

