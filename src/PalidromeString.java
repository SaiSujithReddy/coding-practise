
public class PalidromeString {
	
	public static boolean findPalindrome(String variable)
	{
		String reverse = "";
		
		for(int i=0; i< variable.length();i++)
		{
			reverse =  variable.charAt(i) + reverse;
			System.out.println(reverse.toString());
		}
		reverse.equals(variable);
		
		return reverse.equals(variable);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var = "Hello!olleH";
		System.out.println(findPalindrome(var));

	}

}
