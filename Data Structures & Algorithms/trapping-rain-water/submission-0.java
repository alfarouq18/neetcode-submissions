class Solution {
    public int trap(int[] height) {
        int l = 0; 
        int r = height.length - 1;
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];
        int sum = 0;
        while(l <= r){
            if(maxLeft <= maxRight){
                if(maxLeft - height[l] > 0){
                    sum += maxLeft - height[l];
                }else{
                    maxLeft = height[l];
                }
                l++;
            }else{ 
                if(maxRight - height[r] > 0){
                    sum += maxRight - height[r];
                }else{
                    maxRight = height[r];
                }
                r--;
            }
        }
        return sum;
    }
}
