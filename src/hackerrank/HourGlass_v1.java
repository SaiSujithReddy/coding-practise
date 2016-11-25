package hackerrank;

/**
 * Created by sai on 11/24/16.
 */

public class HourGlass_v1 {

    private static int max = Integer.MIN_VALUE;

    private static int hourGlassSum(int[][] array) {
        int sum =0;
        for(int i=0; i< array.length;i++) {
            for(int j=0; j< array[0].length;j++) {
                if((i==1 && j==0) || (i==1 && j==2)) {
                    // do nothing
                }
                else {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    private static int[][] generate2DArray(int[][] arr, int row, int column) {
        int[][]  newArray = new int[3][3];
        int l =0;
        int k =0;
        for(int i =row ; i< row+3;i++) {
            for(int j=column; j< column+3 ; j++) {
                newArray[l][k] = arr[i][j];
                k++;
            }
            k =0;
            l++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int arr[][] = new int[][]{{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0 },{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0}};
        for(int i =0; i< arr.length-2;i++) {
            for(int j=0;j<arr[0].length-2;j++){
                max = Math.max(max,hourGlassSum(generate2DArray(arr,i,j)));
            }
        }
        System.out.println(max);
    }
}

//learnt things - how to define a 2d array and initialize it
// how to use math.max instead of initializing two variables.