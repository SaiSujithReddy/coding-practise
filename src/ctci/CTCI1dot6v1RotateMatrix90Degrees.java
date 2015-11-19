/*Given an image represented by an NxN matrix, where each pixel in the image is
4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
place?*/
/*
Rotate by +90:

Transpose
Reverse each row
Rotate by -90:

Transpose
Reverse each column
Rotate by +180:

Method 1: Rotate by +90 twice

Method 2: Reverse each row and then reverse each column

Rotate by -180:

Method 1: Rotate by -90 twice

Method 2: Reverse each column and then reverse each row

Method 3: Reverse by +180 as they are same




private static void transpose(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        }
    }
    
public static void swapRows(int[][] m) {
    for (int  i = 0, k = m.length - 1; i < k; ++i, --k) {
        int[] x = m[i];
        m[i] = m[k];
        m[k] = x;
    }
}

*/


package ctci;
import java.util.ArrayList;
public class CTCI1dot6v1RotateMatrix90Degrees {

	static int N =4;


	static void printMatrix(int[][] matrixA)
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(matrixA[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

	}
	// TODO rotate
	static int[][] rotateMatrix(int[][] matrixA)
	{

		// TODO create matrix B of same size
		int[][] matrixB = new int[N][N];
		ArrayList<Integer> aList = new ArrayList<Integer>();
		// TODO each row to arrayList and make it  column

		for(int i=0;i<N;i++)
		{
			for(int j=0; j<N;j++) 
			{
				aList.add(matrixA[i][j]);
			}
		}
		System.out.println(aList);
int k =0;

			for(int i=0;i<N;i++)
			{
				for(int j=0; j<N;j++) 
				{
					matrixB[j][N-i-1] = aList.get(k);
					k++;
				}
			}
		
		printMatrix(matrixB);
		return matrixB;


		// TODO take first row and make it last column of B - Do until last row

	}

	public static void main (String[] args)
	{



		int[][] matrixA = new int[N][N];
		int z =0;
		for(int i=1; i<=N;i++)
		{
			for (int j=1;j<=N;j++)
			{
				matrixA[i-1][j-1] = z;
				z++;
			}
		}
		System.out.println(matrixA);

		// TODO check null matrix
		printMatrix(matrixA);
		if(matrixA.length==0)
		{

			System.out.println("MatrixA is empty");

		}

		else 

		{
			rotateMatrix(matrixA);
		}

		// TODO call rotate method

	}

}
