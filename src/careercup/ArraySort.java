package careercup;

import java.util.Arrays;

public class ArraySort
{
	String[] A = {"C","D","E","F","G"};

	int [] B = {3,0,4,1,2};

	String tempValueArrayA;
	int tempValueArrayB;
	
	void printStringArray(String[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
		System.out.println();
	}
	
	void printIntArray(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
		System.out.println();
	}

	 private void swap (int desiredPosition,int currentPosition)
	{
		tempValueArrayA =  A[desiredPosition];
		A[desiredPosition] = A[currentPosition];
		A[currentPosition] = tempValueArrayA ;

		tempValueArrayB =  B[desiredPosition];
		B[desiredPosition] = B[currentPosition];
		B[currentPosition] = tempValueArrayB ;
	}
	// TODO method arrange
	 void arrange(String[] A, int[] B)
	{
		//take first element in B and place it in correct position 
		printStringArray(A);
		printIntArray(B);
		
		for(int i=0; i<A.length;i++)
		{
     			if(i != B[i])
			{
				System.out.println("tempDesiredPosition " + B[i] + "A[i] is" + i);
				swap(B[i],i);
			}
		}
	}
}


