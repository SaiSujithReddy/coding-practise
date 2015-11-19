// Given two strings find if one is Substring of other
package ctci;

public class CTCI1dot9v1TwoStringsSubStrings
{

	public static void main (String [] args)

	{

		String S1 = new String();
		String S2 = new String();

		S1 = "Hello";
		S2 = "elloH";

		if(S1==null || S2 ==null)
		{
			System.out.println(" Both are null");
		}


		if(S1.length() != S2.length())
		{
			System.out.println(" Not a substring");
		}
		S1 = S1+S1;
		//if(substring(S2,S1))
		//Remove above line to make the code work
		{
			System.out.println("Yes a substring ");
		}

	}

}

