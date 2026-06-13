class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;

        int max = 0;

        while(r < prices.length){
            if(prices[r] - prices[l] < 0){
                l = r;
            }else{
                max = Math.max(max, prices[r] - prices[l]);
            }
            r++;
        }
        return max;
    }
}
