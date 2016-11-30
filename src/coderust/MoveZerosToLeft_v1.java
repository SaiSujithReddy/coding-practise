package coderust;

/**
 * Created by sai on 11/29/16.
 */

//Given an integer array, move all elements containing '0' to the left while maintaining the order of other elements in the array.

public class MoveZerosToLeft_v1 {

    static int j= 0;

    int[] moveLeft(int[] array){

        int zeroPointer =0;
        // check array size =1 or zero case

        for(int i=0; i<array.length;i++){
            if(array[i] ==0 ) {
                array[i] = array[zeroPointer];
                array[zeroPointer] = 0;
                zeroPointer++;
            }
        }
        return array;
    }

    int[] moveLeftWithOrder(int[] array) {

        int[] newArray = new int[array.length];


        for(int i=0; i< array.length;i++) {
            if(array[i] ==0) {
                newArray[j] =0;
                j++;
            }
        }
        for(int i= 0; i<array.length;i++) {
            if(array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;

    }

    public static void main (String [] args) {
        int[] array = new int[]{1,2,3,4,50,6,5,0,2,3,0,0};
        MoveZerosToLeft_v1 obj = new MoveZerosToLeft_v1();

        PrintElementsOfArray obj1 = new PrintElementsOfArray();

        //obj1.printArray(obj.moveLeft(array));
        obj1.printArray(obj.moveLeftWithOrder(array));

    }

}



// My approach initially was to just move zeroes to left
/* time - O(n)
  space - O(1)
 */

// Next after reading the question again seems we need to maintain the order
/*
  time - O(2n) which is equivalent to O(n)
  space- O(n)
 */
