package practice.medium;

public class StocksMaximumProfit {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    // Output: 5

    static int maxProfit(int[] prices) {

        // {7,1,5,3,6,4}

        int maxProfit = 0;
        int bestBuy = prices[0];

        for(int i=1; i<prices.length; i++) {
            if(prices[i] > bestBuy) {       // 1 > 7
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);    // 6 - 1 = 5
            }
            bestBuy = Math.min(bestBuy, prices[i]);     // 1 and 5 , min = 1
        }

        return maxProfit;       // 5
    }
}
