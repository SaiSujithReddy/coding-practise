package sort;

public class InsertionSort {

private void printArray(int[] Array){

for(int i=0; i< Array.length;i++){
System.out.print(" " + Array[i]);
}
System.out.println();
}

public void sort(int[] array){

int currIndex =0;
int swapIndex =0;
int tempValue =0;

printArray(array);
while(currIndex<array.length){

for( swapIndex =currIndex; swapIndex < array.length; swapIndex++){

if(array[currIndex]> array[swapIndex]){
tempValue = array[swapIndex];
for(int i=swapIndex-1;i>=currIndex; i--){
 array[i+1] =  array[i];
}
array[currIndex] = tempValue;

}

}
currIndex++;
}
printArray(array);

}


public static void main (String[] args){


int[] array = {4,1,9,200,-5,-9,2,7,6};

InsertionSort  Object = new InsertionSort();
Object.printArray(array);
Object.sort(array);
}


}