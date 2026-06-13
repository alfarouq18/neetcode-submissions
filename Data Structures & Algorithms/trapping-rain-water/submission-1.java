class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        int maxL = 0;

        for(int i = 0; i < maxLeft.length; i++){
            maxLeft[i] = maxL;
            maxL = Math.max(height[i], maxL);
        }
        int maxR = 0;
        for(int i = maxRight.length - 1; i > 0; i--){
            maxRight[i] = maxR;
            maxR = Math.max(height[i], maxR);
        }

        int[] minHeights = new int[height.length];

        for(int i = 0; i < minHeights.length; i++){
            minHeights[i] = Math.min(maxLeft[i], maxRight[i]);
        }

        int res = 0; 

        for(int i = 0; i < height.length; i++){
            int sum = minHeights[i] - height[i];
            if(sum < 0){
                sum = 0;
            }
            res += sum;
        }

        return res;


    }
}
