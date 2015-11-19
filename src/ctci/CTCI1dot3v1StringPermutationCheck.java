//Given two strings, write a method to decide if one is a permutation of the other.

package ctci;
import java.util.HashSet;
import java.util.ArrayList;
public class CTCI1dot3v1StringPermutationCheck {

// TODO method
static boolean findIfPermuation(String A, String B)
{
	// check for null case 
	if(A ==null | B == null)
	{
		if(A ==null && B == null)
		{
			return true;
		}
		else 
			return false;
	}

ArrayList<Character> alCharacter = new ArrayList<Character>();

// TODO spliut string B in to arraylist and then put in hashset B
for(Character character: B.toCharArray())
{
	alCharacter.add(character);
}

HashSet<Character> hashsetCharacter = new HashSet<Character>();

for(Character char1: alCharacter)
{
hashsetCharacter.add(char1);
}

// TODO check if each key of B is there in String A

for(int i=0; i<A.length();i++)
{
	if(!hashsetCharacter.contains(A.charAt(i)))
{
	return false;
}
}

return true;

// TODO get each character of the string and verify

}
public static void main (String[] args)
{
// TODO declare string

String A = new String();
String B = new String();
//A = "H ";
//A = null;
A = " ";
B = "He llo";



// 

// TODO call method

if(findIfPermuation(A,B))
System.out.println("A is a permutation of B");
else System.out.println("A is NOT a permutation of B");


}

}
