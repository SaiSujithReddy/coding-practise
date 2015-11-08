/*Given an image represented by an NxN matrix, where each pixel in the image is
4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
place?*/

package ctci;
import java.util.ArrayList;
public class CTCI1dot6v1 {

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
