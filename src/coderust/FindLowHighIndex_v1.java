package coderust;

/**
 * Created by sai on 11/29/16.
 */

//Given a sorted array of integers, return the low and high index of the given key. Return -1 if not found. The array length can be in millions with lots of duplicates.


public class FindLowHighIndex_v1 {

    int binarySearch(int[] array,int number) {
        int i = 0;
        int j = array.length-1;
        while( i <j ){
            if(array[i]<number && array[j]>number) {
                if((array[(i+j)/2]) < number) {
                    i = (i+j)/2;
                } else if((array[(i+j)/2]) > number) {
                    j = (i+j)/2;
                } else return (i+j)/2;
            } else if (array[i] == number) {
                return i;
            } else if (array[j] == number) {
                return j;
            } else return -1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1,1,2,2,2,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5};
        int findNumber = 9;
        FindLowHighIndex_v1 obj = new FindLowHighIndex_v1();
        int index = obj.binarySearch(array,findNumber);

        if( index != -1 ) {
            System.out.println("index " + index);
            int highIndex = index;
            int leastIndex = index;
            for(int i=index;i<array.length-1;i++){
                System.out.println("index value is " + index);
                if(array[i+1] == findNumber) {
                    highIndex++;
                    System.out.println("highindex " + highIndex);
                } else break;
            }
            for(int i=index;i>0;i--){
                if(array[i-1] == findNumber) {
                    leastIndex--;
                    System.out.println("lowindex " + leastIndex);
                } else break;
            }

            System.out.println("High Index & Least Index are " + highIndex + " " +leastIndex);
        } else {
            System.out.println("Element not found in array");
        }




    }


}


// My first approach
/*
BInary search and when you reach number scan nearby numbers
if we need to find out number 'k' and there k same digits
time  - O(logn + k)
space - O(1)
 */


// made silly mistakes in for loop
/*
initially i wrote following code


first iteration:-

for(int i=index;i<array.length-1;i++){
            System.out.println("index value is " + index);
            if(array[index] == findNumber) {
                highIndex++;
                System.out.println("highindex " + highIndex);
            } else break;
        }
        for(int i=index;i>0;i--){
            if(array[index] == findNumber) {
                leastIndex--;
                System.out.println("lowindex " + leastIndex);
            } else break;
        }

second iteration:-

for(int i=index;i<array.length-1;i++){
            System.out.println("index value is " + index);
            if(array[i] == findNumber) {
                highIndex++;
                System.out.println("highindex " + highIndex);
            } else break;
        }
        for(int i=index;i>0;i--){
            if(array[i] == findNumber) {
                leastIndex--;
                System.out.println("lowindex " + leastIndex);
            } else break;
        }
 */


// next mistake is that i forgot corner case -1, when the integer is not present in the array.



