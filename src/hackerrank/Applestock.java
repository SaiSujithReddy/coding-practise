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
        int probable_buy_index = 0;
        int probable_sell_index = 0;
        for(int i=1; i<arg.length;i++) {
            if (arg[i] < buy ) {
                probable_buy = arg[i];
                probable_buy_index = i;
            }
            if (arg[i] > sell ) {
                probable_sell = arg[i];
                probable_sell_index = i;
            }
            if((probable_sell - probable_buy) > (sell - buy )) {
                if (probable_sell_index > probable_buy_index) {
                    sell = probable_sell;
                    buy = probable_buy;
                }
            }
        }
        return new int[]{buy,sell};
    }
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{17,18, 24, 25, 8, 10, 17};
        for (int i : myFunction(stockPricesYesterday)) {
            System.out.println(i);
        }
    }
}