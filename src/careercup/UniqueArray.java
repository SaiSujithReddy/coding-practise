package careercup;
import java.util.HashSet;
public class UniqueArray{

	//method printArray
	private void printArray(int[] array){
		for(int i : array){
			System.out.println(" " + i);
			System.out.println();
		}

	}

	//method unique
	public void findUniqueArray(int[] duplicateArray){

		// new hashset 

		HashSet<Integer> hSet = new HashSet<Integer>();

		//loop elemnt of arrray and keep it in hashset

		for(int i : duplicateArray){
			if(!hSet.contains(i) ){
				hSet.add(i);
			}
		}

		// override the existing array with the elements from hashset

		int[] uniqueArray = new int[hSet.size()];
		int j=0;
		for(int i: hSet){
			uniqueArray[j] = i;
			j++;
		}             
		printArray(uniqueArray);
	}

	public static void main(String args[]){
		//System.out.println(" HELLO");
		//Declare / initialize Array
		int[] duplicateArray  = {1,5,8,2,5,1,2,3,4};

		// pass to methos unique

		UniqueArray Object = new UniqueArray();
		Object.findUniqueArray(duplicateArray);

	}
}