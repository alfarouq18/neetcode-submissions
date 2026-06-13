class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;

        int res = 0;
        res = (r - l) * Math.min(heights[l], heights[r]);
        while(l < r){
            if(res < (r - l) * Math.min(heights[l], heights[r])){
                res = (r - l) * Math.min(heights[l], heights[r]);
            }
            if(heights[l] <= heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
