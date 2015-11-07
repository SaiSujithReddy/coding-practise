import java.util.Scanner;


public class BigArray {
	
	static long add(long a, long b)
	{
		return a+b;
	}
	
	static long addElementsOfArray(int [] array)
	{
		long sum =0;
		for(int i=0; i< array.length; i++)
		{
			sum = add(sum,array[i]);
		}
		System.out.println(sum);
		return sum;			
	}
	
	
	static int [] printStringArray(String[] array, int length_of_array)
	{
		int [] array_integer = new int[length_of_array];
		
		for(int i=0;i<length_of_array;i++)
		{
			array_integer[i] = Integer.parseInt(array[i]);
		}
		
		//printIntegerArray(array_integer);
		
		return array_integer;
	}
	
	
	static void printIntegerArray(int[] array)
	{
		for(int i=0; i< array.length;i++)
			{
				System.out.println(array[i]);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int array_length = Integer.parseInt(input.nextLine());

		String array_string = input.nextLine();

		String[] array_string_new =array_string.split("\\s+");
		
		int [] array_integers = new int[array_length];
		addElementsOfArray(printStringArray(array_string_new, array_length));
		
	}

}
