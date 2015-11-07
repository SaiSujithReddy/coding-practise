package ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CTCI1dot1v3 {

	static boolean findUnique(String word)
	{

		//if length of string > 256 reject it
		if(word.length()>256)
		{
			return false;
		}
		else
		{
			//Keep each char in ArrayList by splitting word in to characters
			ArrayList<Character> arrayListCharacters = new ArrayList<Character>();

			for (char character : word.toCharArray())
				arrayListCharacters.add(character);

			//Add each character in to Hashmap, while verifying for any existing character - lookout for null while adding first character
			HashSet<Character> map = new HashSet<Character>();
			for(Character character : arrayListCharacters)
			{
				if(map.contains(character))
				{
					return false;
				}
				else
				{
					map.add(character);
				}
			}

			return true;
			//If all characters are in hashset return true else false 
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = new String();
		word = "Helo?>*h";
		if(findUnique(word))
		{
			System.out.println("Uniqueee");
		}
		else
			System.out.println("Not unique");
	}

}
