package hackerrank;

/**
 * Created by sai on 11/23/16.
 */

public class Applestock {
    public static int[] myFunction(int[] arg) {
        int buy = arg[0];
        int probable_buy = arg[0];
        int sell = arg[1];
        int probable_sell = arg[1];
        for(int i=1; i<arg.length;i++) {

            if (arg[i] < buy ) {
                probable_buy = arg[i];
            }
            if (arg[i] > sell ) {
                probable_sell = arg[i];
            }
            if((probable_sell - probable_buy) > (sell - buy )) {
                sell = probable_sell;
                buy = probable_buy;
            }
        }

        return new int[]{buy,sell};
    }
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{1,1, 5, 5, 8, 10, 19};
        for (int i : myFunction(stockPricesYesterday)) {
            System.out.println(i);
        }
    }
}