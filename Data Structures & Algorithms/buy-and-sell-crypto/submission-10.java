class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int profit = 0;
        for(int r = 0; r < prices.length; r++){
            profit = Math.max(profit, prices[r] - prices[l]);

            if(prices[l] > prices[r]){
                l = r;
            }
        }
        return profit;
    }
}
