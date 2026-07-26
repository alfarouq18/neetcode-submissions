class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }

        int l = 1;
        int r = max;
        int mMin = Integer.MAX_VALUE;

        while(l <= r){
            int m = (r - l )/ 2 + l;
            int hours = 0;
            for(int i = 0; i < piles.length; i++){
                if(piles[i] % m != 0){
                    hours += piles[i] / m + 1;
                }else{
                    hours += piles[i] / m;
                }
            }
            if(hours <= h){
                r = m - 1;
                mMin = Math.min(m, mMin);
            }else if(hours > h){
                l = m + 1;
            }
        }
        return mMin;
    }
}
