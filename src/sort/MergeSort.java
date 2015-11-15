// Below program is from java2novice.com
package sort;

public class MergeSort {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
    private void printArray(int[] array){
    	for(int i : array){
    		System.out.print( " " + i);
    	}
    	System.out.println();
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        System.out.println("tempMergArr ");
        printArray( tempMergArr);
        System.out.println("Array is ");
        printArray(array);
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
            	System.out.println("array[k] is "+array[k]);
            	System.out.println("tempMergArr[i] is "+tempMergArr[i]);
                array[k] = tempMergArr[i];
                i++;
            } else {
            	System.out.println("array[k] is "+array[k]);
            	System.out.println("tempMergArr[j] is "+tempMergArr[j]);
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
        	System.out.println("array[k] is "+array[k]);
        	System.out.println("tempMergArr[i] is "+tempMergArr[i]);
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
