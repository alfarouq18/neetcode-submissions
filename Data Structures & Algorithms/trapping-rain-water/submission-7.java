class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        int lMax = 0;
        int rMax = 0;

        for(int i = 0; i < height.length; i++){
            lMax = Math.max(height[i], lMax);
            leftMax[i] = lMax;
        }
        for(int i = height.length - 1; i > 0; i--){
            rMax = Math.max(height[i], rMax);
            rightMax[i] = rMax;
        }
        int res = 0;
        
        for(int i = 0; i < height.length; i++){
            if(leftMax[i] <= rightMax[i]){
                int sum = leftMax[i] - height[i];
                if(sum < 0){
                    sum = 0;
                }
                res += sum;
            }else{
                int sum = rightMax[i] - height[i];
                if(sum < 0){
                    sum = 0;
                }
                res += sum;
            }
        }
        return res;

    }
}
