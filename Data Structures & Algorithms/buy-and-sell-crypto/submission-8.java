class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int max = 0;
        for(int r = 0; r < prices.length; r++){
            if(r > 0 && prices[r] < prices[l]){
                l = r;
            }else{
                max = Math.max(max, prices[r] - prices[l]);
            }
        }
        return max;
    }
}
