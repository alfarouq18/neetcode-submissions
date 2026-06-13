class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0){
            return 0;
        }
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        
        int max = 0;

        for(int i = 0; i < height.length; i++){
            maxLeft[i] = Math.max(max, height[i]);
            max = Math.max(height[i] , max);
        }
        max = 0;
        for(int i = height.length - 1; i >= 0; i--){
            maxRight[i] = Math.max(max, height[i]);
            max = Math.max(height[i], max);
        }
        
        int res = 0;

        for(int i = 0; i < height.length; i++){
            int min = Math.min(maxLeft[i], maxRight[i]);
            int sum = min - height[i];
            if(sum < 0){
                sum = 0;
            }
            res += sum;
        }
        return res;
    }
}
