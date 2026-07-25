class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;

        int max = 0;

        while(l < r){
            int square = Math.min(heights[l], heights[r]);
            max = Math.max(square * (r - l), max);

            if(heights[r] >= heights[l]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
