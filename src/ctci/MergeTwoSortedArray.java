//You are given two sorted arrays, A and B, where A has a large enough buffer at
//the end to hold B. Write a method to merge B into A in sorted order.

package ctci;

import java.util.Arrays;
public class MergeTwoSortedArray{


	public void printArray(int[] Array){
		for(int i : Array){
			System.out.println(" " +i);
		}
		System.out.println();
	}


	private int[] moveArray(int[] Array,int k){

		int temp =0;
		int j=k;
		if(Array[k] != 0){
		while(Array[j] != 0 & j < Array.length ){
			j++;
		}
		}
		
		for(int i=j; i>=k; i--){
			Array[i+1]  = Array[i];
		}

		return Array;
	}

	// get two arrays

	public void merge( int[] A, int[] B, int size_A, int size_B )
    {
        int total_size = size_A + size_B;
        int point_A = size_A - 1;
        int point_B = size_B - 1;
        for( int i = total_size - 1; i >= 0; i-- )
        {
            if( point_A >= 0 && point_B >=0 )
            {
                if( A[point_A] >= B[point_B] )
                {
                    A[i] = A[point_A--];
                }
                else
                {
                    A[i] = B[point_B--];
                }
            }
            else if( point_B >= 0 )
            {
                A[i] = B[point_B--];
            }
            else
            {
                break;
            }
        }
        printArray(A);
    }

	// search for each elemtn in B strating from arrayB[0] and compare with starting with A,

	//if element A is < leave , else add elemnt B to arrayA before the element we just compared

	// insertion sort 




	public static void main(String[] args){

		int [] ArrayA = new int[10];
		int [] ArrayB = {1,4,5,9,11};

		for(int i = 0; i< ArrayA.length/2; i++){
			ArrayA[i] = i+2;
		}
		
		MergeTwoSortedArray object = new MergeTwoSortedArray();
		object.merge(ArrayA ,ArrayB, 5,ArrayB.length);
	}



}