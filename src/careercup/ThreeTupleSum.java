package careercup;
//Given an array A of n integers and a target value S, does there exist a 3-tuple from A that sums to S?
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeTupleSum{

	private int findSum(int a, int b, int c){
		return a+b+c;
	}

	private void printArrayList(ArrayList<Integer> al){
		for(int i : al){
			System.out.print(" "+i);
		}
		System.out.println();
	}

	public static void printArray(int[] Array){
		for(int i : Array){
			System.out.print(i);
		}
		System.out.println();
	}
	
	public ArrayList<Integer> findTuple(int[] Array, int Target){
		ArrayList<Integer> al = new ArrayList<Integer>();

		int k =Array.length-1;
		for(int i=0; i< Array.length-3; i++){
			int j=i+1;
			while(j<=k){
				
				if(findSum(Array[i], Array[j],Array[k]) == Target){
					
					al.add(Array[i]);
					al.add( Array[j]);
					al.add(Array[k]);
				}
				if(findSum(Array[i], Array[j],Array[k]) > Target){
					System.out.println("hi");
					k--;
				}
				else j++;
			
			}
		}

		printArrayList(al);
		return al;
	}


	public int[] doMergeSort(int[] Array){
		Arrays.sort(Array);
		return Array;

	}



	public static void main(String[] args){


		int target = 16;
		//init
		int[] Array = new int[100];
		for(int i=0; i< Array.length; i++){

			Array[i] = i;

		}
		printArray(Array);
		//call sort method

		//call find Tuple method
		ThreeTupleSum object = new ThreeTupleSum();
		;
		object.findTuple(object.doMergeSort(Array), target);

	}

}
