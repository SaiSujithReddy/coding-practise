package sort;

public class BubbleSort{
	private void printArray(int[] array){

		for(int i=0; i<array.length;i++){
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}
	public void sort(int[] array){
		System.out.println("Before sorting ");
		printArray(array);
		int temp =0;
		for(int i=0; i<array.length; i++){
			for(int j=i;j<array.length;j++){
				if(array[i]>array[j]){
					temp = array[j];
					array[i] = array[j];
					array[j] = temp; 
				}
			}
		}
		System.out.print("After sorting ");
		printArray(array);
	}
	public static void main(String [] args){

		int[] array = {5,3,8,2,9,45,21,67,98};
		BubbleSort Object = new BubbleSort();
		Object.sort(array);
	}
}