class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int max = 0;
        for(int i = 0; i < maxLeft.length; i ++){
            max = Math.max(max, height[i]);
            maxLeft[i] = max;
        }

        int[] maxRight = new int[height.length];
        max = 0;
        for(int i = maxRight.length - 1; i >= 0; i--){
            max = Math.max(max, height[i]);
            maxRight[i] = max;
        }
        int ans = 0;
        for(int i = 0; i < height.length; i++){
            int maxh = Math.min(maxLeft[i], maxRight[i]);
            int sum = maxh - height[i];

            if(sum < 0){
                sum = 0;
            }
            ans += sum;
        }
        return ans;

    }
}
