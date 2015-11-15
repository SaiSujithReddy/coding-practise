package sort;

public class SelectionSortArray{
	private void printArray(int[] Array){
		for(int i=0;i<Array.length;i++){
			System.out.print(" " + Array[i]);
		}
		System.out.println();
	}

	public void sortArray(int[] array){
		if(array.length == 0) return;

		System.out.print("Before Sorting Array ");
		printArray(array);
		
		int tempVar =0;
		int tempIndex =0;
		for(int i=0; i< array.length;i++){
			int temp = array[i];
			for(int j=i;j<array.length;j++){
				
				if(array[j]<array[i]){
					if(array[j]<temp)
					{
						temp = array[j];
						tempIndex = j;										
					}
				}
			}
			
			if(array[i]>temp)
			{
				tempVar = array[i];
				array[i] = array[tempIndex];
				array[tempIndex] = tempVar;
			}
		}

		System.out.print("After Sorting Array ");
		printArray(array);

	}
	public static void main (String[] args){
		int[] array = {4,7,1,89,23,67,12,0,3};
		SelectionSortArray Object = new SelectionSortArray();
		Object.sortArray(array );
	}
}
