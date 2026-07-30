class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxVal = 0;

        for(int i = 0; i < piles.length; i++){
            maxVal = Math.max(maxVal, piles[i]);
        }

        int l = 1;
        int r = maxVal;
        int res = Integer.MAX_VALUE;

        while(l <= r){
            int hours = 0;
            int m = (r - l) / 2 + l;
            for(int i = 0; i < piles.length; i++){
                if(piles[i] % m != 0){
                    hours += piles[i] / m + 1;
                }else{
                    hours += piles[i] / m;
                }
            }

            if(hours <= h){
                res = Math.min(m, res);
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return res;
    }
}
