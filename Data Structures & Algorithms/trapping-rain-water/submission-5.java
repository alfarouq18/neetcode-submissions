class Solution {
    public int trap(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;

        int l = 0;
        int r = height.length - 1;
        int res = 0;

        while(l <= r){
            if(maxLeft <= maxRight){
                int sum = maxLeft - height[l];
                if(sum < 0){
                    sum = 0;
                }
                res += sum;
                maxLeft = Math.max(height[l], maxLeft);
                l++;
            }else{
                int sum = maxRight - height[r];
                if(sum < 0){
                    sum = 0;
                }
                res += sum;
                maxRight = Math.max(height[r], maxRight);
                r--;
            }
        }
        return res;
    }
}
