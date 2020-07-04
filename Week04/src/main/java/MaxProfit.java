//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-07-04<p>
//-------------------------------------------------------

public class MaxProfit {

    //交易多次
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {

            //多次买卖一直股票，后一天的值大于前一天的，则算赚了
            if (prices[i] > prices[i - 1]) {
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int[] input = new int[]{7, 1, 5, 3, 6, 4};
        int result = maxProfit(input);
        System.out.println("===>" + result);
    }


    //交易一次，获取最大利润
/*    public static int maxProfit(int[] prices) {
        int cur = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            //当前值大于cur,则计算价值
            if (prices[i] > cur && (prices[i] - cur) > maxProfit) {
                maxProfit = prices[i] - cur;
            }
            if (prices[i] < cur) {
                cur = prices[i];
            }
        }
        return maxProfit;
    }*/
}