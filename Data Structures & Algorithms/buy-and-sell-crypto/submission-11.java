class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int res = 0;
        for(int r = 0; r < prices.length; r++){
            if(prices[l] > prices[r]){
                l = r;
            }
            res = Math.max(res, prices[r] - prices[l]);
        }
        return res;
    }
}
