import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class DiagonalDifference {
	
	static void printMatrix(int[][] matrix, int size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println(matrix[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int array_length = Integer.parseInt(input.nextLine());
		String array_string =null;
		ArrayList<String> arrayList = new ArrayList<String>();	
		for(int i=0;i<array_length;i++)
		{
			array_string = input.nextLine();
			arrayList.addAll(Arrays.asList(array_string.split("\\s+")));
		
		}
/*		System.out.println("hello doctor");
		System.out.println(arrayList.toString());*/
		
		int [][] matrix = new int[array_length][array_length];
		int k=0;
			for(int i=0; i< array_length; i++)
			{
				for(int j=0; j< array_length; j++)
				{
/*					System.out.println("Array Length is " + array_length);
					System.out.println(" doctor");
					System.out.println(arrayList.get(k));*/
					matrix[i][j] = Integer.parseInt(arrayList.get(k));
					k++;
				}
			}
		
		//printMatrix(matrix,array_length);
		
		int diagonal1 =0;
		int diagonal2 =0;		
		for(int i=0; i < array_length;i++)
		{
			diagonal1 = diagonal1 + matrix[i][i];
			diagonal2 = diagonal2 + matrix[i][array_length-i-1];
		}
		System.out.println(diagonal1);
		System.out.println(diagonal2);
		
		System.out.println(Math.abs(diagonal1 - diagonal2));
		
	}

}
