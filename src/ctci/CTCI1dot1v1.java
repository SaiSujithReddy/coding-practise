/*Implement an algorithm to determine if a string has all unique characters. What
if you cannot use additional data structures?*/
package ctci;

public class CTCI1dot1v1
{
 static boolean findUnique(String word)
{
	for(int i=0; i< word.length();i++)
	{
		CharSequence someString;
		someString = word.subSequence(i, i+1);
		//System.out.println("someString is " + someString );
		
		if(word.substring(i+1).contains(someString))	
		{	
			return false;
		}
	}	
return true;
}
	public static void main (String[] args)
{
	String word = new String();
	word = "Bye! ";
	
	if(findUnique(word))
{
	System.out.println("Uniqueee");
}
else
System.out.println("Not unique");
}
}