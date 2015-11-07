import java.util.Scanner;


public class StairCase {
	
	private static Scanner input;
	
	static void constructStairCase(int height)
	{
		for(int i=0;i<height;i++)
		{
			int j=0;
			while(height-j-i-1>0)
			{
				System.out.printf(" ");
				j++;
			}
			while(j<height)
			{
				System.out.printf("#");
				j++;
			}
			System.out.println();
			
		}
	}

	public static void main (String[] args)
	{
		input = new Scanner(System.in);
		int heightOfStairCase = Integer.parseInt(input.nextLine());
		
		constructStairCase(heightOfStairCase);
	}

}
